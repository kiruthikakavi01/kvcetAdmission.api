package com.administration.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import javax.mail.MessagingException;
//@SpringBootApplication
//public class SpringEmailClientApplication {
//	
//	@Autowired	
//	
//	private EmailSenderService service;
//	public static void main(String args[]) {		SpringApplication.run(SpringEmailClientApplication.class, args);	}
//	@EventListener(ApplicationReadyEvent.class)	public void triggerMail(String emailId) throws MessagingException {
//		//service.sendEmailWithAttachment("aramya0412@gmail.com",	"This is Email Body with Attachment...",	"This email has attachme");
//		String body ="hello";
//		String subject ="registration confirmed";
//		service.sendSimpleEmail(emailId,body,subject);
//	}
//	}


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class SpringEmailClientApplication {

//	public static void main(String args[]) {		SpringApplication.run(SpringEmailClientApplication.class, args);	}}

}