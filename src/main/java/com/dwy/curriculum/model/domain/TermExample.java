package com.dwy.curriculum.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TermExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public TermExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTermIdIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        public Criteria andTermIdEqualTo(String value) {
            addCriterion("term_id =", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotEqualTo(String value) {
            addCriterion("term_id <>", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThan(String value) {
            addCriterion("term_id >", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("term_id >=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThan(String value) {
            addCriterion("term_id <", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThanOrEqualTo(String value) {
            addCriterion("term_id <=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLike(String value) {
            addCriterion("term_id like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotLike(String value) {
            addCriterion("term_id not like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdIn(List<String> values) {
            addCriterion("term_id in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotIn(List<String> values) {
            addCriterion("term_id not in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdBetween(String value1, String value2) {
            addCriterion("term_id between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotBetween(String value1, String value2) {
            addCriterion("term_id not between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTermClassIsNull() {
            addCriterion("term_class is null");
            return (Criteria) this;
        }

        public Criteria andTermClassIsNotNull() {
            addCriterion("term_class is not null");
            return (Criteria) this;
        }

        public Criteria andTermClassEqualTo(String value) {
            addCriterion("term_class =", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassNotEqualTo(String value) {
            addCriterion("term_class <>", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassGreaterThan(String value) {
            addCriterion("term_class >", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassGreaterThanOrEqualTo(String value) {
            addCriterion("term_class >=", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassLessThan(String value) {
            addCriterion("term_class <", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassLessThanOrEqualTo(String value) {
            addCriterion("term_class <=", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassLike(String value) {
            addCriterion("term_class like", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassNotLike(String value) {
            addCriterion("term_class not like", value, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassIn(List<String> values) {
            addCriterion("term_class in", values, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassNotIn(List<String> values) {
            addCriterion("term_class not in", values, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassBetween(String value1, String value2) {
            addCriterion("term_class between", value1, value2, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermClassNotBetween(String value1, String value2) {
            addCriterion("term_class not between", value1, value2, "termClass");
            return (Criteria) this;
        }

        public Criteria andTermStartIsNull() {
            addCriterion("term_start is null");
            return (Criteria) this;
        }

        public Criteria andTermStartIsNotNull() {
            addCriterion("term_start is not null");
            return (Criteria) this;
        }

        public Criteria andTermStartEqualTo(Date value) {
            addCriterionForJDBCDate("term_start =", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("term_start <>", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartGreaterThan(Date value) {
            addCriterionForJDBCDate("term_start >", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_start >=", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartLessThan(Date value) {
            addCriterionForJDBCDate("term_start <", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_start <=", value, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartIn(List<Date> values) {
            addCriterionForJDBCDate("term_start in", values, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("term_start not in", values, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_start between", value1, value2, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_start not between", value1, value2, "termStart");
            return (Criteria) this;
        }

        public Criteria andTermEndIsNull() {
            addCriterion("term_end is null");
            return (Criteria) this;
        }

        public Criteria andTermEndIsNotNull() {
            addCriterion("term_end is not null");
            return (Criteria) this;
        }

        public Criteria andTermEndEqualTo(Date value) {
            addCriterionForJDBCDate("term_end =", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("term_end <>", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndGreaterThan(Date value) {
            addCriterionForJDBCDate("term_end >", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_end >=", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndLessThan(Date value) {
            addCriterionForJDBCDate("term_end <", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_end <=", value, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndIn(List<Date> values) {
            addCriterionForJDBCDate("term_end in", values, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("term_end not in", values, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_end between", value1, value2, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_end not between", value1, value2, "termEnd");
            return (Criteria) this;
        }

        public Criteria andTermSerialIsNull() {
            addCriterion("term_serial is null");
            return (Criteria) this;
        }

        public Criteria andTermSerialIsNotNull() {
            addCriterion("term_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTermSerialEqualTo(Integer value) {
            addCriterion("term_serial =", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialNotEqualTo(Integer value) {
            addCriterion("term_serial <>", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialGreaterThan(Integer value) {
            addCriterion("term_serial >", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_serial >=", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialLessThan(Integer value) {
            addCriterion("term_serial <", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialLessThanOrEqualTo(Integer value) {
            addCriterion("term_serial <=", value, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialIn(List<Integer> values) {
            addCriterion("term_serial in", values, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialNotIn(List<Integer> values) {
            addCriterion("term_serial not in", values, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialBetween(Integer value1, Integer value2) {
            addCriterion("term_serial between", value1, value2, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("term_serial not between", value1, value2, "termSerial");
            return (Criteria) this;
        }

        public Criteria andTermStudentIsNull() {
            addCriterion("term_student is null");
            return (Criteria) this;
        }

        public Criteria andTermStudentIsNotNull() {
            addCriterion("term_student is not null");
            return (Criteria) this;
        }

        public Criteria andTermStudentEqualTo(Integer value) {
            addCriterion("term_student =", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentNotEqualTo(Integer value) {
            addCriterion("term_student <>", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentGreaterThan(Integer value) {
            addCriterion("term_student >", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_student >=", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentLessThan(Integer value) {
            addCriterion("term_student <", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentLessThanOrEqualTo(Integer value) {
            addCriterion("term_student <=", value, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentIn(List<Integer> values) {
            addCriterion("term_student in", values, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentNotIn(List<Integer> values) {
            addCriterion("term_student not in", values, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentBetween(Integer value1, Integer value2) {
            addCriterion("term_student between", value1, value2, "termStudent");
            return (Criteria) this;
        }

        public Criteria andTermStudentNotBetween(Integer value1, Integer value2) {
            addCriterion("term_student not between", value1, value2, "termStudent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table term
     *
     * @mbg.generated do_not_delete_during_merge Wed Jan 20 14:25:41 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table term
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
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