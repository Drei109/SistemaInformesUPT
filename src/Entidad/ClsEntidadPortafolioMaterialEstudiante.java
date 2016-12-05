/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Drei
 */
public class ClsEntidadPortafolioMaterialEstudiante {

    private int idDetallePortafolioMaterialEstudiante;
    private String material;
    private boolean digital;
    private boolean impreso;
    private int cantidad;
    private int idPortafolio;

    
    public int getIdDetallePortafolioMaterialEstudiante() {
        return idDetallePortafolioMaterialEstudiante;
    }

    public void setIdDetallePortafolioMaterialEstudiante(int idDetallePortafolioMaterialEstudiante) {
        this.idDetallePortafolioMaterialEstudiante = idDetallePortafolioMaterialEstudiante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdPortafolio() {
        return idPortafolio;
    }

    public void setIdPortafolio(int idPortafolio) {
        this.idPortafolio = idPortafolio;
    }
}
