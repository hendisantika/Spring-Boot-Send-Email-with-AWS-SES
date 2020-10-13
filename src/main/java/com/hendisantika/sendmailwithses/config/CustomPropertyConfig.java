package com.hendisantika.sendmailwithses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : send-mail-with-ses
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/10/20
 * Time: 06.09
 */
@Component
@PropertySource("classpath:config.properties")
public class CustomPropertyConfig {

    @Value("${mailFrom}")
    public String mailFrom;

    @Value("${awsAccessKey}")
    public String awsAccessKey;

    @Value("${awsSecretKey}")
    public String awsSecretKey;
}