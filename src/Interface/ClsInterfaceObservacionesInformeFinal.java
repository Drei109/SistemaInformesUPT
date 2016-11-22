/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadObservaFinalCurso;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public interface ClsInterfaceObservacionesInformeFinal {
    public ArrayList ListarObservaciones(); 
    void AgregarPruebaEntrada(ClsEntidadObservaFinalCurso Observaciones);
}
