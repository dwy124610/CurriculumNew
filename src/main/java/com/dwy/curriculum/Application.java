package com.dwy.curriculum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/20 10:38
 */
@SpringBootApplication
@MapperScan("com.dwy.curriculum.model.mapper")
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class , args);
        }
}
