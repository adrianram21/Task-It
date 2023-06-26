package taskitproyecto;

import Clases.*;
import Modelo.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    HashTable Subdivisiones;
    Usuario Usuario;

    public Main(Usuario Usuario1) {
        this.Usuario = Usuario1;
        this.Subdivisiones = CargarSubdivisiones();
        initComponents();
        this.setLocationRelativeTo(null);
        Posicion.setText("ROL: " + this.Usuario.getRol());
        Nombre.setText("USUARIO: " + this.Usuario.getNombre());
        Subdivision.setText("SUBDIVISION: " + this.Usuario.getSubdivision());
    }

    public HashTable CargarSubdivisiones() {
        HashTable SubdivisionesA = null;
        try {
            FileInputStream Archivo = new FileInputStream("data\\subdivisiones.txt");
            ObjectInputStream O = new ObjectInputStream(Archivo);
            Object Lista = O.readObject();
            SubdivisionesA = (HashTable) Lista;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return SubdivisionesA;
    }

    public Subdivision BuscarSubdivision(String NombreSubdivision) {
        int Indice = Subdivisiones.Hash(NombreSubdivision);
        Nodo<Subdivision> Lector = Subdivisiones.getLista()[Indice].getHead();
        while (Lector != null && Lector.getData().getNombre().equals(NombreSubdivision) == false) {
            Lector = Lector.getNext();
        }
        if (Lector == null) {
            return null;
        } else {
            return Lector.getData();
        }
    }

    public BinaryMaxHeap BuscarListaTareas(String NombreSubdivision) {
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

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Posicion = new javax.swing.JLabel();
        Subdivision = new javax.swing.JLabel();
        PedirTarea = new javax.swing.JPanel();
        Pedir = new javax.swing.JLabel();
        AñadirTarea = new javax.swing.JPanel();
        Añadir = new javax.swing.JLabel();
        VerTareas = new javax.swing.JPanel();
        Ver = new javax.swing.JLabel();
        Notificar = new javax.swing.JPanel();
        Avisar = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        Retroceder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task It - Inicio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(191, 63, 63));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("USUARIO:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        Posicion.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Posicion.setForeground(new java.awt.Color(191, 63, 63));
        Posicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion.setText("ROL:");
        jPanel1.add(Posicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, -1));

        Subdivision.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Subdivision.setForeground(new java.awt.Color(191, 63, 63));
        Subdivision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subdivision.setText("SUBDIVISION:");
        jPanel1.add(Subdivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        PedirTarea.setBackground(new java.awt.Color(191, 63, 63));
        PedirTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PedirTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PedirTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedirTareaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PedirTareaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PedirTareaMouseExited(evt);
            }
        });

        Pedir.setBackground(new java.awt.Color(255, 255, 255));
        Pedir.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Pedir.setForeground(new java.awt.Color(255, 255, 255));
        Pedir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pedir.setText("Solicitar tarea");
        Pedir.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout PedirTareaLayout = new javax.swing.GroupLayout(PedirTarea);
        PedirTarea.setLayout(PedirTareaLayout);
        PedirTareaLayout.setHorizontalGroup(
            PedirTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PedirTareaLayout.setVerticalGroup(
            PedirTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(PedirTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 50));

        AñadirTarea.setBackground(new java.awt.Color(191, 63, 63));
        AñadirTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AñadirTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirTarea.setPreferredSize(new java.awt.Dimension(180, 30));
        AñadirTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirTareaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirTareaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirTareaMouseExited(evt);
            }
        });

        Añadir.setBackground(new java.awt.Color(255, 255, 255));
        Añadir.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Añadir.setForeground(new java.awt.Color(255, 255, 255));
        Añadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Añadir.setText("Ingresar nueva tarea");
        Añadir.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout AñadirTareaLayout = new javax.swing.GroupLayout(AñadirTarea);
        AñadirTarea.setLayout(AñadirTareaLayout);
        AñadirTareaLayout.setHorizontalGroup(
            AñadirTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        AñadirTareaLayout.setVerticalGroup(
            AñadirTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(AñadirTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 300, 50));

        VerTareas.setBackground(new java.awt.Color(191, 63, 63));
        VerTareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        VerTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerTareas.setPreferredSize(new java.awt.Dimension(180, 30));
        VerTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerTareasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VerTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VerTareasMouseExited(evt);
            }
        });

        Ver.setBackground(new java.awt.Color(255, 255, 255));
        Ver.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Ver.setForeground(new java.awt.Color(255, 255, 255));
        Ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ver.setText("Ver estado de las tareas");
        Ver.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout VerTareasLayout = new javax.swing.GroupLayout(VerTareas);
        VerTareas.setLayout(VerTareasLayout);
        VerTareasLayout.setHorizontalGroup(
            VerTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ver, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        VerTareasLayout.setVerticalGroup(
            VerTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ver, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(VerTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 50));

        Notificar.setBackground(new java.awt.Color(191, 63, 63));
        Notificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Notificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notificar.setPreferredSize(new java.awt.Dimension(180, 30));
        Notificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NotificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NotificarMouseExited(evt);
            }
        });

        Avisar.setBackground(new java.awt.Color(255, 255, 255));
        Avisar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Avisar.setForeground(new java.awt.Color(255, 255, 255));
        Avisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Avisar.setText("Notificar tarea finalizada");
        Avisar.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout NotificarLayout = new javax.swing.GroupLayout(Notificar);
        Notificar.setLayout(NotificarLayout);
        NotificarLayout.setHorizontalGroup(
            NotificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Avisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        NotificarLayout.setVerticalGroup(
            NotificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Avisar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(Notificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        Salir.setBackground(new java.awt.Color(191, 63, 63));
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setPreferredSize(new java.awt.Dimension(180, 30));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        Retroceder.setBackground(new java.awt.Color(255, 255, 255));
        Retroceder.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Retroceder.setForeground(new java.awt.Color(255, 255, 255));
        Retroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Retroceder.setText("Atras");
        Retroceder.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Retroceder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Retroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PedirTareaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedirTareaMouseEntered
        PedirTarea.setBackground(new Color(255, 255, 255));
        Pedir.setForeground(new Color(191, 63, 63));
    }//GEN-LAST:event_PedirTareaMouseEntered

    private void PedirTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedirTareaMouseExited
        PedirTarea.setBackground(new Color(191, 63, 63));
        Pedir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_PedirTareaMouseExited

    private void AñadirTareaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirTareaMouseEntered
        AñadirTarea.setBackground(new Color(255, 255, 255));
        Añadir.setForeground(new Color(191, 63, 63));
    }//GEN-LAST:event_AñadirTareaMouseEntered

    private void AñadirTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirTareaMouseExited
        AñadirTarea.setBackground(new Color(191, 63, 63));
        Añadir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_AñadirTareaMouseExited

    private void PedirTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedirTareaMouseClicked
        String Subdivision = this.Usuario.getSubdivision();
        Subdivision Sub = BuscarSubdivision(Subdivision);
        BinaryMaxHeap Lista = this.BuscarListaTareas(Subdivision);

        Tarea Tarea = Lista.ExtractMax();
        if (Tarea == null) {
            MensajeTareaSolicitada Mensaje = new MensajeTareaSolicitada(null, -1);
            Mensaje.setVisible(true);
        } else {
            MensajeTareaSolicitada Mensaje = new MensajeTareaSolicitada(Tarea.getInfoTarea(), Tarea.getID());
            Mensaje.setVisible(true);
            Sub.getTareasEnProgreso().Insert(Tarea);
            Subdivisiones.GuardarHashTable("data\\subdivisiones.txt");
        }

        Main In = new Main(this.Usuario);
        In.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PedirTareaMouseClicked

    private void AñadirTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirTareaMouseClicked
        IngresarTarea IngTarea = new IngresarTarea(this.Usuario);
        IngTarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AñadirTareaMouseClicked

    private void VerTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerTareasMouseClicked

        if (this.Usuario.getRol().equals("Lider") == true) {
            String Subdivision = (String) this.Usuario.getSubdivision();
            Subdivision Sub = BuscarSubdivision(Subdivision);
            Tabla Tab = new Tabla(Sub.getTareas(), Sub.getTareasEnProgreso(), Sub.getTareasFinalizadas(), this.Usuario);
            Tab.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "¡Esta función no está habilitada para su rol!");
        }

    }//GEN-LAST:event_VerTareasMouseClicked

    private void VerTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerTareasMouseEntered
        VerTareas.setBackground(new Color(255, 255, 255));
        Ver.setForeground(new Color(191, 63, 63));
    }//GEN-LAST:event_VerTareasMouseEntered

    private void VerTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerTareasMouseExited
        VerTareas.setBackground(new Color(191, 63, 63));
        Ver.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_VerTareasMouseExited

    private void NotificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificarMouseClicked
        Notificar Not = new Notificar(this.Usuario);
        Not.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NotificarMouseClicked

    private void NotificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificarMouseEntered
        Notificar.setBackground(new Color(255, 255, 255));
        Avisar.setForeground(new Color(191, 63, 63));
    }//GEN-LAST:event_NotificarMouseEntered

    private void NotificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificarMouseExited
        Notificar.setBackground(new Color(191, 63, 63));
        Avisar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_NotificarMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        LogIn LogIn = new LogIn();
        LogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new Color(255, 255, 255));
        Retroceder.setForeground(new Color(191, 63, 63));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new Color(191, 63, 63));
        Retroceder.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_SalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avisar;
    private javax.swing.JLabel Añadir;
    private javax.swing.JPanel AñadirTarea;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Notificar;
    private javax.swing.JLabel Pedir;
    private javax.swing.JPanel PedirTarea;
    private javax.swing.JLabel Posicion;
    private javax.swing.JLabel Retroceder;
    private javax.swing.JPanel Salir;
    private javax.swing.JLabel Subdivision;
    private javax.swing.JLabel Ver;
    private javax.swing.JPanel VerTareas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
