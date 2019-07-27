package com.example.starter.formatspringbootstarter;

import com.example.starter.formatspringbootstarter.auto.HelloProperties;
import com.example.starter.formatspringbootstarter.format.FormatProcessor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/7/27
 */
public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties, FormatProcessor formatProcessor) {
        this.helloProperties = helloProperties;
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {

        StringBuilder sb = new StringBuilder();
        sb.append("Execute format:").append("<br/>").
                append("p:" + helloProperties.getInfo()).
                append("Obj format result:").append(formatProcessor.format(obj)).append("\n");

        return sb.toString();
    }

}
