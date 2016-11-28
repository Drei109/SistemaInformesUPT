package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadObservaFinalCurso {
    private int idObservaciones; /*INT(11) NOT NULL AUTO_INCREMENT,*/
    private String titulo; /*TEXT NOT NULL,*/
    private String subtitulo; /*TEXT NULL,*/
    private int idinformefinalcurso;
    private String descripcion;
    private int idDetalleObservaciones;
    

    public int getIdObservaciones() {
        return idObservaciones;
    }

    public void setIdObservaciones(int idObservaciones) {
        this.idObservaciones = idObservaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getIdinformefinalcurso() {
        return idinformefinalcurso;
    }

    public void setIdinformefinalcurso(int idinformefinalcurso) {
        this.idinformefinalcurso = idinformefinalcurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdDetalleObservaciones() {
        return idDetalleObservaciones;
    }

    public void setIdDetalleObservaciones(int idDetalleObservaciones) {
        this.idDetalleObservaciones = idDetalleObservaciones;
    }
}
