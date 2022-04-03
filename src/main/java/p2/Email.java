package p2;

import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * <h1>Email</h1>
 * <p>Clasa de trimitere a notificarilor de email in momentul imprumutului.
 * Se trimit toate datele cartii cat si termenul de imprumut.</p>
 * @version 2.04
 * @author Bumbuc Ivan
 */
public class Email {
    /**
     * Constructorul cu parametrii
     * @param subiect
     * @param mesaj
     * @param email
     */
    public Email(String subiect,String mesaj,String email)
    {
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "ivanbumbuc2017@gmail.com";
        String password = "Zaludaib";
        try {
            sendPlainTextEmail(host, port, mailFrom, password, email,
                    subiect, mesaj);
            System.out.println("Succes");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda de trimitere a notificarilor
     * @param host
     * @param port
     * @param userName
     * @param password
     * @param toAddress
     * @param subject
     * @param message
     * @throws AddressException
     * @throws MessagingException
     */
    public void sendPlainTextEmail(String host, String port,
                                   final String userName, final String password, String toAddress,
                                   String subject, String message) throws AddressException,
            MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(message);
        Transport.send(msg);

    }

    /**
     * Metoda de creare a unui nou thread
     * @param s
     * @param b
     */
    public  static void exec(String s,String b)
    {
        ExecutorService emailExecutor = Executors.newSingleThreadExecutor();
        emailExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Email x=new Email("Imprumutare Biblioteca",s,b);
            }
        });
        emailExecutor.shutdown();
    }
}

