package com.example.starter.formatspringbootstarter.auto;

import com.example.starter.formatspringbootstarter.HelloFormatTemplate;
import com.example.starter.formatspringbootstarter.format.FormatProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
@Configuration
@Import(FormatAutoConfiguration.class)
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor formatProcessor) {
        return new HelloFormatTemplate(formatProcessor);
    }

}
