package com.example.starter.formatspringbootstarter.auto;

import com.example.starter.formatspringbootstarter.format.FormatProcessor;
import com.example.starter.formatspringbootstarter.format.JsonFormatProcessor;
import com.example.starter.formatspringbootstarter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
@Configuration
public class FormatAutoConfiguration {

    @Bean
    @Primary
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    public FormatProcessor stringFormat() {
        return new StringFormatProcessor();
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public FormatProcessor jsonFormat() {
        return new JsonFormatProcessor();
    }

}
