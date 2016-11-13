
package Presentacion;

import javax.swing.JOptionPane;



public class FrmPrinicipal extends javax.swing.JFrame {

    public String codigoDocente;
    public String nivelUsuario;
   
    public FrmPrinicipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInformes = new javax.swing.JMenu();
        informePruebaEntrada = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        consultaPruebaEntrada = new javax.swing.JMenuItem();
        consultaFinalCurso = new javax.swing.JMenuItem();
        consultaFinalCursoDoc = new javax.swing.JMenuItem();
        consultaPortafolio = new javax.swing.JMenuItem();
        mnuImprimir = new javax.swing.JMenu();
        imprimirInformeAceptado = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMES");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        mnuInformes.setText("Informes");

        informePruebaEntrada.setText("Informes Restantes");
        informePruebaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informePruebaEntradaActionPerformed(evt);
            }
        });
        mnuInformes.add(informePruebaEntrada);

        jMenuBar1.add(mnuInformes);

        mnuConsultas.setText("Consultas");

        consultaPruebaEntrada.setText("Consulta informe prueba de entrada");
        consultaPruebaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPruebaEntradaActionPerformed(evt);
            }
        });
        mnuConsultas.add(consultaPruebaEntrada);

        consultaFinalCurso.setText("Consulta informe final de curso");
        mnuConsultas.add(consultaFinalCurso);

        consultaFinalCursoDoc.setText("Consulta informe final de curso - doc");
        mnuConsultas.add(consultaFinalCursoDoc);

        consultaPortafolio.setText("Consulta portafolio");
        mnuConsultas.add(consultaPortafolio);

        jMenuBar1.add(mnuConsultas);

        mnuImprimir.setText("Imprimir");

        imprimirInformeAceptado.setText("Imprimir Informe Aprobado");
        imprimirInformeAceptado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirInformeAceptadoActionPerformed(evt);
            }
        });
        mnuImprimir.add(imprimirInformeAceptado);

        jMenuBar1.add(mnuImprimir);

        mnuAyuda.setText("Ayuda");
        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
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

    private void consultaPruebaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPruebaEntradaActionPerformed
        FrmConsultaPruebaEntrada consultaInformePrueabaEntrada = new FrmConsultaPruebaEntrada(nivelUsuario,codigoDocente);
//        consultaInformePrueabaEntrada.cDocente = codigoDocente;
        escritorio.add(consultaInformePrueabaEntrada);
        consultaInformePrueabaEntrada.setVisible(true);
    }//GEN-LAST:event_consultaPruebaEntradaActionPerformed

    private void imprimirInformeAceptadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirInformeAceptadoActionPerformed
        FrmImprimirReporte imprimirReportes = new FrmImprimirReporte(nivelUsuario,codigoDocente);
//        consultaInformePrueabaEntrada.cDocente = codigoDocente;
        escritorio.add(imprimirReportes);
        imprimirReportes.setVisible(true);
    }//GEN-LAST:event_imprimirInformeAceptadoActionPerformed

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
    private javax.swing.JMenuItem consultaFinalCurso;
    private javax.swing.JMenuItem consultaFinalCursoDoc;
    private javax.swing.JMenuItem consultaPortafolio;
    private javax.swing.JMenuItem consultaPruebaEntrada;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem imprimirInformeAceptado;
    private javax.swing.JMenuItem informePruebaEntrada;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuImprimir;
    private javax.swing.JMenu mnuInformes;
    // End of variables declaration//GEN-END:variables
}
