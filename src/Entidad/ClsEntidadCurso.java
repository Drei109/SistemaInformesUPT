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
public class ClsEntidadCurso {
    private String idCurso;//PK
    private String nombre;
    private int horasTeoricas;
    private int horasPracticas;
    private int totalHoras;
    private int creditos;
    private String ciclo;
    private String tipoCurso;
    private String preRequisito;

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }
}
