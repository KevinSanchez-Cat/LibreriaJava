/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class EnvioCorreos
{

    public void enviar(String dir_correo, FileDataSource file)
    {
        try
        {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
           
            props.setProperty("mail.smtp.port", "25");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "libreriavirtual2019ke@gmail.com";
            String passwordRemitente = "libreria2019!";
            String correoReceptor = dir_correo;
            String asunto = "Correo de confirmacion";
            String mensaje = "Hola<br>Este es un coreo de confirmacion de tu  <b> clave de usuario</b><br><br>gracias por unirte a <b> Libreria Virtual</b>";

            BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");

            BodyPart adjunto = new MimeBodyPart();
            //adjunto.setDataHandler(new DataHandler(new FileDataSource("c:/276_47874.pdf")));
            adjunto.setDataHandler(new DataHandler(file));
            adjunto.setFileName("Clave Usuario.pdf");

            MimeMultipart miltiParte = new MimeMultipart();
            miltiParte.addBodyPart(texto);
            miltiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setContent(miltiParte);

            try (Transport t = session.getTransport("smtp"))
            {
                t.connect(correoRemitente, passwordRemitente);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            }

            JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

        } catch (MessagingException ex)
        {
            Logger.getLogger(EnvioCorreos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void enviarProducto(String dir_correo, FileDataSource file)
    {
        try
        {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
           
            props.setProperty("mail.smtp.port", "25");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "libreriavirtual2019ke@gmail.com";
            String passwordRemitente = "libreria2019!";
            String correoReceptor = dir_correo;
            String asunto = "Correo de confirmacion";
            String mensaje = "Hola<br>Este es un coreo de confirmacion de tu  <b> clave de usuario</b><br><br>gracias por unirte a <b> Libreria Virtual</b>";

            BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");

            BodyPart adjunto = new MimeBodyPart();
            //adjunto.setDataHandler(new DataHandler(new FileDataSource("c:/276_47874.pdf")));
            adjunto.setDataHandler(new DataHandler(file));
            adjunto.setFileName("Clave Usuario.pdf");

            MimeMultipart miltiParte = new MimeMultipart();
            miltiParte.addBodyPart(texto);
            miltiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setContent(miltiParte);

            try (Transport t = session.getTransport("smtp"))
            {
                t.connect(correoRemitente, passwordRemitente);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            }

            JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

        } catch (MessagingException ex)
        {
            Logger.getLogger(EnvioCorreos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
