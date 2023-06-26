package taskitproyecto;

import Clases.Subdivision;
import Clases.Tarea;
import Clases.Usuario;
import Modelo.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistroLider extends javax.swing.JFrame {

    HashTable Subdivisiones;
    conjuntoDisjunto<Usuario> Usuarios;

    public RegistroLider() {
        this.Subdivisiones = CargarSubdivisiones();
        this.Usuarios = CargarUsuarios();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public HashTable CargarSubdivisiones() {
        HashTable SubdivisionesA = null;
        try {
            FileInputStream Archivo = new FileInputStream("data\\subdivisiones.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            SubdivisionesA = (HashTable) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return SubdivisionesA;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SubdivisionNueva = new javax.swing.JTextField();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Atras = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Registro lider");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 63, 63));
        jLabel1.setText("NOMBRE DE LA NUEVA SUBDIVISIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        SubdivisionNueva.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        SubdivisionNueva.setBorder(null);
        SubdivisionNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubdivisionNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(SubdivisionNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, -1));

        Agregar.setBackground(new java.awt.Color(191, 63, 63));
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar");

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar);
        Agregar.setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 110, 30));

        Atras.setBackground(new java.awt.Color(191, 63, 63));
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Atras");

        javax.swing.GroupLayout AtrasLayout = new javax.swing.GroupLayout(Atras);
        Atras.setLayout(AtrasLayout);
        AtrasLayout.setHorizontalGroup(
            AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        AtrasLayout.setVerticalGroup(
            AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 30));

        name.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        name.setBorder(null);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, -1));

        jLabel4.setBackground(new java.awt.Color(191, 63, 63));
        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 63, 63));
        jLabel4.setText("INGRESE SU USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(191, 63, 63));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 63, 63));
        jLabel5.setText("INGRESE SU CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        passwordField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubdivisionNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubdivisionNuevaActionPerformed

    }//GEN-LAST:event_SubdivisionNuevaActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        String Subdivision = SubdivisionNueva.getText();
        String nombre=name.getText();
        char[] password = passwordField.getPassword();
        String passwordString = new String(password);
        if (Subdivision.equals("")||nombre.equals("") || passwordString.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Informacion no valida!");
        } else {
            Usuario UserLider=new Usuario(nombre,"Lider",Subdivision,passwordString);
            Subdivision NSubdivision = new Subdivision(Subdivision, new BinaryMaxHeap(10), new AVL<Tarea>(), new PilaListaEnlazada<Tarea>(), UserLider);
            Subdivisiones.Insert(NSubdivision);
            Subdivisiones.GuardarHashTable("data\\subdivisiones.txt");
            Usuarios.makeSet(UserLider);
            Usuarios.GuardarConjunto("data\\usuarios.txt");
            JOptionPane.showMessageDialog(this, "¡División agregada!");
        }
        
        LogIn LogIn = new LogIn();
        LogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarMouseClicked

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        Decision Decision = new Decision();
        Decision.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasMouseClicked

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        Agregar.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
        Agregar.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_AgregarMouseExited

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Atras.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Atras.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_AtrasMouseExited

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JPanel Atras;
    private javax.swing.JTextField SubdivisionNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
