package taskitproyecto;
import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
public class SolicitarTarea extends javax.swing.JFrame {
    AVL<Subdivision> Subdivisiones;
    public SolicitarTarea() {
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
        ElementosSubdivision(GruposSubdivisiones, Subdivisiones.getRoot());

    }
    
    public AVL<Subdivision> CargarSubdivisiones(){
        AVL<Subdivision> SubdivisionesA = null;
            try{
                FileInputStream Archivo = new FileInputStream("data\\subdivisiones.txt");                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Lista = O.readObject();          
                SubdivisionesA = (AVL<Subdivision>) Lista;   
            }
            catch(FileNotFoundException ex){
                
            }
            catch(IOException ex){
                
            }  
            catch(ClassNotFoundException ex){
                
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
    
    public BinaryMaxHeap BuscarListaTareas(String NombreSubdivision, NodoAVL<Subdivision> Nodo){
        if (Nodo.getData().getNombre().compareTo(NombreSubdivision) == 0) {
            return Nodo.getData().getTareas();
        } else if (Nodo.getData().getNombre().compareTo(NombreSubdivision) > 0) {
            if (Nodo.getIzquierdo() != null) {
                return BuscarListaTareas(NombreSubdivision, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return BuscarListaTareas(NombreSubdivision, Nodo.getDerecho());
            } else {
                return null;
            }
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

        GruposSubdivisiones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        EntregarTarea = new javax.swing.JButton();
        Retroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Solicitar tarea");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Subdivisión a la que pertenece");

        EntregarTarea.setText("Pedir tarea");
        EntregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregarTareaActionPerformed(evt);
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
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(GruposSubdivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retroceder)
                        .addGap(9, 9, 9)
                        .addComponent(EntregarTarea)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(GruposSubdivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntregarTarea)
                    .addComponent(Retroceder))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregarTareaActionPerformed
        String Subdivision = (String) GruposSubdivisiones.getSelectedItem();
        Subdivision Sub = BuscarSubdivision(Subdivision, Subdivisiones.getRoot()); 
        BinaryMaxHeap Lista = this.BuscarListaTareas(Subdivision, Subdivisiones.getRoot());
        
        Tarea Tarea = Lista.ExtractMax();
        if(Tarea == null){
            JOptionPane.showMessageDialog(this,"No hay tareas disponibles");
        }
        else{
            JOptionPane.showMessageDialog(this,"Su nueva tarea es: " + Tarea.getInfoTarea() + "\nID: " + Tarea.getID());
            Sub.getTareasEnProgreso().Insert(Tarea);
            Subdivisiones.GuardarAVL("data\\subdivisiones.txt");
        }
        
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_EntregarTareaActionPerformed

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntregarTarea;
    private javax.swing.JComboBox<String> GruposSubdivisiones;
    private javax.swing.JButton Retroceder;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
