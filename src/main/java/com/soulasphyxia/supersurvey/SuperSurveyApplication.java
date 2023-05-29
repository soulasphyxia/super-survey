package com.soulasphyxia.supersurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SuperSurveyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperSurveyApplication.class, args);
    }

}
