/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPortafolio;
import Interface.ClsInterfacePortafolio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Drei
 */
public class ClsNegocioPortafolio implements ClsInterfacePortafolio {

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;

    @Override
    public void AgregarPortafolio(ClsEntidadPortafolio InformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_Portafolio_I(?,?,?,?,?,?)}");
            cst.setString("pidCargaAcademica", String.valueOf(InformeFinal.getIdCargaAcademica()));
            cst.setString("pestadoPortafolio", String.valueOf(InformeFinal.getEstadoPortafolio()));            
            cst.setString("pestudianteAsiste", String.valueOf(InformeFinal.getEstudianteAsisten()));            
            cst.setString("pestudienteAproado", String.valueOf(InformeFinal.getEstudianteAprobado()));            
            cst.setString("pestudianteDesaprobado", String.valueOf(InformeFinal.getEstudianteDesaprobado()));            
            cst.setString("precepcioadoPor", String.valueOf(InformeFinal.getRecepcioadoPor()));            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPortafolio(String codigo, ClsEntidadPortafolio InformeFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarPortafolio(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaAvanzaPortafolio(String criterio, String busqueda) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModificarEstadoPortafolio(String codigo, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaAvanzaPortafolioUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaInformeUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
