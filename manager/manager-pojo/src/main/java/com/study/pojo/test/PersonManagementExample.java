package com.study.pojo.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonManagementExample() {
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

        public Criteria andPmIdIsNull() {
            addCriterion("PM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("PM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Long value) {
            addCriterion("PM_ID =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Long value) {
            addCriterion("PM_ID <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Long value) {
            addCriterion("PM_ID >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PM_ID >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Long value) {
            addCriterion("PM_ID <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Long value) {
            addCriterion("PM_ID <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Long> values) {
            addCriterion("PM_ID in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Long> values) {
            addCriterion("PM_ID not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Long value1, Long value2) {
            addCriterion("PM_ID between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Long value1, Long value2) {
            addCriterion("PM_ID not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdIsNull() {
            addCriterion("PM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdIsNotNull() {
            addCriterion("PM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdEqualTo(Long value) {
            addCriterion("PM_ROLE_ID =", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdNotEqualTo(Long value) {
            addCriterion("PM_ROLE_ID <>", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdGreaterThan(Long value) {
            addCriterion("PM_ROLE_ID >", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PM_ROLE_ID >=", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdLessThan(Long value) {
            addCriterion("PM_ROLE_ID <", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("PM_ROLE_ID <=", value, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdIn(List<Long> values) {
            addCriterion("PM_ROLE_ID in", values, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdNotIn(List<Long> values) {
            addCriterion("PM_ROLE_ID not in", values, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdBetween(Long value1, Long value2) {
            addCriterion("PM_ROLE_ID between", value1, value2, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("PM_ROLE_ID not between", value1, value2, "pmRoleId");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameIsNull() {
            addCriterion("PM_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameIsNotNull() {
            addCriterion("PM_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameEqualTo(String value) {
            addCriterion("PM_ROLE_NAME =", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameNotEqualTo(String value) {
            addCriterion("PM_ROLE_NAME <>", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameGreaterThan(String value) {
            addCriterion("PM_ROLE_NAME >", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("PM_ROLE_NAME >=", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameLessThan(String value) {
            addCriterion("PM_ROLE_NAME <", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameLessThanOrEqualTo(String value) {
            addCriterion("PM_ROLE_NAME <=", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameLike(String value) {
            addCriterion("PM_ROLE_NAME like", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameNotLike(String value) {
            addCriterion("PM_ROLE_NAME not like", value, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameIn(List<String> values) {
            addCriterion("PM_ROLE_NAME in", values, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameNotIn(List<String> values) {
            addCriterion("PM_ROLE_NAME not in", values, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameBetween(String value1, String value2) {
            addCriterion("PM_ROLE_NAME between", value1, value2, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmRoleNameNotBetween(String value1, String value2) {
            addCriterion("PM_ROLE_NAME not between", value1, value2, "pmRoleName");
            return (Criteria) this;
        }

        public Criteria andPmTenantidIsNull() {
            addCriterion("PM_TENANTID is null");
            return (Criteria) this;
        }

        public Criteria andPmTenantidIsNotNull() {
            addCriterion("PM_TENANTID is not null");
            return (Criteria) this;
        }

        public Criteria andPmTenantidEqualTo(String value) {
            addCriterion("PM_TENANTID =", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidNotEqualTo(String value) {
            addCriterion("PM_TENANTID <>", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidGreaterThan(String value) {
            addCriterion("PM_TENANTID >", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidGreaterThanOrEqualTo(String value) {
            addCriterion("PM_TENANTID >=", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidLessThan(String value) {
            addCriterion("PM_TENANTID <", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidLessThanOrEqualTo(String value) {
            addCriterion("PM_TENANTID <=", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidLike(String value) {
            addCriterion("PM_TENANTID like", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidNotLike(String value) {
            addCriterion("PM_TENANTID not like", value, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidIn(List<String> values) {
            addCriterion("PM_TENANTID in", values, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidNotIn(List<String> values) {
            addCriterion("PM_TENANTID not in", values, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidBetween(String value1, String value2) {
            addCriterion("PM_TENANTID between", value1, value2, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmTenantidNotBetween(String value1, String value2) {
            addCriterion("PM_TENANTID not between", value1, value2, "pmTenantid");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeIsNull() {
            addCriterion("PM_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeIsNotNull() {
            addCriterion("PM_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeEqualTo(String value) {
            addCriterion("PM_PROVINCE_CODE =", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeNotEqualTo(String value) {
            addCriterion("PM_PROVINCE_CODE <>", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeGreaterThan(String value) {
            addCriterion("PM_PROVINCE_CODE >", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PM_PROVINCE_CODE >=", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeLessThan(String value) {
            addCriterion("PM_PROVINCE_CODE <", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PM_PROVINCE_CODE <=", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeLike(String value) {
            addCriterion("PM_PROVINCE_CODE like", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeNotLike(String value) {
            addCriterion("PM_PROVINCE_CODE not like", value, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeIn(List<String> values) {
            addCriterion("PM_PROVINCE_CODE in", values, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeNotIn(List<String> values) {
            addCriterion("PM_PROVINCE_CODE not in", values, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeBetween(String value1, String value2) {
            addCriterion("PM_PROVINCE_CODE between", value1, value2, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PM_PROVINCE_CODE not between", value1, value2, "pmProvinceCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeIsNull() {
            addCriterion("PM_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeIsNotNull() {
            addCriterion("PM_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeEqualTo(String value) {
            addCriterion("PM_CITY_CODE =", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeNotEqualTo(String value) {
            addCriterion("PM_CITY_CODE <>", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeGreaterThan(String value) {
            addCriterion("PM_CITY_CODE >", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PM_CITY_CODE >=", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeLessThan(String value) {
            addCriterion("PM_CITY_CODE <", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeLessThanOrEqualTo(String value) {
            addCriterion("PM_CITY_CODE <=", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeLike(String value) {
            addCriterion("PM_CITY_CODE like", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeNotLike(String value) {
            addCriterion("PM_CITY_CODE not like", value, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeIn(List<String> values) {
            addCriterion("PM_CITY_CODE in", values, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeNotIn(List<String> values) {
            addCriterion("PM_CITY_CODE not in", values, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeBetween(String value1, String value2) {
            addCriterion("PM_CITY_CODE between", value1, value2, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmCityCodeNotBetween(String value1, String value2) {
            addCriterion("PM_CITY_CODE not between", value1, value2, "pmCityCode");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdIsNull() {
            addCriterion("PM_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdIsNotNull() {
            addCriterion("PM_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdEqualTo(String value) {
            addCriterion("PM_PERSON_ID =", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdNotEqualTo(String value) {
            addCriterion("PM_PERSON_ID <>", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdGreaterThan(String value) {
            addCriterion("PM_PERSON_ID >", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_ID >=", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdLessThan(String value) {
            addCriterion("PM_PERSON_ID <", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdLessThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_ID <=", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdLike(String value) {
            addCriterion("PM_PERSON_ID like", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdNotLike(String value) {
            addCriterion("PM_PERSON_ID not like", value, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdIn(List<String> values) {
            addCriterion("PM_PERSON_ID in", values, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdNotIn(List<String> values) {
            addCriterion("PM_PERSON_ID not in", values, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdBetween(String value1, String value2) {
            addCriterion("PM_PERSON_ID between", value1, value2, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonIdNotBetween(String value1, String value2) {
            addCriterion("PM_PERSON_ID not between", value1, value2, "pmPersonId");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameIsNull() {
            addCriterion("PM_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameIsNotNull() {
            addCriterion("PM_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameEqualTo(String value) {
            addCriterion("PM_PERSON_NAME =", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameNotEqualTo(String value) {
            addCriterion("PM_PERSON_NAME <>", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameGreaterThan(String value) {
            addCriterion("PM_PERSON_NAME >", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_NAME >=", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameLessThan(String value) {
            addCriterion("PM_PERSON_NAME <", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameLessThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_NAME <=", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameLike(String value) {
            addCriterion("PM_PERSON_NAME like", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameNotLike(String value) {
            addCriterion("PM_PERSON_NAME not like", value, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameIn(List<String> values) {
            addCriterion("PM_PERSON_NAME in", values, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameNotIn(List<String> values) {
            addCriterion("PM_PERSON_NAME not in", values, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameBetween(String value1, String value2) {
            addCriterion("PM_PERSON_NAME between", value1, value2, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonNameNotBetween(String value1, String value2) {
            addCriterion("PM_PERSON_NAME not between", value1, value2, "pmPersonName");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateIsNull() {
            addCriterion("PM_PERSON_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateIsNotNull() {
            addCriterion("PM_PERSON_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateEqualTo(String value) {
            addCriterion("PM_PERSON_STATE =", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateNotEqualTo(String value) {
            addCriterion("PM_PERSON_STATE <>", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateGreaterThan(String value) {
            addCriterion("PM_PERSON_STATE >", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateGreaterThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_STATE >=", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateLessThan(String value) {
            addCriterion("PM_PERSON_STATE <", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateLessThanOrEqualTo(String value) {
            addCriterion("PM_PERSON_STATE <=", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateLike(String value) {
            addCriterion("PM_PERSON_STATE like", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateNotLike(String value) {
            addCriterion("PM_PERSON_STATE not like", value, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateIn(List<String> values) {
            addCriterion("PM_PERSON_STATE in", values, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateNotIn(List<String> values) {
            addCriterion("PM_PERSON_STATE not in", values, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateBetween(String value1, String value2) {
            addCriterion("PM_PERSON_STATE between", value1, value2, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmPersonStateNotBetween(String value1, String value2) {
            addCriterion("PM_PERSON_STATE not between", value1, value2, "pmPersonState");
            return (Criteria) this;
        }

        public Criteria andPmMechanismIsNull() {
            addCriterion("PM_MECHANISM is null");
            return (Criteria) this;
        }

        public Criteria andPmMechanismIsNotNull() {
            addCriterion("PM_MECHANISM is not null");
            return (Criteria) this;
        }

        public Criteria andPmMechanismEqualTo(String value) {
            addCriterion("PM_MECHANISM =", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismNotEqualTo(String value) {
            addCriterion("PM_MECHANISM <>", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismGreaterThan(String value) {
            addCriterion("PM_MECHANISM >", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("PM_MECHANISM >=", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismLessThan(String value) {
            addCriterion("PM_MECHANISM <", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismLessThanOrEqualTo(String value) {
            addCriterion("PM_MECHANISM <=", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismLike(String value) {
            addCriterion("PM_MECHANISM like", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismNotLike(String value) {
            addCriterion("PM_MECHANISM not like", value, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismIn(List<String> values) {
            addCriterion("PM_MECHANISM in", values, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismNotIn(List<String> values) {
            addCriterion("PM_MECHANISM not in", values, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismBetween(String value1, String value2) {
            addCriterion("PM_MECHANISM between", value1, value2, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmMechanismNotBetween(String value1, String value2) {
            addCriterion("PM_MECHANISM not between", value1, value2, "pmMechanism");
            return (Criteria) this;
        }

        public Criteria andPmBusinessIsNull() {
            addCriterion("PM_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andPmBusinessIsNotNull() {
            addCriterion("PM_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andPmBusinessEqualTo(String value) {
            addCriterion("PM_BUSINESS =", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessNotEqualTo(String value) {
            addCriterion("PM_BUSINESS <>", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessGreaterThan(String value) {
            addCriterion("PM_BUSINESS >", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("PM_BUSINESS >=", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessLessThan(String value) {
            addCriterion("PM_BUSINESS <", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessLessThanOrEqualTo(String value) {
            addCriterion("PM_BUSINESS <=", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessLike(String value) {
            addCriterion("PM_BUSINESS like", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessNotLike(String value) {
            addCriterion("PM_BUSINESS not like", value, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessIn(List<String> values) {
            addCriterion("PM_BUSINESS in", values, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessNotIn(List<String> values) {
            addCriterion("PM_BUSINESS not in", values, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessBetween(String value1, String value2) {
            addCriterion("PM_BUSINESS between", value1, value2, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmBusinessNotBetween(String value1, String value2) {
            addCriterion("PM_BUSINESS not between", value1, value2, "pmBusiness");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeIsNull() {
            addCriterion("PM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeIsNotNull() {
            addCriterion("PM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeEqualTo(Date value) {
            addCriterion("PM_CREATETIME =", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeNotEqualTo(Date value) {
            addCriterion("PM_CREATETIME <>", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeGreaterThan(Date value) {
            addCriterion("PM_CREATETIME >", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PM_CREATETIME >=", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeLessThan(Date value) {
            addCriterion("PM_CREATETIME <", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("PM_CREATETIME <=", value, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeIn(List<Date> values) {
            addCriterion("PM_CREATETIME in", values, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeNotIn(List<Date> values) {
            addCriterion("PM_CREATETIME not in", values, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeBetween(Date value1, Date value2) {
            addCriterion("PM_CREATETIME between", value1, value2, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andPmCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("PM_CREATETIME not between", value1, value2, "pmCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("ATTRIBUTE4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("ATTRIBUTE4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("ATTRIBUTE4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("ATTRIBUTE4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("ATTRIBUTE4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("ATTRIBUTE4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("ATTRIBUTE4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("ATTRIBUTE4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE5 not between", value1, value2, "attribute5");
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