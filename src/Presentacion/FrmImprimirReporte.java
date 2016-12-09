/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Conexion.ClsConexion;
import Negocio.ClsNegocioInformeFinalCurso;
import Negocio.ClsNegocioPortafolio;
import Negocio.ClsNegocioPruebaEntrada;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class FrmImprimirReporte extends javax.swing.JInternalFrame {

    static ResultSet rs = null;
    DefaultTableModel dtm = new DefaultTableModel();
    String nivelUsuario = "";
    String codDocente = "";
    
    public FrmImprimirReporte(String nivelUsuario,String codDocente) {
        initComponents();
        this.codDocente = codDocente;
        this.nivelUsuario = nivelUsuario;
//        definirTituloTabla(nivelUsuario);
        cargarCombo(nivelUsuario);
        buscarPruebaEntrada(nivelUsuario,codDocente);
    }

    
    private void cargarCombo(String nivelUsuario){
        switch(nivelUsuario){
        case "Usuario":
            cmbCriterio.removeAllItems();
            cmbCriterio.addItem("Todos");
            cmbCriterio.addItem("Código Curso");
            cmbCriterio.addItem("Nombre Curso");
            cmbCriterio.addItem("Fecha");
            break;
        case "Supervisor":
        case "Administrador":
            cmbCriterio.removeAllItems();
            cmbCriterio.addItem("Todos");
            cmbCriterio.addItem("Código Docente");
            cmbCriterio.addItem("Nombre Docente");
            cmbCriterio.addItem("Semestre");
            cmbCriterio.addItem("Código Curso");
            cmbCriterio.addItem("Nombre Curso");
            cmbCriterio.addItem("Fecha");
            break;
        }
    }
    
    private void buscarPruebaEntrada(String nivelUsuario,String codDocente){
        int tipoInforme = cmbTipoInforme.getSelectedIndex();
        
        String criterio = cmbCriterio.getSelectedItem().toString();
        String busqueda = txtBuscar.getText();
        
        switch(tipoInforme){
            case 0:
                ClsNegocioPruebaEntrada negPruebaEntrada = new ClsNegocioPruebaEntrada();
        
                

                switch(nivelUsuario){
                case "Usuario":
                    try {
                    rs  =negPruebaEntrada.ConsultaInformeUsuario(criterio, busqueda,codDocente);

                    boolean encuentra = false;
                    String Campo[] = new String[5];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra .");
                    }
                    rs.close();
                    negPruebaEntrada.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                case "Supervisor":            
                case "Administrador":
                    try {
                    rs  =negPruebaEntrada.ConsultaInformeAdministrador(criterio, busqueda);

                    boolean encuentra = false;
                    String Campo[] = new String[8];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 
                        Campo[5] = (String) rs.getString(6); 
                        Campo[6] = (String) rs.getString(7); 
                        Campo[7] = (String) rs.getString(8); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra.");
                    }
                    rs.close();
                    negPruebaEntrada.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                }      
                break;
            case 1:
                ClsNegocioInformeFinalCurso negInformeFinalCurso = new ClsNegocioInformeFinalCurso();
        
                switch(nivelUsuario){
                case "Usuario":
                    try {
                    rs  =negInformeFinalCurso.ConsultaInformeUsuario(criterio, busqueda,codDocente);

                    boolean encuentra = false;
                    String Campo[] = new String[5];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra .");
                    }
                    rs.close();
                    negInformeFinalCurso.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                case "Supervisor":            
                case "Administrador":
                    try {
                    rs  =negInformeFinalCurso.ConsultaInformeAdministrador(criterio, busqueda);

                    boolean encuentra = false;
                    String Campo[] = new String[8];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 
                        Campo[5] = (String) rs.getString(6); 
                        Campo[6] = (String) rs.getString(7); 
                        Campo[7] = (String) rs.getString(8); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra.");
                    }
                    rs.close();
                    negInformeFinalCurso.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                }      
                break;
            case 2:
                ClsNegocioPortafolio negPortafolio = new ClsNegocioPortafolio();
        
                switch(nivelUsuario){
                case "Usuario":
                    try {
                    rs  =negPortafolio.ConsultaInformeUsuario(criterio, busqueda,codDocente);

                    boolean encuentra = false;
                    String Campo[] = new String[6];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 
                        Campo[5] = (String) rs.getString(6); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra .");
                    }
                    rs.close();
                    negPortafolio.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                case "Supervisor":            
                case "Administrador":
                    try {
                    rs  =negPortafolio.ConsultaInformeAdministrador(criterio, busqueda);

                    boolean encuentra = false;
                    String Campo[] = new String[9];
                    int fila;
                    fila = dtm.getRowCount();
                    if (fila > 0) {
                        for (int i = 0; i < fila; i++) {
                            dtm.removeRow(0);
                        }
                    }
                    while (rs.next()) {
                        Campo[0] = (String) rs.getString(1); 
                        Campo[1] = (String) rs.getString(2); 
                        Campo[2] = (String) rs.getString(3); 
                        Campo[3] = (String) rs.getString(4); 
                        Campo[4] = (String) rs.getString(5); 
                        Campo[5] = (String) rs.getString(6); 
                        Campo[6] = (String) rs.getString(7); 
                        Campo[7] = (String) rs.getString(8); 
                        Campo[8] = (String) rs.getString(9); 

                        dtm.addRow(Campo);
                        encuentra = true;
                    }

                    if (encuentra == false) {
                        JOptionPane.showMessageDialog(null,"No se encuentra.");
                    }
                    rs.close();
                    negPortafolio.conexion.close();
                    } catch (Exception ex) {
                    }
                    break;
                }      
                break;
        }
    }
    
    private void definirTituloTabla(String nivelUsuario) {
        String tipoInforme = cmbTipoInforme.getSelectedItem().toString();
        switch(nivelUsuario){
        case "Usuario":
            if (tipoInforme.equals("Portafolio")) {
                String titulosUsuario[] = {"ID","Cod Curso","Curso","Fecha","Estado","Unidad"};
                dtm.setColumnIdentifiers(titulosUsuario);
            }else{
                String titulosUsuario[] = {"ID","Cod Curso","Curso","Fecha","Estado"};
                dtm.setColumnIdentifiers(titulosUsuario);
            }
            tblBuscar.setModel(dtm);
            break;
        case "Supervisor":
        case "Administrador":
            if (tipoInforme.equals("Portafolio")) {
                String titulosUsuario[] = {"ID","Cod Docente","Nombre","Semestre","Cod Curso","Curso","Fecha","Estado","Unidad"};
                dtm.setColumnIdentifiers(titulosUsuario);
            }else{
                String titulosAdministrador[] = {"ID","Cod Docente","Nombre","Semestre","Cod Curso","Curso","Fecha","Estado"};
                dtm.setColumnIdentifiers(titulosAdministrador);
            }
            tblBuscar.setModel(dtm);
            break;
        }
        
        
    }
    
    private void hacerReporte(String idReporte){
        int tipoInforme = cmbTipoInforme.getSelectedIndex();
        
        switch(tipoInforme){
            case 0:
                Map p = new HashMap();
                p.put("ID", idReporte);

                Connection cnx = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptInformePruebaEntrada.jrxml");
                    print = JasperFillManager.fillReport(report,p,cnx);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("Reporte Prueba Entrada");
                    view.setVisible(true);
                    cnx.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                Map p2 = new HashMap();
                
                p2.put("ID", Integer.parseInt(idReporte));

                Connection cnx2 = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptInformeFinalCurso.jrxml");
                    print = JasperFillManager.fillReport(report,p2,cnx2);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("Reporte Informe Final");
                    view.setVisible(true);
                    cnx2.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                Map p3 = new HashMap();
                
                p3.put("ID", Integer.parseInt(idReporte));

                Connection cnx3 = new ClsConexion().getConnection();

                try {           
                    JasperReport report;
                    JasperPrint print;
                    report = JasperCompileManager.compileReport("../SistemaInformesUPT/src/Reportes/RptPortafolio.jrxml");
                    print = JasperFillManager.fillReport(report,p3,cnx3);
                    JasperViewer view = new JasperViewer(print,false);
                    view.setTitle("Reporte Informe Final");
                    view.setVisible(true);
                    cnx3.close();
                } catch (JRException | SQLException ex) {
                    Logger.getLogger(FrmInformePruebaEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCriterio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        cmbTipoInforme = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReporte.setText("Ver reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPRIMIR REPORTES");

        jLabel2.setText("Buscar :");

        jLabel3.setText("Criterio :");

        cmbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Código Docente", "Nombre Docente", "Semestre", "Código Curso", "Nombre Curso", "Fecha" }));

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Cod Docente", "Cod Curso", "Curso"
            }
        ));
        jScrollPane1.setViewportView(tblBuscar);

        cmbTipoInforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prueba de entrada", "Informe Final", "Portafolio" }));
        cmbTipoInforme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoInformeItemStateChanged(evt);
            }
        });

        jLabel4.setText("Tipo de Informe :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(cmbTipoInforme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte)
                    .addComponent(btnSalir))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        definirTituloTabla(nivelUsuario);
        buscarPruebaEntrada(nivelUsuario,codDocente);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        if (tblBuscar.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(null,"Seleccione una fila");
        } else {
            String idReporte = (String) tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0);
            hacerReporte(idReporte);
        }        
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbTipoInformeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoInformeItemStateChanged
        String tipoInforme = cmbTipoInforme.getSelectedItem().toString();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (tipoInforme.equals("Portafolio")) {
                cmbCriterio.addItem("Unidad");
            }
        } else if(evt.getStateChange() == ItemEvent.DESELECTED){
            if (!tipoInforme.equals("Portafolio")) {
                cmbCriterio.removeItem("Unidad");
            }
        }
    }//GEN-LAST:event_cmbTipoInformeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCriterio;
    private javax.swing.JComboBox<String> cmbTipoInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
