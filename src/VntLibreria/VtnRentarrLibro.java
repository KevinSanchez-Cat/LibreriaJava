package VntLibreria;

import static VntLibreria.VtnComprarLibros.total;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import recursos.Mensaje;
import recursos.Validaciones;

public class VtnRentarrLibro extends javax.swing.JFrame
{

    static Object[] data = new Object[4];
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    int X_V;
    int Y_V;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnRentarrLibro(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
    

     
     

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new rojerusan.RSTableMetro();
        preciot = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new rojeru_san.RSMTextFull();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new rojerusan.RSTableMetro();

        jMenuItem1.setText("Ver descripción");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Añadir al carrito");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("RENTAR LIBROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 380, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio total:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Clave del usuario:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del usuario:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Shopping_Cart_24px.png"))); // NOI18N
        rSButton2.setText("Rentar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 130, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton3.setText("Regresar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 140, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Libro", "Autor", "Precio", "Cantidad"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColorBackgoundHead(new java.awt.Color(0, 51, 102));
        jTable2.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        jTable2.setColorBordeHead(new java.awt.Color(204, 204, 204));
        jTable2.setColorFilasForeground1(new java.awt.Color(0, 0, 51));
        jTable2.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        jTable2.setFuenteFilas(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable2.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable2.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane4.setViewportView(jTable2);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 270));

        preciot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preciot.setText("$ 000.00");
        jPanel3.add(preciot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 410, 560));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Buscar por nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, 30));

        jTextField2.setForeground(new java.awt.Color(0, 51, 102));
        jTextField2.setBordeColorFocus(new java.awt.Color(0, 51, 102));
        jTextField2.setBotonColor(new java.awt.Color(0, 51, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setOpaque(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 280, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Nombre del libro", "Autor", "Precio", "Stock", "Descripción", "Portada"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColorBackgoundHead(new java.awt.Color(0, 51, 102));
        jTable1.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        jTable1.setColorBordeHead(new java.awt.Color(204, 204, 204));
        jTable1.setColorFilasForeground1(new java.awt.Color(0, 0, 51));
        jTable1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        jTable1.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 810, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // añadir al carrito
        int qty = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad"));
        agregarCarrito(qty);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        NotificacionPedidos h = new NotificacionPedidos();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton3ActionPerformed
    void mostrarDatos(String clave)
    {

        String sql = "";
        if (clave.equals(""))
        {
            sql = "SELECT * FROM t_libro";
            jPanel3.removeAll();
        } else
        {

            sql = "SELECT * FROM t_libro WHERE nombre_libro like '%" + clave + "%' OR autor_libro like '%" + clave + "%' OR editorial_libro like '%" + clave + "%'";
            jPanel3.removeAll();

        }

        Statement st;
        Conexion.con = Conexion.getConexion();
        try
        {
            st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                Blob blob = rs.getBlob("portada");
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
                JLabel u = new JLabel();
                u.setIcon(new ImageIcon(icono.getImage()
                        .getScaledInstance(90, 120, Image.SCALE_SMOOTH)));

                JButton n = new JButton();
                n.setText(rs.getString("nombre_libro"));
                n.setFont(new Font("Tahoma", Font.BOLD, 14));

                n.setIcon(new ImageIcon(icono.getImage()
                        .getScaledInstance(70, 100, Image.SCALE_SMOOTH)));

                n.setOpaque(true);
                n.setBorder(null);
                n.setBorderPainted(false);
                n.setContentAreaFilled(false);
                n.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                n.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                n.setIconTextGap(0);
                n.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                n.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                JPanel v = new JPanel();
                v.setBackground(Color.white);
                v.add(n);

                n.addActionListener(new java.awt.event.ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt)
                    {
                        //JOptionPane.showMessageDialog(null, n.getText());
                        nombre_libro_s = n.getText();
                        ProductInformationLibro ps = new ProductInformationLibro(nombre_libro_s);
                        ps.setVisible(true);
                    }
                });

                jPanel3.add(v);

                jPanel3.updateUI();

            }

        } catch (SQLException e)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
        }

    }
    String nombre_libro_s = "";
    public static ArrayList<ProductList> cartItem = new ArrayList();

    public void llenarTabla()
    {
        ArrayList<ProductList> list;
        if (jTextField2.getText().equals(""))
        {
            list = Conexion.TableGenerator();
        } else
        {
            list = Conexion.TableGenerator(jTextField2.getText());
        }
        Object rowData[] = new Object[6];

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable1.setDefaultRenderer(Object.class, new Tabla());

        model.setRowCount(0); //To clear mobileTable

        for (int i = 0; i < list.size(); i++)
        {
            try
            {
                rowData[0] = list.get(i).getNombre_libro();
                rowData[1] = list.get(i).getAutor_libro();
                rowData[2] = list.get(i).getPrecio_libro();
                rowData[3] = list.get(i).getNo_existencia_libro();
                rowData[4] = list.get(i).getDescripcion_libro();
                Blob blob = list.get(i).getMimage();
                byte[] datas = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;

                img = ImageIO.read(new ByteArrayInputStream(datas));
                ImageIcon icono = new ImageIcon(img);

                Image resizedImage = icono.getImage();
                ImageIcon temp = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
                JLabel iconnnn = new JLabel(temp);
                rowData[5] = iconnnn;

                model.addRow(rowData);
                jTable1.setRowHeight(150);
                jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            } catch (SQLException ex)
            {

            } catch (IOException ex)
            {

            }
        }

    }

    private void agregarCarrito(int qty)
    {
        int fila = jTable1.getSelectedRow();
        if (fila >= 0)
        {
            String nombre = ((jTable1.getValueAt(fila, 0).toString()));
            String autor = (jTable1.getValueAt(fila, 1).toString());
            String precio = (jTable1.getValueAt(fila, 2).toString());
            String stock = (jTable1.getValueAt(fila, 3).toString());
            String descripcion = (jTable1.getValueAt(fila, 4).toString());

            if (Integer.parseInt(stock) < qty)
            {
                JOptionPane.showMessageDialog(null, "Productos insuficientes en Stock!");
            } else
            {

                ProductList p = new ProductList(nombre, autor, qty * Float.parseFloat(precio),
                        qty, null, null);
                cartItem.add(p);
                JOptionPane.showMessageDialog(null, "Producto añadido!");

                int qtyTester = Integer.parseInt(stock) - qty;

                Conexion.updateLibros(nombre, qtyTester);
                cart();

            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Secione una fila");
        }

    }

    private void cart()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        total = 0;
        tot = "";

        for (int i = 0; i < this.cartItem.size(); i++)
        {
            data[0] = this.cartItem.get(i).getNombre_libro();
            data[1] = this.cartItem.get(i).getAutor_libro();
            data[2] = this.cartItem.get(i).getPrecio_libro();
            data[3] = this.cartItem.get(i).getNo_existencia_libro();

            model.addRow(data);
            jTable2.setRowHeight(20);
            total += Float.parseFloat(jTable2.getValueAt(i, 2) + "");

        }

        preciot.setText(String.valueOf(total));
    }
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField2KeyReleased
    {//GEN-HEADEREND:event_jTextField2KeyReleased
        llenarTabla();
    }//GEN-LAST:event_jTextField2KeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Shutdown.wav"));
            music.play();
            Retardos.tSalir.start();

    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private rojerusan.RSTableMetro jTable1;
    private rojerusan.RSTableMetro jTable2;
    private rojeru_san.RSMTextFull jTextField2;
    private javax.swing.JLabel preciot;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    // End of variables declaration//GEN-END:variables
}
