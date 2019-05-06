package com.even;

import com.even.currentlimiting.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/**
 * @author even
 * @date 2019/4/22 14:46
 * @describe
 */
@SpringBootApplication
public class SpringCloudGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayServiceApplication.class, args);
    }
    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }
}
