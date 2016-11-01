package Interface;

import Entidad.ClsEntidadPruebaEntrada;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author enzocv
 */
public interface ClsInterfacePruebaEntrada {
    
    void AgregarPruebaEntrada(ClsEntidadPruebaEntrada PruebaEntrada);
    
    void ModificarPruebaEntrada(String codigo,ClsEntidadPruebaEntrada PruebaEntrada);
    
    void EliminarPruebaEntrada(String codigo);
    
    public ResultSet ConsultaAvanzaPruebaEntrada(String criterio, String busqueda) throws Exception;
}
