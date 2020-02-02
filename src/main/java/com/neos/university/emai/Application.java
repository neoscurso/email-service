package com.neos.university.emai;

import com.neos.university.emai.service.EmailServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Java Doc
 */
@ComponentScan("com.neos.university.emai")
@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailServiceI emailServiceI;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Sending Email...");
        emailServiceI.sendEmail("EMAIL_TO","Testing send email using sprig boot","Hello World \n Spring Boot Email");

        System.out.println("Done");

    }
}
