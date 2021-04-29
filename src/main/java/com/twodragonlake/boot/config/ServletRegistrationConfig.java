package com.twodragonlake.boot.config;

import com.twodragonlake.boot.filters.MyFilter;
import com.twodragonlake.boot.servlet.MyServlet2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/11/16 10:56
 */

//@Configuration
public class ServletRegistrationConfig {
    @Bean
    public ServletRegistrationBean  myServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.addUrlMappings("/myServlet2");
        servletRegistrationBean.setServlet(new MyServlet2());
        return servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.addUrlPatterns("/mServlet/*");
        filterRegistrationBean.setFilter(new MyFilter());
        return  filterRegistrationBean;
    }

}
