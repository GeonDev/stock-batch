package com.stock.batch.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final EnumConverter enumConverter;

    public WebConfig(EnumConverter enumConverter) {
        this.enumConverter = enumConverter;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(enumConverter);
    }
}