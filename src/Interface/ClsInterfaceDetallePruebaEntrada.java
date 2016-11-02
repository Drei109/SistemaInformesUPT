package Interface;

import Entidad.ClsEntidadDetallePruebaEntrada;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public interface ClsInterfaceDetallePruebaEntrada {
    void AgregarDetallePruebaEntrada(ClsEntidadDetallePruebaEntrada DetallePruebaEntrada);
    
    void ModificarDetallePruebaEntrada(String codigoDetalle,String codigoPrueba,ClsEntidadDetallePruebaEntrada DetallePruebaEntrada);
    
    void EliminarDetallePruebaEntrada(String codigo);
    
    public ResultSet ObtenerIdPruebaEntrada(String codigoPlanEstudio)throws Exception;
    
    public ArrayList seleccionarDetallePruebaEntrada(String codPruebaEntrada); 
}
