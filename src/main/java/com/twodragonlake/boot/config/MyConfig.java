package com.twodragonlake.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/6/7 18:00
 */

@Configuration
public class MyConfig {

    @Bean
    public  MyConfigBean getMyConfigBean(){
        return new MyConfigBean();
    }

}
