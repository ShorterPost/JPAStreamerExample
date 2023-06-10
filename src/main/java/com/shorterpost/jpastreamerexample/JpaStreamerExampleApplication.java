package com.shorterpost.jpastreamerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.shorterpost.jpastreamerexample", "com.speedment.jpastreamer"})
public class JpaStreamerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaStreamerExampleApplication.class, args);
    }

}
