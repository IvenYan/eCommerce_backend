package com.management.backend.api.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class AmazonUploadHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonUploadHistoryExample() {
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

        public Criteria andAmazonaccountidIsNull() {
            addCriterion("amazonAccountId is null");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidIsNotNull() {
            addCriterion("amazonAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidEqualTo(Integer value) {
            addCriterion("amazonAccountId =", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidNotEqualTo(Integer value) {
            addCriterion("amazonAccountId <>", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidGreaterThan(Integer value) {
            addCriterion("amazonAccountId >", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amazonAccountId >=", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidLessThan(Integer value) {
            addCriterion("amazonAccountId <", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidLessThanOrEqualTo(Integer value) {
            addCriterion("amazonAccountId <=", value, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidIn(List<Integer> values) {
            addCriterion("amazonAccountId in", values, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidNotIn(List<Integer> values) {
            addCriterion("amazonAccountId not in", values, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidBetween(Integer value1, Integer value2) {
            addCriterion("amazonAccountId between", value1, value2, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("amazonAccountId not between", value1, value2, "amazonaccountid");
            return (Criteria) this;
        }

        public Criteria andProcessdaysIsNull() {
            addCriterion("processDays is null");
            return (Criteria) this;
        }

        public Criteria andProcessdaysIsNotNull() {
            addCriterion("processDays is not null");
            return (Criteria) this;
        }

        public Criteria andProcessdaysEqualTo(String value) {
            addCriterion("processDays =", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysNotEqualTo(String value) {
            addCriterion("processDays <>", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysGreaterThan(String value) {
            addCriterion("processDays >", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysGreaterThanOrEqualTo(String value) {
            addCriterion("processDays >=", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysLessThan(String value) {
            addCriterion("processDays <", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysLessThanOrEqualTo(String value) {
            addCriterion("processDays <=", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysLike(String value) {
            addCriterion("processDays like", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysNotLike(String value) {
            addCriterion("processDays not like", value, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysIn(List<String> values) {
            addCriterion("processDays in", values, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysNotIn(List<String> values) {
            addCriterion("processDays not in", values, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysBetween(String value1, String value2) {
            addCriterion("processDays between", value1, value2, "processdays");
            return (Criteria) this;
        }

        public Criteria andProcessdaysNotBetween(String value1, String value2) {
            addCriterion("processDays not between", value1, value2, "processdays");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("productType is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("productType is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("productType =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("productType <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("productType >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("productType >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("productType <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("productType <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("productType like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("productType not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("productType in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("productType not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("productType between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("productType not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeIsNull() {
            addCriterion("amazonProductType is null");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeIsNotNull() {
            addCriterion("amazonProductType is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeEqualTo(String value) {
            addCriterion("amazonProductType =", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeNotEqualTo(String value) {
            addCriterion("amazonProductType <>", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeGreaterThan(String value) {
            addCriterion("amazonProductType >", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("amazonProductType >=", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeLessThan(String value) {
            addCriterion("amazonProductType <", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeLessThanOrEqualTo(String value) {
            addCriterion("amazonProductType <=", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeLike(String value) {
            addCriterion("amazonProductType like", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeNotLike(String value) {
            addCriterion("amazonProductType not like", value, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeIn(List<String> values) {
            addCriterion("amazonProductType in", values, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeNotIn(List<String> values) {
            addCriterion("amazonProductType not in", values, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeBetween(String value1, String value2) {
            addCriterion("amazonProductType between", value1, value2, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andAmazonproducttypeNotBetween(String value1, String value2) {
            addCriterion("amazonProductType not between", value1, value2, "amazonproducttype");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNull() {
            addCriterion("factoryName is null");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNotNull() {
            addCriterion("factoryName is not null");
            return (Criteria) this;
        }

        public Criteria andFactorynameEqualTo(String value) {
            addCriterion("factoryName =", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotEqualTo(String value) {
            addCriterion("factoryName <>", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThan(String value) {
            addCriterion("factoryName >", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThanOrEqualTo(String value) {
            addCriterion("factoryName >=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThan(String value) {
            addCriterion("factoryName <", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThanOrEqualTo(String value) {
            addCriterion("factoryName <=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLike(String value) {
            addCriterion("factoryName like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotLike(String value) {
            addCriterion("factoryName not like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameIn(List<String> values) {
            addCriterion("factoryName in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotIn(List<String> values) {
            addCriterion("factoryName not in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameBetween(String value1, String value2) {
            addCriterion("factoryName between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotBetween(String value1, String value2) {
            addCriterion("factoryName not between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynoIsNull() {
            addCriterion("factoryNo is null");
            return (Criteria) this;
        }

        public Criteria andFactorynoIsNotNull() {
            addCriterion("factoryNo is not null");
            return (Criteria) this;
        }

        public Criteria andFactorynoEqualTo(String value) {
            addCriterion("factoryNo =", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoNotEqualTo(String value) {
            addCriterion("factoryNo <>", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoGreaterThan(String value) {
            addCriterion("factoryNo >", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoGreaterThanOrEqualTo(String value) {
            addCriterion("factoryNo >=", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoLessThan(String value) {
            addCriterion("factoryNo <", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoLessThanOrEqualTo(String value) {
            addCriterion("factoryNo <=", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoLike(String value) {
            addCriterion("factoryNo like", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoNotLike(String value) {
            addCriterion("factoryNo not like", value, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoIn(List<String> values) {
            addCriterion("factoryNo in", values, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoNotIn(List<String> values) {
            addCriterion("factoryNo not in", values, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoBetween(String value1, String value2) {
            addCriterion("factoryNo between", value1, value2, "factoryno");
            return (Criteria) this;
        }

        public Criteria andFactorynoNotBetween(String value1, String value2) {
            addCriterion("factoryNo not between", value1, value2, "factoryno");
            return (Criteria) this;
        }

        public Criteria andProductbrandIsNull() {
            addCriterion("productBrand is null");
            return (Criteria) this;
        }

        public Criteria andProductbrandIsNotNull() {
            addCriterion("productBrand is not null");
            return (Criteria) this;
        }

        public Criteria andProductbrandEqualTo(String value) {
            addCriterion("productBrand =", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotEqualTo(String value) {
            addCriterion("productBrand <>", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandGreaterThan(String value) {
            addCriterion("productBrand >", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandGreaterThanOrEqualTo(String value) {
            addCriterion("productBrand >=", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLessThan(String value) {
            addCriterion("productBrand <", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLessThanOrEqualTo(String value) {
            addCriterion("productBrand <=", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLike(String value) {
            addCriterion("productBrand like", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotLike(String value) {
            addCriterion("productBrand not like", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandIn(List<String> values) {
            addCriterion("productBrand in", values, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotIn(List<String> values) {
            addCriterion("productBrand not in", values, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandBetween(String value1, String value2) {
            addCriterion("productBrand between", value1, value2, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotBetween(String value1, String value2) {
            addCriterion("productBrand not between", value1, value2, "productbrand");
            return (Criteria) this;
        }

        public Criteria andTitleprefixIsNull() {
            addCriterion("titlePrefix is null");
            return (Criteria) this;
        }

        public Criteria andTitleprefixIsNotNull() {
            addCriterion("titlePrefix is not null");
            return (Criteria) this;
        }

        public Criteria andTitleprefixEqualTo(String value) {
            addCriterion("titlePrefix =", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixNotEqualTo(String value) {
            addCriterion("titlePrefix <>", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixGreaterThan(String value) {
            addCriterion("titlePrefix >", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixGreaterThanOrEqualTo(String value) {
            addCriterion("titlePrefix >=", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixLessThan(String value) {
            addCriterion("titlePrefix <", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixLessThanOrEqualTo(String value) {
            addCriterion("titlePrefix <=", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixLike(String value) {
            addCriterion("titlePrefix like", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixNotLike(String value) {
            addCriterion("titlePrefix not like", value, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixIn(List<String> values) {
            addCriterion("titlePrefix in", values, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixNotIn(List<String> values) {
            addCriterion("titlePrefix not in", values, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixBetween(String value1, String value2) {
            addCriterion("titlePrefix between", value1, value2, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitleprefixNotBetween(String value1, String value2) {
            addCriterion("titlePrefix not between", value1, value2, "titleprefix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixIsNull() {
            addCriterion("titleSuffix is null");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixIsNotNull() {
            addCriterion("titleSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixEqualTo(String value) {
            addCriterion("titleSuffix =", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixNotEqualTo(String value) {
            addCriterion("titleSuffix <>", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixGreaterThan(String value) {
            addCriterion("titleSuffix >", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixGreaterThanOrEqualTo(String value) {
            addCriterion("titleSuffix >=", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixLessThan(String value) {
            addCriterion("titleSuffix <", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixLessThanOrEqualTo(String value) {
            addCriterion("titleSuffix <=", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixLike(String value) {
            addCriterion("titleSuffix like", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixNotLike(String value) {
            addCriterion("titleSuffix not like", value, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixIn(List<String> values) {
            addCriterion("titleSuffix in", values, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixNotIn(List<String> values) {
            addCriterion("titleSuffix not in", values, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixBetween(String value1, String value2) {
            addCriterion("titleSuffix between", value1, value2, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andTitlesuffixNotBetween(String value1, String value2) {
            addCriterion("titleSuffix not between", value1, value2, "titlesuffix");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keyWords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keyWords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keyWords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keyWords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keyWords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keyWords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keyWords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keyWords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keyWords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keyWords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keyWords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keyWords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keyWords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keyWords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDescprefixIsNull() {
            addCriterion("descPrefix is null");
            return (Criteria) this;
        }

        public Criteria andDescprefixIsNotNull() {
            addCriterion("descPrefix is not null");
            return (Criteria) this;
        }

        public Criteria andDescprefixEqualTo(String value) {
            addCriterion("descPrefix =", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixNotEqualTo(String value) {
            addCriterion("descPrefix <>", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixGreaterThan(String value) {
            addCriterion("descPrefix >", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixGreaterThanOrEqualTo(String value) {
            addCriterion("descPrefix >=", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixLessThan(String value) {
            addCriterion("descPrefix <", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixLessThanOrEqualTo(String value) {
            addCriterion("descPrefix <=", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixLike(String value) {
            addCriterion("descPrefix like", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixNotLike(String value) {
            addCriterion("descPrefix not like", value, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixIn(List<String> values) {
            addCriterion("descPrefix in", values, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixNotIn(List<String> values) {
            addCriterion("descPrefix not in", values, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixBetween(String value1, String value2) {
            addCriterion("descPrefix between", value1, value2, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescprefixNotBetween(String value1, String value2) {
            addCriterion("descPrefix not between", value1, value2, "descprefix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixIsNull() {
            addCriterion("descSuffix is null");
            return (Criteria) this;
        }

        public Criteria andDescsuffixIsNotNull() {
            addCriterion("descSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andDescsuffixEqualTo(String value) {
            addCriterion("descSuffix =", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixNotEqualTo(String value) {
            addCriterion("descSuffix <>", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixGreaterThan(String value) {
            addCriterion("descSuffix >", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixGreaterThanOrEqualTo(String value) {
            addCriterion("descSuffix >=", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixLessThan(String value) {
            addCriterion("descSuffix <", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixLessThanOrEqualTo(String value) {
            addCriterion("descSuffix <=", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixLike(String value) {
            addCriterion("descSuffix like", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixNotLike(String value) {
            addCriterion("descSuffix not like", value, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixIn(List<String> values) {
            addCriterion("descSuffix in", values, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixNotIn(List<String> values) {
            addCriterion("descSuffix not in", values, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixBetween(String value1, String value2) {
            addCriterion("descSuffix between", value1, value2, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDescsuffixNotBetween(String value1, String value2) {
            addCriterion("descSuffix not between", value1, value2, "descsuffix");
            return (Criteria) this;
        }

        public Criteria andDesctagIsNull() {
            addCriterion("descTag is null");
            return (Criteria) this;
        }

        public Criteria andDesctagIsNotNull() {
            addCriterion("descTag is not null");
            return (Criteria) this;
        }

        public Criteria andDesctagEqualTo(String value) {
            addCriterion("descTag =", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagNotEqualTo(String value) {
            addCriterion("descTag <>", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagGreaterThan(String value) {
            addCriterion("descTag >", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagGreaterThanOrEqualTo(String value) {
            addCriterion("descTag >=", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagLessThan(String value) {
            addCriterion("descTag <", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagLessThanOrEqualTo(String value) {
            addCriterion("descTag <=", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagLike(String value) {
            addCriterion("descTag like", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagNotLike(String value) {
            addCriterion("descTag not like", value, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagIn(List<String> values) {
            addCriterion("descTag in", values, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagNotIn(List<String> values) {
            addCriterion("descTag not in", values, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagBetween(String value1, String value2) {
            addCriterion("descTag between", value1, value2, "desctag");
            return (Criteria) this;
        }

        public Criteria andDesctagNotBetween(String value1, String value2) {
            addCriterion("descTag not between", value1, value2, "desctag");
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