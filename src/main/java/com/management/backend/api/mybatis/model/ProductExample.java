package com.management.backend.api.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andOnsaleIsNull() {
            addCriterion("onsale is null");
            return (Criteria) this;
        }

        public Criteria andOnsaleIsNotNull() {
            addCriterion("onsale is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaleEqualTo(Byte value) {
            addCriterion("onsale =", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleNotEqualTo(Byte value) {
            addCriterion("onsale <>", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleGreaterThan(Byte value) {
            addCriterion("onsale >", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleGreaterThanOrEqualTo(Byte value) {
            addCriterion("onsale >=", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleLessThan(Byte value) {
            addCriterion("onsale <", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleLessThanOrEqualTo(Byte value) {
            addCriterion("onsale <=", value, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleIn(List<Byte> values) {
            addCriterion("onsale in", values, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleNotIn(List<Byte> values) {
            addCriterion("onsale not in", values, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleBetween(Byte value1, Byte value2) {
            addCriterion("onsale between", value1, value2, "onsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleNotBetween(Byte value1, Byte value2) {
            addCriterion("onsale not between", value1, value2, "onsale");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andSourceAreaIsNull() {
            addCriterion("source_area is null");
            return (Criteria) this;
        }

        public Criteria andSourceAreaIsNotNull() {
            addCriterion("source_area is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAreaEqualTo(String value) {
            addCriterion("source_area =", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaNotEqualTo(String value) {
            addCriterion("source_area <>", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaGreaterThan(String value) {
            addCriterion("source_area >", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("source_area >=", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaLessThan(String value) {
            addCriterion("source_area <", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaLessThanOrEqualTo(String value) {
            addCriterion("source_area <=", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaLike(String value) {
            addCriterion("source_area like", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaNotLike(String value) {
            addCriterion("source_area not like", value, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaIn(List<String> values) {
            addCriterion("source_area in", values, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaNotIn(List<String> values) {
            addCriterion("source_area not in", values, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaBetween(String value1, String value2) {
            addCriterion("source_area between", value1, value2, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andSourceAreaNotBetween(String value1, String value2) {
            addCriterion("source_area not between", value1, value2, "sourceArea");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNull() {
            addCriterion("factory_number is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNotNull() {
            addCriterion("factory_number is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberEqualTo(String value) {
            addCriterion("factory_number =", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotEqualTo(String value) {
            addCriterion("factory_number <>", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThan(String value) {
            addCriterion("factory_number >", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("factory_number >=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThan(String value) {
            addCriterion("factory_number <", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThanOrEqualTo(String value) {
            addCriterion("factory_number <=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLike(String value) {
            addCriterion("factory_number like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotLike(String value) {
            addCriterion("factory_number not like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIn(List<String> values) {
            addCriterion("factory_number in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotIn(List<String> values) {
            addCriterion("factory_number not in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberBetween(String value1, String value2) {
            addCriterion("factory_number between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotBetween(String value1, String value2) {
            addCriterion("factory_number not between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogIsNull() {
            addCriterion("factory_catalog is null");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogIsNotNull() {
            addCriterion("factory_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogEqualTo(String value) {
            addCriterion("factory_catalog =", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogNotEqualTo(String value) {
            addCriterion("factory_catalog <>", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogGreaterThan(String value) {
            addCriterion("factory_catalog >", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("factory_catalog >=", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogLessThan(String value) {
            addCriterion("factory_catalog <", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogLessThanOrEqualTo(String value) {
            addCriterion("factory_catalog <=", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogLike(String value) {
            addCriterion("factory_catalog like", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogNotLike(String value) {
            addCriterion("factory_catalog not like", value, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogIn(List<String> values) {
            addCriterion("factory_catalog in", values, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogNotIn(List<String> values) {
            addCriterion("factory_catalog not in", values, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogBetween(String value1, String value2) {
            addCriterion("factory_catalog between", value1, value2, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andFactoryCatalogNotBetween(String value1, String value2) {
            addCriterion("factory_catalog not between", value1, value2, "factoryCatalog");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenIsNull() {
            addCriterion("upload_forbiden is null");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenIsNotNull() {
            addCriterion("upload_forbiden is not null");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenEqualTo(Byte value) {
            addCriterion("upload_forbiden =", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenNotEqualTo(Byte value) {
            addCriterion("upload_forbiden <>", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenGreaterThan(Byte value) {
            addCriterion("upload_forbiden >", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenGreaterThanOrEqualTo(Byte value) {
            addCriterion("upload_forbiden >=", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenLessThan(Byte value) {
            addCriterion("upload_forbiden <", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenLessThanOrEqualTo(Byte value) {
            addCriterion("upload_forbiden <=", value, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenIn(List<Byte> values) {
            addCriterion("upload_forbiden in", values, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenNotIn(List<Byte> values) {
            addCriterion("upload_forbiden not in", values, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenBetween(Byte value1, Byte value2) {
            addCriterion("upload_forbiden between", value1, value2, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andUploadForbidenNotBetween(Byte value1, Byte value2) {
            addCriterion("upload_forbiden not between", value1, value2, "uploadForbiden");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNull() {
            addCriterion("source_url is null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNotNull() {
            addCriterion("source_url is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlEqualTo(String value) {
            addCriterion("source_url =", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotEqualTo(String value) {
            addCriterion("source_url <>", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThan(String value) {
            addCriterion("source_url >", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("source_url >=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThan(String value) {
            addCriterion("source_url <", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThanOrEqualTo(String value) {
            addCriterion("source_url <=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLike(String value) {
            addCriterion("source_url like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotLike(String value) {
            addCriterion("source_url not like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIn(List<String> values) {
            addCriterion("source_url in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotIn(List<String> values) {
            addCriterion("source_url not in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlBetween(String value1, String value2) {
            addCriterion("source_url between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotBetween(String value1, String value2) {
            addCriterion("source_url not between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Float value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Float value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Float value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Float value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Float value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Float value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Float> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Float> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Float value1, Float value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Float value1, Float value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andShippingCostIsNull() {
            addCriterion("shipping_cost is null");
            return (Criteria) this;
        }

        public Criteria andShippingCostIsNotNull() {
            addCriterion("shipping_cost is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCostEqualTo(Float value) {
            addCriterion("shipping_cost =", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostNotEqualTo(Float value) {
            addCriterion("shipping_cost <>", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostGreaterThan(Float value) {
            addCriterion("shipping_cost >", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostGreaterThanOrEqualTo(Float value) {
            addCriterion("shipping_cost >=", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostLessThan(Float value) {
            addCriterion("shipping_cost <", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostLessThanOrEqualTo(Float value) {
            addCriterion("shipping_cost <=", value, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostIn(List<Float> values) {
            addCriterion("shipping_cost in", values, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostNotIn(List<Float> values) {
            addCriterion("shipping_cost not in", values, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostBetween(Float value1, Float value2) {
            addCriterion("shipping_cost between", value1, value2, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andShippingCostNotBetween(Float value1, Float value2) {
            addCriterion("shipping_cost not between", value1, value2, "shippingCost");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIsNull() {
            addCriterion("custom_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIsNotNull() {
            addCriterion("custom_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomCodeEqualTo(String value) {
            addCriterion("custom_code =", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotEqualTo(String value) {
            addCriterion("custom_code <>", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeGreaterThan(String value) {
            addCriterion("custom_code >", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("custom_code >=", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLessThan(String value) {
            addCriterion("custom_code <", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLessThanOrEqualTo(String value) {
            addCriterion("custom_code <=", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLike(String value) {
            addCriterion("custom_code like", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotLike(String value) {
            addCriterion("custom_code not like", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIn(List<String> values) {
            addCriterion("custom_code in", values, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotIn(List<String> values) {
            addCriterion("custom_code not in", values, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeBetween(String value1, String value2) {
            addCriterion("custom_code between", value1, value2, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotBetween(String value1, String value2) {
            addCriterion("custom_code not between", value1, value2, "customCode");
            return (Criteria) this;
        }

        public Criteria andEngDescIsNull() {
            addCriterion("eng_desc is null");
            return (Criteria) this;
        }

        public Criteria andEngDescIsNotNull() {
            addCriterion("eng_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEngDescEqualTo(String value) {
            addCriterion("eng_desc =", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescNotEqualTo(String value) {
            addCriterion("eng_desc <>", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescGreaterThan(String value) {
            addCriterion("eng_desc >", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescGreaterThanOrEqualTo(String value) {
            addCriterion("eng_desc >=", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescLessThan(String value) {
            addCriterion("eng_desc <", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescLessThanOrEqualTo(String value) {
            addCriterion("eng_desc <=", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescLike(String value) {
            addCriterion("eng_desc like", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescNotLike(String value) {
            addCriterion("eng_desc not like", value, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescIn(List<String> values) {
            addCriterion("eng_desc in", values, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescNotIn(List<String> values) {
            addCriterion("eng_desc not in", values, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescBetween(String value1, String value2) {
            addCriterion("eng_desc between", value1, value2, "engDesc");
            return (Criteria) this;
        }

        public Criteria andEngDescNotBetween(String value1, String value2) {
            addCriterion("eng_desc not between", value1, value2, "engDesc");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceIsNull() {
            addCriterion("declare_price is null");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceIsNotNull() {
            addCriterion("declare_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceEqualTo(String value) {
            addCriterion("declare_price =", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceNotEqualTo(String value) {
            addCriterion("declare_price <>", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceGreaterThan(String value) {
            addCriterion("declare_price >", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceGreaterThanOrEqualTo(String value) {
            addCriterion("declare_price >=", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceLessThan(String value) {
            addCriterion("declare_price <", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceLessThanOrEqualTo(String value) {
            addCriterion("declare_price <=", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceLike(String value) {
            addCriterion("declare_price like", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceNotLike(String value) {
            addCriterion("declare_price not like", value, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceIn(List<String> values) {
            addCriterion("declare_price in", values, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceNotIn(List<String> values) {
            addCriterion("declare_price not in", values, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceBetween(String value1, String value2) {
            addCriterion("declare_price between", value1, value2, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andDeclarePriceNotBetween(String value1, String value2) {
            addCriterion("declare_price not between", value1, value2, "declarePrice");
            return (Criteria) this;
        }

        public Criteria andChDescIsNull() {
            addCriterion("ch_desc is null");
            return (Criteria) this;
        }

        public Criteria andChDescIsNotNull() {
            addCriterion("ch_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChDescEqualTo(String value) {
            addCriterion("ch_desc =", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescNotEqualTo(String value) {
            addCriterion("ch_desc <>", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescGreaterThan(String value) {
            addCriterion("ch_desc >", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescGreaterThanOrEqualTo(String value) {
            addCriterion("ch_desc >=", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescLessThan(String value) {
            addCriterion("ch_desc <", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescLessThanOrEqualTo(String value) {
            addCriterion("ch_desc <=", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescLike(String value) {
            addCriterion("ch_desc like", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescNotLike(String value) {
            addCriterion("ch_desc not like", value, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescIn(List<String> values) {
            addCriterion("ch_desc in", values, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescNotIn(List<String> values) {
            addCriterion("ch_desc not in", values, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescBetween(String value1, String value2) {
            addCriterion("ch_desc between", value1, value2, "chDesc");
            return (Criteria) this;
        }

        public Criteria andChDescNotBetween(String value1, String value2) {
            addCriterion("ch_desc not between", value1, value2, "chDesc");
            return (Criteria) this;
        }

        public Criteria andInnerSkuIsNull() {
            addCriterion("inner_sku is null");
            return (Criteria) this;
        }

        public Criteria andInnerSkuIsNotNull() {
            addCriterion("inner_sku is not null");
            return (Criteria) this;
        }

        public Criteria andInnerSkuEqualTo(String value) {
            addCriterion("inner_sku =", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuNotEqualTo(String value) {
            addCriterion("inner_sku <>", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuGreaterThan(String value) {
            addCriterion("inner_sku >", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuGreaterThanOrEqualTo(String value) {
            addCriterion("inner_sku >=", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuLessThan(String value) {
            addCriterion("inner_sku <", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuLessThanOrEqualTo(String value) {
            addCriterion("inner_sku <=", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuLike(String value) {
            addCriterion("inner_sku like", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuNotLike(String value) {
            addCriterion("inner_sku not like", value, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuIn(List<String> values) {
            addCriterion("inner_sku in", values, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuNotIn(List<String> values) {
            addCriterion("inner_sku not in", values, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuBetween(String value1, String value2) {
            addCriterion("inner_sku between", value1, value2, "innerSku");
            return (Criteria) this;
        }

        public Criteria andInnerSkuNotBetween(String value1, String value2) {
            addCriterion("inner_sku not between", value1, value2, "innerSku");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupIsNull() {
            addCriterion("suit_for_group is null");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupIsNotNull() {
            addCriterion("suit_for_group is not null");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupEqualTo(Byte value) {
            addCriterion("suit_for_group =", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupNotEqualTo(Byte value) {
            addCriterion("suit_for_group <>", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupGreaterThan(Byte value) {
            addCriterion("suit_for_group >", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupGreaterThanOrEqualTo(Byte value) {
            addCriterion("suit_for_group >=", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupLessThan(Byte value) {
            addCriterion("suit_for_group <", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupLessThanOrEqualTo(Byte value) {
            addCriterion("suit_for_group <=", value, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupIn(List<Byte> values) {
            addCriterion("suit_for_group in", values, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupNotIn(List<Byte> values) {
            addCriterion("suit_for_group not in", values, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupBetween(Byte value1, Byte value2) {
            addCriterion("suit_for_group between", value1, value2, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andSuitForGroupNotBetween(Byte value1, Byte value2) {
            addCriterion("suit_for_group not between", value1, value2, "suitForGroup");
            return (Criteria) this;
        }

        public Criteria andProductMaterialIsNull() {
            addCriterion("product_material is null");
            return (Criteria) this;
        }

        public Criteria andProductMaterialIsNotNull() {
            addCriterion("product_material is not null");
            return (Criteria) this;
        }

        public Criteria andProductMaterialEqualTo(String value) {
            addCriterion("product_material =", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialNotEqualTo(String value) {
            addCriterion("product_material <>", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialGreaterThan(String value) {
            addCriterion("product_material >", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("product_material >=", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialLessThan(String value) {
            addCriterion("product_material <", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialLessThanOrEqualTo(String value) {
            addCriterion("product_material <=", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialLike(String value) {
            addCriterion("product_material like", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialNotLike(String value) {
            addCriterion("product_material not like", value, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialIn(List<String> values) {
            addCriterion("product_material in", values, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialNotIn(List<String> values) {
            addCriterion("product_material not in", values, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialBetween(String value1, String value2) {
            addCriterion("product_material between", value1, value2, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andProductMaterialNotBetween(String value1, String value2) {
            addCriterion("product_material not between", value1, value2, "productMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialIsNull() {
            addCriterion("packet_material is null");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialIsNotNull() {
            addCriterion("packet_material is not null");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialEqualTo(String value) {
            addCriterion("packet_material =", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialNotEqualTo(String value) {
            addCriterion("packet_material <>", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialGreaterThan(String value) {
            addCriterion("packet_material >", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("packet_material >=", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialLessThan(String value) {
            addCriterion("packet_material <", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialLessThanOrEqualTo(String value) {
            addCriterion("packet_material <=", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialLike(String value) {
            addCriterion("packet_material like", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialNotLike(String value) {
            addCriterion("packet_material not like", value, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialIn(List<String> values) {
            addCriterion("packet_material in", values, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialNotIn(List<String> values) {
            addCriterion("packet_material not in", values, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialBetween(String value1, String value2) {
            addCriterion("packet_material between", value1, value2, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andPacketMaterialNotBetween(String value1, String value2) {
            addCriterion("packet_material not between", value1, value2, "packetMaterial");
            return (Criteria) this;
        }

        public Criteria andMetalTypeIsNull() {
            addCriterion("metal_type is null");
            return (Criteria) this;
        }

        public Criteria andMetalTypeIsNotNull() {
            addCriterion("metal_type is not null");
            return (Criteria) this;
        }

        public Criteria andMetalTypeEqualTo(String value) {
            addCriterion("metal_type =", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeNotEqualTo(String value) {
            addCriterion("metal_type <>", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeGreaterThan(String value) {
            addCriterion("metal_type >", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("metal_type >=", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeLessThan(String value) {
            addCriterion("metal_type <", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeLessThanOrEqualTo(String value) {
            addCriterion("metal_type <=", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeLike(String value) {
            addCriterion("metal_type like", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeNotLike(String value) {
            addCriterion("metal_type not like", value, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeIn(List<String> values) {
            addCriterion("metal_type in", values, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeNotIn(List<String> values) {
            addCriterion("metal_type not in", values, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeBetween(String value1, String value2) {
            addCriterion("metal_type between", value1, value2, "metalType");
            return (Criteria) this;
        }

        public Criteria andMetalTypeNotBetween(String value1, String value2) {
            addCriterion("metal_type not between", value1, value2, "metalType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeIsNull() {
            addCriterion("jewel_type is null");
            return (Criteria) this;
        }

        public Criteria andJewelTypeIsNotNull() {
            addCriterion("jewel_type is not null");
            return (Criteria) this;
        }

        public Criteria andJewelTypeEqualTo(String value) {
            addCriterion("jewel_type =", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeNotEqualTo(String value) {
            addCriterion("jewel_type <>", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeGreaterThan(String value) {
            addCriterion("jewel_type >", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("jewel_type >=", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeLessThan(String value) {
            addCriterion("jewel_type <", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeLessThanOrEqualTo(String value) {
            addCriterion("jewel_type <=", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeLike(String value) {
            addCriterion("jewel_type like", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeNotLike(String value) {
            addCriterion("jewel_type not like", value, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeIn(List<String> values) {
            addCriterion("jewel_type in", values, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeNotIn(List<String> values) {
            addCriterion("jewel_type not in", values, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeBetween(String value1, String value2) {
            addCriterion("jewel_type between", value1, value2, "jewelType");
            return (Criteria) this;
        }

        public Criteria andJewelTypeNotBetween(String value1, String value2) {
            addCriterion("jewel_type not between", value1, value2, "jewelType");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightIsNull() {
            addCriterion("package_gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightIsNotNull() {
            addCriterion("package_gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightEqualTo(String value) {
            addCriterion("package_gross_weight =", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightNotEqualTo(String value) {
            addCriterion("package_gross_weight <>", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightGreaterThan(String value) {
            addCriterion("package_gross_weight >", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightGreaterThanOrEqualTo(String value) {
            addCriterion("package_gross_weight >=", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightLessThan(String value) {
            addCriterion("package_gross_weight <", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightLessThanOrEqualTo(String value) {
            addCriterion("package_gross_weight <=", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightLike(String value) {
            addCriterion("package_gross_weight like", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightNotLike(String value) {
            addCriterion("package_gross_weight not like", value, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightIn(List<String> values) {
            addCriterion("package_gross_weight in", values, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightNotIn(List<String> values) {
            addCriterion("package_gross_weight not in", values, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightBetween(String value1, String value2) {
            addCriterion("package_gross_weight between", value1, value2, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andPackageGrossWeightNotBetween(String value1, String value2) {
            addCriterion("package_gross_weight not between", value1, value2, "packageGrossWeight");
            return (Criteria) this;
        }

        public Criteria andHasBatteryIsNull() {
            addCriterion("has_battery is null");
            return (Criteria) this;
        }

        public Criteria andHasBatteryIsNotNull() {
            addCriterion("has_battery is not null");
            return (Criteria) this;
        }

        public Criteria andHasBatteryEqualTo(Byte value) {
            addCriterion("has_battery =", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryNotEqualTo(Byte value) {
            addCriterion("has_battery <>", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryGreaterThan(Byte value) {
            addCriterion("has_battery >", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryGreaterThanOrEqualTo(Byte value) {
            addCriterion("has_battery >=", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryLessThan(Byte value) {
            addCriterion("has_battery <", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryLessThanOrEqualTo(Byte value) {
            addCriterion("has_battery <=", value, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryIn(List<Byte> values) {
            addCriterion("has_battery in", values, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryNotIn(List<Byte> values) {
            addCriterion("has_battery not in", values, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryBetween(Byte value1, Byte value2) {
            addCriterion("has_battery between", value1, value2, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andHasBatteryNotBetween(Byte value1, Byte value2) {
            addCriterion("has_battery not between", value1, value2, "hasBattery");
            return (Criteria) this;
        }

        public Criteria andPackageLongIsNull() {
            addCriterion("package_long is null");
            return (Criteria) this;
        }

        public Criteria andPackageLongIsNotNull() {
            addCriterion("package_long is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLongEqualTo(Float value) {
            addCriterion("package_long =", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongNotEqualTo(Float value) {
            addCriterion("package_long <>", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongGreaterThan(Float value) {
            addCriterion("package_long >", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongGreaterThanOrEqualTo(Float value) {
            addCriterion("package_long >=", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongLessThan(Float value) {
            addCriterion("package_long <", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongLessThanOrEqualTo(Float value) {
            addCriterion("package_long <=", value, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongIn(List<Float> values) {
            addCriterion("package_long in", values, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongNotIn(List<Float> values) {
            addCriterion("package_long not in", values, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongBetween(Float value1, Float value2) {
            addCriterion("package_long between", value1, value2, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageLongNotBetween(Float value1, Float value2) {
            addCriterion("package_long not between", value1, value2, "packageLong");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNull() {
            addCriterion("package_width is null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNotNull() {
            addCriterion("package_width is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthEqualTo(Float value) {
            addCriterion("package_width =", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotEqualTo(Float value) {
            addCriterion("package_width <>", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThan(Float value) {
            addCriterion("package_width >", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("package_width >=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThan(Float value) {
            addCriterion("package_width <", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThanOrEqualTo(Float value) {
            addCriterion("package_width <=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIn(List<Float> values) {
            addCriterion("package_width in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotIn(List<Float> values) {
            addCriterion("package_width not in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthBetween(Float value1, Float value2) {
            addCriterion("package_width between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotBetween(Float value1, Float value2) {
            addCriterion("package_width not between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageHightIsNull() {
            addCriterion("package_hight is null");
            return (Criteria) this;
        }

        public Criteria andPackageHightIsNotNull() {
            addCriterion("package_hight is not null");
            return (Criteria) this;
        }

        public Criteria andPackageHightEqualTo(Float value) {
            addCriterion("package_hight =", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightNotEqualTo(Float value) {
            addCriterion("package_hight <>", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightGreaterThan(Float value) {
            addCriterion("package_hight >", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightGreaterThanOrEqualTo(Float value) {
            addCriterion("package_hight >=", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightLessThan(Float value) {
            addCriterion("package_hight <", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightLessThanOrEqualTo(Float value) {
            addCriterion("package_hight <=", value, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightIn(List<Float> values) {
            addCriterion("package_hight in", values, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightNotIn(List<Float> values) {
            addCriterion("package_hight not in", values, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightBetween(Float value1, Float value2) {
            addCriterion("package_hight between", value1, value2, "packageHight");
            return (Criteria) this;
        }

        public Criteria andPackageHightNotBetween(Float value1, Float value2) {
            addCriterion("package_hight not between", value1, value2, "packageHight");
            return (Criteria) this;
        }

        public Criteria andInStoreIsNull() {
            addCriterion("in_store is null");
            return (Criteria) this;
        }

        public Criteria andInStoreIsNotNull() {
            addCriterion("in_store is not null");
            return (Criteria) this;
        }

        public Criteria andInStoreEqualTo(Long value) {
            addCriterion("in_store =", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreNotEqualTo(Long value) {
            addCriterion("in_store <>", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreGreaterThan(Long value) {
            addCriterion("in_store >", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreGreaterThanOrEqualTo(Long value) {
            addCriterion("in_store >=", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreLessThan(Long value) {
            addCriterion("in_store <", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreLessThanOrEqualTo(Long value) {
            addCriterion("in_store <=", value, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreIn(List<Long> values) {
            addCriterion("in_store in", values, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreNotIn(List<Long> values) {
            addCriterion("in_store not in", values, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreBetween(Long value1, Long value2) {
            addCriterion("in_store between", value1, value2, "inStore");
            return (Criteria) this;
        }

        public Criteria andInStoreNotBetween(Long value1, Long value2) {
            addCriterion("in_store not between", value1, value2, "inStore");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageIsNull() {
            addCriterion("count_per_package is null");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageIsNotNull() {
            addCriterion("count_per_package is not null");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageEqualTo(Long value) {
            addCriterion("count_per_package =", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageNotEqualTo(Long value) {
            addCriterion("count_per_package <>", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageGreaterThan(Long value) {
            addCriterion("count_per_package >", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageGreaterThanOrEqualTo(Long value) {
            addCriterion("count_per_package >=", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageLessThan(Long value) {
            addCriterion("count_per_package <", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageLessThanOrEqualTo(Long value) {
            addCriterion("count_per_package <=", value, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageIn(List<Long> values) {
            addCriterion("count_per_package in", values, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageNotIn(List<Long> values) {
            addCriterion("count_per_package not in", values, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageBetween(Long value1, Long value2) {
            addCriterion("count_per_package between", value1, value2, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andCountPerPackageNotBetween(Long value1, Long value2) {
            addCriterion("count_per_package not between", value1, value2, "countPerPackage");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
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