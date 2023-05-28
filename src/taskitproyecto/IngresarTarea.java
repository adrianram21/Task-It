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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class IngresarTarea extends javax.swing.JFrame {
    AVL<Subdivision> Subdivisiones;
    public IngresarTarea() {
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
        CargarPrioridades(NivelPrioridad);
        ElementosSubdivision(Subdivision, Subdivisiones.getRoot());
    }
    
    public void CargarPrioridades(JComboBox ListaDesplegable){
        for(int i = 1; i <= 10; i++){
            ListaDesplegable.addItem(i);
        }
    }
    
    public int CargarContador(){
        int Contador = 0;
            try{
                FileInputStream Archivo = new FileInputStream("data\\Contador.txt");                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Numero = O.readObject();          
                Contador = (Integer) Numero;   
            }
            catch(FileNotFoundException ex){
                
            }
            catch(IOException ex){
                
            }  
            catch(ClassNotFoundException ex){
                
            }
        return Contador;
    }
    
    public void GuardarContador(int Contador){
        try{
            FileOutputStream Archivo = new FileOutputStream("data\\Contador.txt");
            ObjectOutputStream O = new ObjectOutputStream(Archivo);            
            O.writeObject(Contador);
        }
        catch(FileNotFoundException ex){
                
            }
        catch(IOException ex){
                
            }  
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
    
    public BinaryMaxHeap BuscarListaTareasSinAsignar(String NombreSubdivision, NodoAVL<Subdivision> Nodo){
        if (Nodo.getData().getNombre().compareTo(NombreSubdivision) == 0) {
            return Nodo.getData().getTareas();
        } else if (Nodo.getData().getNombre().compareTo(NombreSubdivision) > 0) {
            if (Nodo.getIzquierdo() != null) {
                return BuscarListaTareasSinAsignar(NombreSubdivision, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return BuscarListaTareasSinAsignar(NombreSubdivision, Nodo.getDerecho());
            } else {
                return null;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        DecripcionTarea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        IngresarTarea = new javax.swing.JButton();
        Subdivision = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Retroceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NivelPrioridad = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Ingresar tarea");

        DecripcionTarea.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DecripcionTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DecripcionTarea.setDoubleBuffered(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Subdivisión a la que pertenece la tarea:");

        IngresarTarea.setText("Ingresar tarea");
        IngresarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarTareaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Descripción de la tarea:");

        Retroceder.setText("Atras");
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nivel de prioridad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(Subdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(DecripcionTarea)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(IngresarTarea))
                    .addComponent(jLabel3)
                    .addComponent(NivelPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subdivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NivelPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DecripcionTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarTarea)
                    .addComponent(Retroceder))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarTareaActionPerformed
        String Sub = (String) Subdivision.getSelectedItem();
        String Desc = DecripcionTarea.getText();
        int Prioridad =  (int) NivelPrioridad.getSelectedItem();
        if(Desc.equals("")){
            JOptionPane.showMessageDialog(this,"¡Descripcion no valida!");
        }
        else{
            BinaryMaxHeap ListaTareas = this.BuscarListaTareasSinAsignar(Sub, Subdivisiones.getRoot());
            int Contador = CargarContador();
            Contador++;
            Tarea Tarea = new Tarea(Desc, Contador, Prioridad);
            ListaTareas.Insert(Tarea);
            GuardarContador(Contador);

            JOptionPane.showMessageDialog(this,"¡Tarea ingresada!");
            Subdivisiones.GuardarAVL("data\\subdivisiones.txt");
        }
        
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngresarTareaActionPerformed

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        Main In = new Main();
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetrocederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DecripcionTarea;
    private javax.swing.JButton IngresarTarea;
    private javax.swing.JComboBox<String> NivelPrioridad;
    private javax.swing.JButton Retroceder;
    private javax.swing.JComboBox<String> Subdivision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
