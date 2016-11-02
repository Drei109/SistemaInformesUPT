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
    
    public ResultSet ConsultaAvanzaPruebaEntradaUsuario(String criterio, String busqueda, String codDocente) throws Exception;

    public ArrayList hacerInformePruebaFaltante(String codDocente);
    
    public ArrayList seleccionarPruebaEntrada(String codPruebaEntrada); 
}
