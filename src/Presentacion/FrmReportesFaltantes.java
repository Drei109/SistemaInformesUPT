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
    
    public FrmReportesFaltantes() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

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
        jLabel1.setText("Reportes Restantes");

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

        jLabel2.setForeground(new java.awt.Color(47, 119, 236));
        jLabel2.setText("Lista de tus Reportes:");

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTerminar)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnTerminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        listarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        seleccionarTabla();
    }//GEN-LAST:event_btnTerminarActionPerformed
    
    void listarTabla(){
        String titulos[] = {"Id Curso",
                            "Nombre del Curso",
                            "Nombre del Docente"};
        
        try {
            ClsNegocioPruebaEntrada datos = new ClsNegocioPruebaEntrada();
            dato = datos.hacerInformePruebaFaltante(codDocente);//ArrayList

            Iterator iterator = dato.iterator();

            DefaultTableModel modeloTabla = new DefaultTableModel(null, titulos);

            String campo[] = new String[3];

            while (iterator.hasNext()) {
                ClsEntidadPruebaCursosFaltantes objenti = new ClsEntidadPruebaCursosFaltantes();

                objenti = (ClsEntidadPruebaCursosFaltantes) iterator.next();

                campo[0] = objenti.getIdCurso();
                campo[1] = objenti.getNombreCurso();
                campo[2] = objenti.getNombreDocente();

                modeloTabla.addRow(campo);
            }
            tablaF.setModel(modeloTabla);

            datos.conexion.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    void seleccionarTabla(){
        String campo[] = new String[9];
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
                    break;
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        FrmInformePruebaEntrada info = new FrmInformePruebaEntrada(campo);
        FrmPrinicipal.escritorio.add(info);
        info.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaF;
    // End of variables declaration//GEN-END:variables
}
