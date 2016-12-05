/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsEntidadPortafolio;
import java.sql.ResultSet;

/**
 *
 * @author Drei
 */
public interface ClsInterfacePortafolio {
    void AgregarPortafolio(ClsEntidadPortafolio InformeFinal);
    
    void ModificarPortafolio(String codigo,ClsEntidadPortafolio InformeFinal);
    
    void EliminarPortafolio(String codigo);
    
    public ResultSet ConsultaAvanzaPortafolio(String criterio, String busqueda) throws Exception;
    
    void ModificarEstadoPortafolio(String codigo, String estado);
    
    public ResultSet ConsultaAvanzaPortafolioUsuario(String criterio, String busqueda, String codDocente) throws Exception;
    
//    public ArrayList seleccionarInforCurso(String codPruebaEntrada);
    
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception;
    
    public ResultSet ConsultaInformeUsuario(String criterio, String busqueda, String codDocente) throws Exception;
}
