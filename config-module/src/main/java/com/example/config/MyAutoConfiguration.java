package com.example.config;

import com.example.util.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MyService myService() {
        return new MyServiceImpl();
    }

    public static class MyServiceImpl implements MyService {
        @Override
        public void doSomething() {
            if (StringUtils.isBlank("hello")) {
                System.out.println("Doing something!");
            }
        }
    }

    public interface MyService {
        void doSomething();
    }
}
