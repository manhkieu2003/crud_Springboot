package com.example.xyz.Config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// khai báo để spring biết là bean
@Configuration
public class ModelmapperConfig {
    @Bean
    public ModelMapper getModelmapper()
    {
        ModelMapper modermapper = new ModelMapper();
        modermapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STANDARD);
        return  modermapper;
    }
}
