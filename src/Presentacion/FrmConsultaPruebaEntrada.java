/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.ClsEntidadPruebaCursosFaltantes;
import Negocio.ClsNegocioInformeFinalCurso;
import Negocio.ClsNegocioPruebaEntrada;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Drei
 */
public class FrmConsultaPruebaEntrada extends javax.swing.JInternalFrame {

    static ResultSet rs = null;
    DefaultTableModel dtm = new DefaultTableModel();
    String nivelUsuario = "";
    String codDocente = "";
    String idPruebaEntradaMod ;
    String idCargaAcedemicaMod;
//    public ArrayList<ClsNegocioPruebaEntrada> dato;
    
    public FrmConsultaPruebaEntrada(String nivelUsuario,String codDocente) {
        initComponents();
        this.codDocente = codDocente;
        this.nivelUsuario = nivelUsuario;
        definirTituloTabla(nivelUsuario);
        cargarCombo(nivelUsuario);
        buscarPruebaEntrada(nivelUsuario,codDocente);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCriterio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbTipoInforme = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTA PRUEBA ENTRADA");

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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBuscar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbTipoInforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prueba Entrada", "Informe Final" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(cmbTipoInforme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(btnSalir))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPruebaEntrada(nivelUsuario,codDocente);        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        abrirFrmInformePruebaEntrada(); 
        this.dispose();
    }//GEN-LAST:event_btnVerActionPerformed

    private void abrirFrmInformePruebaEntrada(){
        String idPruebaEntrada = (String) tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0);
        String campo[] = new String[25];
        if (tblBuscar.getSelectedRow() >= 0) {
            if (cmbTipoInforme.getSelectedItem().toString().equals("Prueba Entrada")) {
                try {

                    ClsNegocioPruebaEntrada negNegocioPruebaEntrada = new ClsNegocioPruebaEntrada();
                    ArrayList<String> pruebaEntrada = negNegocioPruebaEntrada.seleccionarPruebaEntrada(idPruebaEntrada);
                    campo = pruebaEntrada.toArray(new String[pruebaEntrada.size()]);
    //                idPruebaEntradaMod = campo[0];
    //                idCargaAcedemicaMod = campo[11];
                    negNegocioPruebaEntrada.conexion.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                FrmInformePruebaEntrada info = new FrmInformePruebaEntrada(campo,false,nivelUsuario);
                FrmPrinicipal.escritorio.add(info);
                info.setVisible(true);
            }
            else if (cmbTipoInforme.getSelectedItem().toString().equals("Informe Final")) {
                try {
                    ClsNegocioInformeFinalCurso negoInfo = new ClsNegocioInformeFinalCurso();
                    ArrayList<String> informe = negoInfo.seleccionarInforCurso(idPruebaEntrada);
                    campo = informe.toArray(new String[informe.size()]);
    //                idPruebaEntradaMod = campo[0];
    //                idCargaAcedemicaMod = campo[11];
                    negoInfo.conexion.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                FrmInformeFinalCurso info = new FrmInformeFinalCurso(campo,false,nivelUsuario);
                FrmPrinicipal.escritorio.add(info);
                info.setVisible(true);
            }
        }        
    }
    
    private void cargarCombo(String nivelUsuario){
        switch(nivelUsuario){
        case "Usuario":
            cmbCriterio.removeAllItems();
            cmbCriterio.addItem("Todos");
            cmbCriterio.addItem("Código Curso");
            cmbCriterio.addItem("Nombre Curso");
            cmbCriterio.addItem("Fecha");
            cmbCriterio.addItem("Estado");
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
            cmbCriterio.addItem("Estado");
            break;
        }
    }
    
    private void buscarPruebaEntrada(String nivelUsuario,String codDocente){
     String tipoInforme = cmbTipoInforme.getSelectedItem().toString();
        if (tipoInforme.equals("Prueba Entrada")) {
            pruebaEntrada(nivelUsuario, codDocente);
        }
        else if(tipoInforme.equals("Informe Final")){
            informeFinal(nivelUsuario, codDocente);
        }
    }
    
    private void definirTituloTabla(String nivelUsuario) {
        
        switch(nivelUsuario){
        case "Usuario":
            String titulosUsuario[] = {"ID","Cod Curso","Curso","Fecha","Estado"};
            dtm.setColumnIdentifiers(titulosUsuario);
            tblBuscar.setModel(dtm);
            break;
        case "Supervisor":
        case "Administrador":
            String titulosAdministrador[] = {"ID","Cod Docente","Nombre","Semestre","Cod Curso","Curso","Fecha","Estado"};
            dtm.setColumnIdentifiers(titulosAdministrador);
            tblBuscar.setModel(dtm);
            break;
        }
        
        
    }
    
    private void pruebaEntrada(String nivelUsuario,String codDocente){
        ClsNegocioPruebaEntrada negPruebaEntrada = new ClsNegocioPruebaEntrada();
        
        String criterio = cmbCriterio.getSelectedItem().toString();
//        JOptionPane.showMessageDialog(null, criterio);
        String busqueda = txtBuscar.getText();
             
        switch(nivelUsuario){
        case "Usuario":
            try {
            rs  =negPruebaEntrada.ConsultaAvanzaPruebaEntradaUsuario(criterio, busqueda,codDocente);

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
                JOptionPane.showMessageDialog(null,"No se encuentra.");
            }
            rs.close();
            negPruebaEntrada.conexion.close();
            } catch (Exception ex) {
            }
            break;
        case "Supervisor":            
        case "Administrador":
            try {
            rs  =negPruebaEntrada.ConsultaAvanzaPruebaEntrada(criterio, busqueda);

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
    }
    
    private void informeFinal(String nivelUsuario,String codDocente){
        ClsNegocioInformeFinalCurso negFinal = new ClsNegocioInformeFinalCurso();
        
        String criterio = cmbCriterio.getSelectedItem().toString();
//        JOptionPane.showMessageDialog(null, criterio);
        String busqueda = txtBuscar.getText();
             
        switch(nivelUsuario){
        case "Usuario":
            try {
            rs  =negFinal.ConsultaAvanzaInfoFinalUsuario(criterio, busqueda,codDocente);

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
                JOptionPane.showMessageDialog(null,"No se encuentra.");
            }
            rs.close();
            negFinal.conexion.close();
            } catch (Exception ex) {
            }
            break;
        case "Supervisor":            
        case "Administrador":
            try {
            rs  =negFinal.ConsultaAvanzaInformeFinal(criterio, busqueda);

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
            negFinal.conexion.close();
            } catch (Exception ex) {
            }
            break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cmbCriterio;
    private javax.swing.JComboBox<String> cmbTipoInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
