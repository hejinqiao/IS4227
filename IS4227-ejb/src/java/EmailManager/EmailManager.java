/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailManager;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.ejb.EJBException;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Administrator
 */
public class EmailManager {

    String emailServerName = "mailauth.comp.nus.edu.sg";
    // Replace with your real name and unix email address         
    String emailFromAddress = "WineXpress<wangtian@comp.nus.edu.sg>";
// Replace with your real name and NUSNET email address     
    String toEmailAddress = "";
    String mailer = "JavaMailer";

    public EmailManager() {
    }

    public void emailActivationCode(String name,String email,String code) {
        //ArrayList<String> al=mbr.emailActivationCode(userId);

        String emailText = "";
        emailText+="Dear "+name+", "+ "\n\n";
        emailText+="Your user account has just been successfully created on WineXpress!"+"\n\n";
        emailText+="Your Activation Code is: "+"\n\n";
        emailText+=code+"\n\n";
        emailText+="Please activate your account first before login using your email address. Thank you!"+"\n\n\n\n";
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress";
        name=name.split(",")[0]+name.split(",")[1];
        toEmailAddress=name+"<"+email+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Your Activation Code for WineXpress");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }
    
    
    public void emailResetPassword(String name, String email, String newPassword){
        String emailText = "";
        emailText+="Dear "+name+", "+ "\n\n";
        emailText+="You have just reset your password on WineXpress!"+"\n\n";
        emailText+="Your New Password is: "+"\n\n";
        emailText+=newPassword+"\n\n";
        emailText+="Please use the new password to login, and change it to your own password after successful login. Thank you!"+"\n\n\n\n";   
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress";
        name=name.split(",")[0]+name.split(",")[1];
        toEmailAddress=name+"<"+email+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("You Have Reset Your Password on WineXpress");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }
    
    
    public void emailEnquiryToAdmin(String userName, String userEmail, Long enquiryID, String enquiryContent){
        String emailText = "";
        emailText+="Dear WineXpress Admin, "+ "\n\n";
        emailText+="One of your members has submitted an enquiry online. "+"\n\n";
        emailText+="Please refer to the following details: "+"\n\n";
        emailText+="Member Name: "+userName+"\n\n";
        emailText+="Member Email: "+userEmail+"\n\n";
        emailText+="Enquiry ID: "+enquiryID+"\n\n";
        emailText+="Enquiry Content: "+"\n\n";
        emailText+=enquiryContent+"\n\n";
        emailText+="Please login to the Admin Console to process this Enquiry. Thank you!"+"\n\n\n\n";   
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress";
        toEmailAddress="WineXpress Admin"+"<"+"wangtian@comp.nus.edu.sg"+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("One Customer Has Submitted an Enquiry Online");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }
    
    public void emailEnquiryToUser(String userName, String userEmail, Long enquiryID, String enquiryContent){
        String emailText = "";
        emailText+="Dear "+userName+", "+ "\n\n";
        emailText+="You have just submitted an enquiry on WineXpress."+"\n\n";
        emailText+="Enquiry ID: "+enquiryID+"\n\n";
        emailText+="Enquiry Content:"+"\n\n";
        emailText+=enquiryContent+"\n\n";
        emailText+="Our Admin is currently processing your enquiry. Please kindly wait for our reply. Thank you!"+"\n\n\n\n";   
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress";
        userName=userName.split(",")[0]+userName.split(",")[1];
        toEmailAddress=userName+"<"+userEmail+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("You Have Submitted an Enquiry on WineXpress");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }
    
    public void emailEnquiryReplyToUser(String userName, String userEmail, Long enquiryID, String replyContent){
        String emailText = "";
        emailText+="Dear "+userName+", "+ "\n\n";
        emailText+="Our Admin has processed your enquiry. Please refer to the following reply"+"\n\n";
        emailText+="Enquiry ID: "+enquiryID+"\n\n";
        emailText+="Reply Content:"+"\n\n";
        emailText+=replyContent+"\n\n";
        emailText+="Thank you again for your enquiry! If you still have any question, please reply us."+"\n\n\n\n";   
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress";
        userName=userName.split(",")[0]+userName.split(",")[1];
        toEmailAddress=userName+"<"+userEmail+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Reply to Your Enquiry on WineXpress");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }
    
    
            
            
            
            
            
    public void emailPromotionPlan(String receiverName,String receiverEmail,String senderName,String senderType,String promoName,String promoCode,String promoDiscount,
            String date,String numberOfTimes){
        
        String emailText = "";
        emailText+="Dear "+receiverName+", "+ "\n\n";
        emailText+=senderName+", "+" there are Promotion Sales on WineXpress! "+"\n\n";
        emailText+="This \""+promoName+"\" ends on "+date+", so act faster lah! "+"\n\n";
        emailText+="To enjoy the promotion, just simply enter this Promotion Code: "+"\n\n";
        emailText+=promoCode+"\n\n";
        emailText+="when you make payment for orders of "+senderName+", "+"\n\n";
        emailText+="and you will get discount of "+promoDiscount+" off! "+"\n\n";
        emailText+="Only the first "+numberOfTimes+" customers are eligible for this discount! "+"\n\n";
        emailText+="So, do grap this opportunity & enjoy excellent wine products! "+"\n\n\n\n";
        emailText+="Best Regards,"+"\n";
        emailText+="WineXpress"+"\n";
        
        toEmailAddress=receiverName+"<"+receiverEmail+">";

        try {
            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(emailFromAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Dont't Miss Out! Enjoy Attractive Discount and Save Now on WineXpress!");

                String messageText = ""+ emailText;

                msg.setText(messageText);
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

                Transport.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new EJBException(e.getMessage());
        }
    }

}

