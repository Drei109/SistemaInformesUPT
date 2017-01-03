
package Entidad;

/**
 *
 * @author Drei
 */
public class ClsEntidadPortafolio {
    private int idPortafolio;
    private String fechaPortafolio;
    private int idCargaAcademica;
    private int estudianteAsisten;
    private int estudianteAprobado;
    private int estudianteDesaprobado;
    private String recepcioadoPor;
    private String estadoPortafolio;
    private int idUnidad;
    private String motivo;

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getRecepcioadoPor() {
        return recepcioadoPor;
    }

    public void setRecepcioadoPor(String recepcioadoPor) {
        this.recepcioadoPor = recepcioadoPor;
    }
    
    public int getIdPortafolio() {
        return idPortafolio;
    }

    public void setIdPortafolio(int idPortafolio) {
        this.idPortafolio = idPortafolio;
    }

    public String getFechaPortafolio() {
        return fechaPortafolio;
    }

    public void setFechaPortafolio(String fechaPortafolio) {
        this.fechaPortafolio = fechaPortafolio;
    }

    public int getIdCargaAcademica() {
        return idCargaAcademica;
    }

    public void setIdCargaAcademica(int idCargaAcademica) {
        this.idCargaAcademica = idCargaAcademica;
    }

    public int getEstudianteAsisten() {
        return estudianteAsisten;
    }

    public void setEstudianteAsisten(int estudianteAsisten) {
        this.estudianteAsisten = estudianteAsisten;
    }

    public int getEstudianteAprobado() {
        return estudianteAprobado;
    }

    public void setEstudianteAprobado(int estudianteAprobado) {
        this.estudianteAprobado = estudianteAprobado;
    }

    public int getEstudianteDesaprobado() {
        return estudianteDesaprobado;
    }

    public void setEstudianteDesaprobado(int estudianteDesaprobado) {
        this.estudianteDesaprobado = estudianteDesaprobado;
    }

    public String getEstadoPortafolio() {
        return estadoPortafolio;
    }

    public void setEstadoPortafolio(String estadoPortafolio) {
        this.estadoPortafolio = estadoPortafolio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
