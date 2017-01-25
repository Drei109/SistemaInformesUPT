/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadDocente;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public interface ClsInterfaceDocente {
    
    String ObtenerCodigo();
    
    void AgregarDocente(ClsEntidadDocente Docente);
    
    void ModificarDocente(ClsEntidadDocente Docente);
    
    void EliminarDocente(String codigo);
    
    public ArrayList MostrarDocentes();
    
    public ClsEntidadDocente MostrarDatosDocente(String codigo);
}
