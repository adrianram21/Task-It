package com.mycompany.proyectotaskit;

import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    
    public ColaListaEnlazada<Tarea> Cola;
    public ListaDoblementeEnlazadaConCola<Tarea> Lista;
    public PilaListaEnlazada<Tarea> Pila;
    private DefaultTableModel ModeloSinAsignar;
    private DefaultTableModel ModeloEnProceso;
    private DefaultTableModel ModeloFinalizado;
    
    public Tabla(ColaListaEnlazada<Tarea> Cola, ListaDoblementeEnlazadaConCola<Tarea> Lista, PilaListaEnlazada<Tarea> Pila) {
        ModeloSinAsignar = new DefaultTableModel();
        ModeloEnProceso = new DefaultTableModel();
        ModeloFinalizado = new DefaultTableModel(); 
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.SinAsignar.setModel(ModeloSinAsignar);
        this.EnProceso.setModel(ModeloEnProceso);
        this.Finalizado.setModel(ModeloFinalizado);       
        
        ModeloSinAsignar.addColumn("Descripcion");
        ModeloSinAsignar.addColumn("ID");
                
        ModeloEnProceso.addColumn("Descripcion");
        ModeloEnProceso.addColumn("ID");
                
        ModeloFinalizado.addColumn("Descripcion");
        ModeloFinalizado.addColumn("ID");   
        
        RellenarSinAsignar(Cola);
        RellenarEnProgreso(Lista);
        RellenarFinalizado(Pila);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SinAsignar = new javax.swing.JTable();
        Retroceder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EnProceso = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Finalizado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Sin asignar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("En proceso");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Finalizado");

        SinAsignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripción", "ID"
            }
        ));
        jScrollPane5.setViewportView(SinAsignar);

        Retroceder.setText("Atras");
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        EnProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripción", "ID"
            }
        ));
        jScrollPane2.setViewportView(EnProceso);

        Finalizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripción", "ID"
            }
        ));
        jScrollPane3.setViewportView(Finalizado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(209, 209, 209)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(Retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(Retroceder)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        EstadoTareas Es = new EstadoTareas();
        Es.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed

        public void RellenarSinAsignar(ColaListaEnlazada<Tarea> Cola){
        ModeloSinAsignar.getDataVector().removeAllElements();
        SinAsignar.updateUI();         
        
        while(Cola.Empty() != true){
               StaticArrayList SA;
               SA = new StaticArrayList(2);
               Tarea SinAsignar = Cola.Dequeue();
               SA.getLista()[0] = (Comparable) (Object) SinAsignar.getInfoTarea();
               SA.getLista()[1] = (Comparable) (Object) SinAsignar.getID(); 
               ModeloSinAsignar.addRow(SA.getLista());

        }
    }
    
    public void RellenarEnProgreso(ListaDoblementeEnlazadaConCola<Tarea> Lista){
        ModeloEnProceso.getDataVector().removeAllElements();
        EnProceso.updateUI();     

        NodoDobleEnlace<Tarea> Lector = Lista.getHead();
        while(Lector != null){     
               StaticArrayList EP;
               EP = new StaticArrayList(2);
               EP.getLista()[0] = (Comparable) (Object) Lector.getData().getInfoTarea();
               EP.getLista()[1] = (Comparable) (Object) Lector.getData().getID();
               ModeloEnProceso.addRow(EP.getLista());
               Lector = Lector.getNext();
        }
    }
    
    public void RellenarFinalizado(PilaListaEnlazada<Tarea> Pila){
        ModeloFinalizado.getDataVector().removeAllElements();
        Finalizado.updateUI();
        
        while(Pila.Empty() != true){
               StaticArrayList FO;
               FO = new StaticArrayList(2);
               Tarea Finalizado = Pila.Pop();
               FO.getLista()[0] = (Comparable) (Object) Finalizado.getInfoTarea();
               FO.getLista()[1] = (Comparable) (Object) Finalizado.getID(); 
               ModeloFinalizado.addRow(FO.getLista());        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EnProceso;
    private javax.swing.JTable Finalizado;
    private javax.swing.JButton Retroceder;
    private javax.swing.JTable SinAsignar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
