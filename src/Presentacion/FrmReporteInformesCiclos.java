/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Conexion.ClsConexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author enzocv
 */
public class FrmReporteInformesCiclos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmReporteInformesCiclos
     */
    public FrmReporteInformesCiclos() {
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
        cmbTipoReporte = new javax.swing.JComboBox<>();
        btnGenerarReporte = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPRIMIR REPORTES POR CICLO");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel2.setText("Tipo de Reporte a Generar :");

        cmbTipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informe Prueba de Entrada", "Informe Final de Curso", "Informe de Portafolio" }));

        btnGenerarReporte.setText("GENERAR REPORTE");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipoReporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGenerarReporte)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        hacerReporte();
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void hacerReporte(){
        int tipoInforme = cmbTipoReporte.getSelectedIndex();
        
        switch(tipoInforme){
            case 0:
                Map p = new HashMap();

                Connection cnx = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptEntradaCiclos.jrxml");
                    print = JasperFillManager.fillReport(report,p,cnx);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("REPORTE POR CICLOS");
                    view.setVisible(true);
                    cnx.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                Map p2 = new HashMap();

                Connection cnx2 = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptFinalCiclos.jrxml");
                    print = JasperFillManager.fillReport(report,p2,cnx2);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("REPORTE POR CICLOS");
                    view.setVisible(true);
                    cnx2.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                Map p3 = new HashMap();

                Connection cnx3 = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptPortafolioCiclos.jrxml");
                    print = JasperFillManager.fillReport(report,p3,cnx3);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("REPORTE POR CICLOS");
                    view.setVisible(true);
                    cnx3.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JComboBox<String> cmbTipoReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
