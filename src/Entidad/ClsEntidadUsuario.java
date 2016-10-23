package Entidad;

/**
 * @author Andrei
 * @author Enzo
 */

public class ClsEntidadUsuario {
    //Atributos de Usuario
    
    /**
     * @param idUsuario     "id del Usuario (PK)"        varchar(20);
     * @param codDocente    "codigo del Docente (FK)"    varchar(20);
     * @param contraseniaUsuario "pass del Usuario" varchar(20);
     * @param nivelUsuario  "nivel del Usuario"     varchar(20);
     * @param estadoUsuario "estado del Usuario"    varchar(20);
     */
    
    private String idUsuario;
    private String codDocente;
    private String contraseniaUsuario;
    private String nivelUsuario;
    private String estadoUsuario;
    
    //GET y SET para los Atributos
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public String getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(String nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    
}
