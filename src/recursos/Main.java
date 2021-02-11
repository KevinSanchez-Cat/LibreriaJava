/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import javax.activation.FileDataSource;

/**
 *
 * @author eduar
 */
public class Main
{

    public static void main(String[] args)
    {
        EnvioCorreos en = new EnvioCorreos();
        String dir = "c:/276_47874.pdf";
        FileDataSource file = new FileDataSource(dir);
        String correoDestinatario = "urielenrique99@gmail.com";
        en.enviar(correoDestinatario, file);
    }
}
