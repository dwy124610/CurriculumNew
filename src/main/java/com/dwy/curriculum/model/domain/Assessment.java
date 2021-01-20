package com.dwy.curriculum.model.domain;

import java.util.Date;

public class Assessment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.id
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.good
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private Integer good;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.star
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private Double star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.term_related
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private Integer termRelated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.time
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessment.userid
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    private String userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.id
     *
     * @return the value of assessment.id
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.id
     *
     * @param id the value for assessment.id
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.good
     *
     * @return the value of assessment.good
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Integer getGood() {
        return good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.good
     *
     * @param good the value for assessment.good
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setGood(Integer good) {
        this.good = good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.star
     *
     * @return the value of assessment.star
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Double getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.star
     *
     * @param star the value for assessment.star
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setStar(Double star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.term_related
     *
     * @return the value of assessment.term_related
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Integer getTermRelated() {
        return termRelated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.term_related
     *
     * @param termRelated the value for assessment.term_related
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setTermRelated(Integer termRelated) {
        this.termRelated = termRelated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.time
     *
     * @return the value of assessment.time
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.time
     *
     * @param time the value for assessment.time
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessment.userid
     *
     * @return the value of assessment.userid
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessment.userid
     *
     * @param userid the value for assessment.userid
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}