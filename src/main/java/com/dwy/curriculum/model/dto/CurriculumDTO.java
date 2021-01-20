package com.dwy.curriculum.model.dto;

import com.dwy.curriculum.model.domain.Curriculum;
import com.google.common.base.Converter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurriculumDTO {

    private List<AssessmentDTO> assessmentList;

    private Integer assessment_number;

    private Double assessment_score;

    private String category;

    private String id;

    private String name ;

    private List<TeacherDTO> teacher;

    private List<TermDTO> term;

    private String university;

    private Integer universityId;

    public Curriculum convertTo(CurriculumDTO curriculumDTO){
        CurriculumConverter converter = new  CurriculumConverter();
        return converter.doForward(curriculumDTO);
    }

    private static class CurriculumConverter extends Converter<CurriculumDTO , Curriculum> {

        @Override
        protected Curriculum doForward(CurriculumDTO curriculumDTO) {
            Curriculum curriculum = new Curriculum();
            curriculum.setAssessmentNumber(curriculumDTO.getAssessment_number());
            curriculum.setAssessmentScore(curriculumDTO.getAssessment_score());
            curriculum.setCategory(curriculumDTO.getCategory());
            curriculum.setName(curriculumDTO.getName());
            curriculum.setUniversity(curriculumDTO.getUniversity());
            curriculum.setUniversityid(curriculumDTO.getUniversityId());
            curriculum.setId(curriculumDTO.getId());
            return curriculum;
        }

        @Override
        protected CurriculumDTO doBackward(Curriculum curriculum) {
            return null;
        }
    }
}

