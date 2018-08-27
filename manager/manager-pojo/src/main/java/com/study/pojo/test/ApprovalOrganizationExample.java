package com.study.pojo.test;

import java.util.ArrayList;
import java.util.List;

public class ApprovalOrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalOrganizationExample() {
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

        public Criteria andAoidIsNull() {
            addCriterion("AOID is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("AOID is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(String value) {
            addCriterion("AOID =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(String value) {
            addCriterion("AOID <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(String value) {
            addCriterion("AOID >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(String value) {
            addCriterion("AOID >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(String value) {
            addCriterion("AOID <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(String value) {
            addCriterion("AOID <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLike(String value) {
            addCriterion("AOID like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotLike(String value) {
            addCriterion("AOID not like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<String> values) {
            addCriterion("AOID in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<String> values) {
            addCriterion("AOID not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(String value1, String value2) {
            addCriterion("AOID between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(String value1, String value2) {
            addCriterion("AOID not between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoPmIdIsNull() {
            addCriterion("AO_PM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAoPmIdIsNotNull() {
            addCriterion("AO_PM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAoPmIdEqualTo(String value) {
            addCriterion("AO_PM_ID =", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdNotEqualTo(String value) {
            addCriterion("AO_PM_ID <>", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdGreaterThan(String value) {
            addCriterion("AO_PM_ID >", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdGreaterThanOrEqualTo(String value) {
            addCriterion("AO_PM_ID >=", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdLessThan(String value) {
            addCriterion("AO_PM_ID <", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdLessThanOrEqualTo(String value) {
            addCriterion("AO_PM_ID <=", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdLike(String value) {
            addCriterion("AO_PM_ID like", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdNotLike(String value) {
            addCriterion("AO_PM_ID not like", value, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdIn(List<String> values) {
            addCriterion("AO_PM_ID in", values, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdNotIn(List<String> values) {
            addCriterion("AO_PM_ID not in", values, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdBetween(String value1, String value2) {
            addCriterion("AO_PM_ID between", value1, value2, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoPmIdNotBetween(String value1, String value2) {
            addCriterion("AO_PM_ID not between", value1, value2, "aoPmId");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismIsNull() {
            addCriterion("AO_APPROVAL_MECHANISM is null");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismIsNotNull() {
            addCriterion("AO_APPROVAL_MECHANISM is not null");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM =", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismNotEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM <>", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismGreaterThan(String value) {
            addCriterion("AO_APPROVAL_MECHANISM >", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM >=", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismLessThan(String value) {
            addCriterion("AO_APPROVAL_MECHANISM <", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismLessThanOrEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM <=", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismLike(String value) {
            addCriterion("AO_APPROVAL_MECHANISM like", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismNotLike(String value) {
            addCriterion("AO_APPROVAL_MECHANISM not like", value, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismIn(List<String> values) {
            addCriterion("AO_APPROVAL_MECHANISM in", values, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismNotIn(List<String> values) {
            addCriterion("AO_APPROVAL_MECHANISM not in", values, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismBetween(String value1, String value2) {
            addCriterion("AO_APPROVAL_MECHANISM between", value1, value2, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismNotBetween(String value1, String value2) {
            addCriterion("AO_APPROVAL_MECHANISM not between", value1, value2, "aoApprovalMechanism");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeIsNull() {
            addCriterion("AO_APPROVAL_MECHANISM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeIsNotNull() {
            addCriterion("AO_APPROVAL_MECHANISM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE =", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeNotEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE <>", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeGreaterThan(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE >", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE >=", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeLessThan(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE <", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeLessThanOrEqualTo(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE <=", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeLike(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE like", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeNotLike(String value) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE not like", value, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeIn(List<String> values) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE in", values, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeNotIn(List<String> values) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE not in", values, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeBetween(String value1, String value2) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE between", value1, value2, "aoApprovalMechanismCode");
            return (Criteria) this;
        }

        public Criteria andAoApprovalMechanismCodeNotBetween(String value1, String value2) {
            addCriterion("AO_APPROVAL_MECHANISM_CODE not between", value1, value2, "aoApprovalMechanismCode");
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