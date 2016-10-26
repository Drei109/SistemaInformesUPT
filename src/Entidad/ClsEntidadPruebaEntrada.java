package Entidad;

import java.util.Date;

/**
 *
 * @author enzocv
 */

public class ClsEntidadPruebaEntrada {

    //Atributos
    private int idPruebaEntrada; //AUTO INCREMENT
    private int idPlanEstudio;
    private String medidasCorrectivas;
    private String fechaPruebaEntrada; 
    
    
    //GET Y SETTER
    public int getIdPruebaEntrada() {
        return idPruebaEntrada;
    }

    public void setIdPruebaEntrada(int idPruebaEntrada) {
        this.idPruebaEntrada = idPruebaEntrada;
    }

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public String getMedidasCorrectivas() {
        return medidasCorrectivas;
    }

    public void setMedidasCorrectivas(String medidasCorrectivas) {
        this.medidasCorrectivas = medidasCorrectivas;
    }

    public String getFechaPruebaEntrada() {
        return fechaPruebaEntrada;
    }

    public void setFechaPruebaEntrada(String fechaPruebaEntrada) {
        this.fechaPruebaEntrada = fechaPruebaEntrada;
    }
    
}
