package Interface;

import Entidad.ClsEntidadUsuario;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.ResultSet;

/**
 * @author Andrei
 * @author Enzo
 */

public interface ClsInterfaceUsuario {
    
    public ResultSet LoginUsuario(String usuario, String password) throws Exception;
    
    public ResultSet obtenerDatosPruebaEntrada(String codDocente, String idCurso)throws Exception;
    
    public ResultSet obtenerCursosDocente(String pcodDocente)throws Exception;
}
