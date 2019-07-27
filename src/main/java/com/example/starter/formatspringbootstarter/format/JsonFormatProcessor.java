package com.example.starter.formatspringbootstarter.format;

import com.alibaba.fastjson.JSON;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
public class JsonFormatProcessor implements FormatProcessor {

    public <T> String format(T obj) {
        return "jsonFormat:" + JSON.toJSONString(obj);
    }

}
