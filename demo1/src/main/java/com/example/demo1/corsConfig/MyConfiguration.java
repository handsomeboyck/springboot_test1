package com.example.demo1.corsConfig;
//设置服务器允许跨域访问
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfiguration extends WebMvcConfigurerAdapter  {

  @Override  
  public void addCorsMappings(CorsRegistry registry) {  
      registry.addMapping("/**")  
              .allowCredentials(true)  
              .allowedHeaders("*")  
              .allowedOrigins("*")  
              .allowedMethods("*");  

  }  
}