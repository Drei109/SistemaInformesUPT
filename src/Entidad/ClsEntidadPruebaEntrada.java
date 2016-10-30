package Entidad;

/**
 *
 * @author enzocv
 */

public class ClsEntidadPruebaEntrada {

    //Atributos
    private int idPruebaEntrada; //AUTO INCREMENT
    private int idPlanEstudio;
    private String fechaPruebaEntrada;
    private int evaluados;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
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

    

    public String getFechaPruebaEntrada() {
        return fechaPruebaEntrada;
    }

    public void setFechaPruebaEntrada(String fechaPruebaEntrada) {
        this.fechaPruebaEntrada = fechaPruebaEntrada;
    }
    
    public int getEvaluados() {
        return evaluados;
    }

    public void setEvaluados(int evaluados) {
        this.evaluados = evaluados;
    }
    
}
