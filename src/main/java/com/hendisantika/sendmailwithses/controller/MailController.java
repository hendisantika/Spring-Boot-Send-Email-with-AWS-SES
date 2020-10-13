package com.hendisantika.sendmailwithses.controller;

import com.hendisantika.sendmailwithses.config.CustomPropertyConfig;
import com.hendisantika.sendmailwithses.entity.Mail;
import com.hendisantika.sendmailwithses.service.EmailSenderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping(value = "/send")
    public String sendMail() throws MessagingException {
        Mail mail = getMail();
        emailSenderService.sendEmail(mail);
        return "Check your email";

    }

    private Mail getMail() {
        Mail mail = new Mail();
        mail.setFrom(customPropertyConfig.mailFrom);
        mail.setTo("<toWhomEver@gmail.com>");
        mail.setSubject("Simple mail");
        Map<String, Object> model = new HashMap<>();
        model.put("templateVariable", "Simple mail with aws..");
        mail.setModel(model);
        return mail;
    }
}
