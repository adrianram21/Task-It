package taskitproyecto;

import Clases.Subdivision;
import Clases.Tarea;
import Clases.Usuario;
import Modelo.*;
import java.awt.Color;
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
    Usuario Usuario;
    
    public Tabla(BinaryMaxHeap Cola, AVL<Tarea> Lista, PilaListaEnlazada<Tarea> Pila, Usuario Usuario) {
        this.Usuario = Usuario;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SinAsignar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EnProceso = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Finalizado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Atras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Tablas");
        setPreferredSize(new java.awt.Dimension(1500, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SinAsignar.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
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
        SinAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SinAsignar.setPreferredSize(new java.awt.Dimension(500, 200));
        SinAsignar.setRowHeight(50);
        SinAsignar.setShowGrid(true);
        SinAsignar.setShowHorizontalLines(true);
        jScrollPane5.setViewportView(SinAsignar);
        if (SinAsignar.getColumnModel().getColumnCount() > 0) {
            SinAsignar.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 480, 500));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 63, 63));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sin asignar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 74));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 63, 63));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("En proceso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 480, 74));

        EnProceso.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
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
        EnProceso.setShowGrid(true);
        EnProceso.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(EnProceso);
        if (EnProceso.getColumnModel().getColumnCount() > 0) {
            EnProceso.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 480, 500));

        Finalizado.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
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
        Finalizado.setShowGrid(true);
        Finalizado.setShowHorizontalLines(true);
        jScrollPane3.setViewportView(Finalizado);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 480, 500));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 63, 63));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Finalizado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 480, 74));

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        AtrasLayout.setVerticalGroup(
            AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 190, 40));

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
        Main Inicio = new Main(this.Usuario);
        Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasMouseClicked

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Atras.setBackground(new Color(170, 63, 63)); 
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Atras.setBackground(new Color(191, 63, 63)); 
    }//GEN-LAST:event_AtrasMouseExited

    public void RellenarSinAsignar(BinaryMaxHeap Cola) {
        ModeloSinAsignar.getDataVector().removeAllElements();
        SinAsignar.updateUI();

        while (Cola.getLongitud() != 0) {
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
    private javax.swing.JPanel Atras;
    private javax.swing.JTable EnProceso;
    private javax.swing.JTable Finalizado;
    private javax.swing.JTable SinAsignar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
