
package Presentacion;

import Entidad.ClsEntidadCacidadInformeFinalCurso;
import Negocio.ClsNegocioCapadidadInformeFinalCurso;
import Negocio.ClsNegocioInformeFinalCurso;
import Utilidad.ClsRadioEditor;
import Utilidad.ClsRenderRadio;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzocv
 */
public class FrmCapacidadesInformeFinalCurso extends javax.swing.JInternalFrame {

    int contador = 0;
    ArrayList<String> LogrosCapacidades = new ArrayList<>();
    int filaSeleccionada = -2;
    boolean filaRemovida = false;
    boolean guardarNuevo = true;
    String IdInfoFinalCurso = "";
    String TOdosIDFinalCurso[] = new String[50];
    
    public FrmCapacidadesInformeFinalCurso() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarFila = new javax.swing.JButton();
        btnRemoverFila = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCapacidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnAgregarFila.setText("Agregar fila");
        btnAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaActionPerformed(evt);
            }
        });

        btnRemoverFila.setText("Remover fila");
        btnRemoverFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFilaActionPerformed(evt);
            }
        });

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        TablaCapacidades.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCapacidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaCapacidadesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCapacidades);

        jLabel1.setText("Logros de Capacidades del Curso:");

        jLabel2.setText("Cuál cree que ha sido el motivo por el cual los estudiantes no alcanzaron el logro de capacidades");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");

        btnRechazar.setText("Rechazar");

        btnAceptar.setText("Aceptar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAgregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoverFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverFila)
                    .addComponent(btnAgregarFila))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEnviar)
                    .addComponent(btnRechazar)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        contador++;
        agregarFila(contador);
        
//        agregarRadioATabla();
        
