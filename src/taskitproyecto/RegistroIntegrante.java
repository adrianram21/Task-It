package taskitproyecto;

import Clases.Subdivision;
import Clases.Usuario;
import Modelo.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.List;

public class RegistroIntegrante extends javax.swing.JFrame {

    public HashTable Subdivisiones;
    public conjuntoDisjunto<Usuario> Usuarios;

    public RegistroIntegrante() {
        this.Subdivisiones = CargarSubdivisiones();
        this.Usuarios = CargarUsuarios();
        initComponents();
        ElementosSubdivision(GruposSubdivisiones, Subdivisiones);
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

    public Subdivision BuscarSubdivision(String NombreSubdivision) {
        int Indice = Subdivisiones.Hash(NombreSubdivision);
        Nodo<Subdivision> Lector = Subdivisiones.getLista()[Indice].getHead();
        while (Lector != null && Lector.getData().getNombre().equals(NombreSubdivision) == false) {
            Lector = Lector.getNext();
        }
        if (Lector == null) {
            return null;
        } else {
            return Lector.getData();
        }
    }

    public void ElementosSubdivision(JComboBox ListaDesplegable, HashTable Sub) {
        int Valores = 0;
        for (int i = 0; i < Sub.getCapacidad(); i++) {
            ListaEnlazadaConCola<Subdivision> Lista = Sub.getLista()[i];
            Nodo<Subdivision> Lectura = Lista.getHead();
            if (Valores == Sub.getCantidadDeValores()) {
                break;
            }
            while (Lectura != null && Valores != Sub.getCantidadDeValores()) {
                ListaDesplegable.addItem(Lectura.getData().getNombre());
                Valores++;
                Lectura = Lectura.getNext();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GruposSubdivisiones = new javax.swing.JComboBox<>();
        Registrarse = new javax.swing.JPanel();
        Registrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Retroceder = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Registro integrante");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 350));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        name.setBorder(null);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel1.setBackground(new java.awt.Color(191, 63, 63));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 63, 63));
        jLabel1.setText("INGRESE SU USUARIO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(191, 63, 63));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 63, 63));
        jLabel3.setText("INGRESE SU CONTRASEÑA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        GruposSubdivisiones.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jPanel3.add(GruposSubdivisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, -1));

        Registrarse.setBackground(new java.awt.Color(191, 63, 63));
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
        });

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrar.setText("Registrarse");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegistrarseLayout = new javax.swing.GroupLayout(Registrarse);
        Registrarse.setLayout(RegistrarseLayout);
        RegistrarseLayout.setHorizontalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        RegistrarseLayout.setVerticalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 30));

        jLabel5.setBackground(new java.awt.Color(191, 63, 63));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 63, 63));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUBDIVISIÓN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 87, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        Retroceder.setBackground(new java.awt.Color(191, 63, 63));
        Retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Retroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetrocederMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RetrocederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RetrocederMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Atras");

        javax.swing.GroupLayout RetrocederLayout = new javax.swing.GroupLayout(Retroceder);
        Retroceder.setLayout(RetrocederLayout);
        RetrocederLayout.setHorizontalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RetrocederLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RetrocederLayout.setVerticalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RetrocederLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        passwordField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void RegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseEntered
        Registrarse.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_RegistrarseMouseEntered

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        Registrarse.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_RegistrarseMouseExited

    private void RetrocederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseEntered
        Retroceder.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_RetrocederMouseEntered

    private void RetrocederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseExited
        Retroceder.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_RetrocederMouseExited

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        Decision Decision = new Decision();
        Decision.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederMouseClicked

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        String nombre = name.getText();
        char[] password = passwordField.getPassword();
        String passwordString = new String(password);
        String subdivString = (String) GruposSubdivisiones.getSelectedItem();
        if (nombre.equals("") || passwordString.equals("") || subdivString.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Ingreso no valido!");
        } else {
            Subdivision subdivision = BuscarSubdivision(subdivString);
            Usuario nuevoUser = new Usuario(nombre, "integrante", subdivision.getNombre(), passwordString);
            Usuarios.makeSet(nuevoUser);
            for (Usuario u : Usuarios.getObjects()) {
                if (u.getNombre().equals(subdivision.getLider().getNombre()) && u.getSubdivision().equals(subdivision.getLider().getSubdivision())) {
                    Usuarios.union(nuevoUser, u);
                    JOptionPane.showMessageDialog(this, "¡Usuario creado!");
                }
            }

            Usuarios.GuardarConjunto("data\\usuarios.txt");
        }
        LogIn LogIn = new LogIn();
        LogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GruposSubdivisiones;
    private javax.swing.JLabel Registrar;
    private javax.swing.JPanel Registrarse;
    private javax.swing.JPanel Retroceder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
