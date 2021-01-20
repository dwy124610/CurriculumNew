package com.dwy.curriculum.model.dto;

import com.dwy.curriculum.model.domain.Teacher;
import com.google.common.base.Converter;
import lombok.*;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDTO {

    private String name ;

    private String state;

    private String userid;

    public Teacher convertTo(TeacherDTO teacherDTO){
        TeacherConvert convert = new TeacherConvert();
        return convert.doForward(teacherDTO);
    }

    private static class TeacherConvert extends Converter<TeacherDTO , Teacher>{


        @Override
        protected Teacher doForward(TeacherDTO teacherDTO) {
            Teacher teacher = new Teacher();
            teacher.setName(teacherDTO.getName());
            teacher.setState(teacherDTO.getState());
            teacher.setUserid(teacherDTO.getUserid());
            return teacher;
        }

        @Override
        protected TeacherDTO doBackward(Teacher teacher) {
            return null;
        }
    }
}
