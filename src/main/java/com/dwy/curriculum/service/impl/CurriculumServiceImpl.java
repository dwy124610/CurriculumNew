package com.dwy.curriculum.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dwy.curriculum.model.domain.*;
import com.dwy.curriculum.model.dto.AssessmentDTO;
import com.dwy.curriculum.model.dto.CurriculumDTO;
import com.dwy.curriculum.model.dto.TeacherDTO;
import com.dwy.curriculum.model.dto.TermDTO;
import com.dwy.curriculum.model.mapper.AssessmentMapper;
import com.dwy.curriculum.model.mapper.CurriculumMapper;
import com.dwy.curriculum.model.mapper.TeacherMapper;
import com.dwy.curriculum.model.mapper.TermMapper;
import com.dwy.curriculum.service.ICurriculumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:39
 */
@Service
@Slf4j
public class CurriculumServiceImpl implements ICurriculumService {

    @Resource
    AssessmentMapper assessmentMapper;

    @Resource
    CurriculumMapper curriculumMapper;

    @Resource
    TeacherMapper teacherMapper;

    @Resource
    TermMapper termMapper;

    private static final String  filepath = "D:\\CurriculumNew";

    @Override
    public void getCurriculumDTO() throws IOException {
        List<String> absolutPathList = new ArrayList<>();
        absolutPathList = getFileAbsolutPathList(filepath , absolutPathList);
        for (String absolutPath : absolutPathList){
            CurriculumDTO curriculumDTO = Objects.requireNonNull(readJsonFile(absolutPath)).toJavaObject(CurriculumDTO.class);
            if (curriculumDTO != null) {
                insertCurriculum(curriculumDTO);
                insertAssessment(curriculumDTO);
                insertTeacher(curriculumDTO);
                insertTerm(curriculumDTO);
            }
        }
    }

    private List<String> getFileAbsolutPathList(String filepath , List<String> absolutPathList) throws FileNotFoundException, IOException {
        try {
            File file = new File(filepath);
            if (!file.isDirectory()) {
//                System.out.println("文件");
//                System.out.println("path=" + file.getPath());
//                System.out.println("absolutepath=" + file.getAbsolutePath());
//                System.out.println("name=" + file.getName());
                absolutPathList.add(file.getAbsolutePath()+"\\"+file.getName());
            } else if (file.isDirectory()) {
//                System.out.println("文件夹");
                String[] fileList = file.list();
                for (int i = 0; i < fileList.length; i++) {
                    File readFile = new File(filepath + "\\" + fileList[i]);
                    if (!readFile.isDirectory()) {
//                        System.out.println("path=" + readFile.getPath());
//                        System.out.println("absolutepath="
//                                + readFile.getAbsolutePath());
//                        System.out.println("name=" + readFile.getName());
                        absolutPathList.add(file.getAbsolutePath()+"\\"+readFile.getName());
                    } else if (readFile.isDirectory()) {
                        getFileAbsolutPathList(filepath + "\\" + fileList[i] , absolutPathList);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("getFileAbsolutPathList()   Exception:" + e.getMessage());
        }
        return absolutPathList;
    }


    /**
     * 读取json文件，返回json串
     * @param absolutPath
     * @return
     */
    private JSONObject readJsonFile(String absolutPath) {
        String jsonStr = "";
        try {
            File jsonFile = ResourceUtils.getFile(absolutPath);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return JSONObject.parseObject(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void insertAssessment(CurriculumDTO curriculumDTO){
        List<AssessmentDTO> assessmentList = curriculumDTO.getAssessmentList();
        for (AssessmentDTO assessmentDTO : assessmentList){
            AssessmentWithBLOBs assessment = assessmentDTO.convertTo(assessmentDTO);
            assessment.setId(curriculumDTO.getId());
            assessmentMapper.insert(assessment);
        }
    }

    private void insertCurriculum(CurriculumDTO curriculumDTO){
        Curriculum curriculum = curriculumDTO.convertTo(curriculumDTO);
        curriculumMapper.insert(curriculum);
    }

    private void insertTeacher(CurriculumDTO curriculumDTO){
        List<TeacherDTO> teacherDTOList = curriculumDTO.getTeacher();
        for (TeacherDTO teacherDTO : teacherDTOList){
            Teacher teacher = teacherDTO.convertTo(teacherDTO);
            teacher.setId(curriculumDTO.getId());
            teacherMapper.insert(teacher);
        }
    }

    private void insertTerm(CurriculumDTO curriculumDTO){
        List<TermDTO> termDTOList = curriculumDTO.getTerm();
        for (TermDTO termDTO : termDTOList){
            Term term = termDTO.convertTo(termDTO);
            term.setId(curriculumDTO.getId());
            termMapper.insert(term);
        }
    }

}
