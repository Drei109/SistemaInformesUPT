package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadObservacionesInformeFinalCurso {
    private int idObservaciones; /*INT(11) NOT NULL AUTO_INCREMENT,*/
    private String titulo; /*TEXT NOT NULL,*/
    private String subtitulo; /*TEXT NULL,*/

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
}
