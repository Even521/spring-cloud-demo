package com.even.springcloudconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author even
 * @date 2019/4/22 14:46
 * @describe
 */

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringCloudConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServiceApplication.class, args);
    }

}
