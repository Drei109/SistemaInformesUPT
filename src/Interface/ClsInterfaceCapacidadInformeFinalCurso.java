
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
}
