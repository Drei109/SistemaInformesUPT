
package Presentacion;

import javax.swing.JOptionPane;



public class FrmPrinicipal extends javax.swing.JFrame {

    public String codigoDocente;
    public String nombreDocente;
    public String nivelUsuario;
    public String unidadActiva;
   
    public FrmPrinicipal() {
        initComponents();        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        txtUnidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDocente = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInformes = new javax.swing.JMenu();
        informePruebaEntrada = new javax.swing.JMenuItem();
        mnuUnidad = new javax.swing.JMenu();
        mnuConsultas = new javax.swing.JMenu();
        consultaPruebaEntrada = new javax.swing.JMenuItem();
        mnuControlInformes = new javax.swing.JMenuItem();
        mnuControlInformesDocente = new javax.swing.JMenuItem();
        mnuImprimir = new javax.swing.JMenu();
        imprimirInformeAceptado = new javax.swing.JMenuItem();
        imprimirInformeCiclos = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMES");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        txtUnidad.setText("Unidad");

        jLabel1.setText("Unidad activa:");

        txtDocente.setText("Docente");

        mnuInformes.setText("Informes");

        informePruebaEntrada.setText("Informes Restantes");
        informePruebaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informePruebaEntradaActionPerformed(evt);
            }
        });
        mnuInformes.add(informePruebaEntrada);

        jMenuBar1.add(mnuInformes);

        mnuUnidad.setText("Unidad");
        mnuUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuUnidadMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuUnidad);

        mnuConsultas.setText("Consultas");

        consultaPruebaEntrada.setText("Consulta informes");
        consultaPruebaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPruebaEntradaActionPerformed(evt);
            }
        });
        mnuConsultas.add(consultaPruebaEntrada);

        mnuControlInformes.setText("Control informes");
        mnuControlInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControlInformesActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuControlInformes);

        mnuControlInformesDocente.setText("Control informes Cursos");
        mnuControlInformesDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControlInformesDocenteActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuControlInformesDocente);

        jMenuBar1.add(mnuConsultas);

        mnuImprimir.setText("Imprimir");

        imprimirInformeAceptado.setText("Imprimir Informe Aprobado");
        imprimirInformeAceptado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirInformeAceptadoActionPerformed(evt);
            }
        });
        mnuImprimir.add(imprimirInformeAceptado);

        imprimirInformeCiclos.setText("Imprimir Informe por Ciclos");
        imprimirInformeCiclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirInformeCiclosActionPerformed(evt);
            }
        });
        mnuImprimir.add(imprimirInformeCiclos);

        jMenuBar1.add(mnuImprimir);

        mnuAyuda.setText("Ayuda");
        jMenuBar1.add(mnuAyuda);

        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(escritorio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidad)
                    .addComponent(jLabel1)
                    .addComponent(txtDocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void informePruebaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informePruebaEntradaActionPerformed
          FrmReportesFaltantes reporteFaltante = new FrmReportesFaltantes(this.nivelUsuario);
          reporteFaltante.codDocente = codigoDocente;
          reporteFaltante.reporteAbierto = "Entrada";
          escritorio.add(reporteFaltante);
          reporteFaltante.setVisible(true);
    }//GEN-LAST:event_informePruebaEntradaActionPerformed

    private void imprimirInformeAceptadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirInformeAceptadoActionPerformed
        FrmImprimirReporte imprimirReportes = new FrmImprimirReporte(nivelUsuario,codigoDocente);
//        consultaInformePrueabaEntrada.cDocente = codigoDocente;
        escritorio.add(imprimirReportes);
        imprimirReportes.setVisible(true);
    }//GEN-LAST:event_imprimirInformeAceptadoActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        this.dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void consultaPruebaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPruebaEntradaActionPerformed
        FrmConsultaPruebaEntrada consultaInformePrueabaEntrada = new FrmConsultaPruebaEntrada(nivelUsuario,codigoDocente);
//        consultaInformePrueabaEntrada.cDocente = codigoDocente;
        escritorio.add(consultaInformePrueabaEntrada);
        consultaInformePrueabaEntrada.setVisible(true);
    }//GEN-LAST:event_consultaPruebaEntradaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtUnidad.setText(unidadActiva);
        txtDocente.setText(nombreDocente);
        if (nivelUsuario.equals("Usuario")) {
            mnuControlInformes.setVisible(false);
            mnuUnidad.setVisible(false);
            imprimirInformeCiclos.setVisible(false);
        }
        if (nivelUsuario.equals("Administrador") || nivelUsuario.equals("Supervisor")) {
            mnuControlInformesDocente.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnuControlInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControlInformesActionPerformed
        FrmControlInformes controlReportes = new FrmControlInformes(nivelUsuario,codigoDocente);
        escritorio.add(controlReportes);
        controlReportes.setVisible(true);
    }//GEN-LAST:event_mnuControlInformesActionPerformed

    private void mnuControlInformesDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControlInformesDocenteActionPerformed
        FrmControlInformesDocente controlReportesDoc = new FrmControlInformesDocente(nivelUsuario,codigoDocente);
        escritorio.add(controlReportesDoc);
        controlReportesDoc.setVisible(true);
    }//GEN-LAST:event_mnuControlInformesDocenteActionPerformed

    private void mnuUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuUnidadMouseClicked
        FrmUnidad uni = new FrmUnidad();
        escritorio.add(uni);
        uni.setVisible(true);
    }//GEN-LAST:event_mnuUnidadMouseClicked

    private void imprimirInformeCiclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirInformeCiclosActionPerformed
        FrmReporteInformesCiclos repo = new FrmReporteInformesCiclos();
        escritorio.add(repo);
        repo.setVisible(true);
    }//GEN-LAST:event_imprimirInformeCiclosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrinicipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultaPruebaEntrada;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem imprimirInformeAceptado;
    private javax.swing.JMenuItem imprimirInformeCiclos;
    private javax.swing.JMenuItem informePruebaEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuItem mnuControlInformes;
    private javax.swing.JMenuItem mnuControlInformesDocente;
    private javax.swing.JMenu mnuImprimir;
    private javax.swing.JMenu mnuInformes;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuUnidad;
    private javax.swing.JLabel txtDocente;
    private javax.swing.JLabel txtUnidad;
    // End of variables declaration//GEN-END:variables
}
