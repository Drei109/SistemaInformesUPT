/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadPortafolioMaterialDocente;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public interface ClsInterfacePortafolioMaterialDocente {
    public ResultSet obtenerIdInfoFinalCuro()throws Exception;
    
    void AgregarDetallePortafolioMaterialDocente(ClsEntidadPortafolioMaterialDocente CapacidadPortafoliDocente);
    
    void ModificarPortafolioMaterialDocente(String codigo,ClsEntidadPortafolioMaterialDocente CapacidadPortafoliDocente);
    
    public ArrayList obtenerInfoFinalDocente(String codDoc,String idCurso); 
    
    void ModificarEstadoInfoFinal(String codigo, String estado);
    
    void EliminarDetallePortafolioMaterialDocente(String codigo);
    
    public ArrayList seleccionarPortafolioMaterialDocente(String codInfoFinal); 
}
