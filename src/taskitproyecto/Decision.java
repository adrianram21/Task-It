package taskitproyecto;

import java.awt.Color;

public class Decision extends javax.swing.JFrame {

    public Decision() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lider = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Integrante = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Retroceder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Registro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 130));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lider.setBackground(new java.awt.Color(191, 63, 63));
        Lider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lider.setPreferredSize(new java.awt.Dimension(100, 30));
        Lider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LiderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LiderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LiderMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lider");

        javax.swing.GroupLayout LiderLayout = new javax.swing.GroupLayout(Lider);
        Lider.setLayout(LiderLayout);
        LiderLayout.setHorizontalGroup(
            LiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LiderLayout.setVerticalGroup(
            LiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Lider, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, -1));

        Integrante.setBackground(new java.awt.Color(191, 63, 63));
        Integrante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Integrante.setPreferredSize(new java.awt.Dimension(100, 30));
        Integrante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IntegranteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IntegranteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IntegranteMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Integrante");

        javax.swing.GroupLayout IntegranteLayout = new javax.swing.GroupLayout(Integrante);
        Integrante.setLayout(IntegranteLayout);
        IntegranteLayout.setHorizontalGroup(
            IntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        IntegranteLayout.setVerticalGroup(
            IntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntegranteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Integrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));

        Retroceder.setBackground(new java.awt.Color(255, 255, 255));
        Retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Retroceder.setPreferredSize(new java.awt.Dimension(100, 30));
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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 63, 63));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Atras");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 63, 63)));

        javax.swing.GroupLayout RetrocederLayout = new javax.swing.GroupLayout(Retroceder);
        Retroceder.setLayout(RetrocederLayout);
        RetrocederLayout.setHorizontalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        RetrocederLayout.setVerticalGroup(
            RetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RetrocederLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 63, 63));
        jLabel1.setText("Por favor, indique el rol que va a tener el usuario que");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 63, 63));
        jLabel2.setText("desea crear");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiderMouseClicked
        RegistroLider AgregarSubdivision = new RegistroLider();
        this.setVisible(false);
        AgregarSubdivision.setVisible(true);
    }//GEN-LAST:event_LiderMouseClicked

    private void LiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiderMouseEntered
        Lider.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_LiderMouseEntered

    private void LiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiderMouseExited
        Lider.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_LiderMouseExited

    private void IntegranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntegranteMouseClicked
        RegistroIntegrante Reg = new RegistroIntegrante();
        this.setVisible(false);
        Reg.setVisible(true);
    }//GEN-LAST:event_IntegranteMouseClicked

    private void IntegranteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntegranteMouseEntered
        Integrante.setBackground(new Color(170, 63, 63));
    }//GEN-LAST:event_IntegranteMouseEntered

    private void IntegranteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntegranteMouseExited
        Integrante.setBackground(new Color(191, 63, 63));
    }//GEN-LAST:event_IntegranteMouseExited

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        LogIn LogIn = new LogIn();
        LogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederMouseClicked

    private void RetrocederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseEntered
        Retroceder.setBackground(new Color(234, 234, 234));
    }//GEN-LAST:event_RetrocederMouseEntered

    private void RetrocederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseExited
        Retroceder.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_RetrocederMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Integrante;
    private javax.swing.JPanel Lider;
    private javax.swing.JPanel Retroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
