package taskitproyecto;
import Clases.Subdivision;
import Clases.Tarea;
import Modelo.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstadoTareas extends javax.swing.JFrame {
    public AVL<Subdivision> Subdivisiones;
    public EstadoTareas() {    
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        ElementosSubdivision(GruposSubdivisiones, Subdivisiones.getRoot());
        this.setLocationRelativeTo(null);
        
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
    
    
    public void ElementosSubdivision(JComboBox ListaDesplegable, NodoAVL<Subdivision> Nodo){
        if (Nodo == null) {
        } 
        else {
            ElementosSubdivision(ListaDesplegable, Nodo.getIzquierdo());
            ListaDesplegable.addItem(Nodo.getData().getNombre());
            ElementosSubdivision(ListaDesplegable, Nodo.getDerecho());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GruposSubdivisiones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Retroceder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Estado de las tareas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Subdivisión en la que está interesado:");

        Retroceder.setText("Atras");
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GruposSubdivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GruposSubdivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Retroceder))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Subdivision = (String) this.GruposSubdivisiones.getSelectedItem();
            Subdivision Sub = BuscarSubdivision(Subdivision, Subdivisiones.getRoot()); 
            Tabla Tab = new Tabla(Sub.getTareas(),Sub.getTareasEnProgreso(),Sub.getTareasFinalizadas());
            Tab.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GruposSubdivisiones;
    private javax.swing.JButton Retroceder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