//        agruparBotones();
        
    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnRemoverFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFilaActionPerformed
        contador--;
        removerFila();
    }//GEN-LAST:event_btnRemoverFilaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
        cargarIDsInfoFinalCurso();
    }//GEN-LAST:event_formInternalFrameOpened

    private void TablaCapacidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCapacidadesMousePressed
        if (TablaCapacidades.getSelectedRow()!= -1) {
            if (filaSeleccionada == -2 || filaRemovida == true) {
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
                filaRemovida = false;
            } else {
                LogrosCapacidades.set(filaSeleccionada, txtComentario.getText());
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
            }
        }
    }//GEN-LAST:event_TablaCapacidadesMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (TablaCapacidades.getRowCount() > 0) {
            if (calcularMarcadosNivelCapacidad()) {
                agregarCapadicades();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese un nivel por cada Capacidad.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "inserta datos en la Tabla");
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void agregarFila(int contador){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        modelo.addRow(new Object[]{contador, "","","","","",""});
        modelo.isCellEditable(0, 0);
        TablaCapacidades.setRowHeight(30);
        LogrosCapacidades.add("");
        
    }
    
    private void removerFila(){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        if (TablaCapacidades.getSelectedRow()!= -1) {
            filaRemovida = true;
            LogrosCapacidades.remove(TablaCapacidades.getSelectedRow());
            modelo.removeRow(TablaCapacidades.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        }
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nro","Capacidades del Curso","N","P","A","B","M"});
        
        TablaCapacidades.setModel(modelo);
    }
    
    private void cargarIDsInfoFinalCurso() {
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioCapadidadInformeFinalCurso informe = new ClsNegocioCapadidadInformeFinalCurso();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsIdInforme = informe.obtenerIdInfoFinalCuro();
            int contador = 0;
            //itera los valores hechas en la consulta
            while (rsIdInforme.next()) {
                //cambiar de valor hasta llegar al ultimo ID
                IdInfoFinalCurso = rsIdInforme.getString(1);
                
                //guardamos todos los id para si en algun momneto lo necesitamos
                TOdosIDFinalCurso[contador] = rsIdInforme.getString(1);
                
                contador++;
            }
            informe.conexion.close();
        } catch (Exception e) {
        }
    }
    
    private void agregarRadioATabla() {
        //Agregar Radio a la Columna N
        TablaCapacidades.getColumn("N").setCellRenderer(new ClsRenderRadio());
        TablaCapacidades.getColumn("N").setCellEditor(new ClsRadioEditor(new JCheckBox()));
        
        //Agregar Radio a la Columna P
        TablaCapacidades.getColumn("P").setCellRenderer(new ClsRenderRadio());
        TablaCapacidades.getColumn("P").setCellEditor(new ClsRadioEditor(new JCheckBox()));
        
        //Agregar Radio a la Columna A
        TablaCapacidades.getColumn("A").setCellRenderer(new ClsRenderRadio());
        TablaCapacidades.getColumn("A").setCellEditor(new ClsRadioEditor(new JCheckBox()));
        
        //Agregar Radio a la Columna B
        TablaCapacidades.getColumn("B").setCellRenderer(new ClsRenderRadio());
        TablaCapacidades.getColumn("B").setCellEditor(new ClsRadioEditor(new JCheckBox()));
        
        //Agregar Radio a la Columna M
        TablaCapacidades.getColumn("M").setCellRenderer(new ClsRenderRadio());
        TablaCapacidades.getColumn("M").setCellEditor(new ClsRadioEditor(new JCheckBox()));
    }
    
    private void agruparBotones(){
        ButtonGroup bg = new ButtonGroup();
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        
        for (int i = 0; i < TablaCapacidades.getRowCount(); i++) {
            bg.add((JRadioButton) modelo.getValueAt(i, 2));
            bg.add((JRadioButton) modelo.getValueAt(i, 3));
            bg.add((JRadioButton) modelo.getValueAt(i, 4));
            bg.add((JRadioButton) modelo.getValueAt(i, 5));
            bg.add((JRadioButton) modelo.getValueAt(i, 6));
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCapacidades;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnRemoverFila;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtComentario;
    // End of variables declaration//GEN-END:variables

    private boolean calcularMarcadosNivelCapacidad() {
        int filas = TablaCapacidades.getRowCount();
        boolean eval = false;    
        int cantidadMarcados[] = new int[filas];
        contador = 0;
        for (int i = 0; i < filas; i++) {
            String N = ((String) TablaCapacidades.getValueAt(i, 2)).toLowerCase();
            String P = ((String) TablaCapacidades.getValueAt(i, 3)).toLowerCase();
            String A = ((String) TablaCapacidades.getValueAt(i, 4)).toLowerCase();
            String B = ((String) TablaCapacidades.getValueAt(i, 5)).toLowerCase();
            String M = ((String) TablaCapacidades.getValueAt(i, 6)).toLowerCase();
            if (N.equals("x")) contador++;
            if (P.equals("x")) contador++;
            if (A.equals("x")) contador++;
            if (B.equals("x")) contador++;
            if (M.equals("x")) contador++;
           
            cantidadMarcados[i] = contador;
        }
        
        for (int i = 0; i < cantidadMarcados.length; i++) {
            if (cantidadMarcados[i] == 1) {
                eval = true;
            }
        }
        
        return eval;
        
    }

    private void agregarCapadicades() {
        int filas = TablaCapacidades.getRowCount();
        try {
            ClsEntidadCacidadInformeFinalCurso entiCapacidad = new ClsEntidadCacidadInformeFinalCurso();
            ClsNegocioCapadidadInformeFinalCurso negoCapacidad =  new ClsNegocioCapadidadInformeFinalCurso();
            for (int i = 0; i < filas; i++) {
                entiCapacidad.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
                entiCapacidad.setDescripcion((String) TablaCapacidades.getValueAt(i, 1));
                
                String nada = "N";
                String poco = "N";
                String acep = "N";
                String bueno = "N";
                String muybien = "N";
                //evaluar si las celdas esta vacias
                if (!TablaCapacidades.getValueAt(i, 2).equals("")) {
                    nada = ((String) TablaCapacidades.getValueAt(i, 2)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 3).equals("")) {
                    poco = ((String) TablaCapacidades.getValueAt(i, 3)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 4).equals("")) {
                    acep = ((String) TablaCapacidades.getValueAt(i, 4)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 5).equals("")) {
                    bueno = ((String) TablaCapacidades.getValueAt(i, 5)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 6).equals("")) {
                    muybien = ((String) TablaCapacidades.getValueAt(i, 6)).toLowerCase(); 
                }


                //evaluamos que celda esta marcada con una X    
                //e ingresamos el codigo del nivel que corresponda
                if (nada.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(1);
                }
                else if (poco.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(11);
                }
                else if (acep.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(21);
                }
                else if (bueno.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(31);
                }
                else if (muybien.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(41);
                }
                
                negoCapacidad.AgregarDetallePruebaEntrada(entiCapacidad);
            }
            JOptionPane.showMessageDialog(null,entiCapacidad.getIdnivelcapacidad());
            negoCapacidad.cst.close();
            negoCapacidad.conexion.close();
            
            
            JOptionPane.showMessageDialog(null, "Guardado con exito.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mensaje: "+e.getMessage());
        }
    }

    

    
}
