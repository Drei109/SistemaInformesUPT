package Presentacion;

import javax.swing.table.DefaultTableModel;
import Conexion.ClsConexion;
import Entidad.ClsEntidadDetallePruebaEntrada;
import Entidad.ClsEntidadPruebaCursosFaltantes;
import Entidad.ClsEntidadPruebaEntrada;

import Negocio.ClsNegocioDetallePruebaEntrada;
import Negocio.ClsNegocioPruebaEntrada;

import Negocio.ClsNegocioUsuario;
import Utilidad.ClsRenderTable;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.*;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author Andrei
 * @author Enzo
 */
public class FrmInformePruebaEntrada extends javax.swing.JInternalFrame {

    public String cDocente;
    String idPlanEstudios;
    String idPruebaEntrada;
    private boolean menuAbierto = false;
    public String[] datoPE = null;
    private boolean calculadoPorcentajes = false;
    ArrayList<String> medidasCorrectivas = new ArrayList<>();
    int filaSeleccionada = -2;
    boolean filaRemovida = false;
    boolean guardarNuevo = true;
    
    
    
    String IDPruebaEntrada = "--";
    int contador = 0;
    public FrmInformePruebaEntrada() {
        initComponents();
    }
       
    public FrmInformePruebaEntrada(String[] datoPEF, boolean guardarNuevo){
        initComponents();
        this.datoPE = datoPEF;
        this.guardarNuevo = guardarNuevo;
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nro", "Conocimiento o Habilidad","No Aceptable","%","Suficiente","%","Bueno","%","Total"});
        
        tabla.setModel(modelo);
    }
    
    private void cargarDatosTabla(){
        txtEvaluados.setText(datoPE[10]);
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        ClsNegocioDetallePruebaEntrada detallePruebaEntrada = new ClsNegocioDetallePruebaEntrada();
        ArrayList<ClsEntidadDetallePruebaEntrada> detalle = detallePruebaEntrada.seleccionarDetallePruebaEntrada(datoPE[9]);
        Iterator iterator = detalle.iterator();
        
        String campo[] = new String[9];
        
        while (iterator.hasNext()) {            
            ClsEntidadDetallePruebaEntrada objDetalle = new ClsEntidadDetallePruebaEntrada();
            objDetalle = (ClsEntidadDetallePruebaEntrada) iterator.next();
            
//            campo[1] = String.valueOf(objDetalle.getIdPruebaEntrada());
            campo[0] = String.valueOf(objDetalle.getIdDetallePruebaEntrada());
            campo[1] = objDetalle.getHabilidad();
            campo[2] = String.valueOf(objDetalle.getCantNoAceptalbe());
            campo[3] = "";
            campo[4] = String.valueOf(objDetalle.getCantSuficiente());
            campo[5] = "";
            campo[6] = String.valueOf(objDetalle.getCantBueno());
            campo[7] = "";
            campo[8] = "";
//            campo[6] = objDetalle.getMedidasCorrectivas();
//            txtComentario.setText(objDetalle.getMedidasCorrectivas());
            medidasCorrectivas.add(objDetalle.getMedidasCorrectivas());
            
            modelo.addRow(campo);
            
        }
        tabla.setModel(modelo);
        calcularPorcentajes();
        
    }
    
    private void agregarFila(int contador){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(new Object[]{contador, "","","","","","","",""});
        modelo.isCellEditable(0, 0);
        tabla.setRowHeight(30);
        medidasCorrectivas.add("");
        
    }
    
