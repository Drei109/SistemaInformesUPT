/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadSemestre;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public interface ClsInterfaceSemestre {
    
    void AgregarSemestre(ClsEntidadSemestre Semestre);
    
    void ModificarSemestre(ClsEntidadSemestre Semestre);
    
    void EliminarSemestre(String codigo);
    
    public ArrayList MostrarSemestres();
    
    public ClsEntidadSemestre MostrarDatosSemestre(String codigo);
}
