package com.rh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sweehaw
 */
@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**",
                "/css/**",
                "/js/**",
                "/icon/**",
                "/img/**")
                .addResourceLocations(
                        "/webjars/",
                        "classpath:/webjars/css/",
                        "classpath:/webjars/js/",
                        "/webjars/font-awesome/5.5.0/css",
                        "classpath:/webjars/img/")
                .resourceChain(false);
    }
}
