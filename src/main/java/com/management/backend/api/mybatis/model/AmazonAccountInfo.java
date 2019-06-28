package com.management.backend.api.mybatis.model;

public class AmazonAccountInfo {
    private Integer id;

    private String accountNickname;

    private Integer sellerId;

    private String amazonMarketplace;

    private String countryCode;

    private String amazonMwsEndpoint;

    private String marketplaceId;

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

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
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