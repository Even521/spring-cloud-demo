package com.even;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author even
 * @date 2019/4/22 14:46
 * @describe
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudAdminServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAdminServiceApplication.class, args);
    }
}
