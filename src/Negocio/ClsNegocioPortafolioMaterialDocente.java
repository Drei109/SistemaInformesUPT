/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPortafolioMaterialDocente;
import Interface.ClsInterfacePortafolioMaterialDocente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public class ClsNegocioPortafolioMaterialDocente implements ClsInterfacePortafolioMaterialDocente{
    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;

    @Override
    public ResultSet obtenerIdInfoFinalCuro() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AgregarDetallePortafolioMaterialDocente(ClsEntidadPortafolioMaterialDocente CapacidadPortafoliDocente) {
        try {
            cst = conexion.prepareCall("{call USP_DetallePortafolioDocente_I(?,?,?,?,?)}");
            cst.setString("pmaterial", String.valueOf(CapacidadPortafoliDocente.getMaterial())); 
            cst.setBoolean("pdigital", CapacidadPortafoliDocente.isDigital());
            cst.setBoolean("pimpreso", CapacidadPortafoliDocente.isImpreso());            
            cst.setString("pcantidad", String.valueOf(CapacidadPortafoliDocente.getCantidad()));
            cst.setString("pidPortafolio", String.valueOf(CapacidadPortafoliDocente.getIdPortafolio()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPortafolioMaterialDocente(String codigo, ClsEntidadPortafolioMaterialDocente CapacidadPortafoliDocente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList obtenerInfoFinalDocente(String codDoc, String idCurso) {
        ArrayList<String> idInfo = new ArrayList<String>();
        
        try {
            cst = conexion.prepareCall("{call USP_ObtenerIdIPortafolio(?,?)}");
            cst.setString("pcoddoc", codDoc);
            cst.setString("pidCurso", idCurso);
            rs = cst.executeQuery();
            
            while (rs.next()) {//
                idInfo.add(rs.getString(1));
            }
            return idInfo;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ModificarEstadoInfoFinal(String codigo, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarDetallePortafolioMaterialDocente(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList seleccionarPortafolioMaterialDocente(String codInfoFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
