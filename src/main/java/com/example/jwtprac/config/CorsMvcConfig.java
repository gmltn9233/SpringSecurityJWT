package com.example.jwtprac.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

        //모든경로에서 3000번 요청을 허용
        corsRegistry.addMapping("/**")
            .allowedOrigins("http://localhost:3000");
    }
}