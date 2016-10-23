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
}
