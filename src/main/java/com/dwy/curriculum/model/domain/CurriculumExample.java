package com.dwy.curriculum.model.domain;

import java.util.ArrayList;
import java.util.List;

public class CurriculumExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public CurriculumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
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
     * This method corresponds to the database table curriculum
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
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
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
     * This class corresponds to the database table curriculum
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberIsNull() {
            addCriterion("assessment_number is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberIsNotNull() {
            addCriterion("assessment_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberEqualTo(Integer value) {
            addCriterion("assessment_number =", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberNotEqualTo(Integer value) {
            addCriterion("assessment_number <>", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberGreaterThan(Integer value) {
            addCriterion("assessment_number >", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_number >=", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberLessThan(Integer value) {
            addCriterion("assessment_number <", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_number <=", value, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberIn(List<Integer> values) {
            addCriterion("assessment_number in", values, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberNotIn(List<Integer> values) {
            addCriterion("assessment_number not in", values, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberBetween(Integer value1, Integer value2) {
            addCriterion("assessment_number between", value1, value2, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_number not between", value1, value2, "assessmentNumber");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreIsNull() {
            addCriterion("assessment_score is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreIsNotNull() {
            addCriterion("assessment_score is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreEqualTo(Double value) {
            addCriterion("assessment_score =", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreNotEqualTo(Double value) {
            addCriterion("assessment_score <>", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreGreaterThan(Double value) {
            addCriterion("assessment_score >", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("assessment_score >=", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreLessThan(Double value) {
            addCriterion("assessment_score <", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreLessThanOrEqualTo(Double value) {
            addCriterion("assessment_score <=", value, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreIn(List<Double> values) {
            addCriterion("assessment_score in", values, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreNotIn(List<Double> values) {
            addCriterion("assessment_score not in", values, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreBetween(Double value1, Double value2) {
            addCriterion("assessment_score between", value1, value2, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andAssessmentScoreNotBetween(Double value1, Double value2) {
            addCriterion("assessment_score not between", value1, value2, "assessmentScore");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNull() {
            addCriterion("university is null");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNotNull() {
            addCriterion("university is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityEqualTo(String value) {
            addCriterion("university =", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotEqualTo(String value) {
            addCriterion("university <>", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThan(String value) {
            addCriterion("university >", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThanOrEqualTo(String value) {
            addCriterion("university >=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThan(String value) {
            addCriterion("university <", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThanOrEqualTo(String value) {
            addCriterion("university <=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLike(String value) {
            addCriterion("university like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotLike(String value) {
            addCriterion("university not like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityIn(List<String> values) {
            addCriterion("university in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotIn(List<String> values) {
            addCriterion("university not in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityBetween(String value1, String value2) {
            addCriterion("university between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotBetween(String value1, String value2) {
            addCriterion("university not between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityidIsNull() {
            addCriterion("universityId is null");
            return (Criteria) this;
        }

        public Criteria andUniversityidIsNotNull() {
            addCriterion("universityId is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityidEqualTo(Integer value) {
            addCriterion("universityId =", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidNotEqualTo(Integer value) {
            addCriterion("universityId <>", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidGreaterThan(Integer value) {
            addCriterion("universityId >", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("universityId >=", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidLessThan(Integer value) {
            addCriterion("universityId <", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidLessThanOrEqualTo(Integer value) {
            addCriterion("universityId <=", value, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidIn(List<Integer> values) {
            addCriterion("universityId in", values, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidNotIn(List<Integer> values) {
            addCriterion("universityId not in", values, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidBetween(Integer value1, Integer value2) {
            addCriterion("universityId between", value1, value2, "universityid");
            return (Criteria) this;
        }

        public Criteria andUniversityidNotBetween(Integer value1, Integer value2) {
            addCriterion("universityId not between", value1, value2, "universityid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum
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
     * This class corresponds to the database table curriculum
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