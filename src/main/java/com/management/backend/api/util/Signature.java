package com.management.backend.api.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 * @ClassName Signature
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/7/3 22:16
 * @Version 1.0
 **/
public class Signature {

    private static final String CHARACTER_ENCODING = "UTF-8";
    final static String ALGORITHM = "HmacSHA256";

    public static void main(String[] args) throws Exception {
        // Change this secret key to yours
        String secretKey = "AKIAJH2EZXNXNDOS3TJQ";

        // Use the endpoint for your marketplace
        String serviceUrl = "https://mws.amazonservices.com/";

        // Create set of parameters needed and store in a map
        HashMap<String, String> parameters = new HashMap<String,String>();

        // Add required parameters. Change these as needed.
        parameters.put("AWSAccessKeyId", urlEncode("AKIAJH2EZXNXNDOS3TJQ"));
        parameters.put("Action", urlEncode("GetFeedSubmissionList"));
        parameters.put("MWSAuthToken", urlEncode("hS/J1Wfhu3foKru5wyz0spoJ+mAh2CGV3P8D856x"));
        parameters.put("SellerId", urlEncode("A2R2HEGXW6VHVZ"));
        parameters.put("SignatureMethod", urlEncode(ALGORITHM));
        parameters.put("SignatureVersion", urlEncode("2"));
        parameters.put("SubmittedFromDate",
                urlEncode("2013-05-01T12:00:00Z"));
        parameters.put("Timestamp", urlEncode("2013-05-02T16:00:00Z"));
        parameters.put("Version", urlEncode("2009-01-01"));

        // Format the parameters as they will appear in final format
        // (without the signature parameter)
        String formattedParameters = calculateStringToSignV2(parameters,
                serviceUrl);

        String signature = sign(formattedParameters, secretKey);

        // Add signature to the parameters and display final results
        parameters.put("Signature", urlEncode(signature));
        System.out.println(calculateStringToSignV2(parameters,
                serviceUrl));
    }

    /* If Signature Version is 2, string to sign is based on following:
     *
     *    1. The HTTP Request Method followed by an ASCII newline (%0A)
     *
     *    2. The HTTP Host header in the form of lowercase host,
     *       followed by an ASCII newline.
     *
     *    3. The URL encoded HTTP absolute path component of the URI
     *       (up to but not including the query string parameters);
     *       if this is empty use a forward '/'. This parameter is followed
     *       by an ASCII newline.
     *
     *    4. The concatenation of all query string components (names and
     *       values) as UTF-8 characters which are URL encoded as per RFC
     *       3986 (hex characters MUST be uppercase), sorted using
     *       lexicographic byte ordering. Parameter names are separated from
     *       their values by the '=' character (ASCII character 61), even if
     *       the value is empty. Pairs of parameter and values are separated
     *       by the '&' character (ASCII code 38).
     *
     */
    public static String computeContentMD5HeaderValue( InputStream fis )
            throws IOException, NoSuchAlgorithmException {

        DigestInputStream dis = new DigestInputStream( fis,
                MessageDigest.getInstance( "MD5" ));

        byte[] buffer = new byte[8192];
        while( dis.read( buffer ) > 0 );

        String md5Content = new String(
                org.apache.commons.codec.binary.Base64.encodeBase64(
                        dis.getMessageDigest().digest()) );

        // Effectively resets the stream to be beginning of the file
        // via a FileChannel.
//        YK 注释掉的
//        fis.getChannel().position( 0 );

        return md5Content;
    }

    public static String calculateStringToSignV2(
            Map<String, String> parameters, String serviceUrl)
            throws SignatureException, URISyntaxException {
        // Sort the parameters alphabetically by storing
        // in TreeMap structure
        Map<String, String> sorted = new TreeMap<String, String>();
        sorted.putAll(parameters);

        // Set endpoint value
        URI endpoint = new URI(serviceUrl.toLowerCase());

        // Create flattened (String) representation
        StringBuilder data = new StringBuilder();
//        data.append("POST\n");
//        data.append(endpoint.getHost());
//        data.append("\n/");
//        data.append("\n");

        Iterator<Entry<String, String>> pairs =
                sorted.entrySet().iterator();
        while (pairs.hasNext()) {
            Map.Entry<String, String> pair = pairs.next();
            if (pair.getValue() != null) {
                data.append( pair.getKey() + "=" + pair.getValue());
            }
            else {
                data.append( pair.getKey() + "=");
            }

            // Delimit parameters with ampersand (&)
            if (pairs.hasNext()) {
                data.append( "&");
            }
        }

        return data.toString();
    }

    /*
     * Sign the text with the given secret key and convert to base64
     */
    public static String sign(String data, String secretKey)
            throws NoSuchAlgorithmException, InvalidKeyException,
            IllegalStateException, UnsupportedEncodingException {
        Mac mac = Mac.getInstance(ALGORITHM);
        mac.init(new SecretKeySpec(secretKey.getBytes(CHARACTER_ENCODING),
                ALGORITHM));
        byte[] signature = mac.doFinal(data.getBytes(CHARACTER_ENCODING));
        String signatureBase64 = new String(Base64.encodeBase64(signature),
                CHARACTER_ENCODING);
        return new String(signatureBase64);
    }

    public static String urlEncode(String rawValue) {
        String value = (rawValue == null) ? "" : rawValue;
        String encoded = null;

        try {
            encoded = URLEncoder.encode(value, CHARACTER_ENCODING)
                    .replace("+", "%20")
                    .replace("*", "%2A")
                    .replace("%7E","~");
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unknown encoding: " + CHARACTER_ENCODING);
            e.printStackTrace();
        }

        return encoded;
    }
}
