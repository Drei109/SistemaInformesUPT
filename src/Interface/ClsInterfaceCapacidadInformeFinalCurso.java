
package Interface;

import Entidad.ClsEntidadCacidadInformeFinalCurso;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public interface ClsInterfaceCapacidadInformeFinalCurso {
    public ResultSet obtenerIdInfoFinalCuro()throws Exception;
    
    void AgregarDetallePruebaEntrada(ClsEntidadCacidadInformeFinalCurso CapacidadInformeFinal);
    
    void ModificarInfoFinal(String codigo,ClsEntidadCacidadInformeFinalCurso CapacidadInformeFinal);
    
    public ArrayList obtenerInfoFinalDocente(String codDoc,String idCurso); 
    
    void ModificarEstadoInfoFinal(String codigo, String estado);
    
    void EliminarDetallInfoFinalTodo(String codigo);
    
    public ArrayList seleccionarDetalleInfoFinal(String codInfoFinal); 
}
