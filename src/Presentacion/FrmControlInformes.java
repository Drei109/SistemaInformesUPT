/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPruebaCursosFaltantes;
import Negocio.ClsNegocioPruebaEntrada;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Drei
 */
public class FrmControlInformes extends javax.swing.JInternalFrame {

    static ResultSet rs = null;
    DefaultTableModel dtm = new DefaultTableModel();
    String nivelUsuario = "";
    String codDocente = "";
    public ArrayList<ClsNegocioPruebaEntrada> dato = null;
    private TableRowSorter<TableModel> rowSorter;
    
    public FrmControlInformes(String nivelUsuario,String codDocente) {
        initComponents();

        this.codDocente = codDocente;
        this.nivelUsuario = nivelUsuario;
        definirTituloTabla(nivelUsuario);
        
        btngroup.add(rbtnPie);
        btngroup.add(rbtnBarras);
        rbtnPie.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoInforme = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbtnPie = new javax.swing.JRadioButton();
        rbtnBarras = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("Tipo de Informe :");

        cmbTipoInforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prueba Entrada", "Informe Final Curso", "Portafolio" }));
        cmbTipoInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoInformeActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBuscar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReporte.setText("Imprimir Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar :");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL INFORMES");

        rbtnPie.setText("Pie");

        rbtnBarras.setText("Barras");

        jLabel3.setText("Tipo de reporte:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnPie)
                        .addGap(28, 28, 28)
                        .addComponent(rbtnBarras)
                        .addGap(41, 41, 41)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte)
                    .addComponent(btnSalir)
                    .addComponent(rbtnPie)
                    .addComponent(rbtnBarras)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void definirTituloTabla(String nivelUsuario) {
                
        String titulosAdministrador[] = {"ID","Cod Docente","Nombre","Semestre","Cod Curso","Curso","Fecha","Estado","Sección"};
        dtm.setColumnIdentifiers(titulosAdministrador);
        tblBuscar.setModel(dtm);   
    }
    
    private void buscarInformes(String nivelUsuario,String codDocente){
        int tipoInforme = cmbTipoInforme.getSelectedIndex();        
        String titulosAdministrador[] = {"ID","Cod Docente","Nombre","Cod Curso","Curso","Fecha","Estado","Sección"};
//        String criterio = cmbCriterio.getSelectedItem().toString();
//        String busqueda = txtBuscar.getText();
        
        try {
            ClsNegocioPruebaEntrada datos = new ClsNegocioPruebaEntrada();
//                    String busqueda = cmbTipoReporte.getSelectedItem().toString();
            dato = datos.verInformesTotales((String) cmbTipoInforme.getSelectedItem());//ArrayList

            Iterator iterator = dato.iterator();

            DefaultTableModel modeloTabla = new DefaultTableModel(null, titulosAdministrador);

            String campo[] = new String[8];

            while (iterator.hasNext()) {
                ClsEntidadPruebaCursosFaltantes objenti = new ClsEntidadPruebaCursosFaltantes();

                objenti = (ClsEntidadPruebaCursosFaltantes) iterator.next();

                campo[0] = objenti.getCargaAcademica();
                campo[1] = objenti.getCodigoDocente();
                campo[2] = objenti.getNombreDocente();
                campo[3] = objenti.getIdCurso();
                campo[4] = objenti.getNombreCurso();
                campo[5] = objenti.getFechaPrueba();
                if(objenti.getEstadoPrueba()!=null){
                    campo[6] = objenti.getEstadoPrueba();     
                    if(campo[6].equals("Observado") || campo[6].equals("Guardado")){
                        campo[6] = "No enviado";
                    }
                }else{
                    campo[6] = "No enviado";
                }
                campo[7] = objenti.getSeccion();
                modeloTabla.addRow(campo);
            }
            tblBuscar.setModel(modeloTabla);

            datos.conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarInformes(nivelUsuario,codDocente);
        rowSorter = new TableRowSorter<>(tblBuscar.getModel());
        tblBuscar.setRowSorter(rowSorter);
        String text = txtBuscar.getText();
        if (text.trim().length() == 0) {
           rowSorter.setRowFilter(null);
        } else {
           rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
//        Prueba Entrada
//        Informe Final Curso
//        Portafolio
        String tipoInforme = (String) cmbTipoInforme.getSelectedItem();
        
        switch(tipoInforme){
            case "Prueba Entrada":
                if (rbtnPie.isSelected()) {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlInformePruebaEntrada.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlInformesPruebaEntradaBarras.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                
                break;
            case "Informe Final Curso":
                if (rbtnPie.isSelected()) {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlInformeFinal.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlInformeFinalBarras.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            case "Portafolio":
                if (rbtnPie.isSelected()) {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlPortafolioPie.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Map p = new HashMap();                
                    Connection cnx = new ClsConexion().getConnection();
                    try {           
                        JasperReport report;
                        JasperPrint print;
                        report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptControlPortafolioBarras.jrxml");
                        print = JasperFillManager.fillReport(report,p,cnx);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Reporte Prueba Entrada");
                        view.setVisible(true);
                        cnx.close();
                    } catch (JRException | SQLException ex) {
                        Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void cmbTipoInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoInformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoInformeActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JComboBox<String> cmbTipoInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnBarras;
    private javax.swing.JRadioButton rbtnPie;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
