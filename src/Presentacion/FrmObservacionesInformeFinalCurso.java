
package Presentacion;

import Entidad.ClsEntidadObservaFinalCurso;
import Negocio.ClsNegocioCapadidadInformeFinalCurso;
import Negocio.ClsNegocioObservacionesInformeFinalCurso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author enzocv
 */
public class FrmObservacionesInformeFinalCurso extends javax.swing.JInternalFrame {

    int idObservacion[];
    String tituloObservacion[];
    String subTituloObservacion[];
    String IdInfoFinalCurso = "";
    
    String observa1 = "";
    String observa2 = "";
    String observa3 = "";
    String material = "", foros = "", cuestionarios = "", examenes = "",
                    tareas = "", ppt="";       
    String observa5 = "";
    String observa6 = "";
    String observa7 = "";
    String observa8 = "";
    String observa9 = "";
    
    public FrmObservacionesInformeFinalCurso() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObserva1 = new javax.swing.JTextArea();
        titulo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObserva2 = new javax.swing.JTextArea();
        titulo3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObserva3 = new javax.swing.JTextArea();
        titulo4 = new javax.swing.JLabel();
        titulo9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObserva9 = new javax.swing.JTextArea();
        titulo5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtObserva5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtObserva6 = new javax.swing.JTextArea();
        titulo6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtObserva7 = new javax.swing.JTextArea();
        titulo7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtObserva8 = new javax.swing.JTextArea();
        titulo8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkMaterial = new javax.swing.JCheckBox();
        chkForos = new javax.swing.JCheckBox();
        chkCuestionarios = new javax.swing.JCheckBox();
        chkExamenes = new javax.swing.JCheckBox();
        chkTareas = new javax.swing.JCheckBox();
        chkPresentaciones = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();

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

        jLabel1.setText("Observaciones:");

        titulo1.setText("jLabel2");

        txtObserva1.setColumns(20);
        txtObserva1.setRows(5);
        jScrollPane1.setViewportView(txtObserva1);

        titulo2.setText("jLabel3");

        txtObserva2.setColumns(20);
        txtObserva2.setRows(5);
        jScrollPane2.setViewportView(txtObserva2);

        titulo3.setText("jLabel2");

        txtObserva3.setColumns(20);
        txtObserva3.setRows(5);
        jScrollPane3.setViewportView(txtObserva3);

        titulo4.setText("jLabel2");

        titulo9.setText("jLabel2");

        txtObserva9.setColumns(20);
        txtObserva9.setRows(5);
        jScrollPane5.setViewportView(txtObserva9);

        titulo5.setText("jLabel2");

        txtObserva5.setColumns(20);
        txtObserva5.setRows(5);
        jScrollPane6.setViewportView(txtObserva5);

        txtObserva6.setColumns(20);
        txtObserva6.setRows(5);
        jScrollPane7.setViewportView(txtObserva6);

        titulo6.setText("jLabel2");

        txtObserva7.setColumns(20);
        txtObserva7.setRows(5);
        jScrollPane8.setViewportView(txtObserva7);

        titulo7.setText("jLabel2");

        txtObserva8.setColumns(20);
        txtObserva8.setRows(5);
        jScrollPane9.setViewportView(txtObserva8);

        titulo8.setText("jLabel2");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        chkMaterial.setText("Material Curso");

        chkForos.setText("Foros");

        chkCuestionarios.setText("Cuestionarios");

        chkExamenes.setText("Examenes Virtuales");

        chkTareas.setText("Tareas");

