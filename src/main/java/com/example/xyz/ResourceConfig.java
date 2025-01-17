package com.example.xyz;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
// định nghĩa message lỗi
@Configuration
public class ResourceConfig {
    @Bean("messageSource")
    public MessageSource getMessageSource()
    {
         ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
         messageSource.setBasenames("classpath:messages/user");
         messageSource.setDefaultEncoding("utf-8");
         return messageSource;
    }
}
