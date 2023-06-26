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

public class Notificar extends javax.swing.JFrame {

    HashTable Subdivisiones;
    Usuario Usuario;

    public Notificar(Usuario Usuario) {
        this.Usuario = Usuario;
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public HashTable CargarSubdivisiones() {
        HashTable SubdivisionesA = null;
        try {
            FileInputStream Archivo = new FileInputStream("data\\subdivisiones.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            SubdivisionesA =  (HashTable) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return SubdivisionesA;
    }

    public AVL<Tarea> BuscarListaTareasEnProgreso(String NombreSubdivision) {
        int Indice = Subdivisiones.Hash(NombreSubdivision);
        Nodo<Subdivision> Lector = Subdivisiones.getLista()[Indice].getHead();
        while (Lector != null && Lector.getData().getNombre().equals(NombreSubdivision) == false) {
            Lector = Lector.getNext();
        }
        if (Lector == null) {
            return null;
        } else {
            return Lector.getData().getTareasEnProgreso();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        Avisar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Retroceder = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Notificar finalización de tarea");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 63, 63));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Especifique el numero de identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, -1));

        Identificacion.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        Identificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Identificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 63, 63), 2));
        jPanel1.add(Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, -1));

        Avisar.setBackground(new java.awt.Color(191, 63, 63));
        Avisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Avisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AvisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AvisarMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Notificar");

        javax.swing.GroupLayout AvisarLayout = new javax.swing.GroupLayout(Avisar);
        Avisar.setLayout(AvisarLayout);
        AvisarLayout.setHorizontalGroup(
            AvisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        AvisarLayout.setVerticalGroup(
            AvisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Avisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 130, 30));

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

        jPanel1.add(Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 63, 63));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("de la tarea");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvisarMouseEntered
        Avisar.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_AvisarMouseEntered

    private void AvisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvisarMouseExited
        Avisar.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_AvisarMouseExited

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        Main In = new Main(this.Usuario);
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederMouseClicked

    private void RetrocederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseEntered
        Retroceder.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_RetrocederMouseEntered

    private void RetrocederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseExited
        Retroceder.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_RetrocederMouseExited

    private void AvisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvisarMouseClicked
        String Sub = (String) this.Usuario.getSubdivision();
        try {
            int ID = Integer.parseInt(Identificacion.getText());
            Subdivision Subdiv = BuscarSubdivision(Sub);
            AVL<Tarea> TareasEnProgreso = this.BuscarListaTareasEnProgreso(Sub);
            Tarea Tarea1 = this.Find(ID, TareasEnProgreso.getRoot());
            if (Tarea1 == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró la identificación!");
            } else {
                TareasEnProgreso.Remove(Tarea1);
                Subdiv.getTareasFinalizadas().Push(Tarea1);
                Subdivisiones.GuardarHashTable("data\\subdivisiones.txt");
                JOptionPane.showMessageDialog(this, "¡Estado de la tarea actualizado!");
            }

            Main In = new Main(this.Usuario);
            In.setVisible(true);
            this.setVisible(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "¡Identificación no valida!");
        }
    }//GEN-LAST:event_AvisarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Avisar;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JPanel Retroceder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
