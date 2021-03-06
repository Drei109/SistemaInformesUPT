/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.ClsEntidadCurso;
import Negocio.ClsNegocioCurso;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Asus
 */
public class FrmCRUDCursos extends javax.swing.JInternalFrame {

    
    public ArrayList<ClsNegocioCurso> dato = null;
    SpinnerNumberModel  modelSpn = null;
    private TableRowSorter<TableModel> rowSorter;
    
    public FrmCRUDCursos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spnHTeoricas = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnHPracticas = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spnCreditos = new javax.swing.JSpinner();
        cmbCiclos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdCurso = new javax.swing.JTextField();
        cmbCiclo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoCurso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPreRequisito = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Cursos");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));

        jLabel2.setText("Nombre:");

        spnHTeoricas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel3.setText("H. Teoricas:");

        jLabel4.setText("H. Practicas:");

        spnHPracticas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel5.setText("Creditos:");

        spnCreditos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        cmbCiclos.setText("Ciclo:");

        jLabel7.setText("ID Curso:");

        cmbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));

        jLabel8.setText("Tipo Curso:");

        cmbTipoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Opcional", "Obligatorio" }));

        jLabel9.setText("Pre - Requisito:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(cmbCiclos)
                    .addComponent(jLabel9))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnCreditos)
                                .addComponent(spnHTeoricas)
                                .addComponent(cmbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(32, 32, 32))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spnHPracticas)
                                .addComponent(cmbTipoCurso, 0, 127, Short.MAX_VALUE)))
                        .addComponent(txtNombreCurso)
                        .addComponent(txtIdCurso))
                    .addComponent(txtPreRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnHTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(spnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCiclos)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(cmbTipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(spnHPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtPreRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(27, 27, 27)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(26, 26, 26)
                .addComponent(btnEliminar)
                .addGap(31, 31, 31)
                .addComponent(btnLimpiar)
                .addGap(30, 30, 30)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCursos);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limipar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        deshabilitarBotonesNuevo();
        listarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarBotonesNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //guardar datos ingresados en el formulario
        String idCurso = txtIdCurso.getText();
        String nombreCurso = txtNombreCurso.getText();
        int hTeoricas =  Integer.parseInt(spnHTeoricas.getValue().toString());
        int hPracticas =  Integer.parseInt(spnHPracticas.getValue().toString());
        int creditos = Integer.parseInt(spnCreditos.getValue().toString());
        String ciclo = cmbCiclo.getSelectedItem().toString();
        String tipoCurso = cmbTipoCurso.getSelectedItem().toString();
        String preRequisito = txtPreRequisito.getText();
        
        try {
            ClsNegocioCurso negoCurso = new ClsNegocioCurso();
            ClsEntidadCurso entiCurso = new ClsEntidadCurso();
            //pasar los datos a la entidad curso
            entiCurso.setIdCurso(idCurso);
            entiCurso.setNombre(nombreCurso);
            entiCurso.setHorasTeoricas(hTeoricas);
            entiCurso.setHorasPracticas(hPracticas);
            entiCurso.setCreditos(creditos);
            entiCurso.setCiclo(ciclo);
            entiCurso.setTipoCurso(tipoCurso);
            entiCurso.setPreRequisito(preRequisito);
            
            //llamar a la clase de negocio para guardar los datos
            negoCurso.AgregarCurso(entiCurso);
            
            //cerrar la conexion de la clase negocio
            negoCurso.conexion.close();
            
            //refrescar la tabla de cursos
            listarTabla();
            
            //volver a desabilitar los botones
            deshabilitarBotonesNuevo();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCursosMouseClicked
        agregarDatosCajas();
    }//GEN-LAST:event_tablaCursosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(tablaCursos.getSelectedRow() >= 0){
            if (!txtIdCurso.getText().equals("")) {
                //guardar datos ingresados en el formulario
                String idCurso = (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 0);
                String nombreCurso = txtNombreCurso.getText();
                int hTeoricas =  Integer.parseInt(spnHTeoricas.getValue().toString());
                int hPracticas =  Integer.parseInt(spnHPracticas.getValue().toString());
                int creditos = Integer.parseInt(spnCreditos.getValue().toString());
                String ciclo = cmbCiclo.getSelectedItem().toString();
                String tipoCurso = cmbTipoCurso.getSelectedItem().toString();
                String preRequisito = txtPreRequisito.getText();

                try {
                    ClsNegocioCurso negoCurso = new ClsNegocioCurso();
                    ClsEntidadCurso entiCurso = new ClsEntidadCurso();
                    //pasar los datos a la entidad curso
                    entiCurso.setIdCurso(idCurso);
                    entiCurso.setNombre(nombreCurso);
                    entiCurso.setHorasTeoricas(hTeoricas);
                    entiCurso.setHorasPracticas(hPracticas);
                    entiCurso.setCreditos(creditos);
                    entiCurso.setCiclo(ciclo);
                    entiCurso.setTipoCurso(tipoCurso);
                    entiCurso.setPreRequisito(preRequisito);

                    //llamar a la clase de negocio para guardar los datos
                    negoCurso.ModificarCurso(idCurso, entiCurso);
                    
                    //cerrar la conexion de la clase negocio
                    negoCurso.conexion.close();

                    //refrescar la tabla de cursos
                    listarTabla();

                    //volver a desabilitar los botones
                    deshabilitarBotonesNuevo();
                    txtIdCurso.setEnabled(true);
                    limipar();

                } catch (Exception e) {
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(tablaCursos.getSelectedRow() >= 0){
            if (!txtIdCurso.getText().equals("")) {
                //guardar datos ingresados en el formulario
                String idCurso = (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 0);
                
                int reply = JOptionPane.showConfirmDialog(null,
                                          "¿Esta seguro que quiere eliminar el curso: "+idCurso+" ?",
                                          "YES?",
                                          JOptionPane.YES_NO_OPTION);
                if (reply == 0) {
                    try {
                        ClsNegocioCurso negoCurso = new ClsNegocioCurso();

                        //llamar a la clase de negocio para guardar los datos
                        negoCurso.EliminarCurso(idCurso);

                        //cerrar la conexion de la clase negocio
                        negoCurso.conexion.close();

                        //refrescar la tabla de cursos
                        listarTabla();

                        //volver a desabilitar los botones
                        deshabilitarBotonesNuevo();
                        txtIdCurso.setEnabled(true);
                        limipar();

                    } catch (Exception e) {
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        rowSorter = new TableRowSorter<>(tablaCursos.getModel());
        tablaCursos.setRowSorter(rowSorter);
        String text = txtBuscar.getText();
        if (text.trim().length() == 0) {
            rowSorter.setRowFilter(null);
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void habilitarBotonesNuevo(){
        //habilitar botones cuando se quiera guardar un curso nuevo
        txtIdCurso.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }
    
    private void deshabilitarBotonesNuevo(){
        //deshabilitar botones 
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    //metodos que se ejecutan cuando el formulario se abra.
    void listarTabla(){
        String titulos[] = {"Id Curso",
                            "Nombre",
                            "H.Teoricas",
                            "H.Practicas",
                            "H.Totales",
                            "Creditos",
                            "Ciclo",
                            "Tipo Curso",
                            "Pre Requisito"};
        
        try {
            ClsNegocioCurso  datos = new ClsNegocioCurso();
            
            dato = datos.seleccionarTodasLosCursos();

            Iterator iterator = dato.iterator();

            DefaultTableModel modeloTabla = new DefaultTableModel(null, titulos);

            String campo[] = new String[9];

            while (iterator.hasNext()) {
                ClsEntidadCurso objenti = new ClsEntidadCurso();

                objenti = (ClsEntidadCurso) iterator.next();

                campo[0] = objenti.getIdCurso();
                campo[1] = objenti.getNombre();
                campo[2] = String.valueOf(objenti.getHorasTeoricas());
                campo[3] = String.valueOf(objenti.getHorasPracticas());
                campo[4] = String.valueOf(objenti.getTotalHoras());
                campo[5] = String.valueOf(objenti.getCreditos());
                campo[6] = objenti.getCiclo();
                campo[7] = objenti.getTipoCurso();
                campo[8] = objenti.getPreRequisito();
                
                modeloTabla.addRow(campo);
            }
            tablaCursos.setModel(modeloTabla);

            datos.conexion.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //metodo para cuando se de clic en una celda cuanquiera de la tabla.
    void agregarDatosCajas(){
        txtIdCurso.setEnabled(false);
        txtIdCurso.setText( (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 0) );
        txtNombreCurso.setText( (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 1) );
        
        String value1 = (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 2);
        String value2 = (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 3);
        String value3 = (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 5);
        
//        modelSpn = new SpinnerNumberModel(Integer.parseInt(value),0,5,1);

        spnHTeoricas.setValue(Integer.parseInt(value1) );
        spnHPracticas.setValue( Integer.parseInt(value2) );
        spnCreditos.setValue( Integer.parseInt(value3) );

        cmbCiclo.setSelectedItem( tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 6) );
        cmbTipoCurso.setSelectedItem( tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 7) );
        txtPreRequisito.setText( (String) tablaCursos.getValueAt(tablaCursos.getSelectedRow(), 8) );
        
        //activar boton de actualizar datos
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    //limiar items de formulario
    private void limipar(){
        txtIdCurso.setText("");
        txtNombreCurso.setText("");
        txtPreRequisito.setText("");
        //TODO buscar como resetear un spinner
        spnCreditos.setValue(0);
        spnHPracticas.setValue(0);
        spnHTeoricas.setValue(0);
        
        cmbCiclo.setSelectedIndex(0);
        cmbTipoCurso.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCiclo;
    private javax.swing.JLabel cmbCiclos;
    private javax.swing.JComboBox<String> cmbTipoCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCreditos;
    private javax.swing.JSpinner spnHPracticas;
    private javax.swing.JSpinner spnHTeoricas;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtPreRequisito;
    // End of variables declaration//GEN-END:variables
}
