package Interface;

import Entidad.ClsEntidadInformeFinalCurso;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author enzocv
 */
public interface ClsInterfaceInformeFinalCurso {
    void AgregarInformeFinal(ClsEntidadInformeFinalCurso InformeFinal);
    
    void ModificarInformeFinal(String codigo,ClsEntidadInformeFinalCurso InformeFinal);
    
    void EliminarInformeFinal(String codigo);
    
    public ResultSet ConsultaAvanzaInformeFinal(String criterio, String busqueda) throws Exception;
    
    void ModificarEstadoInformeFinal(String codigo, String estado, String motivo);
    
    public ResultSet ConsultaAvanzaInfoFinalUsuario(String criterio, String busqueda, String codDocente) throws Exception;
    
    public ArrayList seleccionarInforCurso(String codPruebaEntrada);
    
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception;
    
    public ResultSet ConsultaInformeUsuario(String criterio, String busqueda, String codDocente) throws Exception;
    
}
