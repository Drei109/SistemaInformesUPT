package Presentacion;

import Entidad.ClsEntidadCacidadInformeFinalCurso;
import Entidad.ClsEntidadInformeFinalCurso;
import Entidad.ClsEntidadObservaFinalCurso;
import Negocio.ClsNegocioCapadidadInformeFinalCurso;
import Negocio.ClsNegocioInformeFinalCurso;
import Negocio.ClsNegocioObservacionesInformeFinalCurso;
import Negocio.ClsNegocioUsuario;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author enzocv
 */
public class FrmPrueba extends javax.swing.JInternalFrame {

    /*INFORME FINAL | VARIABLES*/
    public String[] datoIFC = null;
    boolean guardarNuevo = false;
    boolean guardadoF = false;
    boolean actualizaF = false;
    boolean calculadoPorcentajes = false;
    public String nivelUsuario;
    String idCargaAcademica;
    
    /*CAPACIDADES | VARIABLES*/
    int contador = 0;
    ArrayList<String> LogrosCapacidades = new ArrayList<>();
    int filaSeleccionada = -2;
    boolean filaRemovida = false;
//    boolean guardarNuevo = true;
    String IdInfoFinalCurso = "";
    String TOdosIDFinalCurso[] = new String[50];
    
    /*OBSERVACIONES | VARIABLES*/
    int idObservacion[];
    String tituloObservacion[];
    String subTituloObservacion[];
//    String IdInfoFinalCurso = "";
    
    String observa1 = "Ninguna";
    String observa2 = "Ninguna";
    String observa3 = "Ninguna";
    String material = "No", foros = "No", cuestionarios = "No", examenes = "No",
                    tareas = "No", ppt="No";       
    String observa5 = "Ninguna";
    String observa6 = "Ninguna";
    String observa7 = "Ninguna";
    String observa8 = "Ninguna";
    String observa9 = "Ninguna";
    
    public FrmPrueba() {
        initComponents();
    }
    
