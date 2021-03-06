/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.gui;
import consultorio.basededatos.ConexionDB;
import consultorio.paciente.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class VentanaTabla extends javax.swing.JFrame { 
    /**
     * Creates new form VentanaTabla
     */
    public VentanaTabla() {
      this.initComponents();
       TablePacker tablePacker = new TablePacker(TablePacker.ALL_ROWS, true);
        tablePacker.pack(jTMySQL);
        tablePacker.pack(jTHistorial);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tituloTablaPacLabel = new javax.swing.JLabel();
        labelFechaAct = new Reloj();
        jSPTabla = new javax.swing.JScrollPane();
        jTMySQL = new javax.swing.JTable();
        jBEliminar1 = new javax.swing.JButton();
        datosCompBoton = new javax.swing.JButton();
        modificButton = new javax.swing.JButton();
        buttonActualizarTabla = new javax.swing.JButton();
        jLabelHistorialMedico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTHistorial = new javax.swing.JTable();
        nuevoEventoButton = new javax.swing.JButton();
        jLabelFiltrar = new javax.swing.JLabel();
        jTFFiltrar = new javax.swing.JTextField();
        JButtonFiltrar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MediHist - Tabla de Pacientes");

        tituloTablaPacLabel.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        tituloTablaPacLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTablaPacLabel.setText("Pacientes en lista hasta hoy.");
        tituloTablaPacLabel.setToolTipText("");

        jTMySQL.setAutoCreateRowSorter(true);
        jTMySQL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTMySQL.setModel (ConexionDB.listarTabla());
        jTMySQL.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTMySQL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTMySQL.setMinimumSize(new java.awt.Dimension(80, 72));
        jTMySQL.setName(""); // NOI18N
        jTMySQL.setRowSorter(null);
        jTMySQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMySQLMouseClicked(evt);
            }
        });
        jSPTabla.setViewportView(jTMySQL);

        jBEliminar1.setText("Eliminar Registro");
        jBEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar1ActionPerformed(evt);
            }
        });

        datosCompBoton.setText("Informacion Detallada");
        datosCompBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosCompBotonActionPerformed(evt);
            }
        });

        modificButton.setText("Modificar Registro");
        modificButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificButtonActionPerformed(evt);
            }
        });

        buttonActualizarTabla.setText("Actualizar Tabla");
        buttonActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarTablaActionPerformed(evt);
            }
        });

        jLabelHistorialMedico.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabelHistorialMedico.setText("Historial Medico del Paciente.");

        jTHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTHistorial.setModel(new javax.swing.table.DefaultTableModel(
            null, new String[]{
                "ID","Fecha Consulta","Padecimiento Actual","Ex Laboratorio",
                "Ex Imagen", "Tratamiento", "Comentario","Fecha Seguimiento"
            }));
            jTHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            jScrollPane3.setViewportView(jTHistorial);

            nuevoEventoButton.setText("Agregar Historial");
            nuevoEventoButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nuevoEventoButtonActionPerformed(evt);
                }
            });

            jLabelFiltrar.setText("Filtrar:");

            jTFFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTFFiltrarKeyTyped(evt);
                }
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTFFiltrarKeyReleased(evt);
                }
            });

            JButtonFiltrar.setText("OK");
            JButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JButtonFiltrarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(datosCompBoton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonActualizarTabla)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                    .addComponent(nuevoEventoButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(modificButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jBEliminar1)
                    .addGap(30, 30, 30))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSPTabla, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHistorialMedico)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane3))
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tituloTablaPacLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFiltrar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(JButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFechaAct, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelFechaAct, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloTablaPacLabel)
                        .addComponent(jLabelFiltrar)
                        .addComponent(jTFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JButtonFiltrar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSPTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(jLabelHistorialMedico)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEliminar1)
                        .addComponent(datosCompBoton)
                        .addComponent(modificButton)
                        .addComponent(buttonActualizarTabla)
                        .addComponent(nuevoEventoButton))
                    .addGap(24, 24, 24))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jBEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar1ActionPerformed
        // TODO add your handling code here:        
        String id_localizado = obtenerIdFilaTabla();
        if(id_localizado == null){
            System.out.println("No realiza nada ya que no se selecciono Fila");
        }else{
            int confirmado = 0;
            confirmado = JOptionPane.showConfirmDialog(null, "Estas Seguro de Eliminar el Registro");
         
            if(JOptionPane.OK_OPTION== confirmado)
            {
             ConexionDB.eliminarPac(id_localizado);
             ConexionDB.eliminarAnt(id_localizado);
             ConexionDB.eliminarNoAnt(id_localizado);
             jTMySQL.setModel(ConexionDB.listarTabla());
             TablePacker tablePacker = new TablePacker(TablePacker.ALL_ROWS, true);
             tablePacker.pack(jTMySQL);
            }
        }
        
    }//GEN-LAST:event_jBEliminar1ActionPerformed

    private void datosCompBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosCompBotonActionPerformed
        // TODO add your handling code here:
        //Seria una Pantalla Similar a la de Ventana Altas pero Con los Campos
        //TextFields Cambiados por Label para Brindando Informacion   
     
        String id_localizado = obtenerIdFilaTabla();             
        if(id_localizado == null) 
        {           
            System.out.println("No realiza nada ya que no se selecciono Fila");    
        }
        else
        {
           InfoDetallada infoDet = new InfoDetallada(id_localizado);
           infoDet.setLocationRelativeTo(this);
           infoDet.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           infoDet.setVisible(true);
        }
    
    }//GEN-LAST:event_datosCompBotonActionPerformed

    private void modificButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificButtonActionPerformed
        // TODO add your handling code here:
        String id_localizado = obtenerIdFilaTabla();             
        if(id_localizado == null)
        {           
            System.out.println("No realiza nada ya que no se selecciono Fila");    
        }
        else
        {
            ArrayList<String> aListPac = ConexionDB.obtenerDatosPacientes(id_localizado);
            int i=0;
            for (String string : aListPac) {
                System.out.println(i+": "+string);
               i++;
            }
            VentanaAltas vAltas = new VentanaAltas();
            vAltas.setLocationRelativeTo(null);
            vAltas.llenarGUIModificaciones(aListPac);
            vAltas.setResizable(false);
            vAltas.setTipoOperacion(0);
            vAltas.setIdParaUpdate(Integer.parseInt(id_localizado));
            vAltas.setVisible(true);  
        }
    }//GEN-LAST:event_modificButtonActionPerformed

    private void buttonActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarTablaActionPerformed
        // TODO add your handling code here:
        jTMySQL.setModel(ConexionDB.listarTabla());
        TablePacker tablePacker = new TablePacker(TablePacker.ALL_ROWS, true);
        tablePacker.pack(jTMySQL);
    }//GEN-LAST:event_buttonActualizarTablaActionPerformed

    private void jTMySQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMySQLMouseClicked
        // TODO add your handling code here
        System.out.println(obtenerIdFilaTabla());
        jTHistorial.setModel(ConexionDB.tablaHistModel(obtenerIdFilaTabla()));
        TablePacker tp = new TablePacker(TablePacker.ALL_ROWS, true);
        tp.pack(jTHistorial);
    }//GEN-LAST:event_jTMySQLMouseClicked

    private void nuevoEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEventoButtonActionPerformed
        // TODO add your handling code here:
        String id_localizado = obtenerIdFilaTabla();             
        if(id_localizado == null)
        {           
            System.out.println("No realiza nada ya que no se selecciono Fila");    
        }
        else
        {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AddHist hist = new AddHist();
               hist.setLocationRelativeTo(null);
               hist.setId(Integer.parseInt(obtenerIdFilaTabla()));
               hist.setVisible(rootPaneCheckingEnabled);
            }
        });
        }
    }//GEN-LAST:event_nuevoEventoButtonActionPerformed

    private void jTFFiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltrarKeyTyped

    }//GEN-LAST:event_jTFFiltrarKeyTyped

    private void JButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonFiltrarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_JButtonFiltrarActionPerformed
