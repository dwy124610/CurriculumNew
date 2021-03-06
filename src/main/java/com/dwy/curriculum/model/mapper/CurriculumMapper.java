package com.dwy.curriculum.model.mapper;

import com.dwy.curriculum.model.domain.Curriculum;
import com.dwy.curriculum.model.domain.CurriculumExample;
import com.dwy.curriculum.model.domain.CurriculumKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CurriculumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @SelectProvider(type=CurriculumSqlProvider.class, method="countByExample")
    long countByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @DeleteProvider(type=CurriculumSqlProvider.class, method="deleteByExample")
    int deleteByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @Delete({
        "delete from curriculum",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(CurriculumKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @Insert({
        "insert into curriculum (id, name, ",
        "category, assessment_number, ",
        "assessment_score, university, ",
        "universityId)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=VARCHAR}, #{assessmentNumber,jdbcType=INTEGER}, ",
        "#{assessmentScore,jdbcType=DOUBLE}, #{university,jdbcType=VARCHAR}, ",
        "#{universityid,jdbcType=INTEGER})"
    })
    int insert(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @InsertProvider(type=CurriculumSqlProvider.class, method="insertSelective")
    int insertSelective(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @SelectProvider(type=CurriculumSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="assessment_number", property="assessmentNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="assessment_score", property="assessmentScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="university", property="university", jdbcType=JdbcType.VARCHAR),
        @Result(column="universityId", property="universityid", jdbcType=JdbcType.INTEGER)
    })
    List<Curriculum> selectByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @Select({
        "select",
        "id, name, category, assessment_number, assessment_score, university, universityId",
        "from curriculum",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="assessment_number", property="assessmentNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="assessment_score", property="assessmentScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="university", property="university", jdbcType=JdbcType.VARCHAR),
        @Result(column="universityId", property="universityid", jdbcType=JdbcType.INTEGER)
    })
    Curriculum selectByPrimaryKey(CurriculumKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @UpdateProvider(type=CurriculumSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @UpdateProvider(type=CurriculumSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @UpdateProvider(type=CurriculumSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @Update({
        "update curriculum",
        "set name = #{name,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "assessment_number = #{assessmentNumber,jdbcType=INTEGER},",
          "assessment_score = #{assessmentScore,jdbcType=DOUBLE},",
          "university = #{university,jdbcType=VARCHAR},",
          "universityId = #{universityid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Curriculum record);
}