    private void removerFila(){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()!= -1) {
            filaRemovida = true;
            medidasCorrectivas.remove(tabla.getSelectedRow());
            modelo.removeRow(tabla.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        cmbNombreCurso = new javax.swing.JComboBox<>();
        txtPractico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTeorico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDocente = new javax.swing.JTextField();
        txtRetirados = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMatriculados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        btnAgregarFila = new javax.swing.JButton();
        btnRemoverFila = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEvaluados = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAbandono = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnCalcularPorcentajes = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();

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
        jLabel1.setText("PRUEBA ENTRADA");

        lblSemestre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSemestre.setText("SEMESTRE");

        cmbCodigoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoCursoActionPerformed(evt);
            }
        });

        cmbNombreCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNombreCursoActionPerformed(evt);
            }
        });

        txtPractico.setEnabled(false);

        jLabel2.setText("Código :");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Teórico :");

        jLabel5.setText("Práctico :");

        txtTeorico.setEnabled(false);

        jLabel6.setText("Docente:");

        txtDocente.setEditable(false);
        txtDocente.setEnabled(false);

        txtRetirados.setEnabled(false);

        jLabel7.setText("Matriculados :");

        jLabel8.setText("Retirados :");

        txtMatriculados.setEnabled(false);

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                if(colIndex == 0 || colIndex == 3 || colIndex == 5 || colIndex == 7 || colIndex == 8){
                    return false;
                }
                else{
                    return true;
                }
            }
        };
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setInheritsPopupMenu(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel9.setText("Describa las medidas correctivas que tomará en los casos de grado no aceptable:");

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane2.setViewportView(txtComentario);

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

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setText("Evaluados:");

        jLabel11.setText("Abandono :");

        txtAbandono.setEnabled(false);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCalcularPorcentajes.setText("Calcular Porcentajes");
        btnCalcularPorcentajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPorcentajesActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRechazar.setText("Rechazar");
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        btnInforme.setText("Hacer Infome");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(lblSemestre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbCodigoCurso, 0, 154, Short.MAX_VALUE)
                                        .addComponent(cmbNombreCurso, 0, 154, Short.MAX_VALUE)
                                        .addComponent(txtDocente))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMatriculados)
                                            .addComponent(txtRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTeorico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel5))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPractico, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEvaluados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCalcularPorcentajes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAgregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRemoverFila, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSemestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEvaluados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTeorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtPractico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularPorcentajes)
                    .addComponent(btnAgregarFila)
                    .addComponent(btnRemoverFila))
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnviar)
                        .addComponent(btnGuardar))
                    .addComponent(btnInforme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar)
                        .addComponent(btnRechazar))
                    .addComponent(btnCerrar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        contador++;
        agregarFila(contador);
    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnRemoverFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFilaActionPerformed
        contador--;
        removerFila();
    }//GEN-LAST:event_btnRemoverFilaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        /**
         * @param munuAbierto       Boolean     "Verifica que la ventana se encuentre abierta"
         */
        recibeDatosFormulario();
        cargarTabla();
        if (datoPE.length == 11) {
            cargarDatosTabla();            
        } 
        menuAbierto = true;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        tabla.setRowHeight(30);

    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCursoActionPerformed
        /**
         * @param menuAbierto       boolean     "verifica que JInternal este abierto"
         */
        
        if (menuAbierto) {
            //seleccionamos el nombre del curso de acurdo al codigo del curso
            //seleccionado
            cmbNombreCurso.setSelectedIndex(cmbCodigoCurso.getSelectedIndex());
        }
    }//GEN-LAST:event_cmbCodigoCursoActionPerformed

    private void cmbNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNombreCursoActionPerformed
        /**
         * @param menuAbierto       boolean     "verifica que JInternal este abierto"
         */
        
        if (menuAbierto) {
            //seleccionamos el nombre del curso de acurdo al codigo del curso
            //seleccionado
            cmbCodigoCurso.setSelectedIndex(cmbNombreCurso.getSelectedIndex());
        }
    }//GEN-LAST:event_cmbNombreCursoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (calculadoPorcentajes) {
            String estado = "Guardado";
            if (guardarNuevo) {
                guardarInforme(estado);
            }else{
                if (tabla.getSelectedRow() != -1) {
                    medidasCorrectivas.set(tabla.getSelectedRow(), txtComentario.getText());
                }
                actualizarInforme();
            }
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Tabla vacia.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void actualizarInforme(){
        ClsEntidadDetallePruebaEntrada entidadDetalle = new ClsEntidadDetallePruebaEntrada();
        
        ClsNegocioPruebaEntrada negocioPrueba = new ClsNegocioPruebaEntrada();
        ClsEntidadPruebaEntrada entidadPrueba = new ClsEntidadPruebaEntrada();
        
        
        int filas = tabla.getRowCount();
        
        
        
        try {
            
            //MODIFICAR PRUEBA DE ENTRADA
            entidadPrueba.setIdCargaAcademica(Integer.parseInt(idPlanEstudios));
            entidadPrueba.setEstado("Guardado");
            entidadPrueba.setEvaluados(Integer.parseInt(txtEvaluados.getText()));

            negocioPrueba.ModificarPruebaEntrada(datoPE[9],entidadPrueba);
            negocioPrueba.cst.close();
            negocioPrueba.conexion.close();
            
            //MODIFICAR DETALLE DE PRUEBA DE ENTRADA
            ClsNegocioDetallePruebaEntrada negocioDetalle = new ClsNegocioDetallePruebaEntrada();
            negocioDetalle.EliminarDetallPruebaEntradaTodo(datoPE[9]);
            
            
            ResultSet rs = negocioDetalle.ObtenerIdPruebaEntrada(idPlanEstudios);
            while (rs.next()) {
                IDPruebaEntrada = rs.getString(1);
            }
            
            //3 5 7
            for (int i = 0; i < filas; i++) {
                entidadDetalle.setIdPruebaEntrada(Integer.parseInt(IDPruebaEntrada));
                entidadDetalle.setHabilidad((String) tabla.getValueAt(i, 1));
                entidadDetalle.setCantNoAceptalbe(Integer.parseInt((String) tabla.getValueAt(i, 2)));
                entidadDetalle.setCantSuficiente(Integer.parseInt((String) tabla.getValueAt(i, 4)));
                entidadDetalle.setCantBueno(Integer.parseInt((String) tabla.getValueAt(i, 6)));
                entidadDetalle.setMedidasCorrectivas(medidasCorrectivas.get(i));
                negocioDetalle.AgregarDetallePruebaEntrada(entidadDetalle);
            }
            
        JOptionPane.showMessageDialog(null, "Operación Exitosa");
        
        negocioDetalle.conexion.close();
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void guardarInforme(String estado){
        /**
         * @param valores           String          "Almacena todos los id de la tabla"
         * @param filas             Integer         "Obtiene las Filas de la tabla"
         * @param valor             String          "Obtiene el primer valor de cada fila"
         * @param negocioDetalle    Objeto          "Instancia para Negocio de Detalle de Prueba de Entrada"
         * @param negocioPrueba     Objeto          "Instancia para Negocio de Prueba de Entrada"
         * @param entidadDetalle    Objeto          "Instancia para Entidad de Detalle de Prueba de Entrada"
         * @param entidadPrueba     Objeto          "Instancia para Entidad de Prueba de Entrada"
         * 
         */
        
        ClsEntidadDetallePruebaEntrada entidadDetalle = new ClsEntidadDetallePruebaEntrada();
        
        ClsNegocioPruebaEntrada negocioPrueba = new ClsNegocioPruebaEntrada();
        ClsEntidadPruebaEntrada entidadPrueba = new ClsEntidadPruebaEntrada();
        
        
        int filas = tabla.getRowCount();
        
        
        
        try {
            
            //GUARDAR PRUEBA DE ENTRADA
            entidadPrueba.setIdCargaAcademica(Integer.parseInt(idPlanEstudios));
            entidadPrueba.setEstado(estado);
            entidadPrueba.setEvaluados(Integer.parseInt(txtEvaluados.getText()));

            negocioPrueba.AgregarPruebaEntrada(entidadPrueba);
            negocioPrueba.cst.close();
            negocioPrueba.conexion.close();
            
            //GUARDAR DETALLE DE PRUEBA DE ENTRADA
            ClsNegocioDetallePruebaEntrada negocioDetalle = new ClsNegocioDetallePruebaEntrada();
            ResultSet rs = negocioDetalle.ObtenerIdPruebaEntrada(idPlanEstudios);
            while (rs.next()) {
                IDPruebaEntrada = rs.getString(1);
            }
            
            //3 5 7
            for (int i = 0; i < filas; i++) {
                entidadDetalle.setIdPruebaEntrada(Integer.parseInt(IDPruebaEntrada));
                entidadDetalle.setHabilidad((String) tabla.getValueAt(i, 1));
                entidadDetalle.setCantNoAceptalbe(Integer.parseInt((String) tabla.getValueAt(i, 2)));
                entidadDetalle.setCantSuficiente(Integer.parseInt((String) tabla.getValueAt(i, 4)));
                entidadDetalle.setCantBueno(Integer.parseInt((String) tabla.getValueAt(i, 6)));
                entidadDetalle.setMedidasCorrectivas(medidasCorrectivas.get(i));
                negocioDetalle.AgregarDetallePruebaEntrada(entidadDetalle);
            }
            
        JOptionPane.showMessageDialog(null, "Operación Exitosa");
        
        negocioDetalle.conexion.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (calculadoPorcentajes) {
            String estado = "Enviado";
            guardarInforme(estado);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Tabla vacia.");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCalcularPorcentajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPorcentajesActionPerformed
        calcularPorcentajes();
    }                                                      

    private void calcularPorcentajes(){
        int filas = tabla.getRowCount();
        if (!txtEvaluados.getText().equals("")) {
            int evaluados = Integer.parseInt(txtEvaluados.getText());
            int matriculados = Integer.parseInt(txtMatriculados.getText());
            int CantNoAceptable = 0;
            int CantSuficiente  = 0;
            int CantBueno       = 0;  

            //3 5 7


            if (!(filas <= 0 || evaluados <= 0 || evaluados > matriculados)) {

                for (int i = 0; i < filas; i++) {
                    
                    if (!(tabla.getValueAt(i, 2).equals("") || tabla.getValueAt(i, 4).equals("") || tabla.getValueAt(i, 6).equals("") )) {
                        CantNoAceptable = Integer.parseInt((String) tabla.getValueAt(i, 2));
                        CantSuficiente  = Integer.parseInt((String) tabla.getValueAt(i, 4));
                        CantBueno       = Integer.parseInt((String) tabla.getValueAt(i, 6));

                        if ((CantNoAceptable+CantSuficiente+CantBueno) > evaluados) {
                            JOptionPane.showMessageDialog(null, "Cantidades de la tabla superior a los evaluados");
                            break;
                        }
                        else{
                            tabla.setValueAt(((CantNoAceptable*100)/evaluados), i, 3);
                            tabla.setValueAt(((CantSuficiente*100)/evaluados), i, 5);
                            tabla.setValueAt(((CantBueno*100)/evaluados), i, 7);
                            tabla.setValueAt((((CantNoAceptable*100)/evaluados) +
                                                ((CantSuficiente*100)/evaluados) +
                                                ((CantBueno*100)/evaluados)), i, 8);
                            
                            calculadoPorcentajes = true;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Datos de la Tabla Vacios.");
                        break;
                    }
                    
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad de evaluados.");
        }

        tabla.setDefaultRenderer(Object.class, new  ClsRenderTable());
    }//GEN-LAST:event_btnCalcularPorcentajesActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        if (tabla.getSelectedRow()!= -1) {
            if (filaSeleccionada == -2 || filaRemovida == true) {
                filaSeleccionada = tabla.getSelectedRow();
                txtComentario.setText(medidasCorrectivas.get(filaSeleccionada));
                filaRemovida = false;
            } else {
                medidasCorrectivas.set(filaSeleccionada, txtComentario.getText());
                filaSeleccionada = tabla.getSelectedRow();
                txtComentario.setText(medidasCorrectivas.get(filaSeleccionada));
            }
        }
    }//GEN-LAST:event_tablaMousePressed

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        ClsNegocioDetallePruebaEntrada negocioDetalle = new ClsNegocioDetallePruebaEntrada();
        ResultSet rs;
        try {
            rs = negocioDetalle.ObtenerIdPruebaEntrada(idPlanEstudios);
            while (rs.next()) {
                IDPruebaEntrada = rs.getString(1);
            }
            negocioDetalle.cst.close();
            negocioDetalle.conexion.close();
            
            String estado = "Rechazado";
            
            ClsNegocioPruebaEntrada prueba = new ClsNegocioPruebaEntrada();
            prueba.ModificarEstadoPruebaEntrada(IDPruebaEntrada, estado);
            
            prueba.cst.close();
            prueba.conexion.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo Modificar el Estado de la Prueba de Entrada.");
        }
    }//GEN-LAST:event_btnRechazarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        ClsNegocioDetallePruebaEntrada negocioDetalle = new ClsNegocioDetallePruebaEntrada();
        ResultSet rs;
        try {
            rs = negocioDetalle.ObtenerIdPruebaEntrada(idPlanEstudios);
            while (rs.next()) {
                IDPruebaEntrada = rs.getString(1);
            }
            negocioDetalle.cst.close();
            negocioDetalle.conexion.close();
            
            String estado = "Aceptado";
            
            ClsNegocioPruebaEntrada prueba = new ClsNegocioPruebaEntrada();
            prueba.ModificarEstadoPruebaEntrada(IDPruebaEntrada, estado);
            
            prueba.cst.close();
            prueba.conexion.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo Modificar el Estado de la Prueba de Entrada.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        Map p = new HashMap();
        p.put("ID", datoPE[9]);
        
//        p.put("idPE", datoPE[9]);
//        p.put("idPe2", datoPE[9]);
        
        
        Connection cnx = new ClsConexion().getConnection();
        
        try {           
            JasperReport report;
            JasperPrint print;
            report = JasperCompileManager.compileReport("../Proyecto-Final-Aguirre-Catalan/src/Reportes/RptInformePruebaEntrada.jrxml");
            print = JasperFillManager.fillReport(report,p,cnx);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Reporte Prueba Entrada");
            view.setVisible(true);
            cnx.close();
        } catch (JRException ex) {
            Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInformeActionPerformed

    private void recibeDatosFormulario(){
        
        cmbCodigoCurso.removeAllItems();
        cmbNombreCurso.removeAllItems();
        
        //Llenar los ComboBox con los datos seleccionados del foormulario
        //Reportes Faltantes
        cmbCodigoCurso.addItem(datoPE[0]);
        cmbNombreCurso.addItem(datoPE[1]);
        
        txtTeorico.setText(datoPE[2]);
        txtPractico.setText(datoPE[3]);
        txtMatriculados.setText(datoPE[4]);
        txtRetirados.setText(datoPE[5]);
        txtAbandono.setText(datoPE[6]);
        cDocente = datoPE[7];
        txtDocente.setText(datoPE[8]);
        
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioUsuario docente = new ClsNegocioUsuario();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsDocente = docente.obtenerDatosPruebaEntrada(datoPE[7], datoPE[0]);
            
            //itera los valores hechas en la consulta
            while (rsDocente.next()) {
                //llenar los valores con los valores respectivos
                lblSemestre.setText("Semestre " + rsDocente.getString(7));
                
                idPlanEstudios = rsDocente.getString(8);
            }
        } catch (Exception e) {
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnCalcularPorcentajes;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnRemoverFila;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbNombreCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSemestre;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txtAbandono;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtDocente;
    public static javax.swing.JTextField txtEvaluados;
    private javax.swing.JTextField txtMatriculados;
    private javax.swing.JTextField txtPractico;
    private javax.swing.JTextField txtRetirados;
    private javax.swing.JTextField txtTeorico;
    // End of variables declaration//GEN-END:variables
}