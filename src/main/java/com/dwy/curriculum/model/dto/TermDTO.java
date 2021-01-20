package com.dwy.curriculum.model.dto;

import com.dwy.curriculum.model.domain.Term;
import com.google.common.base.Converter;
import lombok.*;

import java.util.Date;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TermDTO {

    private String term_class;

    private Date term_end;

    private String term_id;

    private Integer term_serial;

    private Date term_start;

    private Integer term_student;

    public Term convertTo(TermDTO termDTO){
        TermConvert convert = new TermConvert();
        return convert.doForward(termDTO);
    }

    private static class TermConvert extends Converter<TermDTO , Term>{


        @Override
        protected Term doForward(TermDTO termDTO) {
            Term term = new Term();
            term.setTermClass(termDTO.getTerm_class());
            term.setTermEnd(termDTO.getTerm_end());
            term.setTermStart(termDTO.getTerm_start());
            term.setTermSerial(termDTO.getTerm_serial());
            term.setTermStudent(termDTO.getTerm_student());
            term.setTermId(termDTO.getTerm_id());
            return term;
        }


        @Override
        protected TermDTO doBackward(Term term) {
            return null;
        }
    }

}
