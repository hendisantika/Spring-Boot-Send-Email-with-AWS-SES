package com.hendisantika.sendmailwithses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : send-mail-with-ses
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/10/20
 * Time: 06.10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mail {
    private String from;
    private String to;
    private String subject;
    private Map<String, Object> model;
}
