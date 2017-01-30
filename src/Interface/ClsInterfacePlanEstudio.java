/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadPlanEstudio;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public interface ClsInterfacePlanEstudio {
    void AgregarPlanEstudio(ClsEntidadPlanEstudio PlanEstudio);
    
    void ModificarPlanEstudio(ClsEntidadPlanEstudio PlanEstudio);
    
    void EliminarPlanEstudio(String idPlanEstudio);
    
    public ArrayList MostrarPlanEstudios();
    
    public ClsEntidadPlanEstudio MostrarDatosClsEntidadPlanEstudio(String idPlanEstudio);
}
