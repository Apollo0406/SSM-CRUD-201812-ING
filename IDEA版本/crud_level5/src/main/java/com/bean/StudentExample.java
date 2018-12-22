package com.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuCounIdIsNull() {
            addCriterion("stu_coun_id is null");
            return (Criteria) this;
        }

        public Criteria andStuCounIdIsNotNull() {
            addCriterion("stu_coun_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuCounIdEqualTo(Integer value) {
            addCriterion("stu_coun_id =", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdNotEqualTo(Integer value) {
            addCriterion("stu_coun_id <>", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdGreaterThan(Integer value) {
            addCriterion("stu_coun_id >", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_coun_id >=", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdLessThan(Integer value) {
            addCriterion("stu_coun_id <", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_coun_id <=", value, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdIn(List<Integer> values) {
            addCriterion("stu_coun_id in", values, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdNotIn(List<Integer> values) {
            addCriterion("stu_coun_id not in", values, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_coun_id between", value1, value2, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuCounIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_coun_id not between", value1, value2, "stuCounId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdIsNull() {
            addCriterion("stu_uni_id is null");
            return (Criteria) this;
        }

        public Criteria andStuUniIdIsNotNull() {
            addCriterion("stu_uni_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuUniIdEqualTo(Integer value) {
            addCriterion("stu_uni_id =", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdNotEqualTo(Integer value) {
            addCriterion("stu_uni_id <>", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdGreaterThan(Integer value) {
            addCriterion("stu_uni_id >", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_uni_id >=", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdLessThan(Integer value) {
            addCriterion("stu_uni_id <", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_uni_id <=", value, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdIn(List<Integer> values) {
            addCriterion("stu_uni_id in", values, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdNotIn(List<Integer> values) {
            addCriterion("stu_uni_id not in", values, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_uni_id between", value1, value2, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuUniIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_uni_id not between", value1, value2, "stuUniId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdIsNull() {
            addCriterion("stu_major_id is null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdIsNotNull() {
            addCriterion("stu_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdEqualTo(Integer value) {
            addCriterion("stu_major_id =", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdNotEqualTo(Integer value) {
            addCriterion("stu_major_id <>", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdGreaterThan(Integer value) {
            addCriterion("stu_major_id >", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_major_id >=", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdLessThan(Integer value) {
            addCriterion("stu_major_id <", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_major_id <=", value, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdIn(List<Integer> values) {
            addCriterion("stu_major_id in", values, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdNotIn(List<Integer> values) {
            addCriterion("stu_major_id not in", values, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_major_id between", value1, value2, "stuMajorId");
            return (Criteria) this;
        }

        public Criteria andStuMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_major_id not between", value1, value2, "stuMajorId");
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