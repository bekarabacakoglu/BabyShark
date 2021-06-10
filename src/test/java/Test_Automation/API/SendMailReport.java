package Test_Automation.API;

//After complete execution send pdf report by email

import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendMailReport {


    public void tearDown(){

    sendPDFReportByGMail("ahmetmesutercikan18@gmail.com", "ahmet.naz05", "ahmetmesutercikan@hotmail.com", "PDF Report", "");

        }

/**

 * Send email using java

 * @param from

 * @param pass

 * @param to

 * @param subject

 * @param body

 */

private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {

        Properties props = System.getProperties();

        String host = "smtp.gmail.com";

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.host", host);

        props.put("mail.smtp.user", from);

        props.put("mail.smtp.password", pass);

        props.put("mail.smtp.port", "587");

        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        MimeMessage message = new MimeMessage(session);

        try {

        //Set from address

        message.setFrom(new InternetAddress(from));

        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//Set subject

        message.setSubject(subject);

        message.setText(body);

        BodyPart objMessageBodyPart = new MimeBodyPart();

        objMessageBodyPart.setText("Please Find The Attached Report File!");

        Multipart multipart = new MimeMultipart();

        multipart.addBodyPart(objMessageBodyPart);

        objMessageBodyPart = new MimeBodyPart();

//Set path to the pdf report file

        String filename = System.getProperty("user.dir")+"C:\\Users\\ahmet.ercikan\\IdeaProjects\\Gmop_SwaggerService\\test-output\\GmopSwaggerReport.html";

//Create data source to attach the file in mail

        DataSource source = new FileDataSource(filename);

        objMessageBodyPart.setDataHandler(new DataHandler(source));

        objMessageBodyPart.setFileName(filename);

        multipart.addBodyPart(objMessageBodyPart);

        message.setContent(multipart);

        Transport transport = session.getTransport("smtp");

        transport.connect(host, from, pass);

        transport.sendMessage(message, message.getAllRecipients());

        transport.close();

        }

        catch (AddressException ae) {

        ae.printStackTrace();

        }

        catch (MessagingException me) {

        me.printStackTrace();

        }

        }

}