        chkPresentaciones.setText("Presentaciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMaterial)
                    .addComponent(chkForos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkExamenes)
                    .addComponent(chkCuestionarios))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTareas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkPresentaciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMaterial)
                    .addComponent(chkCuestionarios)
                    .addComponent(chkTareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkForos)
                    .addComponent(chkExamenes)
                    .addComponent(chkPresentaciones))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEnviar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo4)
                    .addComponent(titulo3)
                    .addComponent(titulo2)
                    .addComponent(titulo1)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo9)
                    .addComponent(titulo8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addComponent(titulo5)
                        .addComponent(jScrollPane7)
                        .addComponent(titulo6)
                        .addComponent(jScrollPane8)
                        .addComponent(titulo7)
                        .addComponent(jScrollPane9))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1)
                    .addComponent(titulo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2)
                    .addComponent(titulo6))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo3)
                    .addComponent(titulo7))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo4)
                    .addComponent(titulo8))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titulo9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        try {
            ClsNegocioObservacionesInformeFinalCurso negoObserva = new ClsNegocioObservacionesInformeFinalCurso();
        
            ArrayList<ClsEntidadObservaFinalCurso> datos = negoObserva.ListarObservaciones();
            
            idObservacion = new int[datos.size()];
            tituloObservacion = new String[datos.size()];
            subTituloObservacion = new String[datos.size()];
            int i = 0;
            for (ClsEntidadObservaFinalCurso dato : datos) {
                idObservacion[i] = dato.getIdObservaciones();
                tituloObservacion[i] = dato.getTitulo();
                subTituloObservacion[i] = dato.getSubtitulo();
                i++;
            }
            llenarTitulos(tituloObservacion);
            
            negoObserva.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrmObservacionesInformeFinalCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            cargarIDsInfoFinalCurso();
            recogerDatos();
            
            ClsEntidadObservaFinalCurso entiObserva = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva = new ClsNegocioObservacionesInformeFinalCurso();
            
            //primera observacion
            entiObserva.setIdObservaciones(idObservacion[0]);
            entiObserva.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva.setDescripcion(observa1);
            
            negoObserva.AgregarPruebaEntrada(entiObserva);
            negoObserva.cst.close();
            negoObserva.conexion.close();
//            
            ClsEntidadObservaFinalCurso entiObserva2 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva2 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //segunda observacion
            entiObserva2.setIdObservaciones(idObservacion[1]);
            entiObserva2.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva2.setDescripcion(observa2);
            
            negoObserva2.AgregarPruebaEntrada(entiObserva2);
            negoObserva2.cst.close();
            negoObserva2.conexion.close();
//            
//            
            ClsEntidadObservaFinalCurso entiObserva3 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva3 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //tercera observacion
            entiObserva3.setIdObservaciones(idObservacion[2]);
            entiObserva3.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva3.setDescripcion(observa3);
            
            negoObserva3.AgregarPruebaEntrada(entiObserva3);
            negoObserva3.cst.close();
            negoObserva3.conexion.close();
//            
//            
            ClsEntidadObservaFinalCurso entiObserva4 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva4 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //cuarta observacion
            entiObserva4.setIdObservaciones(idObservacion[3]);
            entiObserva4.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva4.setDescripcion(material+","+foros+","+cuestionarios+","+examenes+","+tareas+","+ppt);
            
            negoObserva4.AgregarPruebaEntrada(entiObserva4);
            negoObserva4.cst.close();
            negoObserva4.conexion.close();
//            
//            
            ClsEntidadObservaFinalCurso entiObserva5 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva5 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //quinta observacion
            entiObserva5.setIdObservaciones(idObservacion[4]);
            entiObserva5.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva5.setDescripcion(observa5);
            
            negoObserva5.AgregarPruebaEntrada(entiObserva5);
            negoObserva5.cst.close();
            negoObserva5.conexion.close();
//            
//            
            ClsEntidadObservaFinalCurso entiObserva6 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva6 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //sexta observacion
            entiObserva6.setIdObservaciones(idObservacion[5]);
            entiObserva6.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva6.setDescripcion(observa6);
            
            negoObserva6.AgregarPruebaEntrada(entiObserva6);
            negoObserva6.cst.close();
            negoObserva6.conexion.close();
//            
//            
            ClsEntidadObservaFinalCurso entiObserva7 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva7 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //septima observacion
            entiObserva7.setIdObservaciones(idObservacion[6]);
            entiObserva7.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva7.setDescripcion(observa7);
            
            negoObserva7.AgregarPruebaEntrada(entiObserva7);
            negoObserva7.cst.close();
            negoObserva7.conexion.close();
//            
            ClsEntidadObservaFinalCurso entiObserva8 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva8 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //octava observacion
            entiObserva8.setIdObservaciones(idObservacion[7]);
            entiObserva8.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva8.setDescripcion(observa8);
            
            negoObserva8.AgregarPruebaEntrada(entiObserva8);
            negoObserva8.cst.close();
            negoObserva8.conexion.close();
//            
            ClsEntidadObservaFinalCurso entiObserva9 = new ClsEntidadObservaFinalCurso();
            ClsNegocioObservacionesInformeFinalCurso negoObserva9 = new ClsNegocioObservacionesInformeFinalCurso();
            
            //novena observacion
            entiObserva9.setIdObservaciones(idObservacion[8]);
            entiObserva9.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
            entiObserva9.setDescripcion(observa9);
            
            negoObserva9.AgregarPruebaEntrada(entiObserva9);
            negoObserva9.cst.close();
            negoObserva9.conexion.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Operación Exitosa");
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    void llenarTitulos(String[] titulo){
        titulo1.setText(titulo[0]);
        titulo2.setText(titulo[1]);
        titulo3.setText(titulo[2]);
        titulo4.setText(titulo[3]);
        titulo5.setText(titulo[4]);
        titulo6.setText(titulo[5]);
        titulo7.setText(titulo[6]);
        titulo8.setText(titulo[7]);
        titulo9.setText(titulo[8]);
    }
    
    void recogerDatos(){
        observa1 = txtObserva1.getText();
        observa2 = txtObserva2.getText();
        observa3 = txtObserva3.getText();
            if (chkMaterial.isSelected()) {
                material = "Material del Curso";
            }
            if (chkForos.isSelected()) {
                foros = "Foros";
            }
            if (chkCuestionarios.isSelected()) {
                cuestionarios = "Cuestionarios";
            }
            if (chkExamenes.isSelected()) {
                examenes = "Examenes Virtuales";
            }
            if (chkTareas.isSelected()) {
                tareas = "Tareas Encargadas";
            }
            if (chkPresentaciones.isSelected()) {
                ppt = "Presentaciones";
            }
           
        observa5 = txtObserva5.getText();
        observa6 = txtObserva6.getText();
        observa7 = txtObserva7.getText();
        observa8 = txtObserva8.getText();
        observa9 = txtObserva9.getText();
    }
    
    private void cargarIDsInfoFinalCurso() {
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioCapadidadInformeFinalCurso informe = new ClsNegocioCapadidadInformeFinalCurso();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsIdInforme = informe.obtenerIdInfoFinalCuro();
            
            //itera los valores hechas en la consulta
            while (rsIdInforme.next()) {
                //cambiar de valor hasta llegar al ultimo ID
                IdInfoFinalCurso = rsIdInforme.getString(1);
            }
            informe.conexion.close();
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkCuestionarios;
    private javax.swing.JCheckBox chkExamenes;
    private javax.swing.JCheckBox chkForos;
    private javax.swing.JCheckBox chkMaterial;
    private javax.swing.JCheckBox chkPresentaciones;
    private javax.swing.JCheckBox chkTareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JTextArea txtObserva1;
    private javax.swing.JTextArea txtObserva2;
    private javax.swing.JTextArea txtObserva3;
    private javax.swing.JTextArea txtObserva5;
    private javax.swing.JTextArea txtObserva6;
    private javax.swing.JTextArea txtObserva7;
    private javax.swing.JTextArea txtObserva8;
    private javax.swing.JTextArea txtObserva9;
    // End of variables declaration//GEN-END:variables
}
