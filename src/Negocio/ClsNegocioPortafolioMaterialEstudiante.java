/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPortafolioMaterialDocente;
import Entidad.ClsEntidadPortafolioMaterialEstudiante;
import Interface.ClsInterfacePortafolioMaterialEstudiante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public class ClsNegocioPortafolioMaterialEstudiante implements ClsInterfacePortafolioMaterialEstudiante{
    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public ResultSet obtenerIdInfoFinalCuro() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AgregarDetallePortafolioMaterialEstudiante(ClsEntidadPortafolioMaterialEstudiante CapacidadPortafoliEstudiante) {
        try {
            cst = conexion.prepareCall("{call USP_DetallePortafolioEstudiante_I(?,?,?,?,?)}");
            cst.setString("pmaterial", String.valueOf(CapacidadPortafoliEstudiante.getMaterial())); 
            cst.setBoolean("pdigital", CapacidadPortafoliEstudiante.isDigital());
            cst.setBoolean("pimpreso", CapacidadPortafoliEstudiante.isImpreso());            
            cst.setString("pcantidad", String.valueOf(CapacidadPortafoliEstudiante.getCantidad()));
            cst.setString("pidPortafolio", String.valueOf(CapacidadPortafoliEstudiante.getIdPortafolio()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPortafolioMaterialEstudiante(String codigo, ClsEntidadPortafolioMaterialEstudiante CapacidadPortafoliEstudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList obtenerInfoFinalEstudiante(String codDoc, String idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModificarEstadoInfoFinal(String codigo, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarDetallePortafolioMaterialEstudiante(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList seleccionarPortafolioMaterialEstudiante(String codInfoFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