    public FrmPrueba(String[] datoRF, boolean guardarNuevo,String nivelusu){
        initComponents();
        this.datoIFC = datoRF;
        this.guardarNuevo = guardarNuevo;
        this.nivelUsuario = nivelusu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnGuardarInforme = new javax.swing.JButton();
        btnEnviarInforme = new javax.swing.JButton();
        btnAceptarInforme = new javax.swing.JButton();
        btnRechazarInforme = new javax.swing.JButton();
        btnCancelarInforme = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumCumpliSilabo = new javax.swing.JTextField();
        txtNumPractiCalificada = new javax.swing.JTextField();
        txtNumExpeLaboratorio = new javax.swing.JTextField();
        txtNumTrabajoInvestiga = new javax.swing.JTextField();
        txtNumMatriculados = new javax.swing.JTextField();
        txtNumRetirados = new javax.swing.JTextField();
        txtNumAbandono = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPorcenCumpleSilabo = new javax.swing.JTextField();
        txtPorcenPractiCalificada = new javax.swing.JTextField();
        txtPorcenExpeLaboratorio = new javax.swing.JTextField();
        txtPorcenTrabajoInvestiga = new javax.swing.JTextField();
        txtPorcenMatriculados = new javax.swing.JTextField();
        txtPorcenRetirados = new javax.swing.JTextField();
        txtPorcenAbandono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNumBaja = new javax.swing.JTextField();
        txtNumNotaPromedio = new javax.swing.JTextField();
        txtNumNotaAlta = new javax.swing.JTextField();
        txtNumDesaprobados = new javax.swing.JTextField();
        txtNumAprobados = new javax.swing.JTextField();
        txtNumAsisten = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtPorcenAsisten = new javax.swing.JTextField();
        txtPorcenAprobados = new javax.swing.JTextField();
        txtPorcenDesaprobados = new javax.swing.JTextField();
        btnCalcularPorcentajes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSecCurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        chkTeoriaCursoInforme = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        chkPractCursoInforme = new javax.swing.JCheckBox();
        chkLabCursoInforme = new javax.swing.JCheckBox();
        chkTallerCursoInforme = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JTextField();
        txtEmailDocente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelularDocente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnRemoverFila = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCapacidades = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarFila = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnSalirCapacidad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnGuardarCapacidad = new javax.swing.JButton();
        btnEnviarCapacidad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObserva3 = new javax.swing.JTextArea();
        titulo4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        titulo9 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObserva9 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtObserva1 = new javax.swing.JTextArea();
        titulo5 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtObserva5 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtObserva2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtObserva6 = new javax.swing.JTextArea();
        titulo6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtObserva7 = new javax.swing.JTextArea();
        titulo7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnGuardarObservaciones = new javax.swing.JButton();
        btnEnviarObservaciones = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtObserva8 = new javax.swing.JTextArea();
        titulo8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        chkMaterial = new javax.swing.JCheckBox();
        chkForos = new javax.swing.JCheckBox();
        chkCuestionarios = new javax.swing.JCheckBox();
        chkExamenes = new javax.swing.JCheckBox();
        chkTareas = new javax.swing.JCheckBox();
        chkPresentaciones = new javax.swing.JCheckBox();

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

        jLabel1.setText("UNIVERSIDAD PRIVADA DE TACNA");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        btnGuardarInforme.setText("Guardar");
        btnGuardarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInformeActionPerformed(evt);
            }
        });

        btnEnviarInforme.setText("Enviar");
        btnEnviarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarInformeActionPerformed(evt);
            }
        });

        btnAceptarInforme.setText("Aceptar");
        btnAceptarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarInformeActionPerformed(evt);
            }
        });

        btnRechazarInforme.setText("Rechazar");
        btnRechazarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarInformeActionPerformed(evt);
            }
        });

        btnCancelarInforme.setText("Cancelar");
        btnCancelarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnGuardarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEnviarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRechazarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarInforme)
                    .addComponent(btnEnviarInforme)
                    .addComponent(btnAceptarInforme)
                    .addComponent(btnRechazarInforme)
                    .addComponent(btnCancelarInforme))
                .addContainerGap())
        );

        jLabel2.setText("FACULTAD DE INGENIERIA ");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        jLabel12.setText("Porcentaje de cumplimiento del silabo:");

        jLabel13.setText("Practicas calificadas realizadas:");

        jLabel14.setText("Experiencias de laboratorio realizadas: ");

        jLabel15.setText("Proyectos y/o trabajos de investigación realizados:");

        jLabel16.setText("Estudiantes matriculados:");

        jLabel17.setText("Estudiantes retirados:");

        jLabel18.setText("Estudiantes con abandono:");

        txtNumMatriculados.setEnabled(false);

        txtNumRetirados.setEnabled(false);

        txtNumAbandono.setEnabled(false);

        jLabel19.setText("RESUMEN DEL CURSO");

        jLabel20.setText("N°");

        txtPorcenCumpleSilabo.setEnabled(false);

        txtPorcenPractiCalificada.setEnabled(false);

        txtPorcenExpeLaboratorio.setEnabled(false);

        txtPorcenTrabajoInvestiga.setEnabled(false);

        txtPorcenMatriculados.setEnabled(false);

        txtPorcenRetirados.setEnabled(false);

        txtPorcenAbandono.setEnabled(false);

        jLabel21.setText("%");

        jLabel22.setText("Estudiantes que asisten:");

        jLabel23.setText("Estudiantes aprobados:");

        jLabel24.setText("Estudiantes desaprobados:");

        jLabel25.setText("Nota final mas alta:");

        jLabel26.setText("Nota final promedio:");

        jLabel27.setText("Nota final mas baja:");

        jLabel28.setText("N°");

        jLabel29.setText("%");

        txtPorcenAsisten.setEnabled(false);

        txtPorcenAprobados.setEnabled(false);

        txtPorcenDesaprobados.setEnabled(false);

        btnCalcularPorcentajes.setText("Calcular Porcentejes");
        btnCalcularPorcentajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPorcentajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel20))
                    .addComponent(txtNumTrabajoInvestiga, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txtNumMatriculados)
                    .addComponent(txtNumRetirados)
                    .addComponent(txtNumPractiCalificada)
                    .addComponent(txtNumCumpliSilabo)
                    .addComponent(txtNumAbandono)
                    .addComponent(txtNumExpeLaboratorio))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPorcenCumpleSilabo)
                            .addComponent(txtPorcenPractiCalificada)
                            .addComponent(txtPorcenExpeLaboratorio)
                            .addComponent(txtPorcenTrabajoInvestiga)
                            .addComponent(txtPorcenMatriculados)
                            .addComponent(txtPorcenRetirados)
                            .addComponent(txtPorcenAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(btnCalcularPorcentajes)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel28))
                    .addComponent(txtNumNotaAlta)
                    .addComponent(txtNumNotaPromedio)
                    .addComponent(txtNumBaja)
                    .addComponent(txtNumAprobados)
                    .addComponent(txtNumDesaprobados, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txtNumAsisten))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcenAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel29)))
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumNotaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumNotaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNumCumpliSilabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenCumpleSilabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNumPractiCalificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenPractiCalificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNumExpeLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenExpeLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNumTrabajoInvestiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenTrabajoInvestiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNumMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtNumRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNumAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcenAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularPorcentajes))
                .addContainerGap())
        );

        jLabel3.setText("Escuela Profesional de Ingeniería de Sistemas");

        lblSemestre.setText("INFORME FINAL DEL CURSO");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        jLabel5.setText("Codigo Curso :");

        txtCodigoCurso.setEnabled(false);

        jLabel6.setText("Sec. :");

        jLabel7.setText("Nombre del Curso :");

        txtNombreCurso.setEnabled(false);

        chkTeoriaCursoInforme.setText("Teoría");

        jLabel8.setText("Tipo :");

        chkPractCursoInforme.setText("Pract");

        chkLabCursoInforme.setText("Lab");

        chkTallerCursoInforme.setText("Taller");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtCodigoCurso))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCurso)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSecCurso)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(chkTeoriaCursoInforme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPractCursoInforme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkLabCursoInforme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkTallerCursoInforme)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(124, 124, 124))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkTeoriaCursoInforme)
                            .addComponent(chkPractCursoInforme)
                            .addComponent(chkLabCursoInforme)
                            .addComponent(chkTallerCursoInforme)
                            .addComponent(txtSecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        jLabel9.setText("Nombre Docente :");

        jLabel10.setText("E-mail Personal :");

        txtNombreDocente.setEnabled(false);
        txtNombreDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDocenteActionPerformed(evt);
            }
        });

        txtEmailDocente.setEnabled(false);

        jLabel11.setText("Celular :");

        txtCelularDocente.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreDocente)
                    .addComponent(txtEmailDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtCelularDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtCelularDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lblSemestre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSemestre)
                .addGap(11, 11, 11)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe Final Curso", jPanel1);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        btnRemoverFila.setText("Remover fila");
        btnRemoverFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFilaActionPerformed(evt);
            }
        });

        TablaCapacidades.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCapacidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaCapacidadesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCapacidades);

        jLabel4.setText("Logros de Capacidades del Curso:");

        btnAgregarFila.setText("Agregar fila");
        btnAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(btnAgregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoverFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemoverFila)
                        .addComponent(btnAgregarFila))
                    .addContainerGap()))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        jLabel30.setText("Cuál cree que ha sido el motivo por el cual los estudiantes no alcanzaron el logro de capacidades");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        btnSalirCapacidad.setText("Salir");
        btnSalirCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCapacidadActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        btnGuardarCapacidad.setText("Guardar");
        btnGuardarCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCapacidadActionPerformed(evt);
            }
        });

        btnEnviarCapacidad.setText("Enviar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnSalirCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEnviarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnGuardarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCapacidad)
                    .addComponent(btnEnviarCapacidad)
                    .addComponent(btnSalirCapacidad)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capacidades", jPanel2);

        titulo3.setText("jLabel2");

        txtObserva3.setColumns(20);
        txtObserva3.setRows(5);
        jScrollPane3.setViewportView(txtObserva3);

        titulo4.setText("jLabel2");

        jLabel32.setText("Observaciones:");

        titulo9.setText("jLabel2");

        titulo1.setText("jLabel2");

        txtObserva9.setColumns(20);
        txtObserva9.setRows(5);
        jScrollPane5.setViewportView(txtObserva9);

        txtObserva1.setColumns(20);
        txtObserva1.setRows(5);
        jScrollPane10.setViewportView(txtObserva1);

        titulo5.setText("jLabel2");

        titulo2.setText("jLabel3");

        txtObserva5.setColumns(20);
        txtObserva5.setRows(5);
        jScrollPane6.setViewportView(txtObserva5);

        txtObserva2.setColumns(20);
        txtObserva2.setRows(5);
        jScrollPane11.setViewportView(txtObserva2);

        txtObserva6.setColumns(20);
        txtObserva6.setRows(5);
        jScrollPane7.setViewportView(txtObserva6);

        titulo6.setText("jLabel2");

        txtObserva7.setColumns(20);
        txtObserva7.setRows(5);
        jScrollPane8.setViewportView(txtObserva7);

        titulo7.setText("jLabel2");

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        btnGuardarObservaciones.setText("Guardar");
        btnGuardarObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarObservacionesActionPerformed(evt);
            }
        });

        btnEnviarObservaciones.setText("Enviar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardarObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviarObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarObservaciones)
                    .addComponent(btnEnviarObservaciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtObserva8.setColumns(20);
        txtObserva8.setRows(5);
        jScrollPane9.setViewportView(txtObserva8);

        titulo8.setText("jLabel2");

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        chkMaterial.setText("Material Curso");

        chkForos.setText("Foros");

        chkCuestionarios.setText("Cuestionarios");

        chkExamenes.setText("Examenes Virtuales");

        chkTareas.setText("Tareas");

        chkPresentaciones.setText("Presentaciones");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMaterial)
                    .addComponent(chkForos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkExamenes)
                    .addComponent(chkCuestionarios))
                .addGap(41, 41, 41)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTareas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkPresentaciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMaterial)
                    .addComponent(chkCuestionarios)
                    .addComponent(chkTareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkForos)
                    .addComponent(chkExamenes)
                    .addComponent(chkPresentaciones))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo4)
                    .addComponent(titulo3)
                    .addComponent(titulo2)
                    .addComponent(titulo1)
                    .addComponent(jLabel32)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane11)
                    .addComponent(jScrollPane10)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo9)
                    .addComponent(titulo8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1)
                    .addComponent(titulo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2)
                    .addComponent(titulo6))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo3)
                    .addComponent(titulo7))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo4)
                    .addComponent(titulo8))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(titulo9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Observaciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInformeActionPerformed
        if (validarFormulario()) {
            if (guardarNuevo) {
                String opcion = "Guardado";
                guardarDatos(opcion);
                guardadoF = true;
            }
            else{
                /*actualizas*/
                String opcion = "Guardado";
                actualizarDatos(opcion);
                actualizaF = true;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
        }

    }//GEN-LAST:event_btnGuardarInformeActionPerformed

    private void btnEnviarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarInformeActionPerformed
        if (validarFormulario()) {
            if (guardarNuevo) {
                String opcion = "Enviado";
                guardarDatos(opcion);
                guardadoF = true;
            }
            else{
                actualizarDatos("Enviado");
                actualizaF = true;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
        }
    }//GEN-LAST:event_btnEnviarInformeActionPerformed

    private void btnCancelarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInformeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarInformeActionPerformed

    private void btnCalcularPorcentajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPorcentajesActionPerformed
    
        if (!txtNumMatriculados.getText().equals("")) {
            double matriculados = Double.parseDouble(txtNumMatriculados.getText());
            double porcentajeTotal = 0.0;
            if (matriculados >= 1) {
                porcentajeTotal = ((matriculados / matriculados) *100); 	  
                txtPorcenMatriculados.setText(""+porcentajeTotal);
            }
            else{
                txtPorcenMatriculados.setText("0");
            }
            if (!txtNumRetirados.getText().equals("") && !txtNumAbandono.getText().equals("") &&
                !txtNumAsisten.getText().equals("") && !txtNumAprobados.getText().equals("") &&
                !txtNumDesaprobados.getText().equals("")) {
                
                double retirados = Double.parseDouble(txtNumRetirados.getText());
                double abandono = Double.parseDouble(txtNumAbandono.getText());
                double asisten = Double.parseDouble(txtNumAsisten.getText());
                double aprobados = Double.parseDouble(txtNumAprobados.getText());
                double desaprobados = Double.parseDouble(txtNumDesaprobados.getText());
                
                if (!(asisten > matriculados || asisten < 0)) {
                    if ((aprobados + desaprobados) <= asisten && (aprobados + desaprobados) > 0 && aprobados >= 0 && desaprobados >= 0) {
                        DecimalFormat df = new DecimalFormat("#0.0");
                        
                        txtPorcenRetirados.setText( ""+(retirados * porcentajeTotal)/matriculados);
                        txtPorcenAbandono.setText( ""+(abandono * porcentajeTotal)/matriculados);
                        txtPorcenAsisten.setText( ""+(asisten * porcentajeTotal)/matriculados);
                        double asis = Double.parseDouble(txtPorcenAsisten.getText());
                        txtPorcenAsisten.setText( ""+df.format((asisten * porcentajeTotal)/matriculados));
                        
                        
//                        double porcentajeAsisten = asis;
//                        df.format(porcentajeAsisten);
                        txtPorcenAprobados.setText(df.format((aprobados * asis)/asisten));
                        txtPorcenDesaprobados.setText(df.format((desaprobados * asis)/asisten));

                        calculadoPorcentajes = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cantidad de aprobados y desaprobados no coinciden");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Alumnos Asistentes mayores a los Matriculados");
                }
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Faltan Datos.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Numero de Matriculados NULO");
        }
    }//GEN-LAST:event_btnCalcularPorcentajesActionPerformed

    private void txtNombreDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDocenteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarDatos();
        if (nivelUsuario.equals("Usuario")) {
            btnAceptarInforme.setVisible(false);
            btnRechazarInforme.setVisible(false);
        }
        obtenerIdCargaAcademica();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnRemoverFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFilaActionPerformed
        contador--;
        removerFila();
    }//GEN-LAST:event_btnRemoverFilaActionPerformed

    private void TablaCapacidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCapacidadesMousePressed
        if (TablaCapacidades.getSelectedRow()!= -1) {
            if (filaSeleccionada == -2 || filaRemovida == true) {
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
                filaRemovida = false;
            } else {
                LogrosCapacidades.set(filaSeleccionada, txtComentario.getText());
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
            }
        }
    }//GEN-LAST:event_TablaCapacidadesMousePressed

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        contador++;
        agregarFila(contador);

    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnSalirCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCapacidadActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirCapacidadActionPerformed

    private void btnGuardarCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCapacidadActionPerformed
        if (guardadoF) {
            if (TablaCapacidades.getRowCount() > 0) {
                if (calcularMarcadosNivelCapacidad()) {
                    agregarCapadicades();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ingrese un nivel por cada Capacidad.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "inserta datos en la Tabla");
            }
        }
        else{
                JOptionPane.showMessageDialog(null, "Guarde El Informe Principal Antes.");
        }
    }//GEN-LAST:event_btnGuardarCapacidadActionPerformed

    private void btnGuardarObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarObservacionesActionPerformed
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
    }//GEN-LAST:event_btnGuardarObservacionesActionPerformed

    private void btnAceptarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarInformeActionPerformed
        ClsNegocioInformeFinalCurso negoIFC = new ClsNegocioInformeFinalCurso();
        ResultSet rs ;
        try {
            String estado = "Aprobado";
            negoIFC.ModificarEstadoInformeFinal(IdInfoFinalCurso, estado);
            negoIFC.cst.close();
            negoIFC.conexion.close();
            JOptionPane.showMessageDialog(null, "El Informe se Aprobo con exito");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAceptarInformeActionPerformed

    private void btnRechazarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarInformeActionPerformed
        ClsNegocioInformeFinalCurso negoIFC = new ClsNegocioInformeFinalCurso();
        ResultSet rs ;
        try {
            String estado = "Rechazado";
            negoIFC.ModificarEstadoInformeFinal(IdInfoFinalCurso, estado);
            negoIFC.cst.close();
            negoIFC.conexion.close();
            JOptionPane.showMessageDialog(null, "El Informe se Aprobo con exito");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRechazarInformeActionPerformed

    /*INFORME FINAL | METODOS*/
    private void guardarDatos(String opcion){
        
        ClsEntidadInformeFinalCurso entiInfoFinalCurso = new ClsEntidadInformeFinalCurso();
        ClsNegocioInformeFinalCurso negoInfoFinalCurso = new ClsNegocioInformeFinalCurso();
            
            
        try {
            entiInfoFinalCurso.setIdCargaAcademica(Integer.parseInt(idCargaAcademica));
            entiInfoFinalCurso.setEstadoInformeFinalCurso(opcion);
            entiInfoFinalCurso.setCumpliSilabo(Integer.parseInt(txtNumCumpliSilabo.getText()));
            entiInfoFinalCurso.setPractiRealizadas(Integer.parseInt(txtNumPractiCalificada.getText()));
            entiInfoFinalCurso.setLaboratoRealizadas(Integer.parseInt(txtNumExpeLaboratorio.getText()));
            entiInfoFinalCurso.setProyectoRealizado(Integer.parseInt(txtNumTrabajoInvestiga.getText()));
            entiInfoFinalCurso.setEstudianteAsiste(Integer.parseInt(txtNumAsisten.getText()));
            entiInfoFinalCurso.setEstudienteAproado(Integer.parseInt(txtNumAprobados.getText()));
            entiInfoFinalCurso.setEstudianteDesaprobado(Integer.parseInt(txtNumAbandono.getText()));
            
            
            String masAlta = !txtNumNotaAlta.getText().equals("") ? txtNumNotaAlta.getText() : "0" ;
            String prom = !txtNumNotaPromedio.getText().equals("") ? txtNumNotaPromedio.getText() : "0" ;      
            String masBaja = !txtNumBaja.getText().equals("") ? txtNumBaja.getText() : "0" ;
            
            entiInfoFinalCurso.setNotaMasAlta(Integer.parseInt(masAlta));
            entiInfoFinalCurso.setNotaMasBaja(Integer.parseInt(masBaja));
            entiInfoFinalCurso.setNotaPromedio(Integer.parseInt(prom));
            
            String lab = chkLabCursoInforme.isSelected() ? "Si" : "No";
            String talle = chkTallerCursoInforme.isSelected() ? "Si" : "No";
            entiInfoFinalCurso.setLab(lab);
            entiInfoFinalCurso.setTaller(talle);
            
            negoInfoFinalCurso.AgregarInformeFinal(entiInfoFinalCurso);
            negoInfoFinalCurso.cst.close();
            negoInfoFinalCurso.conexion.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa.");
        } catch (Exception e) {
        }
    }
    
    private void actualizarDatos(String opcion){
        ClsEntidadInformeFinalCurso entiInfoFinalCurso = new ClsEntidadInformeFinalCurso();
        ClsNegocioInformeFinalCurso negoInfoFinalCurso = new ClsNegocioInformeFinalCurso();
            
        try {
            entiInfoFinalCurso.setIdCargaAcademica(Integer.parseInt(idCargaAcademica));
            entiInfoFinalCurso.setEstadoInformeFinalCurso(opcion);
            entiInfoFinalCurso.setCumpliSilabo(Integer.parseInt(txtNumCumpliSilabo.getText()));
            entiInfoFinalCurso.setPractiRealizadas(Integer.parseInt(txtNumPractiCalificada.getText()));
            entiInfoFinalCurso.setLaboratoRealizadas(Integer.parseInt(txtNumExpeLaboratorio.getText()));
            entiInfoFinalCurso.setProyectoRealizado(Integer.parseInt(txtNumTrabajoInvestiga.getText()));
            entiInfoFinalCurso.setEstudianteAsiste(Integer.parseInt(txtNumAsisten.getText()));
            entiInfoFinalCurso.setEstudienteAproado(Integer.parseInt(txtNumAprobados.getText()));
            entiInfoFinalCurso.setEstudianteDesaprobado(Integer.parseInt(txtNumAbandono.getText()));
            
            
            String masAlta = !txtNumNotaAlta.getText().equals("") ? txtNumNotaAlta.getText() : "0" ;
            String prom = !txtNumNotaPromedio.getText().equals("") ? txtNumNotaPromedio.getText() : "0" ;      
            String masBaja = !txtNumBaja.getText().equals("") ? txtNumBaja.getText() : "0" ;
            
            entiInfoFinalCurso.setNotaMasAlta(Integer.parseInt(masAlta));
            entiInfoFinalCurso.setNotaMasBaja(Integer.parseInt(masBaja));
            entiInfoFinalCurso.setNotaPromedio(Integer.parseInt(prom));
            
            String lab = chkLabCursoInforme.isSelected() ? "Si" : "No";
            String talle = chkTallerCursoInforme.isSelected() ? "Si" : "No";
            entiInfoFinalCurso.setLab(lab);
            entiInfoFinalCurso.setTaller(talle);
            
            negoInfoFinalCurso.ModificarInformeFinal(IdInfoFinalCurso, entiInfoFinalCurso);
            negoInfoFinalCurso.cst.close();
            negoInfoFinalCurso.conexion.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa.");
        } catch (Exception e) {
        }
    }
    
    private boolean validarFormulario(){
        boolean top = false;
        boolean chk = false;
        boolean mid = false;
        boolean result = false;
        
        if (!txtSecCurso.getText().equals("")) {
            if (chkLabCursoInforme.isSelected())    chk = true;
            if (chkPractCursoInforme.isSelected())  chk = true;
            if (chkTallerCursoInforme.isSelected()) chk = true;
            if (chkTeoriaCursoInforme.isSelected()) chk = true;
            
            if(chk) top = true;
        }
        
        if(calculadoPorcentajes) mid = true;
        
        if (top && mid) result = true;
        
        return result;
    }
    
    void obtenerIdCargaAcademica(){
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioUsuario docente = new ClsNegocioUsuario();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsDocente = docente.obtenerDatosPruebaEntrada(datoIFC[7], datoIFC[0]);
            
            //itera los valores hechas en la consulta
            while (rsDocente.next()) {
                //llenar los valores con los valores respectivos
                lblSemestre.setText("INFORME FINAL DEL CURSO " + rsDocente.getString(7));
                
                idCargaAcademica = rsDocente.getString(8);
            }
            docente.conexion.close();
        } catch (Exception e) {
        }
    }
    
    private void cargarDatos(){
        if (guardarNuevo) {
            txtCodigoCurso.setText(datoIFC[0]);
            txtNombreCurso.setText(datoIFC[1]);

            int teoricas = Integer.parseInt(datoIFC[2]);
            int practicas = Integer.parseInt(datoIFC[3]);

            if (practicas > 0) {
                chkPractCursoInforme.setSelected(true);
            }
            if (teoricas > 0) {
                chkTeoriaCursoInforme.setSelected(true);
            }

            txtNumMatriculados.setText(datoIFC[4]);
            txtNumRetirados.setText(datoIFC[5]);
            txtNumAbandono.setText(datoIFC[6]); 

            String codigoDcoente = datoIFC[7];

            txtNombreDocente.setText(datoIFC[8]);
            txtEmailDocente.setText(datoIFC[9]); 
            txtCelularDocente.setText(datoIFC[10]);
        }
        else{
            txtCodigoCurso.setText(datoIFC[0]);
            txtNombreCurso.setText(datoIFC[1]);
            
            int hteoricas = Integer.parseInt(datoIFC[2]);
            int hpracticas = Integer.parseInt(datoIFC[3]);
            
            if (hteoricas > 0)  chkTeoriaCursoInforme.setSelected(true);
            if (hpracticas > 0) chkPractCursoInforme.setSelected(true);
            
            String aLab   = datoIFC[12].equals("No") ? "Si" : "No";
            String aTalle = datoIFC[13].equals("Si") ? "Si" : "No";
            if (aLab.equals("Si"))   chkLabCursoInforme.setSelected(true);
            if (aTalle.equals("Si")) chkTallerCursoInforme.setSelected(true);
            
            txtNombreDocente.setText(datoIFC[8]);
            txtEmailDocente.setText(datoIFC[10]);
            txtCelularDocente.setText(datoIFC[9]);
            
            txtNumCumpliSilabo.setText(datoIFC[14]);
            txtNumPractiCalificada.setText(datoIFC[15]);
            txtNumExpeLaboratorio.setText(datoIFC[16]);
            txtNumTrabajoInvestiga.setText(datoIFC[17]);
            txtNumMatriculados.setText(datoIFC[4]);
            txtNumRetirados.setText(datoIFC[5]);
            txtNumAbandono.setText(datoIFC[6]);
            txtNumAsisten.setText(datoIFC[18]);
            txtNumAprobados.setText(datoIFC[19]);
            txtNumDesaprobados.setText(datoIFC[20]);
            txtNumNotaAlta.setText(datoIFC[21]);
            txtNumNotaPromedio.setText(datoIFC[22]);
            txtNumBaja.setText(datoIFC[23]);
        }
        
    }

    /*CAPACIDADES | METODOS*/
    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nro","Capacidades del Curso","N","P","A","B","M"});
        
        TablaCapacidades.setModel(modelo);
    }
    
    private void agregarFila(int contador){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        modelo.addRow(new Object[]{contador, "","","","","",""});
        modelo.isCellEditable(0, 0);
        TablaCapacidades.setRowHeight(30);
        LogrosCapacidades.add("");
        
    }
    
    private void removerFila(){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        if (TablaCapacidades.getSelectedRow()!= -1) {
            filaRemovida = true;
            LogrosCapacidades.remove(TablaCapacidades.getSelectedRow());
            modelo.removeRow(TablaCapacidades.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        }
    }
    
    private boolean calcularMarcadosNivelCapacidad() {
        int filas = TablaCapacidades.getRowCount();
        boolean eval = false;    
        int cantidadMarcados[] = new int[filas];
        contador = 0;
        for (int i = 0; i < filas; i++) {
            String N = ((String) TablaCapacidades.getValueAt(i, 2)).toLowerCase();
            String P = ((String) TablaCapacidades.getValueAt(i, 3)).toLowerCase();
            String A = ((String) TablaCapacidades.getValueAt(i, 4)).toLowerCase();
            String B = ((String) TablaCapacidades.getValueAt(i, 5)).toLowerCase();
            String M = ((String) TablaCapacidades.getValueAt(i, 6)).toLowerCase();
            if (N.equals("x")) contador++;
            if (P.equals("x")) contador++;
            if (A.equals("x")) contador++;
            if (B.equals("x")) contador++;
            if (M.equals("x")) contador++;
           
            cantidadMarcados[i] = contador;
        }
        
        for (int i = 0; i < cantidadMarcados.length; i++) {
            if (cantidadMarcados[i] == 1) {
                eval = true;
            }
        }
        
        return eval;
        
    }
    
    private void agregarCapadicades() {
        int filas = TablaCapacidades.getRowCount();
        try {
            ClsEntidadCacidadInformeFinalCurso entiCapacidad = new ClsEntidadCacidadInformeFinalCurso();
            ClsNegocioCapadidadInformeFinalCurso negoCapacidad =  new ClsNegocioCapadidadInformeFinalCurso();
            for (int i = 0; i < filas; i++) {
                entiCapacidad.setIdinformefinalcurso(Integer.parseInt(IdInfoFinalCurso));
                entiCapacidad.setDescripcion((String) TablaCapacidades.getValueAt(i, 1));
                
                String nada = "N";
                String poco = "N";
                String acep = "N";
                String bueno = "N";
                String muybien = "N";
                //evaluar si las celdas esta vacias
                if (!TablaCapacidades.getValueAt(i, 2).equals("")) {
                    nada = ((String) TablaCapacidades.getValueAt(i, 2)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 3).equals("")) {
                    poco = ((String) TablaCapacidades.getValueAt(i, 3)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 4).equals("")) {
                    acep = ((String) TablaCapacidades.getValueAt(i, 4)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 5).equals("")) {
                    bueno = ((String) TablaCapacidades.getValueAt(i, 5)).toLowerCase();
                }
                if (!TablaCapacidades.getValueAt(i, 6).equals("")) {
                    muybien = ((String) TablaCapacidades.getValueAt(i, 6)).toLowerCase(); 
                }


                //evaluamos que celda esta marcada con una X    
                //e ingresamos el codigo del nivel que corresponda
                if (nada.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(1);
                }
                else if (poco.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(11);
                }
                else if (acep.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(21);
                }
                else if (bueno.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(31);
                }
                else if (muybien.equals("x")) {
                    entiCapacidad.setIdnivelcapacidad(41);
                }
                
                negoCapacidad.AgregarDetallePruebaEntrada(entiCapacidad);
            }
            JOptionPane.showMessageDialog(null,entiCapacidad.getIdnivelcapacidad());
            negoCapacidad.cst.close();
            negoCapacidad.conexion.close();
            
            
            JOptionPane.showMessageDialog(null, "Guardado con exito.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mensaje: "+e.getMessage());
        }
    }
    
    /*OBSERVACIONES | METODOS*/
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
    private javax.swing.JTable TablaCapacidades;
    private javax.swing.JButton btnAceptarInforme;
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnCalcularPorcentajes;
    private javax.swing.JButton btnCancelarInforme;
    private javax.swing.JButton btnEnviarCapacidad;
    private javax.swing.JButton btnEnviarInforme;
    private javax.swing.JButton btnEnviarObservaciones;
    private javax.swing.JButton btnGuardarCapacidad;
    private javax.swing.JButton btnGuardarInforme;
    private javax.swing.JButton btnGuardarObservaciones;
    private javax.swing.JButton btnRechazarInforme;
    private javax.swing.JButton btnRemoverFila;
    private javax.swing.JButton btnSalirCapacidad;
    private javax.swing.JCheckBox chkCuestionarios;
    private javax.swing.JCheckBox chkExamenes;
    private javax.swing.JCheckBox chkForos;
    private javax.swing.JCheckBox chkLabCursoInforme;
    private javax.swing.JCheckBox chkMaterial;
    private javax.swing.JCheckBox chkPractCursoInforme;
    private javax.swing.JCheckBox chkPresentaciones;
    private javax.swing.JCheckBox chkTallerCursoInforme;
    private javax.swing.JCheckBox chkTareas;
    private javax.swing.JCheckBox chkTeoriaCursoInforme;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JTextField txtCelularDocente;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtEmailDocente;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNombreDocente;
    private javax.swing.JTextField txtNumAbandono;
    private javax.swing.JTextField txtNumAprobados;
    private javax.swing.JTextField txtNumAsisten;
    private javax.swing.JTextField txtNumBaja;
    private javax.swing.JTextField txtNumCumpliSilabo;
    private javax.swing.JTextField txtNumDesaprobados;
    private javax.swing.JTextField txtNumExpeLaboratorio;
    private javax.swing.JTextField txtNumMatriculados;
    private javax.swing.JTextField txtNumNotaAlta;
    private javax.swing.JTextField txtNumNotaPromedio;
    private javax.swing.JTextField txtNumPractiCalificada;
    private javax.swing.JTextField txtNumRetirados;
    private javax.swing.JTextField txtNumTrabajoInvestiga;
    private javax.swing.JTextArea txtObserva1;
    private javax.swing.JTextArea txtObserva2;
    private javax.swing.JTextArea txtObserva3;
    private javax.swing.JTextArea txtObserva5;
    private javax.swing.JTextArea txtObserva6;
    private javax.swing.JTextArea txtObserva7;
    private javax.swing.JTextArea txtObserva8;
    private javax.swing.JTextArea txtObserva9;
    private javax.swing.JTextField txtPorcenAbandono;
    private javax.swing.JTextField txtPorcenAprobados;
    private javax.swing.JTextField txtPorcenAsisten;
    private javax.swing.JTextField txtPorcenCumpleSilabo;
    private javax.swing.JTextField txtPorcenDesaprobados;
    private javax.swing.JTextField txtPorcenExpeLaboratorio;
    private javax.swing.JTextField txtPorcenMatriculados;
    private javax.swing.JTextField txtPorcenPractiCalificada;
    private javax.swing.JTextField txtPorcenRetirados;
    private javax.swing.JTextField txtPorcenTrabajoInvestiga;
    private javax.swing.JTextField txtSecCurso;
    // End of variables declaration//GEN-END:variables
}
