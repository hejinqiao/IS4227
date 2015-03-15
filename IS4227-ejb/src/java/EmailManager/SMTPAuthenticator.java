/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailManager;

import javax.mail.*;

/**
 *
 * @author Administrator
 */
public class SMTPAuthenticator extends javax.mail.Authenticator {

// Replace with your actual unix id 
    private static final String SMTP_AUTH_USER = "wangtian";
// Replace with your actual unix password 
    private static final String SMTP_AUTH_PWD = "wtq1120";

    public SMTPAuthenticator() {
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        String username = SMTP_AUTH_USER;
        String password = SMTP_AUTH_PWD;

        return new PasswordAuthentication(username, password);
    }
}