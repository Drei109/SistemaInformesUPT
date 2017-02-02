/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Asus
 */
public class ClsEntidadCargaAcedemica {
    private int idCargaAcademica;
    private int idPlanEstudio;
    private int idSemestre;
    private String idCurso;
    private int alumnosMatriculados;
    private int alumnosRetirados;
    private int alumnosAbandono;
    private String codDocente;
    private String seccion;
    
    private String nombrePlanEstudio;
    private String nombreSemestre;
    private String nombreDocente;

    public int getIdCargaAcademica() {
        return idCargaAcademica;
    }

    public void setIdCargaAcademica(int idCargaAcademica) {
        this.idCargaAcademica = idCargaAcademica;
    }

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public int getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public void setAlumnosMatriculados(int alumnosMatriculados) {
        this.alumnosMatriculados = alumnosMatriculados;
    }

    public int getAlumnosRetirados() {
        return alumnosRetirados;
    }

    public void setAlumnosRetirados(int alumnosRetirados) {
        this.alumnosRetirados = alumnosRetirados;
    }

    public int getAlumnosAbandono() {
        return alumnosAbandono;
    }

    public void setAlumnosAbandono(int alumnosAbandono) {
        this.alumnosAbandono = alumnosAbandono;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombrePlanEstudio() {
        return nombrePlanEstudio;
    }

    public void setNombrePlanEstudio(String nombrePlanEstudio) {
        this.nombrePlanEstudio = nombrePlanEstudio;
    }

    public String getNombreSemestre() {
        return nombreSemestre;
    }

    public void setNombreSemestre(String nombreSemestre) {
        this.nombreSemestre = nombreSemestre;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }
}
