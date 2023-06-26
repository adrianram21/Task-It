package taskitproyecto;

import Clases.Subdivision;
import Clases.Tarea;
import Clases.Usuario;
import Modelo.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class IngresarTarea extends javax.swing.JFrame {

    Usuario Usuario;
    HashTable Subdivisiones;

    public IngresarTarea(Usuario Usuario) {
        this.Usuario = Usuario;
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
        CargarPrioridades(NivelPrioridad);
    }

    public void CargarPrioridades(JComboBox ListaDesplegable) {
        for (int i = 1; i <= 10; i++) {
            ListaDesplegable.addItem(i);
        }
    }

    public int CargarContador() {
        int Contador = 0;
        try {
            FileInputStream Archivo = new FileInputStream("data\\Contador.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Numero = O.readObject();
            Contador = (Integer) Numero;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return Contador;
    }

    public void GuardarContador(int Contador) {
        try {
            FileOutputStream Archivo = new FileOutputStream("data\\Contador.txt");
            ObjectOutputStream O = new ObjectOutputStream(Archivo);
            O.writeObject(Contador);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
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

    public BinaryMaxHeap BuscarListaTareasSinAsignar(String NombreSubdivision) {
        int Indice = Subdivisiones.Hash(NombreSubdivision);
        Nodo<Subdivision> Lector = Subdivisiones.getLista()[Indice].getHead();
        while (Lector != null && Lector.getData().getNombre().equals(NombreSubdivision) == false) {
            Lector = Lector.getNext();
        }
        if (Lector == null) {
            return null;
        } else {
            return Lector.getData().getTareas();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NivelPrioridad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Atras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DecripcionTarea = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Ingresar tarea");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 63, 63));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nivel de prioridad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 550, -1));

        NivelPrioridad.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jPanel1.add(NivelPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 63, 63));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripción de la tarea");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 550, -1));

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

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atras");

        javax.swing.GroupLayout AtrasLayout = new javax.swing.GroupLayout(Atras);
        Atras.setLayout(AtrasLayout);
        AtrasLayout.setHorizontalGroup(
            AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        AtrasLayout.setVerticalGroup(
            AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 140, 30));

        Ingresar.setBackground(new java.awt.Color(191, 63, 63));
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresar tarea");

        javax.swing.GroupLayout IngresarLayout = new javax.swing.GroupLayout(Ingresar);
        Ingresar.setLayout(IngresarLayout);
        IngresarLayout.setHorizontalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        IngresarLayout.setVerticalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, 30));

        DecripcionTarea.setColumns(20);
        DecripcionTarea.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        DecripcionTarea.setLineWrap(true);
        DecripcionTarea.setRows(5);
        DecripcionTarea.setWrapStyleWord(true);
        DecripcionTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 63, 63), 2));
        jScrollPane2.setViewportView(DecripcionTarea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        Main In = new Main(this.Usuario);
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasMouseClicked

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Atras.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Atras.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_AtrasMouseExited

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked
        String Sub = (String) this.Usuario.getSubdivision();
        String Desc = DecripcionTarea.getText();
        int Prioridad = (int) NivelPrioridad.getSelectedItem();
        if (Desc.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Descripcion no valida!");
        } else {
            BinaryMaxHeap ListaTareas = this.BuscarListaTareasSinAsignar(Sub);
            int Contador = CargarContador();
            Contador++;
            Tarea Tarea = new Tarea(Desc, Contador, Prioridad);
            ListaTareas.Insert(Tarea);
            GuardarContador(Contador);
            JOptionPane.showMessageDialog(this, "¡Tarea ingresada!");
            Subdivisiones.GuardarHashTable("data\\subdivisiones.txt");
        }

        Main In = new Main(this.Usuario);
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngresarMouseClicked

    private void IngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseEntered
        Ingresar.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_IngresarMouseEntered

    private void IngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseExited
        Ingresar.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_IngresarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Atras;
    private javax.swing.JTextArea DecripcionTarea;
    private javax.swing.JPanel Ingresar;
    private javax.swing.JComboBox<String> NivelPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
