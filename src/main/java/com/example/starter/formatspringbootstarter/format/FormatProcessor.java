package com.example.starter.formatspringbootstarter.format;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
public interface FormatProcessor {

    /**
     * @param obj
     * @param <T>
     * @return
     */
    <T> String format(T obj);

}
