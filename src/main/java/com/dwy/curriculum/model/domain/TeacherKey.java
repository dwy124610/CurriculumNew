package com.dwy.curriculum.model.domain;

public class TeacherKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbg.generated Wed Jan 20 13:56:27 CST 2021
     */
    private String id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbg.generated Wed Jan 20 13:56:27 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbg.generated Wed Jan 20 13:56:27 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}