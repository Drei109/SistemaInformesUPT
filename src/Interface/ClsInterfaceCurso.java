/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadCurso;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public interface ClsInterfaceCurso {
    void AgregarCurso(ClsEntidadCurso curso);
    
    void ModificarCurso(String idCurso,ClsEntidadCurso curso);
    
    void EliminarCurso(String idCurso);
    
    public ArrayList seleccionarCurso(String idCurso); 
    
    public ArrayList seleccionarTodasLosCursos();
}
