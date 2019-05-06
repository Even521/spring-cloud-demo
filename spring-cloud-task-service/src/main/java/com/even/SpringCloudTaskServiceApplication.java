package com.even;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
/**
 * @author even
 * @date 2019/4/22 14:46
 * @describe
 */
@SpringBootApplication
@EnableTask
public class SpringCloudTaskServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTaskServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner() {
        return new TestCommandLineRunner();
    }

    public static class TestCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... strings) throws Exception {
            System.out.println("this is a Test about spring cloud task.");
        }
    }

}
