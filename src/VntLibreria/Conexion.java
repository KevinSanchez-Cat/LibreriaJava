package VntLibreria;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion
{

    //VARIABLE ESTATICA Y GLOBAL DE TIPO Connection, PERMITE SER LA UNION PARA CONECTARNOS A LA BASE DE DATOS Y REALIZAR CAMBIOS
    public static Connection con;

    //METODO PUBLICO Y ESTATICO QUE RETORNA UN DATO DE TIPO Connection, METODO QUE HACE LA CONEXION AL SISTEMA GERTOR DE DATOS MySQL
    public static Connection getConexion()
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
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria_virtual_proyecto", "root", "");
            //PODEMOS MOSTRAR UN MENSAJE PARA VERIFICAR SI HUBO UNA CONEXION EXITOSA
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException ex)
        {
            //MUESTA UN MENSAJE DE ERROR MAS SU ERROR
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONECCION DE LA BASE DE DATOS", "Ups! Ha ocurrido un error\n" + ex.toString(), JOptionPane.ERROR);
        }
        return con;
    }

    public static ArrayList<ProductList> TableGenerator()
    {
        ArrayList<ProductList> list = new ArrayList<>();
        try
        {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria_virtual_proyecto", "root", "");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT nombre_libro,autor_libro,precio_libro,no_existencia_libro,descripcion_libro, portada FROM t_libro");

            ProductList pl;

            while (rs.next())
            {

                pl = new ProductList(rs.getString("nombre_libro"), rs.getString("autor_libro"),
                        rs.getFloat("precio_libro"), rs.getInt("no_existencia_libro"), rs.getString("descripcion_libro"), rs.getBlob("portada"));

                list.add(pl);

            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static ArrayList<ProductList> TableGenerator(String clave)
    {
        ArrayList<ProductList> list = new ArrayList<>();
        try
        {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria_virtual_proyecto", "root", "");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT nombre_libro,autor_libro,precio_libro,no_existencia_libro,descripcion_libro, portada FROM t_libro WHERE nombre_libro like '" + clave + "%'");

            ProductList pl;

            while (rs.next())
            {

                pl = new ProductList(rs.getString("nombre_libro"), rs.getString("autor_libro"),
                        rs.getFloat("precio_libro"), rs.getInt("no_existencia_libro"), rs.getString("descripcion_libro"), rs.getBlob("portada"));

                list.add(pl);

            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void updateLibros(String nombre_libro, int qty)
    {
        try
        {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria_virtual_proyecto", "root", "");

            PreparedStatement ps = con.prepareStatement("UPDATE t_libro SET no_existencia_libro=? WHERE nombre_libro=?");

            ps.setInt(1, qty);
            ps.setString(2, nombre_libro);
            if (ps.executeUpdate() == 0)
            {
                JOptionPane.showMessageDialog(null, "No existe el producto!");
            } else if (ps.executeUpdate() == 1/* && flag*/)
            {
                JOptionPane.showMessageDialog(null, "Actualizado correctamente!");
                //flag = false;
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
