package com.dwy.curriculum.model.mapper;

import com.dwy.curriculum.model.domain.Teacher;
import com.dwy.curriculum.model.domain.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @SelectProvider(type=TeacherSqlProvider.class, method="countByExample")
    long countByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @DeleteProvider(type=TeacherSqlProvider.class, method="deleteByExample")
    int deleteByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @Insert({
        "insert into teacher (id, name, ",
        "state, userid)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=VARCHAR}, #{userid,jdbcType=VARCHAR})"
    })
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @InsertProvider(type=TeacherSqlProvider.class, method="insertSelective")
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @SelectProvider(type=TeacherSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="userid", property="userid", jdbcType=JdbcType.VARCHAR)
    })
    List<Teacher> selectByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Jan 20 14:25:41 CST 2021
     */
    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);
}