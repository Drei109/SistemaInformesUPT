package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadCacidadInformeFinalCurso {

    private int idcapacidad; /*INT(11) NOT NULL AUTO_INCREMENT,*/
    private String descripcion; /*TEXT NOT NULL,*/
    private int idnivelcapacidad; /*INT(11) NOT NULL,*/
    private int idinformefinalcurso; /*INT(11) NULL DEFAULT NULL,*/
    
    public int getIdcapacidad() {
        return idcapacidad;
    }

    public void setIdcapacidad(int idcapacidad) {
        this.idcapacidad = idcapacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdnivelcapacidad() {
        return idnivelcapacidad;
    }

    public void setIdnivelcapacidad(int idnivelcapacidad) {
        this.idnivelcapacidad = idnivelcapacidad;
    }

    public int getIdinformefinalcurso() {
        return idinformefinalcurso;
    }

    public void setIdinformefinalcurso(int idinformefinalcurso) {
        this.idinformefinalcurso = idinformefinalcurso;
    }
    
}
