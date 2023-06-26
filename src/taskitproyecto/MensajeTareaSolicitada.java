package taskitproyecto;

import java.awt.Color;

public class MensajeTareaSolicitada extends javax.swing.JFrame {

    public MensajeTareaSolicitada(String Descripcion, int ID) {

        initComponents();
        jScrollPane2.setBorder(null);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        if (Descripcion == null && ID == -1) {
            Informacion.setText("No hay tareas disponibles");
        } else {
            Informacion.setText("Su nueva tarea es: " + Descripcion + "\n\nID: " + ID);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Retroceder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Información tarea");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Aceptar");

        javax.swing.GroupLayout RetrocederLayout = new javax.swing.GroupLayout(Retroceder);
        Retroceder.setLayout(RetrocederLayout);
        RetrocederLayout.setHorizontalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        RetrocederLayout.setVerticalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, 30));

        Informacion.setEditable(false);
        Informacion.setBackground(new java.awt.Color(255, 255, 255));
        Informacion.setColumns(20);
        Informacion.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Informacion.setForeground(new java.awt.Color(191, 63, 63));
        Informacion.setLineWrap(true);
        Informacion.setRows(5);
        Informacion.setWrapStyleWord(true);
        Informacion.setBorder(null);
        Informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Informacion.setDisabledTextColor(new java.awt.Color(191, 63, 63));
        Informacion.setEnabled(false);
        jScrollPane2.setViewportView(Informacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 320, -1));

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

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederMouseClicked

    private void RetrocederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseEntered
        Retroceder.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_RetrocederMouseEntered

    private void RetrocederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseExited
        Retroceder.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_RetrocederMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Informacion;
    private javax.swing.JPanel Retroceder;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
