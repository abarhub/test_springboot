package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);

    // ces 2 servlet fonctionnent !!!

    @Bean
    public ServletRegistrationBean<DispatcherServlet> exampleServletBean() {

        LOGGER.info("exampleServletBean");

        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(Web2Config.class);
        //ctx.setServletContext(container);
        ctx.setBeanName("tata");

        ServletRegistrationBean<DispatcherServlet> bean = new ServletRegistrationBean<>(
                new DispatcherServlet(ctx), "/exampleServlet/*");
        bean.setLoadOnStartup(3);
        bean.setName("tata0");
        return bean;
    }

    @Bean
    public ServletRegistrationBean<DispatcherServlet> exampleServletBean2() {

        LOGGER.info("exampleServletBean2");

        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(Web3Config.class);
        //ctx.setServletContext(container);
        ctx.setBeanName("toto");

        ServletRegistrationBean<DispatcherServlet> bean = new ServletRegistrationBean<>(
                new DispatcherServlet(ctx) {

                }, "/exampleServlet2/*");
        bean.setLoadOnStartup(2);
        bean.setName("toto0");
        return bean;
    }

}