/**
 * Este metodo de KeyReleased ayuda a que con un ENTER en el JTFFiltrar
 * busque directamente en la base de datos de una manera rapida.
 * @param evt 
 */
    private void jTFFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltrarKeyReleased
        // TODO add your handling code here:
                    int key=evt.getKeyCode();
    if(evt.getSource()==jTFFiltrar)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
           buscar();                    
        }
    }
    }//GEN-LAST:event_jTFFiltrarKeyReleased
    
    private void buscar(){        
        jTMySQL.setModel(ConexionDB.busquedaPac(jTFFiltrar.getText()));
        TablePacker tb = new TablePacker(TablePacker.ALL_ROWS, true);
        tb.pack(jTMySQL);
    }
    
    public String obtenerIdFilaTabla(){
        int fila;
        String id;
        fila = jTMySQL.getSelectedRow();       
        if(fila == -1){
          JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
          return null;
        }else
        { 
            DefaultTableModel modelo = (DefaultTableModel)jTMySQL.getModel();
            id = String.valueOf(modelo.getValueAt(jTMySQL.getSelectedRow(), 0));
            return id;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTabla().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonFiltrar;
    private javax.swing.JButton buttonActualizarTabla;
    private javax.swing.JButton datosCompBoton;
    private javax.swing.JButton jBEliminar1;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JLabel jLabelHistorialMedico;
    private javax.swing.JScrollPane jSPTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFFiltrar;
    private javax.swing.JTable jTHistorial;
    private javax.swing.JTable jTMySQL;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFechaAct;
    private javax.swing.JButton modificButton;
    private javax.swing.JButton nuevoEventoButton;
    private javax.swing.JLabel tituloTablaPacLabel;
    // End of variables declaration//GEN-END:variables
    private Fecha fechaAct;
}
