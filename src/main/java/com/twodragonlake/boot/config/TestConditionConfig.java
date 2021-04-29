package com.twodragonlake.boot.config;

import com.twodragonlake.boot.condition.TestCondition;
import com.twodragonlake.boot.condition.TestCondition2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConditionConfig {

    @Bean
    @Conditional(TestCondition.class)
    public String getConfig(){
        return "hello";
    }
b
    @Bean
    public String getConfig2(){
        return "world";
    }


    @Bean
    @Conditional({TestCondition.class, TestCondition2.class})
    public String getConfig3(){
        return "welcome";
    }
}
