package com.dwy.curriculum;

import com.dwy.curriculum.service.ICurriculumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CurriculumServiceTest {

    @Resource
    ICurriculumService curriculumService;

    @Test
    public void getCurriculumDTOTest() throws IOException {
        curriculumService.getCurriculumDTO();
    }
}
