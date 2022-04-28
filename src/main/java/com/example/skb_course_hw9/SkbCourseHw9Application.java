package com.example.skb_course_hw9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")
public class SkbCourseHw9Application {

    public static void main(String[] args) {
        SpringApplication.run(SkbCourseHw9Application.class, args);
    }

}
