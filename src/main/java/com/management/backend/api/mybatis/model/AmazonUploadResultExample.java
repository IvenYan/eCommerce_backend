package com.management.backend.api.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonUploadResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonUploadResultExample() {
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

        public Criteria andBatchnoIsNull() {
            addCriterion("batchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("batchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(Integer value) {
            addCriterion("batchNo =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(Integer value) {
            addCriterion("batchNo <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(Integer value) {
            addCriterion("batchNo >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("batchNo >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(Integer value) {
            addCriterion("batchNo <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(Integer value) {
            addCriterion("batchNo <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<Integer> values) {
            addCriterion("batchNo in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<Integer> values) {
            addCriterion("batchNo not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(Integer value1, Integer value2) {
            addCriterion("batchNo between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(Integer value1, Integer value2) {
            addCriterion("batchNo not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountIsNull() {
            addCriterion("amazonAccount is null");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountIsNotNull() {
            addCriterion("amazonAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountEqualTo(String value) {
            addCriterion("amazonAccount =", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountNotEqualTo(String value) {
            addCriterion("amazonAccount <>", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountGreaterThan(String value) {
            addCriterion("amazonAccount >", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountGreaterThanOrEqualTo(String value) {
            addCriterion("amazonAccount >=", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountLessThan(String value) {
            addCriterion("amazonAccount <", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountLessThanOrEqualTo(String value) {
            addCriterion("amazonAccount <=", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountLike(String value) {
            addCriterion("amazonAccount like", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountNotLike(String value) {
            addCriterion("amazonAccount not like", value, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountIn(List<String> values) {
            addCriterion("amazonAccount in", values, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountNotIn(List<String> values) {
            addCriterion("amazonAccount not in", values, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountBetween(String value1, String value2) {
            addCriterion("amazonAccount between", value1, value2, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAmazonaccountNotBetween(String value1, String value2) {
            addCriterion("amazonAccount not between", value1, value2, "amazonaccount");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("accountId =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("accountId <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("accountId >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountId >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("accountId <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("accountId <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("accountId in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("accountId not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("accountId between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("accountId not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIsNull() {
            addCriterion("uploadType is null");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIsNotNull() {
            addCriterion("uploadType is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtypeEqualTo(String value) {
            addCriterion("uploadType =", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotEqualTo(String value) {
            addCriterion("uploadType <>", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeGreaterThan(String value) {
            addCriterion("uploadType >", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadType >=", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeLessThan(String value) {
            addCriterion("uploadType <", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeLessThanOrEqualTo(String value) {
            addCriterion("uploadType <=", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeLike(String value) {
            addCriterion("uploadType like", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotLike(String value) {
            addCriterion("uploadType not like", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIn(List<String> values) {
            addCriterion("uploadType in", values, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotIn(List<String> values) {
            addCriterion("uploadType not in", values, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeBetween(String value1, String value2) {
            addCriterion("uploadType between", value1, value2, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotBetween(String value1, String value2) {
            addCriterion("uploadType not between", value1, value2, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescIsNull() {
            addCriterion("uploadTypeDesc is null");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescIsNotNull() {
            addCriterion("uploadTypeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescEqualTo(String value) {
            addCriterion("uploadTypeDesc =", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescNotEqualTo(String value) {
            addCriterion("uploadTypeDesc <>", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescGreaterThan(String value) {
            addCriterion("uploadTypeDesc >", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescGreaterThanOrEqualTo(String value) {
            addCriterion("uploadTypeDesc >=", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescLessThan(String value) {
            addCriterion("uploadTypeDesc <", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescLessThanOrEqualTo(String value) {
            addCriterion("uploadTypeDesc <=", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescLike(String value) {
            addCriterion("uploadTypeDesc like", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescNotLike(String value) {
            addCriterion("uploadTypeDesc not like", value, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescIn(List<String> values) {
            addCriterion("uploadTypeDesc in", values, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescNotIn(List<String> values) {
            addCriterion("uploadTypeDesc not in", values, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescBetween(String value1, String value2) {
            addCriterion("uploadTypeDesc between", value1, value2, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadtypedescNotBetween(String value1, String value2) {
            addCriterion("uploadTypeDesc not between", value1, value2, "uploadtypedesc");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsIsNull() {
            addCriterion("uploadProductCounts is null");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsIsNotNull() {
            addCriterion("uploadProductCounts is not null");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsEqualTo(String value) {
            addCriterion("uploadProductCounts =", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsNotEqualTo(String value) {
            addCriterion("uploadProductCounts <>", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsGreaterThan(String value) {
            addCriterion("uploadProductCounts >", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsGreaterThanOrEqualTo(String value) {
            addCriterion("uploadProductCounts >=", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsLessThan(String value) {
            addCriterion("uploadProductCounts <", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsLessThanOrEqualTo(String value) {
            addCriterion("uploadProductCounts <=", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsLike(String value) {
            addCriterion("uploadProductCounts like", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsNotLike(String value) {
            addCriterion("uploadProductCounts not like", value, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsIn(List<String> values) {
            addCriterion("uploadProductCounts in", values, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsNotIn(List<String> values) {
            addCriterion("uploadProductCounts not in", values, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsBetween(String value1, String value2) {
            addCriterion("uploadProductCounts between", value1, value2, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andUploadproductcountsNotBetween(String value1, String value2) {
            addCriterion("uploadProductCounts not between", value1, value2, "uploadproductcounts");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUploaderrorIsNull() {
            addCriterion("uploadError is null");
            return (Criteria) this;
        }

        public Criteria andUploaderrorIsNotNull() {
            addCriterion("uploadError is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderrorEqualTo(Integer value) {
            addCriterion("uploadError =", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorNotEqualTo(Integer value) {
            addCriterion("uploadError <>", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorGreaterThan(Integer value) {
            addCriterion("uploadError >", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadError >=", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorLessThan(Integer value) {
            addCriterion("uploadError <", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorLessThanOrEqualTo(Integer value) {
            addCriterion("uploadError <=", value, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorIn(List<Integer> values) {
            addCriterion("uploadError in", values, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorNotIn(List<Integer> values) {
            addCriterion("uploadError not in", values, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorBetween(Integer value1, Integer value2) {
            addCriterion("uploadError between", value1, value2, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploaderrorNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadError not between", value1, value2, "uploaderror");
            return (Criteria) this;
        }

        public Criteria andUploadwarnIsNull() {
            addCriterion("uploadWarn is null");
            return (Criteria) this;
        }

        public Criteria andUploadwarnIsNotNull() {
            addCriterion("uploadWarn is not null");
            return (Criteria) this;
        }

        public Criteria andUploadwarnEqualTo(Integer value) {
            addCriterion("uploadWarn =", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnNotEqualTo(Integer value) {
            addCriterion("uploadWarn <>", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnGreaterThan(Integer value) {
            addCriterion("uploadWarn >", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadWarn >=", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnLessThan(Integer value) {
            addCriterion("uploadWarn <", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnLessThanOrEqualTo(Integer value) {
            addCriterion("uploadWarn <=", value, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnIn(List<Integer> values) {
            addCriterion("uploadWarn in", values, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnNotIn(List<Integer> values) {
            addCriterion("uploadWarn not in", values, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnBetween(Integer value1, Integer value2) {
            addCriterion("uploadWarn between", value1, value2, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andUploadwarnNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadWarn not between", value1, value2, "uploadwarn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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