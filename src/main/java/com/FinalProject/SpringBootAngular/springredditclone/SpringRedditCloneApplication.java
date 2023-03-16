package com.FinalProject.SpringBootAngular.springredditclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.FinalProject.SpringBootAngular.springredditclone.config.OpenAPIConfiguration;

@SpringBootApplication
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class SpringRedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.FinalProject.SpringBootAngular.springredditclone.SpringRedditCloneApplication.class,
                args);
    }

}
