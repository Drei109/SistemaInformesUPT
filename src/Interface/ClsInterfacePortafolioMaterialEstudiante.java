/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadPortafolioMaterialDocente;
import Entidad.ClsEntidadPortafolioMaterialEstudiante;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public interface ClsInterfacePortafolioMaterialEstudiante {
    public ResultSet obtenerIdInfoFinalCuro()throws Exception;
    
    void AgregarDetallePortafolioMaterialEstudiante(ClsEntidadPortafolioMaterialEstudiante CapacidadPortafoliEstudiante);
    
    void ModificarPortafolioMaterialEstudiante(String codigo,ClsEntidadPortafolioMaterialEstudiante CapacidadPortafoliEstudiante);
    
    public ArrayList obtenerInfoFinalEstudiante(String codDoc,String idCurso); 
    
    void ModificarEstadoInfoFinal(String codigo, String estado);
    
    void EliminarDetallePortafolioMaterialEstudiante(String codigo);
    
    public ArrayList seleccionarPortafolioMaterialEstudiante(String codInfoFinal); 
}
