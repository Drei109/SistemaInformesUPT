/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadDocente;
import Entidad.ClsEntidadSemestre;
import Interface.ClsInterfaceSemestre;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public class ClsNegocioSemestre implements ClsInterfaceSemestre{
    
    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
   
    @Override
    public void AgregarSemestre(ClsEntidadSemestre Semestre) {
        try {
            cst = conexion.prepareCall("{call USP_Semestre_I(?,?,?)}");
            cst.setString("pnombreSemestre", Semestre.getNombreSemestre());
            cst.setString("panioSemestre", Semestre.getAnioSemestre());
            cst.setString("pestadoSemestre", Semestre.getEstadoSemestre());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarSemestre(ClsEntidadSemestre Semestre) {
        try {
            cst = conexion.prepareCall("{call USP_Semestre_U(?,?,?,?)}");
            cst.setString("pidSemestre", Semestre.getIdSemestre());
            cst.setString("pnombreSemestre", Semestre.getNombreSemestre());
            cst.setString("panioSemestre", Semestre.getAnioSemestre());
            cst.setString("pestadoSemestre", Semestre.getEstadoSemestre());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarSemestre(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_Semestre_D(?)}");
            cst.setString("pidSemestre", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList MostrarSemestres() {
        ArrayList<ClsEntidadSemestre> infoSemestre = new ArrayList<ClsEntidadSemestre>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Semestre_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadSemestre entSemestre = new ClsEntidadSemestre();

                entSemestre.setIdSemestre(rs.getString("idSemestre"));        
                entSemestre.setNombreSemestre(rs.getString("nombreSemestre"));        
                entSemestre.setAnioSemestre(rs.getString("anioSemestre"));        
                entSemestre.setEstadoSemestre(rs.getString("estadoSemestre"));        
                infoSemestre.add(entSemestre);
            }
            
            
            return infoSemestre;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ClsEntidadSemestre MostrarDatosSemestre(String codigo) {
        ClsEntidadSemestre entSemestre = new ClsEntidadSemestre();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Semestre_S2(?)}");
            cst.setString("pidSemestre", codigo);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                entSemestre.setIdSemestre(rs.getString("idSemestre"));        
                entSemestre.setNombreSemestre(rs.getString("nombreSemestre"));        
                entSemestre.setAnioSemestre(rs.getString("anioSemestre"));        
                entSemestre.setEstadoSemestre(rs.getString("estadoSemestre"));     
            }
            
            return entSemestre;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
