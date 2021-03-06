package com.bean;

import java.util.ArrayList;
import java.util.List;

public class UniversityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UniversityExample() {
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

        public Criteria andUniversityIdIsNull() {
            addCriterion("university_id is null");
            return (Criteria) this;
        }

        public Criteria andUniversityIdIsNotNull() {
            addCriterion("university_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityIdEqualTo(Integer value) {
            addCriterion("university_id =", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdNotEqualTo(Integer value) {
            addCriterion("university_id <>", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdGreaterThan(Integer value) {
            addCriterion("university_id >", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("university_id >=", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdLessThan(Integer value) {
            addCriterion("university_id <", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdLessThanOrEqualTo(Integer value) {
            addCriterion("university_id <=", value, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdIn(List<Integer> values) {
            addCriterion("university_id in", values, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdNotIn(List<Integer> values) {
            addCriterion("university_id not in", values, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdBetween(Integer value1, Integer value2) {
            addCriterion("university_id between", value1, value2, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("university_id not between", value1, value2, "universityId");
            return (Criteria) this;
        }

        public Criteria andUniversityNameIsNull() {
            addCriterion("university_name is null");
            return (Criteria) this;
        }

        public Criteria andUniversityNameIsNotNull() {
            addCriterion("university_name is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityNameEqualTo(String value) {
            addCriterion("university_name =", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameNotEqualTo(String value) {
            addCriterion("university_name <>", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameGreaterThan(String value) {
            addCriterion("university_name >", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameGreaterThanOrEqualTo(String value) {
            addCriterion("university_name >=", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameLessThan(String value) {
            addCriterion("university_name <", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameLessThanOrEqualTo(String value) {
            addCriterion("university_name <=", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameLike(String value) {
            addCriterion("university_name like", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameNotLike(String value) {
            addCriterion("university_name not like", value, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameIn(List<String> values) {
            addCriterion("university_name in", values, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameNotIn(List<String> values) {
            addCriterion("university_name not in", values, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameBetween(String value1, String value2) {
            addCriterion("university_name between", value1, value2, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityNameNotBetween(String value1, String value2) {
            addCriterion("university_name not between", value1, value2, "universityName");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressIsNull() {
            addCriterion("university_address is null");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressIsNotNull() {
            addCriterion("university_address is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressEqualTo(String value) {
            addCriterion("university_address =", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressNotEqualTo(String value) {
            addCriterion("university_address <>", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressGreaterThan(String value) {
            addCriterion("university_address >", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("university_address >=", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressLessThan(String value) {
            addCriterion("university_address <", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressLessThanOrEqualTo(String value) {
            addCriterion("university_address <=", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressLike(String value) {
            addCriterion("university_address like", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressNotLike(String value) {
            addCriterion("university_address not like", value, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressIn(List<String> values) {
            addCriterion("university_address in", values, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressNotIn(List<String> values) {
            addCriterion("university_address not in", values, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressBetween(String value1, String value2) {
            addCriterion("university_address between", value1, value2, "universityAddress");
            return (Criteria) this;
        }

        public Criteria andUniversityAddressNotBetween(String value1, String value2) {
            addCriterion("university_address not between", value1, value2, "universityAddress");
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