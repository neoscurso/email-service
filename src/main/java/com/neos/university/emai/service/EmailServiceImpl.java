package com.neos.university.emai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailServiceI {
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String to, String subject, String messageBody) {
        SimpleMailMessage msg = new SimpleMailMessage();
        System.out.println("::::SENDING EMAIL:::::::");
        msg.setFrom("EMAIL_FROM");
        msg.setTo(to);
        msg.setSubject(subject);
        msg.setText(messageBody);

        javaMailSender.send(msg);
    }
}
