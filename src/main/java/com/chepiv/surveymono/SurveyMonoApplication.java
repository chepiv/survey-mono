package com.chepiv.surveymono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SurveyMonoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SurveyMonoApplication.class, args);
    }

}
