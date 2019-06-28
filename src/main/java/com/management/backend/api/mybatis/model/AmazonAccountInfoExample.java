package com.management.backend.api.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class AmazonAccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonAccountInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameIsNull() {
            addCriterion("account_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameIsNotNull() {
            addCriterion("account_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameEqualTo(String value) {
            addCriterion("account_nickname =", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotEqualTo(String value) {
            addCriterion("account_nickname <>", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameGreaterThan(String value) {
            addCriterion("account_nickname >", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("account_nickname >=", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLessThan(String value) {
            addCriterion("account_nickname <", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLessThanOrEqualTo(String value) {
            addCriterion("account_nickname <=", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLike(String value) {
            addCriterion("account_nickname like", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotLike(String value) {
            addCriterion("account_nickname not like", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameIn(List<String> values) {
            addCriterion("account_nickname in", values, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotIn(List<String> values) {
            addCriterion("account_nickname not in", values, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameBetween(String value1, String value2) {
            addCriterion("account_nickname between", value1, value2, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotBetween(String value1, String value2) {
            addCriterion("account_nickname not between", value1, value2, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceIsNull() {
            addCriterion("amazon_marketplace is null");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceIsNotNull() {
            addCriterion("amazon_marketplace is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceEqualTo(String value) {
            addCriterion("amazon_marketplace =", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceNotEqualTo(String value) {
            addCriterion("amazon_marketplace <>", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceGreaterThan(String value) {
            addCriterion("amazon_marketplace >", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceGreaterThanOrEqualTo(String value) {
            addCriterion("amazon_marketplace >=", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceLessThan(String value) {
            addCriterion("amazon_marketplace <", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceLessThanOrEqualTo(String value) {
            addCriterion("amazon_marketplace <=", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceLike(String value) {
            addCriterion("amazon_marketplace like", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceNotLike(String value) {
            addCriterion("amazon_marketplace not like", value, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceIn(List<String> values) {
            addCriterion("amazon_marketplace in", values, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceNotIn(List<String> values) {
            addCriterion("amazon_marketplace not in", values, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceBetween(String value1, String value2) {
            addCriterion("amazon_marketplace between", value1, value2, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andAmazonMarketplaceNotBetween(String value1, String value2) {
            addCriterion("amazon_marketplace not between", value1, value2, "amazonMarketplace");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointIsNull() {
            addCriterion("amazon_mws_endpoint is null");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointIsNotNull() {
            addCriterion("amazon_mws_endpoint is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointEqualTo(String value) {
            addCriterion("amazon_mws_endpoint =", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointNotEqualTo(String value) {
            addCriterion("amazon_mws_endpoint <>", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointGreaterThan(String value) {
            addCriterion("amazon_mws_endpoint >", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("amazon_mws_endpoint >=", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointLessThan(String value) {
            addCriterion("amazon_mws_endpoint <", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointLessThanOrEqualTo(String value) {
            addCriterion("amazon_mws_endpoint <=", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointLike(String value) {
            addCriterion("amazon_mws_endpoint like", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointNotLike(String value) {
            addCriterion("amazon_mws_endpoint not like", value, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointIn(List<String> values) {
            addCriterion("amazon_mws_endpoint in", values, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointNotIn(List<String> values) {
            addCriterion("amazon_mws_endpoint not in", values, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointBetween(String value1, String value2) {
            addCriterion("amazon_mws_endpoint between", value1, value2, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andAmazonMwsEndpointNotBetween(String value1, String value2) {
            addCriterion("amazon_mws_endpoint not between", value1, value2, "amazonMwsEndpoint");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdIsNull() {
            addCriterion("marketplace_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdIsNotNull() {
            addCriterion("marketplace_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdEqualTo(String value) {
            addCriterion("marketplace_id =", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdNotEqualTo(String value) {
            addCriterion("marketplace_id <>", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdGreaterThan(String value) {
            addCriterion("marketplace_id >", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("marketplace_id >=", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdLessThan(String value) {
            addCriterion("marketplace_id <", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdLessThanOrEqualTo(String value) {
            addCriterion("marketplace_id <=", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdLike(String value) {
            addCriterion("marketplace_id like", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdNotLike(String value) {
            addCriterion("marketplace_id not like", value, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdIn(List<String> values) {
            addCriterion("marketplace_id in", values, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdNotIn(List<String> values) {
            addCriterion("marketplace_id not in", values, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdBetween(String value1, String value2) {
            addCriterion("marketplace_id between", value1, value2, "marketplaceId");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIdNotBetween(String value1, String value2) {
            addCriterion("marketplace_id not between", value1, value2, "marketplaceId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}