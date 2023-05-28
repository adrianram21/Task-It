package taskitproyecto;

import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class NuevaSubdivision extends javax.swing.JFrame {

    AVL<Subdivision> Subdivisiones;

    public NuevaSubdivision() {
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public AVL<Subdivision> CargarSubdivisiones() {
        AVL<Subdivision> SubdivisionesA = null;
        try {
            FileInputStream Archivo = new FileInputStream("subdivisiones.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            SubdivisionesA = (AVL<Subdivision>) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return SubdivisionesA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubdivisionNueva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AgregarSubdivision = new javax.swing.JButton();
        Retroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Agregar nueva subdivisión");

        SubdivisionNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubdivisionNuevaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Agregue la nueva subdivisión:");

        AgregarSubdivision.setText("Agregar");
        AgregarSubdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSubdivisionActionPerformed(evt);
            }
        });

        Retroceder.setText("Atras");
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SubdivisionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgregarSubdivision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Retroceder)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(SubdivisionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(AgregarSubdivision)
                    .addComponent(Retroceder))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubdivisionNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubdivisionNuevaActionPerformed

    }//GEN-LAST:event_SubdivisionNuevaActionPerformed

    private void AgregarSubdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSubdivisionActionPerformed
        String Subdivision = SubdivisionNueva.getText();
        if (Subdivision.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Nombre no valido!");
        } else {
            Subdivision NSubdivision = new Subdivision(Subdivision, new BinaryMaxHeap(10), new AVL<Tarea>(), new PilaListaEnlazada<Tarea>());
            Subdivisiones.Insert(NSubdivision);
            Subdivisiones.GuardarAVL("subdivisiones.txt");
            JOptionPane.showMessageDialog(this, "¡División agregada!");
        }

        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarSubdivisionActionPerformed

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarSubdivision;
    private javax.swing.JButton Retroceder;
    private javax.swing.JTextField SubdivisionNueva;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
