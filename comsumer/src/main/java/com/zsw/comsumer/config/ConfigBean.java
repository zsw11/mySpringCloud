package com.zsw.comsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zsw
 * @date 2021/3/10 18:17
 * @description : 注入restTemplate
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
