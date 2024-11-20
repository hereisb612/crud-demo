package com.forty2.training.crud;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    @Bean
    PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }
}
