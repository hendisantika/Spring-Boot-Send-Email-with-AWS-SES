package com.hendisantika.sendmailwithses.controller;

import com.hendisantika.sendmailwithses.config.CustomPropertyConfig;
import com.hendisantika.sendmailwithses.service.EmailSenderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : send-mail-with-ses
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/10/20
 * Time: 06.16
 */
@RestController
public class MailController {

    private final EmailSenderService emailSenderService;
    private final CustomPropertyConfig customPropertyConfig;

    public MailController(EmailSenderService emailSenderService, CustomPropertyConfig customPropertyConfig) {
        this.emailSenderService = emailSenderService;
        this.customPropertyConfig = customPropertyConfig;
    }

}
