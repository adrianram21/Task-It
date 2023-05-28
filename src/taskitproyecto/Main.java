package taskitproyecto;
import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;

public class Main extends javax.swing.JFrame {   
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null); 
//
//        BinaryMaxHeap Lista = new BinaryMaxHeap(10);
//        BinaryMaxHeap Lista2 = new BinaryMaxHeap(10);
//        BinaryMaxHeap Lista3 = new BinaryMaxHeap(10);
//        
//        AVL<Tarea> ListaP = new AVL();
//        AVL<Tarea> Lista2P = new AVL();
//        AVL<Tarea> Lista3P = new AVL();
//        
//        PilaListaEnlazada<Tarea> ListaF = new PilaListaEnlazada();
//        PilaListaEnlazada<Tarea> Lista2F = new PilaListaEnlazada();
//        PilaListaEnlazada<Tarea> Lista3F = new PilaListaEnlazada();     
//
//        Lista.Insert(new Tarea("Revisar los estados financieros de clientes.", 1, 2));
//        ListaP.Insert(new Tarea("Asegurarse de que los registros contables de nuestros clientes coincidan.", 2, 2));
//        ListaF.Push(new Tarea("Preparar y presentar declaraciones de impuestos.", 3, 9));
//        
//        Lista2.Insert(new Tarea("Realizar análisis detallados de los costos.", 4, 6));
//        Lista2P.Insert(new Tarea("Preparar estados financieros.", 5, 3));
//        Lista2F.Push(new Tarea("Revisar los procesos contables de clientes.", 6, 8));
//        
//        Lista3.Insert(new Tarea("Proporcionar asesoramiento fiscal.", 2, 1));
//        Lista3P.Insert(new Tarea("Preparar nóminas precisas.", 8, 9));
//        Lista3.Insert(new Tarea("Proporcionar servicios de contabilidad.", 9, 7));
//        Lista3F.Push(new Tarea("Ayudar a nuestros clientes a planificar su futuro financiero.", 10, 4));
//        
//        AVL<Subdivision> Subdivisiones = new AVL<Subdivision>();
//        Subdivisiones.Insert(new Subdivision("Recursos Humanos", Lista, ListaP, ListaF));
//        Subdivisiones.Insert(new Subdivision("Burocracia", Lista2, Lista2P, Lista2F));
//        Subdivisiones.Insert(new Subdivision("Recreacion", Lista3, Lista3P, Lista3F));
//        Subdivisiones.GuardarAVL("subdivisiones.txt");
//             

    }
    
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SolicitarTarea = new javax.swing.JButton();
        IngresarTarea = new javax.swing.JButton();
        NotificarTareaTerm = new javax.swing.JButton();
        VerEstadoTareas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AgregarSubdivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Inicio");

        SolicitarTarea.setText("Solicitar tarea");
        SolicitarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarTareaActionPerformed(evt);
            }
        });

        IngresarTarea.setText("Ingresar nueva tarea");
        IngresarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarTareaActionPerformed(evt);
            }
        });

        NotificarTareaTerm.setText("Notificar tarea finalizada");
        NotificarTareaTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificarTareaTermActionPerformed(evt);
            }
        });

        VerEstadoTareas.setText("Ver estado de las tareas");
        VerEstadoTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstadoTareasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Task it");

        AgregarSubdivision.setText("Agregar nueva subdivisión");
        AgregarSubdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSubdivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(AgregarSubdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SolicitarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NotificarTareaTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerEstadoTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(SolicitarTarea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresarTarea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotificarTareaTerm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerEstadoTareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarSubdivision)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolicitarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarTareaActionPerformed
        SolicitarTarea SolTarea = new SolicitarTarea();        
        SolTarea.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_SolicitarTareaActionPerformed

    private void IngresarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarTareaActionPerformed
        IngresarTarea IngTarea = new IngresarTarea();
        IngTarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngresarTareaActionPerformed

    private void NotificarTareaTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificarTareaTermActionPerformed
        Notificar Not = new Notificar();
        Not.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NotificarTareaTermActionPerformed

    private void VerEstadoTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstadoTareasActionPerformed
        EstadoTareas EstTareas = new EstadoTareas();
        EstTareas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerEstadoTareasActionPerformed

    private void AgregarSubdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSubdivisionActionPerformed
        NuevaSubdivision NuevSub = new NuevaSubdivision();
        NuevSub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarSubdivisionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main in = new Main();
                in.setVisible(true);               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarSubdivision;
    private javax.swing.JButton IngresarTarea;
    private javax.swing.JButton NotificarTareaTerm;
    private javax.swing.JButton SolicitarTarea;
    private javax.swing.JButton VerEstadoTareas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
