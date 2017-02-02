/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadCargaAcedemica;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public interface ClsInterfaceCargaAcademica {
    void AgregarCargaAcademica(ClsEntidadCargaAcedemica CargaAcademica);
    
    void ModificarCargaAcademica(ClsEntidadCargaAcedemica CargaAcademica);
    
    void EliminarCargaAcademica(String idCargaAcademica);
    
    public ArrayList MostrarCargaAcademica();
    
    public ClsEntidadCargaAcedemica MostrarDatosCargaAcademica(String idCargaAcademica);
}
