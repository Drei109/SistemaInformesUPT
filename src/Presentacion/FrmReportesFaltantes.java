package Presentacion;

import Entidad.ClsEntidadPruebaCursosFaltantes;
import Entidad.ClsEntidadPruebaEntrada;
import Negocio.ClsNegocioPruebaEntrada;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzocv
 */
public class FrmReportesFaltantes extends javax.swing.JInternalFrame {

    public String codDocente;
    public String reporteAbierto;
    public ArrayList<ClsNegocioPruebaEntrada> dato = null;
    public String nivelUsuario;
    
    public FrmReportesFaltantes() {
        initComponents();
    }
    public FrmReportesFaltantes(String nivelusu) {
        initComponents();
        this.nivelUsuario = nivelusu;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();
        btnTerminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoReporte = new javax.swing.JComboBox<>();
        btnListarTabla = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Reportes faltantes");
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 119, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTES FALTANTES");

        tablaF.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaF);

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de Reporte:");

        cmbTipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prueba Entrada", "Informe Final Curso", "Portafolio" }));

        btnListarTabla.setText("Listar Tabla");
        btnListarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 209, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnListarTabla)
                    .addComponent(cmbTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerminar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        listarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        seleccionarTabla();
        this.dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTablaActionPerformed
        listarTabla();
    }//GEN-LAST:event_btnListarTablaActionPerformed
    
    void listarTabla(){
        
        String tipoInforme = (String) cmbTipoReporte.getSelectedItem();
        if ("Portafolio".equals(tipoInforme)) {
            String titulos[] = {"Id Curso",
                            "Nombre del Curso",
                            "Nombre del Docente",
                            "Unidad por hacer","idUnidad","Sección"};
            try {
                ClsNegocioPruebaEntrada datos = new ClsNegocioPruebaEntrada();
                String busqueda = cmbTipoReporte.getSelectedItem().toString();
                dato = datos.hacerInformePruebaFaltante(codDocente,busqueda);//ArrayList

                Iterator iterator = dato.iterator();

                DefaultTableModel modeloTabla = new DefaultTableModel(null, titulos);

                String campo[] = new String[6];
                String nombreUnidad = "";

                while (iterator.hasNext()) {
                    ClsEntidadPruebaCursosFaltantes objenti = new ClsEntidadPruebaCursosFaltantes();

                    objenti = (ClsEntidadPruebaCursosFaltantes) iterator.next();

                    campo[0] = objenti.getIdCurso();
                    campo[1] = objenti.getNombreCurso();
                    campo[2] = objenti.getNombreDocente();
                    
//                    
//                    if(objenti.getIdUnidad() != null){
//                        nombreUnidad = "Unidad I";
//                    }
                    switch(objenti.getIdUnidad()){
                        case 0:
                            nombreUnidad = "Unidad I";
                            break;
                        case 1:
                            nombreUnidad = "Unidad II";
                            break;
                        case 2:
                            nombreUnidad = "Unidad III";
                            break;
                    }
                    
                    campo[3] = nombreUnidad;
                    campo[4] = String.valueOf(objenti.getIdUnidad());
                    campo[5] = objenti.getSeccion();
                    
                    if(objenti.getIdUnidad() < Integer.parseInt(objenti.getCuentaCarga())){
                        modeloTabla.addRow(campo);                        
                    }
                }
                tablaF.setModel(modeloTabla);
                tablaF.removeColumn(tablaF.getColumnModel().getColumn(4));
                datos.conexion.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String titulos[] = {"Id Curso",
                            "Nombre del Curso",
                            "Nombre del Docente",
                            "Sección"};
        
            try {
                ClsNegocioPruebaEntrada datos = new ClsNegocioPruebaEntrada();
                String busqueda = cmbTipoReporte.getSelectedItem().toString();
                dato = datos.hacerInformePruebaFaltante(codDocente,busqueda);//ArrayList

                Iterator iterator = dato.iterator();

                DefaultTableModel modeloTabla = new DefaultTableModel(null, titulos);

                String campo[] = new String[4];

                while (iterator.hasNext()) {
                    ClsEntidadPruebaCursosFaltantes objenti = new ClsEntidadPruebaCursosFaltantes();

                    objenti = (ClsEntidadPruebaCursosFaltantes) iterator.next();

                    campo[0] = objenti.getIdCurso();
                    campo[1] = objenti.getNombreCurso();
                    campo[2] = objenti.getNombreDocente();
                    campo[3] = objenti.getSeccion();

                    modeloTabla.addRow(campo);
                }
                tablaF.setModel(modeloTabla);
                datos.conexion.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }       
    }
    
    void seleccionarTabla(){
        String campo[] = new String[15];
        String tipoReporte = cmbTipoReporte.getSelectedItem().toString();
        if (tablaF.getSelectedRow() >= 0) {
            try {
                Iterator iterator = dato.iterator();

                int filaS = tablaF.getSelectedRow();

                while (iterator.hasNext()) {
                    ClsEntidadPruebaCursosFaltantes objenti = new ClsEntidadPruebaCursosFaltantes();

                    objenti = (ClsEntidadPruebaCursosFaltantes) iterator.next();

                    if (tablaF.getValueAt(filaS, 0) == objenti.getIdCurso()) {
                        campo[0] = objenti.getIdCurso();
                        campo[1] = objenti.getNombreCurso();
                        campo[2] = String.valueOf(objenti.getHorasTeoricas());
                        campo[3] = String.valueOf(objenti.getHoraPracticas());
                        campo[4] = String.valueOf(objenti.getAlumnosMatriculados());
                        campo[5] = String.valueOf(objenti.getAlumnosRetirados());
                        campo[6] = String.valueOf(objenti.getAlumnosAbandono());
                        campo[7] = String.valueOf(objenti.getCodigoDocente());
                        campo[8] = String.valueOf(objenti.getNombreDocente());
                        campo[9] = objenti.getEmailDocente();
                        campo[10]= objenti.getCeluDocente();
                        campo[11]= objenti.getSeccion();
                        if(tipoReporte.equals("Portafolio")){
                            campo[12] = (String) tablaF.getValueAt(filaS,3);
                            campo[13] = (String) tablaF.getModel().getValueAt(filaS,4);
                            campo[14] = objenti.getCargaAcademica();
                        }
                        break;
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            
            if (tipoReporte.equals("Prueba Entrada")) {
                FrmInformePruebaEntrada info = new FrmInformePruebaEntrada(campo,true,nivelUsuario);
                FrmPrinicipal.escritorio.add(info);
                info.setVisible(true);
                this.dispose();
            }
            else if (tipoReporte.equals("Informe Final Curso")) {
//                FrmInformeFinalCurso info = new FrmInformeFinalCurso(campo,true,nivelUsuario);
//                FrmPrinicipal.escritorio.add(info);
                FrmPrueba info = new FrmPrueba(campo,true,nivelUsuario,codDocente);
                FrmPrinicipal.escritorio.add(info);
                info.setVisible(true);
                this.dispose();
            }
            else if (tipoReporte.equals("Portafolio")) {
//                FrmInformeFinalCurso info = new FrmInformeFinalCurso(campo,true,nivelUsuario);
//                FrmPrinicipal.escritorio.add(info);
                FrmPortafolio info = new FrmPortafolio(campo,true,nivelUsuario,codDocente);
                FrmPrinicipal.escritorio.add(info);
                info.setVisible(true);
                this.dispose();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione un Curso.");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> cmbTipoReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaF;
    // End of variables declaration//GEN-END:variables
}
