package taskitproyecto;

import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {

    public BinaryMaxHeap Cola;
    public AVL<Tarea> Lista;
    public PilaListaEnlazada<Tarea> Pila;
    private DefaultTableModel ModeloSinAsignar;
    private DefaultTableModel ModeloEnProceso;
    private DefaultTableModel ModeloFinalizado;

    public Tabla(BinaryMaxHeap Cola, AVL<Tarea> Lista, PilaListaEnlazada<Tarea> Pila) {
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
        SinAsignar.getColumnModel().getColumn(0).setPreferredWidth(1000);
        SinAsignar.getColumnModel().getColumn(0).setResizable(false);
    
        ModeloEnProceso.addColumn("Descripcion");
        ModeloEnProceso.addColumn("ID");
        EnProceso.getColumnModel().getColumn(0).setPreferredWidth(1000);
        EnProceso.getColumnModel().getColumn(0).setResizable(false);
        
        ModeloFinalizado.addColumn("Descripcion");
        ModeloFinalizado.addColumn("ID");
        Finalizado.getColumnModel().getColumn(0).setPreferredWidth(1000);
        Finalizado.getColumnModel().getColumn(0).setResizable(false);
        
        
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
        setTitle("Task It - Tablas");

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SinAsignar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        SinAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SinAsignar.setRowHeight(50);
        SinAsignar.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(SinAsignar);
        if (SinAsignar.getColumnModel().getColumnCount() > 0) {
            SinAsignar.getColumnModel().getColumn(0).setResizable(false);
            SinAsignar.getColumnModel().getColumn(0).setPreferredWidth(500);
            SinAsignar.getColumnModel().getColumn(1).setResizable(false);
        }

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
        EnProceso.setRowHeight(50);
        EnProceso.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(EnProceso);
        if (EnProceso.getColumnModel().getColumnCount() > 0) {
            EnProceso.getColumnModel().getColumn(0).setResizable(false);
            EnProceso.getColumnModel().getColumn(0).setPreferredWidth(500);
            EnProceso.getColumnModel().getColumn(1).setResizable(false);
        }

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Finalizado.setRowHeight(50);
        jScrollPane3.setViewportView(Finalizado);
        if (Finalizado.getColumnModel().getColumnCount() > 0) {
            Finalizado.getColumnModel().getColumn(0).setResizable(false);
            Finalizado.getColumnModel().getColumn(0).setPreferredWidth(500);
            Finalizado.getColumnModel().getColumn(1).setResizable(false);
        }

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

    public void RellenarSinAsignar(BinaryMaxHeap Cola) {
        ModeloSinAsignar.getDataVector().removeAllElements();
        SinAsignar.updateUI();

        while (Cola.size != 0) {
            StaticArrayList SA;
            SA = new StaticArrayList(2);
            Tarea SinAsignar = Cola.ExtractMax();
            SA.getLista()[0] = (Comparable) (Object) SinAsignar.getInfoTarea();
            SA.getLista()[1] = (Comparable) (Object) SinAsignar.getID();
            ModeloSinAsignar.addRow(SA.getLista());

        }
    }

    public void RellenarEnProgreso(AVL<Tarea> Lista) {
        ModeloEnProceso.getDataVector().removeAllElements();
        EnProceso.updateUI();

        ColaListaEnlazada<Tarea> Cola = new ColaListaEnlazada<Tarea>();
        Cola = this.InOrderTraversal(Lista.getRoot(), Cola);

        while (Cola.Empty() != true) {
            StaticArrayList EP;
            EP = new StaticArrayList(2);
            Tarea EnProgreso = Cola.Dequeue();
            EP.getLista()[0] = (Comparable) (Object) EnProgreso.getInfoTarea();
            EP.getLista()[1] = (Comparable) (Object) EnProgreso.getID();
            ModeloEnProceso.addRow(EP.getLista());
        }
    }

    public void RellenarFinalizado(PilaListaEnlazada<Tarea> Pila) {
        ModeloFinalizado.getDataVector().removeAllElements();
        Finalizado.updateUI();

        while (Pila.Empty() != true) {
            StaticArrayList FO;
            FO = new StaticArrayList(2);
            Tarea Finalizado = Pila.Pop();
            FO.getLista()[0] = (Comparable) (Object) Finalizado.getInfoTarea();
            FO.getLista()[1] = (Comparable) (Object) Finalizado.getID();
            ModeloFinalizado.addRow(FO.getLista());
        }
    }

    public ColaListaEnlazada<Tarea> InOrderTraversal(NodoAVL<Tarea> Nodo, ColaListaEnlazada<Tarea> Cola) {
        if (Nodo != null) {
            InOrderTraversal(Nodo.getIzquierdo(), Cola);
            Cola.Enqueue(Nodo.getData());
            InOrderTraversal(Nodo.getDerecho(), Cola);
        }
        return Cola;
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
