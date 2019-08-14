package com.amazonaws.mws;

import com.amazonaws.mws.model.ContentType;
import com.amazonaws.mws.model.SubmitFeedRequest;
import com.amazonaws.mws.model.SubmitFeedResponse;
import com.amazonaws.mws.samples.SubmitFeedAsyncSample;
import com.management.backend.api.controller.ProductUpload;
import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import com.management.backend.api.util.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @ClassName IvenDemoSample
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/7/27 13:48
 * @Version 1.0
 **/
public class IvenDemoSample {

    protected static final Logger log = LoggerFactory.getLogger(IvenDemoSample.class);

        /**
         * Just add a few required parameters, and try the service
         * Submit Feed functionality
         *
         * @param content unused
         */
        public static void invoke(AmazonAccountInfo amazonAccountInfo,String feedType,String content) {

            /************************************************************************
             * Access Key ID and Secret Access Key ID, obtained from:
             * http://aws.amazon.com
             ***********************************************************************/
            final String accessKeyId = amazonAccountInfo.getAmazonAccessID();
            final String secretAccessKey = amazonAccountInfo.getAmazonAccessSecret();

            final String appName = "JoeJAN";
            final String appVersion = "1.0";        //默认填的

            MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

            /************************************************************************
             * Uncomment to set the appropriate MWS endpoint.
             ************************************************************************/
            // US
            // config.setServiceURL("https://mws.amazonservices.com/");
            // UK
            // config.setServiceURL("https://mws.amazonservices.co.uk/");
            // Germany
            // config.setServiceURL("https://mws.amazonservices.de/");
            // France
            // config.setServiceURL("https://mws.amazonservices.fr/");
//             Italy
//            config.setServiceURL("https://mws.amazonservices.it/");
            // Japan
            // config.setServiceURL("https://mws.amazonservices.jp/");
            // China
            // config.setServiceURL("https://mws.amazonservices.com.cn/");
            // Canada
            // config.setServiceURL("https://mws.amazonservices.ca/");
            // India
            // config.setServiceURL("https://mws.amazonservices.in/");
            config.setServiceURL(amazonAccountInfo.getAmazonMwsEndpoint());

            /************************************************************************
             * The argument (35) set below is the number of threads client should
             * spawn for processing.
             ***********************************************************************/

            config.setMaxAsyncThreads(35);

            /************************************************************************
             * Instantiate Http Client Implementation of Marketplace Web Service
             ***********************************************************************/

            MarketplaceWebService service = new MarketplaceWebServiceClient(accessKeyId, secretAccessKey, appName, appVersion, config);

            /************************************************************************
             * Setup requests parameters and invoke parallel processing. Of course
             * in real world application, there will be much more than a couple of
             * requests to process.
             ***********************************************************************/

            /************************************************************************
             * Marketplace and Merchant IDs are required parameters for all
             * Marketplace Web Service calls.
             ***********************************************************************/
            final String merchantId = amazonAccountInfo.getMerchantIdentifier();
            final String sellerDevAuthToken = "<Merchant Developer MWS Auth Token>";

            SubmitFeedRequest requestOne = new SubmitFeedRequest();
            requestOne.setMerchant( merchantId );

            InputStream is = new ByteArrayInputStream(content.getBytes());
            String mdsStr="";
            try {
                mdsStr= Signature.computeContentMD5HeaderValue(is);
            } catch (IOException e) {
                log.error("IvenDemoSample,IOException="+e.getMessage());
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                log.error("IvenDemoSample,NoSuchAlgorithmException="+e.getMessage());
                e.printStackTrace();
            }
//            设置MD5 值
//            requestOne.setContentMD5(mdsStr);
            //requestOne.setMWSAuthToken(sellerDevAuthToken);

            requestOne.setFeedType( feedType );

            // MWS exclusively offers a streaming interface for uploading your feeds. This is because
            // feed sizes can grow past the 1GB range - and as your business grows you could otherwise
            // silently reach the feed size where your in-memory solution will no longer work, leaving you
            // puzzled as to why a solution that worked for a long time suddenly stopped working though
            // you made no changes. For the same reason, we strongly encourage you to generate your feeds to
            // local disk then upload them directly from disk to MWS via Java - without buffering them in Java
            // memory in their entirety.
            //
            // requestOne.setFeedContent( new FileInputStream("my-feed-1.xml" /*or "my-flat-file-1.txt" if you use flat files*/);

            SubmitFeedRequest requestTwo = new SubmitFeedRequest();
            requestTwo.setMerchant( merchantId );
            //requestTwo.setMWSAuthToken(sellerDevAuthToken);

            requestTwo.setFeedType(feedType );
            requestTwo.setContentType(ContentType.TextXml);

//            InputStream is = new ByteArrayInputStream(content.getBytes());
//设置内容
            requestTwo.setContentMD5(mdsStr);
            requestTwo.setFeedContent(is);

            // requestTwo.setFeedContent( new FileInputStream("my-feed-2.xml" /*or "my-flat-file-2.txt" if you use flat files*/);

            List<SubmitFeedRequest> requests = new ArrayList<SubmitFeedRequest>();
            requests.add(requestOne);
            requests.add(requestTwo);
             invokeSubmitFeed(service, requests);

        }



        /**
         * Submit Feed request sample
         * Uploads a file for processing together with the necessary
         * metadata to process the file, such as which type of feed it is.
         * PurgeAndReplace if true means that your existing e.g. inventory is
         * wiped out and replace with the contents of this feed - use with
         * caution (the default is false).
         *
         * @param service instance of MarketplaceWebService service
         * @param requests list of requests to process
         */
        public static void invokeSubmitFeed(MarketplaceWebService service, List<SubmitFeedRequest> requests) {
            List<Future<SubmitFeedResponse>> responses = new ArrayList<Future<SubmitFeedResponse>>();
            for (SubmitFeedRequest request : requests) {
                responses.add(service.submitFeedAsync(request));
            }
            for (Future<SubmitFeedResponse> future : responses) {
                while (!future.isDone()) {
                    Thread.yield();
                }
                try {
                    SubmitFeedResponse response = future.get();
                    // Original request corresponding to this response, if needed:
                    SubmitFeedRequest originalRequest = requests.get(responses.indexOf(future));
                    System.out.println("Response request id: " + response.getResponseMetadata().getRequestId());
                    System.out.println(response.getResponseHeaderMetadata());
                    System.out.println();
                } catch (Exception e) {
                    if (e.getCause() instanceof MarketplaceWebServiceException) {
                        MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e.getCause());
                        System.out.println("Caught Exception: " + exception.getMessage());
                        System.out.println("Response Status Code: " + exception.getStatusCode());
                        System.out.println("Error Code: " + exception.getErrorCode());
                        System.out.println("Error Type: " + exception.getErrorType());
                        System.out.println("Request ID: " + exception.getRequestId());
                        System.out.print("XML: " + exception.getXML());
                        System.out.println("ResponseHeaderMetadata: " + exception.getResponseHeaderMetadata());
                    } else {
                        e.printStackTrace();
                    }
                }
            }
        }



}
