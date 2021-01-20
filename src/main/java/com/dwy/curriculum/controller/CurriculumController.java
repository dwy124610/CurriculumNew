package com.dwy.curriculum.controller;

import com.dwy.curriculum.service.ICurriculumService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 11:10
 */
@RestController
public class CurriculumController {


    @Resource
    ICurriculumService curriculumService;

    @RequestMapping("/curriculum")
    public void getCurriculumDTO() throws IOException {
        curriculumService.getCurriculumDTO();
    }
}
