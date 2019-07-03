package com.management.backend.api.mybatis.model;

public class AmazonAccountInfo {
    private Integer id;

    private String accountNickname;

    private String sellerId;

    private String amazonMarketplace;

    private String countryCode;

    private String amazonMwsEndpoint;

    private String marketplaceId;

    private String amazonAccessID;
    private String amazonAccessSecret;
    private String accountCountry;
    private String merchantIdentifier;

    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    public void setMerchantIdentifier(String merchantIdentifier) {
        this.merchantIdentifier = merchantIdentifier;
    }

    public String getAccountCountry() {
        return accountCountry;
    }

    public void setAccountCountry(String accountCountry) {
        this.accountCountry = accountCountry;
    }

    public String getAmazonAccessID() {
        return amazonAccessID;
    }

    public void setAmazonAccessID(String amazonAccessID) {
        this.amazonAccessID = amazonAccessID;
    }

    public String getAmazonAccessSecret() {
        return amazonAccessSecret;
    }

    public void setAmazonAccessSecret(String amazonAccessSecret) {
        this.amazonAccessSecret = amazonAccessSecret;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNickname() {
        return accountNickname;
    }

    public void setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname == null ? null : accountNickname.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getAmazonMarketplace() {
        return amazonMarketplace;
    }

    public void setAmazonMarketplace(String amazonMarketplace) {
        this.amazonMarketplace = amazonMarketplace == null ? null : amazonMarketplace.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAmazonMwsEndpoint() {
        return amazonMwsEndpoint;
    }

    public void setAmazonMwsEndpoint(String amazonMwsEndpoint) {
        this.amazonMwsEndpoint = amazonMwsEndpoint == null ? null : amazonMwsEndpoint.trim();
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId == null ? null : marketplaceId.trim();
    }
}
