package VntLibreria;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBDMexico
{

    //VARIABLE ESTATICA Y GLOBAL DE TIPO Connection, PERMITE SER LA UNION PARA CONECTARNOS A LA BASE DE DATOS Y REALIZAR CAMBIOS
    public static Connection con1;

    //METODO PUBLICO Y ESTATICO QUE RETORNA UN DATO DE TIPO Connection, METODO QUE HACE LA CONEXION AL SISTEMA GERTOR DE DATOS MySQL
    public Connection getConexion()
    {
        //NECESITAMOS UN CAPTURADOR DE EXEPCIONES PARA EVITAR UN FALLO EN EL PROGRAMA, 
        try
        {
            //NUESTRO CONECTOR PARA MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //NUESTRA VARIABLE RECIBIRA EL "NODO" PARA CONECTARNOS A NUESTRA BASE DE DATOS
            //PRIMER PARAMETRO:URL 
            //SEGUNDO PARAMETRO: USUARIO
            //TERCER PARAMETRO: CONTRASEÑA
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/mexico", "root", "");
            //PODEMOS MOSTRAR UN MENSAJE PARA VERIFICAR SI HUBO UNA CONEXION EXITOSA
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException ex)
        {
            //MUESTA UN MENSAJE DE ERROR MAS SU ERROR
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONECCION DE LA BASE DE DATOS", "Ups! Ha ocurrido un error\n" + ex.toString(), JOptionPane.ERROR);
        }
        return con1;
    }

}
