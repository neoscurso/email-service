package com.neos.university.emai.service;

public interface EmailServiceI {

    void sendEmail(String to, String subject, String messageBody);

}
