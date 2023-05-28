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

public class Notificar extends javax.swing.JFrame {

    AVL<Subdivision> Subdivisiones;

    public Notificar() {
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
        ElementosSubdivision(Subdivision, Subdivisiones.getRoot());
    }

    public AVL<Subdivision> CargarSubdivisiones() {
        AVL<Subdivision> SubdivisionesA = null;
        try {
            FileInputStream Archivo = new FileInputStream("data\\subdivisiones.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            SubdivisionesA = (AVL<Subdivision>) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return SubdivisionesA;
    }

    public void ElementosSubdivision(JComboBox ListaDesplegable, NodoAVL<Subdivision> Nodo){
        if (Nodo == null) {
        } 
        else {
            ElementosSubdivision(ListaDesplegable, Nodo.getIzquierdo());
            ListaDesplegable.addItem(Nodo.getData().getNombre());
            ElementosSubdivision(ListaDesplegable, Nodo.getDerecho());
        }
    }

    public AVL<Tarea> BuscarListaTareasEnProgreso(String NombreSubdivision, NodoAVL<Subdivision> Nodo){
        if (Nodo.getData().getNombre().compareTo(NombreSubdivision) == 0) {
            return Nodo.getData().getTareasEnProgreso();
        } else if (Nodo.getData().getNombre().compareTo(NombreSubdivision) > 0) {
            if (Nodo.getIzquierdo() != null) {
                return BuscarListaTareasEnProgreso(NombreSubdivision, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return BuscarListaTareasEnProgreso(NombreSubdivision, Nodo.getDerecho());
            } else {
                return null;
            }
        }
    }

    public Tarea Find(int Valor, NodoAVL<Tarea> Nodo) {
        if (Nodo.getData().getID() == Valor) {
            return Nodo.getData();
        } else if (Nodo.getData().getID() > Valor) {
            if (Nodo.getIzquierdo() != null) {
                return Find(Valor, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return Find(Valor, Nodo.getDerecho());
            } else {
                return null;
            }
        }
    }

        public Subdivision BuscarSubdivision(String NombreSubdivision, NodoAVL<Subdivision> Nodo){
        if (Nodo.getData().getNombre().compareTo(NombreSubdivision) == 0) {
            return Nodo.getData();
        } else if (Nodo.getData().getNombre().compareTo(NombreSubdivision) > 0) {
            if (Nodo.getIzquierdo() != null) {
                return BuscarSubdivision(NombreSubdivision, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return BuscarSubdivision(NombreSubdivision, Nodo.getDerecho());
            } else {
                return null;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        Notificar = new javax.swing.JButton();
        Retroceder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Subdivision = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Notificar finalización de tarea");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Especifique el numero de identificacion de la tarea:");

        Notificar.setText("Notificar");
        Notificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificarActionPerformed(evt);
            }
        });

        Retroceder.setText("Atras");
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Subdivision a la que pertenece la tarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retroceder)
                        .addGap(17, 17, 17)
                        .addComponent(Notificar))
                    .addComponent(jLabel2)
                    .addComponent(Subdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(Subdivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Notificar)
                    .addComponent(Retroceder))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificarActionPerformed
        String Sub = (String) Subdivision.getSelectedItem();
        try {
            int ID = Integer.parseInt(Identificacion.getText());
            Subdivision Subdiv = BuscarSubdivision(Sub, Subdivisiones.getRoot());
            AVL<Tarea> TareasEnProgreso = this.BuscarListaTareasEnProgreso(Sub, Subdivisiones.getRoot());
            Tarea Tarea1 = this.Find(ID, TareasEnProgreso.getRoot());
            if (Tarea1 == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró la identificación!");
            } else {
                TareasEnProgreso.Remove(Tarea1);
                Subdiv.getTareasFinalizadas().Push(Tarea1);
                Subdivisiones.GuardarAVL("data\\subdivisiones.txt");
                JOptionPane.showMessageDialog(this, "¡Estado de la tarea actualizado!");
            }

            Main In = new Main();
            In.setVisible(true);
            this.setVisible(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "¡Identificación no valida!");
        }


    }//GEN-LAST:event_NotificarActionPerformed

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Identificacion;
    private javax.swing.JButton Notificar;
    private javax.swing.JButton Retroceder;
    private javax.swing.JComboBox<String> Subdivision;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
