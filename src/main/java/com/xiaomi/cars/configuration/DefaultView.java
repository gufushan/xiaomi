package com.xiaomi.cars.configuration;


import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by Administrator on 2018/7/6.
 */
@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {
    public static String LOGIN_USER = "loginUser";


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
