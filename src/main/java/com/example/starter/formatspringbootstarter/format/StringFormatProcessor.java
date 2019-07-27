package com.example.starter.formatspringbootstarter.format;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
public class StringFormatProcessor implements FormatProcessor{

    public <T> String format(T obj) {
        return "string format: " + obj.toString();
    }
}
