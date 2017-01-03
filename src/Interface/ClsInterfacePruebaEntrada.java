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
    
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception;
    
    public ResultSet ConsultaInformeUsuario(String criterio, String busqueda, String codDocente) throws Exception;

    public ArrayList hacerInformePruebaFaltante(String codDocente, String busqueda);
    
    public ArrayList seleccionarPruebaEntrada(String codPruebaEntrada); 
    
    void ModificarEstadoPruebaEntrada(String codigo, String estado, String motivo);
    
    public ArrayList verInformesTotales(String busqueda);
    
    public ResultSet verInformesTotalesGraficos(String busqueda) throws Exception;
    
    public ArrayList verInformesTotalesDocente(String busqueda,String codDocente);
    
    public ResultSet verInformesTotalesGraficosPorDocente(String busqueda,String codDocente) throws Exception;
}
