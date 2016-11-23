package Presentacion;

/**
 *
 * @author enzocv
 */
import Entidad.ClsEntidadInformeFinalCurso;
import Negocio.ClsNegocioInformeFinalCurso;
import Negocio.ClsNegocioUsuario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FrmInformeFinalCurso extends javax.swing.JInternalFrame {

    public String[] datoIFC = null;
    boolean guardarNuevo = false;
    boolean guardadoF = false;
    boolean actualizaF = false;
    boolean calculadoPorcentajes = false;
    public String nivelUsuario;
    String idCargaAcademica;
    
    public FrmInformeFinalCurso() {
        initComponents();
    }

    public FrmInformeFinalCurso(String[] datoRF, boolean guardarNuevo,String nivelusu){
        initComponents();
        this.datoIFC = datoRF;
        this.guardarNuevo = guardarNuevo;
        this.nivelUsuario = nivelusu;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSecCurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        chkTeoriaCurso = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        chkPractCurso = new javax.swing.JCheckBox();
        chkLabCurso = new javax.swing.JCheckBox();
        chkTallerCurso = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JTextField();
        txtEmailDocente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelularDocente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
        btnIndicaciones = new javax.swing.JButton();
        btnObservaciones = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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

        jLabel2.setText("FACULTAD DE INGENIERIA ");

        jLabel3.setText("Escuela Profesional de Ingeniería de Sistemas");

        lblSemestre.setText("INFORME FINAL DEL CURSO");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        jLabel5.setText("Codigo Curso :");

        txtCodigoCurso.setEnabled(false);

        jLabel6.setText("Sec. :");

        jLabel7.setText("Nombre del Curso :");

        txtNombreCurso.setEnabled(false);

        chkTeoriaCurso.setText("Teoría");

        jLabel8.setText("Tipo :");

        chkPractCurso.setText("Pract");

        chkLabCurso.setText("Lab");

        chkTallerCurso.setText("Taller");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtCodigoCurso))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCurso)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSecCurso)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkTeoriaCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPractCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkLabCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkTallerCurso)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkTeoriaCurso)
                            .addComponent(chkPractCurso)
                            .addComponent(chkLabCurso)
                            .addComponent(chkTallerCurso)
                            .addComponent(txtSecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreDocente)
                    .addComponent(txtEmailDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtCelularDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtCelularDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

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

        jLabel21.setText("%");

        jLabel22.setText("Estudiantes que asisten:");

        jLabel23.setText("Estudiantes aprobados:");

        jLabel24.setText("Estudiantes desaprobados:");

        jLabel25.setText("Nota final mas alta:");

        jLabel26.setText("Nota final promedio:");

        jLabel27.setText("Nota final mas baja:");

        jLabel28.setText("N°");

        jLabel29.setText("%");

        btnCalcularPorcentajes.setText("Calcular Porcentejes");
        btnCalcularPorcentajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPorcentajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel20))
                    .addComponent(txtNumTrabajoInvestiga, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txtNumMatriculados)
                    .addComponent(txtNumRetirados)
                    .addComponent(txtNumPractiCalificada)
                    .addComponent(txtNumCumpliSilabo)
                    .addComponent(txtNumAbandono)
                    .addComponent(txtNumExpeLaboratorio))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPorcenCumpleSilabo)
                            .addComponent(txtPorcenPractiCalificada)
                            .addComponent(txtPorcenExpeLaboratorio)
                            .addComponent(txtPorcenTrabajoInvestiga)
                            .addComponent(txtPorcenMatriculados)
                            .addComponent(txtPorcenRetirados)
                            .addComponent(txtPorcenAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(btnCalcularPorcentajes)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel28))
                    .addComponent(txtNumNotaAlta)
                    .addComponent(txtNumNotaPromedio)
                    .addComponent(txtNumBaja)
                    .addComponent(txtNumAprobados)
                    .addComponent(txtNumDesaprobados, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txtNumAsisten))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcenAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel29)))
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenDesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumNotaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumNotaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNumCumpliSilabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenCumpleSilabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNumPractiCalificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenPractiCalificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNumExpeLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenExpeLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNumTrabajoInvestiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenTrabajoInvestiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNumMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtNumRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcenRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNumAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcenAbandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularPorcentajes))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 222)));

        btnIndicaciones.setText("Capacidades");
        btnIndicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicacionesActionPerformed(evt);
            }
        });

        btnObservaciones.setText("Observaciones");
        btnObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObservacionesActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");

        btnRechazar.setText("Rechazar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnIndicaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIndicaciones)
                    .addComponent(btnObservaciones)
                    .addComponent(btnGuardar)
                    .addComponent(btnEnviar)
                    .addComponent(btnAceptar)
                    .addComponent(btnRechazar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lblSemestre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSemestre)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDocenteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validarFormulario()) {
            if (guardarNuevo) {
                String opcion = "Guardado";
                guardarDatos(opcion);
                guardadoF = true;
            }
            else{
                /*actualizas*/
                actualizaF = true;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarDatos();
        if (nivelUsuario.equals("Usuario")) {
            btnAceptar.setVisible(false);
            btnRechazar.setVisible(false);
        }
        obtenerIdCargaAcademica();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnIndicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicacionesActionPerformed
        if (guardadoF && guardarNuevo) {
            FrmCapacidadesInformeFinalCurso frmcapacidades = new FrmCapacidadesInformeFinalCurso();
            FrmPrinicipal.escritorio.add(frmcapacidades);
            frmcapacidades.setVisible(true);
        }
        else if (actualizaF) {
            /*construtor con parametros para actualizar las capacidades del informe*/
        }
        else{
            JOptionPane.showMessageDialog(null, "Guarde o Envie antes de ingresar las observaciones");
        }
    }//GEN-LAST:event_btnIndicacionesActionPerformed

    private void btnCalcularPorcentajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPorcentajesActionPerformed
        
        if (!txtNumMatriculados.equals("")) {
            double matriculados = Double.parseDouble(txtNumMatriculados.getText());
            double porcentajeTotal = 0.0;
            if (matriculados >= 1) {
                porcentajeTotal = (matriculados*(100/100)*100);
                txtPorcenMatriculados.setText(""+porcentajeTotal);
            }
            else{
                txtPorcenMatriculados.setText("0");
            }
            
            double retirados = Double.parseDouble(txtNumRetirados.getText());
            double abandono = Double.parseDouble(txtNumAbandono.getText());
            double asisten = Double.parseDouble(txtNumAsisten.getText());
            double aprobados = Double.parseDouble(txtNumAprobados.getText());
            double desaprobados = Double.parseDouble(txtNumDesaprobados.getText());
            
            if (!(asisten > matriculados || asisten < 0)) {
                if ((aprobados + desaprobados) <= asisten) {
                    txtPorcenRetirados.setText("" + (retirados * porcentajeTotal)/matriculados);
                    txtPorcenAbandono.setText("" + (abandono * porcentajeTotal)/matriculados);
                    txtPorcenAsisten.setText("" + (asisten * porcentajeTotal)/matriculados);
            
                    double porcentajeAsisten = Double.parseDouble(txtPorcenAsisten.getText());
            
                    txtPorcenAprobados.setText(""+ (aprobados * porcentajeAsisten)/asisten);
                    txtPorcenDesaprobados.setText(""+ (desaprobados * porcentajeAsisten)/asisten);
                    
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
            JOptionPane.showMessageDialog(null, "Numero de Matriculados NULO");
        }
    }//GEN-LAST:event_btnCalcularPorcentajesActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (validarFormulario()) {
            if (guardarNuevo) {
                String opcion = "Enviado";
                guardarDatos(opcion);
                guardadoF = true;
            }
            else{
                /*actualizas*/
                actualizaF = true;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservacionesActionPerformed
        if (guardadoF && guardarNuevo) {
            FrmObservacionesInformeFinalCurso observa = new FrmObservacionesInformeFinalCurso();
            FrmPrinicipal.escritorio.add(observa);
            observa.setVisible(true);
        }
        else if (actualizaF) {
            /*construtor con parametros para actualizar las observaciones del informe*/
        }
        else{
            JOptionPane.showMessageDialog(null, "Guarde o Envie antes de ingresar las observaciones");
        }
    }//GEN-LAST:event_btnObservacionesActionPerformed

    private void cargarDatos(){
        txtCodigoCurso.setText(datoIFC[0]);
        txtNombreCurso.setText(datoIFC[1]);
        
        int teoricas = Integer.parseInt(datoIFC[2]);
        int practicas = Integer.parseInt(datoIFC[3]);
        
        if (practicas > 0) {
            chkPractCurso.setSelected(true);
        }
        if (teoricas > 0) {
            chkTeoriaCurso.setSelected(true);
        }
        
        txtNumMatriculados.setText(datoIFC[4]);
        txtNumRetirados.setText(datoIFC[5]);
        txtNumAbandono.setText(datoIFC[6]); 
        
        String codigoDcoente = datoIFC[7];
        
        txtNombreDocente.setText(datoIFC[8]);
        txtEmailDocente.setText(datoIFC[9]); 
        txtCelularDocente.setText(datoIFC[10]);
    }
    
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
            entiInfoFinalCurso.setNotaMasAlta(Integer.parseInt(txtNumNotaAlta.getText()));
            entiInfoFinalCurso.setNotaMasBaja(Integer.parseInt(txtNumBaja.getText()));
            entiInfoFinalCurso.setNotaPromedio(Integer.parseInt(txtNumNotaPromedio.getText()));
            
            if (chkLabCurso.isSelected()) {
                entiInfoFinalCurso.setLab("Si");
            }
            else{
                entiInfoFinalCurso.setLab("No");
            }
            
            if (chkTallerCurso.isSelected()) {
                entiInfoFinalCurso.setTaller("Si");
            }
            else{
                entiInfoFinalCurso.setTaller("No");
            }
            
            negoInfoFinalCurso.AgregarInformeFinal(entiInfoFinalCurso);
            negoInfoFinalCurso.cst.close();
            negoInfoFinalCurso.conexion.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa.");
        } catch (Exception e) {
        }
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
    
    private boolean validarFormulario(){
        boolean top = false;
        boolean chk = false;
        boolean mid = false;
        boolean result = false;
        
        if (!txtSecCurso.getText().equals("")) {
            if (chkLabCurso.isSelected())    chk = true;
            if (chkPractCurso.isSelected())  chk = true;
            if (chkTallerCurso.isSelected()) chk = true;
            if (chkTeoriaCurso.isSelected()) chk = true;
            
            if(chk) top = true;
        }
        
        if(calculadoPorcentajes) mid = true;
        
        if (top && mid) result = true;
        
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCalcularPorcentajes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIndicaciones;
    private javax.swing.JButton btnObservaciones;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JCheckBox chkLabCurso;
    private javax.swing.JCheckBox chkPractCurso;
    private javax.swing.JCheckBox chkTallerCurso;
    private javax.swing.JCheckBox chkTeoriaCurso;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField txtCelularDocente;
    private javax.swing.JTextField txtCodigoCurso;
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
