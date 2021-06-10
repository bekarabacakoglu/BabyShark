package Test_Automation.API;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class BaseClass
{

    public static ExtentReports extent;
    public static ExtentTest logger;
    String yemeksepetiXRM = "https://salcaapitest.yemeksepeti.com";
    Fairy fairy = Fairy.create();
    Person person = fairy.person();

    @BeforeTest
    public void Start()
    {
            extent = new ExtentReports(
                    System.getProperty("user.dir") + "/test-output/BackboneReport.html", true);
            extent.addSystemInfo("Tool","TestNG").addSystemInfo("Project", "Backbone - Services")
                    .addSystemInfo("Environment", "Dev Ortami")
                    .addSystemInfo("User Name", "Ahmet Mesut Ercikan");
            extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }

    @AfterMethod
    public synchronized void getResult(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(LogStatus.PASS, "Test Case Passed is " + result.getName());
        }
        if(result.getStatus()==ITestResult.FAILURE) {
            String reason = result.getThrowable().toString();
            logger.log(LogStatus.FAIL, reason);
            extent.endTest(logger);
        }
    }

    @AfterTest
    public void TearDown()
    {
        extent.flush();

//        // Create object of Property file
//        Properties props = new Properties();
//
//        // this will set host of server- you can change based on your requirement
//        props.put("mail.smtp.host", "smtp.gmail.com");
//
//        // set the port of socket factory
//        props.put("mail.smtp.socketFactory.port", "465");
//
//        // set socket factory
//        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//
//        // set the authentication to true
//        props.put("mail.smtp.auth", "true");
//
//        // set the port of SMTP server
//        props.put("mail.smtp.port", "587");
//
//        // This will handle the complete authentication
//        Session session = Session.getDefaultInstance(props,
//
//                new javax.mail.Authenticator() {
//
//                    protected PasswordAuthentication getPasswordAuthentication() {
//
//                        return new PasswordAuthentication("ahmetmesutercikan18@gmail.com", "ahmet.naz05");
//
//                    }
//
//                });
//
//        try {
//
//            // Create object of MimeMessage class
//            Message message = new MimeMessage(session);
//
//            // Set the from address
//            message.setFrom(new InternetAddress("ahmetmesutercikan18@gmail.com"));
//
//            // Set the recipient address
//            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("ahmetmesutercikan@hotmail.com"));
//
//            // Add the subject link
//            message.setSubject("Testing Subject");
//
//            // Create object to add multimedia type content
//            BodyPart messageBodyPart1 = new MimeBodyPart();
//
//            // Set the body of email
//            messageBodyPart1.setText("Gmop Servis Testlerinin Sonucu Ektedir.");
//
//            // Create another object to add another content
//            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//
//            // Mention the file which you want to send
//            String filename = "C:\\Users\\ahmet.ercikan\\IdeaProjects\\Gmop_SwaggerService\\test-output\\GmopSwaggerReport.html";
//
//            // Create data source and pass the filename
//            DataSource source = new FileDataSource(filename);
//
//            // set the handler
//            messageBodyPart2.setDataHandler(new DataHandler(source));
//
//            // set the file
//            messageBodyPart2.setFileName(filename);
//
//            // Create object of MimeMultipart class
//            Multipart multipart = new MimeMultipart();
//
//            // add body part 1
//            multipart.addBodyPart(messageBodyPart2);
//
//            // add body part 2
//            multipart.addBodyPart(messageBodyPart1);
//
//            // set the content
//            message.setContent(multipart);
//
//            // finally send the email
//            Transport.send(message);
//
//            System.out.println("=====Email Sent=====");
//
//        } catch (MessagingException e) {
//
//            throw new RuntimeException(e);
//
//        }

//        // E-Mail Bilgileri Tanımlanıyor.
//        String from = "ahmetmesutercikan18@gmail.com";
//        String to = "ahmetmesutercikan@hotmail.com";
//        String subject = "Selenium Test Result";
//        String bodyText = "Gmop Servis Testlerinin Sonucu Ektedir.";
//        String host = "localhost";
//
//        // Attach Edilecek Dosyanın Dizini Tanımlanıyor.
//        String attachmentName = "C:\\Users\\ahmet.ercikan\\IdeaProjects\\Gmop_SwaggerService\\test-output\\GmopSwaggerReport.html";
//
//        // SMTP Bilgileri Tanımlanıyor.
//        Properties props = new Properties();
//        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//        props.put("mail.smtp.user", "ahmetmesutercikan18@gmail.com");
//        props.put("mail.smtp.password", "ahmet.naz05");
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.port", "465");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.host", host);
//        Session session = Session.getDefaultInstance(props);
//        try {
//            InternetAddress fromAddress = new InternetAddress(from);
//            InternetAddress toAddress = new InternetAddress(to);
//
//            MimeMessage msg = new MimeMessage(session);
//            msg.setFrom(fromAddress);
//            msg.setRecipient(Message.RecipientType.TO, toAddress);
//            msg.setSubject(subject);
//            msg.setSentDate(new Date());
//
//            MimeBodyPart messagePart = new MimeBodyPart();
//            messagePart.setText(bodyText);
//
//            FileDataSource fileDataSource = new FileDataSource(attachmentName);
//
//            MimeBodyPart attachmentPart = new MimeBodyPart();
//            attachmentPart.setDataHandler(new DataHandler(fileDataSource));
//            attachmentPart.setFileName(fileDataSource.getName());
//
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(messagePart);
//            multipart.addBodyPart(attachmentPart);
//
//            msg.setContent(multipart);
//            Transport.send(msg,"ahmetmesutercikan18@gmail.com","ahmet.naz05");
//        } catch (MessagingException e) {
//
//            e.printStackTrace();
//        }
    }
}
