package recursos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;

public class BarraInstrucciones
{

    public static void genera(String clave, String nombre, String correo)
    {
        try
        {
            String nombreArchivo = "codigo" + nombre + ".pdf";
            String destino = "c:/ARCHIVOS_MULTIMEDIA/";
            String archivo = destino + nombreArchivo;

            File folder = new File(destino);

            //si no existe
            if (!folder.exists())
            {
                //folder.mkdir();//en caso de que no existan
                folder.mkdirs();//en caso de que no existan, las crea todas
            }
            // copyFile_Java(ruts, archivo);

            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(archivo));
            doc.open();

            doc.add(new Paragraph(" "));

            Barcode128 code128 = new Barcode128();
            code128.setCode(clave);
            Image img128 = code128.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            //Escalas
            img128.scalePercent(200);
            doc.add(img128);

            doc.close();

            EnvioCorreos envio = new EnvioCorreos();
            FileDataSource o = new FileDataSource("c:/ARCHIVOS_MULTIMEDIA/codigo" + nombre + ".pdf");
            envio.enviar(correo, o);

        } catch (DocumentException | FileNotFoundException ex)
        {

        }
    }

    public static void generaManager(String clave, String correo)
    {
        try
        {

            String nombreArchivo = "codigo.pdf";
            String destino = "c:/ARCHIVOS_MULTIMEDIA/";
            String archivo = destino + nombreArchivo;

            File folder = new File(destino);

            //si no existe
            if (!folder.exists())
            {
                //folder.mkdir();//en caso de que no existan
                folder.mkdirs();//en caso de que no existan, las crea todas
            }

            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(archivo));
            doc.open();

            doc.add(new Paragraph(" "));

            Barcode128 code128 = new Barcode128();
            code128.setCode(clave);
            Image img128 = code128.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            //Escalas
            img128.scalePercent(200);
            doc.add(img128);

            doc.close();

            EnvioCorreos envio = new EnvioCorreos();
            FileDataSource o = new FileDataSource("c:/ARCHIVOS_MULTIMEDIA/codigo.pdf");
            envio.enviar(correo, o);

        } catch (DocumentException | FileNotFoundException ex)
        {

        }
    }

    public static boolean esEmail(String correo)
    {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
    /*
     AudioClip music;
        music = Applet.newAudioClip(ClassLoader.getSystemResource("progra/THE 1975-love if it we made it.wav"));
        music.play();
        jButton2.setVisible(true);
     */
 /*
     try
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e)
        {
        }
     */

    //Para colocar una imagen en boton con accion, con un tituto, dentro de un panel
    /*Blob blob = rs.getBlob("portada");
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try
                {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e)
                {
                    Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
                }

                ImageIcon icono = new ImageIcon(img);

                JButton n = new JButton();
                n.setText(rs.getString("nombre_libro"));
                n.setFont(new Font("Tahoma", Font.BOLD, 14));
                n.setIcon(new ImageIcon(icono.getImage().getScaledInstance(70, 100, Image.SCALE_SMOOTH)));
                n.setOpaque(true);
                n.setBorder(null);
                n.setBorderPainted(false);
                n.setContentAreaFilled(false);
                n.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                n.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                n.setIconTextGap(0);
                n.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                n.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                n.addActionListener(new java.awt.event.ActionListener()

                {
                    public void actionPerformed(java.awt.event.ActionEvent evt)
                    {
                        nombre_libro_s = n.getText();
                        ProductInformationLibro ps = new ProductInformationLibro(nombre_libro_s);
                        ps.setVisible(true);
                    }
                });
     */
}
