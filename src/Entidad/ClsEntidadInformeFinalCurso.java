package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadInformeFinalCurso {
    private int idinformefinalcurso; /*INT(11) NOT NULL AUTO_INCREMENT,*/
    private String fechainformefinalcurso;  /*DATETIME NULL DEFAULT NULL,*/
    private int idCargaAcademica; /*INT(11) NOT NULL,*/
    private int practicascalificadas; /*INT(11) NULL DEFAULT NULL,*/
    private String estadoInformeFinalCurso; /*VARCHAR(10) NOT NULL,*/
    private int cumpliSilabo; /*INT(10) NOT NULL,*/
    private int practiRealizadas; /*INT(10) NOT NULL,*/
    private int laboratoRealizadas; /*INT(10) NOT NULL,*/
    private int proyectoRealizado; /*INT(10) NOT NULL,*/
    private int estudianteAsiste; /*INT(5) NOT NULL,*/
    private int estudienteAproado; /*INT(5) NOT NULL,*/
    private int estudianteDesaprobado; /*INT(5) NOT NULL,*/
    private int notaMasAlta; /*INT(5) NOT NULL,*/
    private int notaPromedio; /*INT(5) NOT NULL,*/
    private int notaMasBaja; /*INT(5) NOT NULL,*/

    public int getIdinformefinalcurso() {
        return idinformefinalcurso;
    }

    public void setIdinformefinalcurso(int idinformefinalcurso) {
        this.idinformefinalcurso = idinformefinalcurso;
    }

    public String getFechainformefinalcurso() {
        return fechainformefinalcurso;
    }

    public void setFechainformefinalcurso(String fechainformefinalcurso) {
        this.fechainformefinalcurso = fechainformefinalcurso;
    }

    public int getIdCargaAcademica() {
        return idCargaAcademica;
    }

    public void setIdCargaAcademica(int idCargaAcademica) {
        this.idCargaAcademica = idCargaAcademica;
    }

    public int getPracticascalificadas() {
        return practicascalificadas;
    }

    public void setPracticascalificadas(int practicascalificadas) {
        this.practicascalificadas = practicascalificadas;
    }

    public String getEstadoInformeFinalCurso() {
        return estadoInformeFinalCurso;
    }

    public void setEstadoInformeFinalCurso(String estadoInformeFinalCurso) {
        this.estadoInformeFinalCurso = estadoInformeFinalCurso;
    }

    public int getCumpliSilabo() {
        return cumpliSilabo;
    }

    public void setCumpliSilabo(int cumpliSilabo) {
        this.cumpliSilabo = cumpliSilabo;
    }

    public int getPractiRealizadas() {
        return practiRealizadas;
    }

    public void setPractiRealizadas(int practiRealizadas) {
        this.practiRealizadas = practiRealizadas;
    }

    public int getLaboratoRealizadas() {
        return laboratoRealizadas;
    }

    public void setLaboratoRealizadas(int laboratoRealizadas) {
        this.laboratoRealizadas = laboratoRealizadas;
    }

    public int getProyectoRealizado() {
        return proyectoRealizado;
    }

    public void setProyectoRealizado(int proyectoRealizado) {
        this.proyectoRealizado = proyectoRealizado;
    }

    public int getEstudianteAsiste() {
        return estudianteAsiste;
    }

    public void setEstudianteAsiste(int estudianteAsiste) {
        this.estudianteAsiste = estudianteAsiste;
    }

    public int getEstudienteAproado() {
        return estudienteAproado;
    }

    public void setEstudienteAproado(int estudienteAproado) {
        this.estudienteAproado = estudienteAproado;
    }

    public int getEstudianteDesaprobado() {
        return estudianteDesaprobado;
    }

    public void setEstudianteDesaprobado(int estudianteDesaprobado) {
        this.estudianteDesaprobado = estudianteDesaprobado;
    }

    public int getNotaMasAlta() {
        return notaMasAlta;
    }

    public void setNotaMasAlta(int notaMasAlta) {
        this.notaMasAlta = notaMasAlta;
    }

    public int getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(int notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public int getNotaMasBaja() {
        return notaMasBaja;
    }

    public void setNotaMasBaja(int notaMasBaja) {
        this.notaMasBaja = notaMasBaja;
    }
}
