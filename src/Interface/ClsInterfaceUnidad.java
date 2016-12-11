package Interface;

import Entidad.ClsEntidadUnidad;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public interface ClsInterfaceUnidad {
    void AgregarUnidad(ClsEntidadUnidad Unidad);
    
    void ModificarUnidad(String codigo,ClsEntidadUnidad Unidad);
    
    void EliminarUnidad(String codigo);
    
    public ArrayList seleccionarUnidad(String codigoUnidad); 
    
    public ArrayList seleccionarTodasLasUnidad(); 
    
    public String unidadActiva();
}
