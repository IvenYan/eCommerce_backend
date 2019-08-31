package com.management.backend.api.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class AmazonProductStandardNoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonProductStandardNoExample() {
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

        public Criteria andStandardProductIdIsNull() {
            addCriterion("standard_product_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdIsNotNull() {
            addCriterion("standard_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdEqualTo(String value) {
            addCriterion("standard_product_id =", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdNotEqualTo(String value) {
            addCriterion("standard_product_id <>", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdGreaterThan(String value) {
            addCriterion("standard_product_id >", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("standard_product_id >=", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdLessThan(String value) {
            addCriterion("standard_product_id <", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdLessThanOrEqualTo(String value) {
            addCriterion("standard_product_id <=", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdLike(String value) {
            addCriterion("standard_product_id like", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdNotLike(String value) {
            addCriterion("standard_product_id not like", value, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdIn(List<String> values) {
            addCriterion("standard_product_id in", values, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdNotIn(List<String> values) {
            addCriterion("standard_product_id not in", values, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdBetween(String value1, String value2) {
            addCriterion("standard_product_id between", value1, value2, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardProductIdNotBetween(String value1, String value2) {
            addCriterion("standard_product_id not between", value1, value2, "standardProductId");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIsNull() {
            addCriterion("standard_type is null");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIsNotNull() {
            addCriterion("standard_type is not null");
            return (Criteria) this;
        }

        public Criteria andStandardTypeEqualTo(String value) {
            addCriterion("standard_type =", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotEqualTo(String value) {
            addCriterion("standard_type <>", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeGreaterThan(String value) {
            addCriterion("standard_type >", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("standard_type >=", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLessThan(String value) {
            addCriterion("standard_type <", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLessThanOrEqualTo(String value) {
            addCriterion("standard_type <=", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLike(String value) {
            addCriterion("standard_type like", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotLike(String value) {
            addCriterion("standard_type not like", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIn(List<String> values) {
            addCriterion("standard_type in", values, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotIn(List<String> values) {
            addCriterion("standard_type not in", values, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeBetween(String value1, String value2) {
            addCriterion("standard_type between", value1, value2, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotBetween(String value1, String value2) {
            addCriterion("standard_type not between", value1, value2, "standardType");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(String value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(String value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(String value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(String value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(String value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(String value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLike(String value) {
            addCriterion("used like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotLike(String value) {
            addCriterion("used not like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<String> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<String> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(String value1, String value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(String value1, String value2) {
            addCriterion("used not between", value1, value2, "used");
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