package com.example.starter.formatspringbootstarter;

import com.example.starter.formatspringbootstarter.format.FormatProcessor;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    public HelloFormatTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {

        StringBuilder sb = new StringBuilder();
        sb.append("Execute format:").append("\n").
                append("Obj format result:").append(formatProcessor.format(obj)).append("\n");

        return sb.toString();
    }

}
