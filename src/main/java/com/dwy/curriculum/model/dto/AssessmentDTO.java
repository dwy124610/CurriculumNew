package com.dwy.curriculum.model.dto;

import com.dwy.curriculum.model.domain.Assessment;
import com.dwy.curriculum.model.domain.AssessmentWithBLOBs;
import com.google.common.base.Converter;
import lombok.*;

import java.util.Date;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AssessmentDTO {

    private String assessment_content;

    private Integer good;

    private Double star;

    private Integer term_related;

    private Date time;

    private String userid;

    public AssessmentWithBLOBs convertTo(AssessmentDTO assessmentDTO){
        AssessmentConverter converter = new AssessmentConverter();
        return converter.doForward(assessmentDTO);
    }

    private static class AssessmentConverter extends Converter<AssessmentDTO , AssessmentWithBLOBs>{

        @Override
        protected AssessmentWithBLOBs doForward(AssessmentDTO assessmentDTO) {
            AssessmentWithBLOBs assessment = new AssessmentWithBLOBs();
            assessment.setAssessmentContent(assessmentDTO.getAssessment_content());
            assessment.setGood(assessmentDTO.getGood());
            assessment.setStar(assessmentDTO.getStar());
            assessment.setTermRelated(assessmentDTO.getTerm_related());
            assessment.setTime(assessmentDTO.getTime());
            assessment.setUserid(assessmentDTO.getUserid());
            return assessment;
        }

        @Override
        protected AssessmentDTO doBackward(AssessmentWithBLOBs assessment) {
            return null;
        }
    }

}
