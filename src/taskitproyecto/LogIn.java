package taskitproyecto;

import Clases.Usuario;
import java.awt.Color;
import Modelo.*;
import Clases.*;
import FuncionesHash.HashString;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    conjuntoDisjunto<Usuario> usuarios;

    public LogIn() {
        initComponents();
        this.usuarios = CargarUsuarios();
        this.setLocationRelativeTo(null);


    }


        
    public conjuntoDisjunto<Usuario> CargarUsuarios() {
        conjuntoDisjunto<Usuario> Usuarios = null;
        try {
            FileInputStream Archivo = new FileInputStream("data\\usuarios.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            Usuarios = (conjuntoDisjunto<Usuario>) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return Usuarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Registrarse = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Iniciar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Login");

        Fondo.setBackground(new java.awt.Color(191, 63, 63));
        Fondo.setMinimumSize(new java.awt.Dimension(300, 400));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrarse.setBackground(new java.awt.Color(191, 63, 63));
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.setPreferredSize(new java.awt.Dimension(100, 30));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrarse");

        javax.swing.GroupLayout RegistrarseLayout = new javax.swing.GroupLayout(Registrarse);
        Registrarse.setLayout(RegistrarseLayout);
        RegistrarseLayout.setHorizontalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        RegistrarseLayout.setVerticalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 106, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        name.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        jSeparator1.setForeground(new java.awt.Color(191, 63, 63));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 168, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(191, 63, 63));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 168, -1));

        Iniciar.setBackground(new java.awt.Color(191, 63, 63));
        Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Iniciar sesión");

        javax.swing.GroupLayout IniciarLayout = new javax.swing.GroupLayout(Iniciar);
        Iniciar.setLayout(IniciarLayout);
        IniciarLayout.setHorizontalGroup(
            IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IniciarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        IniciarLayout.setVerticalGroup(
            IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IniciarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        passwordField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        passwordField.setBorder(null);
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, -1));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 240));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Task It");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        Iniciar.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_IniciarMouseEntered

    private void IniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseExited
        Iniciar.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_IniciarMouseExited

    private void RegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseEntered
        Registrarse.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_RegistrarseMouseEntered

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        Registrarse.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_RegistrarseMouseExited

    private void IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseClicked
        boolean valido=false;
        HashString hs=new HashString(59,3);
        String nombre = name.getText();
        char[] password = passwordField.getPassword();
        String passwordString = new String(password);
        if (nombre.equals("") || passwordString.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Ingreso no valido!");
        } else {
           
            for(Usuario u: usuarios.getObjects()){                
                if(u.getNombre().equals(nombre) && hs.CompareHashes(u.getContraseña(), passwordString)){
                    Main Inicio = new Main(u);
                    this.setVisible(false);
                    Inicio.setVisible(true);
                    valido=true;
                }
            }
            if(!valido)JOptionPane.showMessageDialog(this, "¡Usuario o contraseña incorrectos!");
        }
    }//GEN-LAST:event_IniciarMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        Decision Decision = new Decision();
        this.setVisible(false);
        Decision.setVisible(true);
    }//GEN-LAST:event_RegistrarseMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Iniciar;
    private javax.swing.JPanel Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
