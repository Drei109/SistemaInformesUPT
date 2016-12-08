package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadUnidad {
    private int  idUnidad;// INT(11) NOT NULL AUTO_INCREMENT,
    private String descripcionUnidad;//` VARCHAR(20) NOT NULL,
    private String estadoUnidad;// VARCHAR(20) NULL DEFAULT NULL,

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDescripcionUnidad() {
        return descripcionUnidad;
    }

    public void setDescripcionUnidad(String descripcionUnidad) {
        this.descripcionUnidad = descripcionUnidad;
    }

    public String getEstadoUnidad() {
        return estadoUnidad;
    }

    public void setEstadoUnidad(String estadoUnidad) {
        this.estadoUnidad = estadoUnidad;
    }
}
