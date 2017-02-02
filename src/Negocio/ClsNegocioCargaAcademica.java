/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadCargaAcedemica;
import Interface.ClsInterfaceCargaAcademica;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ClsNegocioCargaAcademica implements ClsInterfaceCargaAcademica{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public void AgregarCargaAcademica(ClsEntidadCargaAcedemica CargaAcademica) {
        try {
            cst = conexion.prepareCall("{call USP_CargaAcademica_I(?,?,?,?,?,?,?,?)}");
            cst.setString("pidPlanEstudio", String.valueOf(CargaAcademica.getIdPlanEstudio()));
            cst.setString("pidSemestre", String.valueOf(CargaAcademica.getIdSemestre()));
            cst.setString("pidCurso", CargaAcademica.getIdCurso());
            cst.setString("palumnosMatriculados", String.valueOf(CargaAcademica.getAlumnosMatriculados()));
            cst.setString("palumnosRetirados", String.valueOf(CargaAcademica.getAlumnosRetirados()));
            cst.setString("palumnosAbandono", String.valueOf(CargaAcademica.getAlumnosAbandono()));
            cst.setString("pcodDocente", CargaAcademica.getCodDocente());
            cst.setString("pseccion", CargaAcademica.getSeccion());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarCargaAcademica(ClsEntidadCargaAcedemica CargaAcademica) {
        try {
            cst = conexion.prepareCall("{call USP_CargaAcademica_U(?,?,?,?,?,?,?,?,?)}");
            cst.setString("pidCargaAcedemica", String.valueOf(CargaAcademica.getIdCargaAcademica()));
            cst.setString("pidPlanEstudio", String.valueOf(CargaAcademica.getIdPlanEstudio()));
            cst.setString("pidSemestre", String.valueOf(CargaAcademica.getIdSemestre()));
            cst.setString("pidCurso", CargaAcademica.getIdCurso());
            cst.setString("palumnosMatriculados", String.valueOf(CargaAcademica.getAlumnosMatriculados()));
            cst.setString("palumnosRetirados", String.valueOf(CargaAcademica.getAlumnosRetirados()));
            cst.setString("palumnosAbandono", String.valueOf(CargaAcademica.getAlumnosAbandono()));
            cst.setString("pcodDocente", CargaAcademica.getCodDocente());
            cst.setString("pseccion", CargaAcademica.getSeccion());
            cst.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarCargaAcademica(String idCargaAcademica) {
        try {
            cst = conexion.prepareCall("{call USP_CargaAcademica_D(?)}");
            cst.setString("pidCargaAcedemica", idCargaAcademica);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList MostrarCargaAcademica() {
        ArrayList<ClsEntidadCargaAcedemica> infoCargaAcademica = new ArrayList<ClsEntidadCargaAcedemica>();
        
        try {
            cst = conexion.prepareCall("{call USP_CargaAcademica_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadCargaAcedemica entCargaAcademica = new ClsEntidadCargaAcedemica();

                entCargaAcademica.setIdCargaAcademica(Integer.parseInt(rs.getString("idCargaAcademica")));        
                entCargaAcademica.setIdPlanEstudio(Integer.parseInt(rs.getString("idPlanEstudio")));        
                entCargaAcademica.setIdSemestre(Integer.parseInt(rs.getString("idSemestre")));        
                entCargaAcademica.setIdCurso(rs.getString("idCurso"));        
                entCargaAcademica.setAlumnosMatriculados(Integer.parseInt(rs.getString("alumnosMatriculados")));        
                entCargaAcademica.setAlumnosRetirados(Integer.parseInt(rs.getString("alumnosRetirados")));        
                entCargaAcademica.setAlumnosAbandono(Integer.parseInt(rs.getString("alumnosAbandono")));        
                entCargaAcademica.setCodDocente(rs.getString("codDocente"));        
                entCargaAcademica.setSeccion(rs.getString("seccion"));
                
                entCargaAcademica.setNombrePlanEstudio(rs.getString("nombrePlanEstudio"));
                entCargaAcademica.setNombreSemestre(rs.getString("nombreSemestre"));
                entCargaAcademica.setNombreDocente(rs.getString("nombreDocente"));
                
                infoCargaAcademica.add(entCargaAcademica);
            }
            
            
            return infoCargaAcademica;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ClsEntidadCargaAcedemica MostrarDatosCargaAcademica(String idCargaAcademica) {
        ClsEntidadCargaAcedemica entCargaAcademica = new ClsEntidadCargaAcedemica();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_CargaAcademica_S2(?)}");
            cst.setString("pidCargaAcedemica", idCargaAcademica);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                entCargaAcademica.setIdCargaAcademica(Integer.parseInt(rs.getString("idCargaAcademica")));  
                entCargaAcademica.setIdPlanEstudio(Integer.parseInt(rs.getString("idPlanEstudio")));        
                entCargaAcademica.setIdSemestre(Integer.parseInt(rs.getString("idSemestre")));        
                entCargaAcademica.setIdCurso(rs.getString("idCurso"));        
                entCargaAcademica.setAlumnosMatriculados(Integer.parseInt(rs.getString("alumnosMatriculados")));        
                entCargaAcademica.setAlumnosRetirados(Integer.parseInt(rs.getString("alumnosRetirados")));        
                entCargaAcademica.setAlumnosAbandono(Integer.parseInt(rs.getString("alumnosAbandono")));        
                entCargaAcademica.setCodDocente(rs.getString("codDocente"));        
                entCargaAcademica.setSeccion(rs.getString("seccion"));   
                
                entCargaAcademica.setNombrePlanEstudio(rs.getString("nombrePlanEstudio"));
                entCargaAcademica.setNombreSemestre(rs.getString("nombreSemestre"));
                entCargaAcademica.setNombreDocente(rs.getString("nombreDocente"));
            }
            
            return entCargaAcademica;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
