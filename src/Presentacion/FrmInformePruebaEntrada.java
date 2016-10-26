package Presentacion;

import javax.swing.table.DefaultTableModel;
import Conexion.ClsConexion;
import Negocio.ClsNegocioUsuario;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.*;
import java.sql.ResultSet;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei
 * @author Enzo
 */
public class FrmInformePruebaEntrada extends javax.swing.JInternalFrame {

    public String cDocente;
    private boolean menuAbierto = false;
    
    public FrmInformePruebaEntrada() {
        initComponents();
        cargarTabla();
    }
    
    private void cargarDatosDocenteFormulario(){
        String codigoDocente = cDocente;
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioUsuario docente = new ClsNegocioUsuario();
            
            ResultSet rsDocente = docente.obtenerCursosDocente(codigoDocente);
            
            cmbCodigoCurso.removeAllItems();
            cmbNombreCurso.removeAllItems();
            
            while (rsDocente.next()) {
                 cmbCodigoCurso.addItem(rsDocente.getString(1));
                 cmbNombreCurso.addItem(rsDocente.getString(2));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void cargarDatosCompletoDocenteCurso(){
        /**
         * @param curso             String      "Obtiene el codigo del curso seleccionado"
         * @param codigoDocente     String      "Obtiene el codigo del docente que esta seleccionado"
         */
        
        String curso = cmbCodigoCurso.getSelectedItem().toString();
        String codigoDocente = cDocente;
        
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioUsuario docente = new ClsNegocioUsuario();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsDocente = docente.obtenerDatosPruebaEntrada(codigoDocente, curso);
            
            //itera los valores hechas en la consulta
            while (rsDocente.next()) {
                //llenar los valores con los valores respectivos
                txtDocente.setText(rsDocente.getString(5));
                txtPractico.setText(String.valueOf(rsDocente.getInt(4)));
                txtTeorico.setText(String.valueOf(rsDocente.getInt(3)));
                txtMatriculados.setText(String.valueOf(rsDocente.getInt(6)));
                lblSemestre.setText("Semestre " + rsDocente.getString(7));
                
                cmbNombreCurso.setSelectedItem(rsDocente.getString(2));
                cmbCodigoCurso.setSelectedItem(rsDocente.getString(1));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nro", "Conocimiento o Habilidad","No Aceptable","%","Suficiente","%","Bueno","%","Total"});
        tabla.setModel(modelo);
    }
    private void agregarFila(){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(new Object[]{"", "","","","","","","",""});
    }
    
    private void removerFila(){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.removeRow(tabla.getSelectedRow());
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
        btnEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        btnAgregarFila = new javax.swing.JButton();
        btnRemoverFila = new javax.swing.JButton();

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

        jLabel1.setText("PRUEBA ENTRADA");

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

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Teórico");

        jLabel5.setText("Práctico");

        jLabel6.setText("Docente:");

        jLabel7.setText("Matriculados");

        jLabel8.setText("Retirados");

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
        jScrollPane1.setViewportView(tabla);

        jLabel9.setText("Describa las medidas correctivas que tomará en los casos de grado no aceptable:");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(lblSemestre)))
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemoverFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(cmbNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTeorico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPractico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)))
                                        .addComponent(txtDocente)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(60, 60, 60)
                                    .addComponent(txtMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSemestre)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPractico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFila)
                    .addComponent(btnRemoverFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        agregarFila();
    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnRemoverFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFilaActionPerformed
        removerFila();
    }//GEN-LAST:event_btnRemoverFilaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        /**
         * @param munuAbierto       Boolean     "Verifica que la ventana se encuentre abierta"
         */
        
        cargarDatosDocenteFormulario();
        cargarDatosCompletoDocenteCurso();
        menuAbierto = true;
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCursoActionPerformed
        /**
         * @param menuAbierto       boolean     "verifica que JInternal este abierto"
         */
        
        if (menuAbierto) {
            //seleccionamos el nombre del curso de acurdo al codigo del curso
            //seleccionado
            cmbNombreCurso.setSelectedIndex(cmbCodigoCurso.getSelectedIndex());
            cargarDatosCompletoDocenteCurso();
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
            cargarDatosCompletoDocenteCurso();
        }
    }//GEN-LAST:event_cmbNombreCursoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        /**
         * @param valores       String          "Almacena todos los id de la tabla"
         * @param filas         Integer         "Obtiene las Filas de la tabla"
         * @param valor         String          "Obtiene el primer valor de cada fila"
         */
        
        String valores = "" ;
        int filas = tabla.getRowCount();
        
        for (int i = 0; i < filas; i++) {
            String valor = (String) tabla.getValueAt(i, 0);
            valores += valor + ",\n ";
        }
        
        
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRemoverFila;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbNombreCurso;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtMatriculados;
    private javax.swing.JTextField txtPractico;
    private javax.swing.JTextField txtRetirados;
    private javax.swing.JTextField txtTeorico;
    // End of variables declaration//GEN-END:variables
}
