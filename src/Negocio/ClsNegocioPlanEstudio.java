/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPlanEstudio;
import Interface.ClsInterfacePlanEstudio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ClsNegocioPlanEstudio implements ClsInterfacePlanEstudio{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public void AgregarPlanEstudio(ClsEntidadPlanEstudio PlanEstudio) {
        try {
            cst = conexion.prepareCall("{call USP_PlanEstudio_I(?)}");
            cst.setString("pnombrePlanEstudio", PlanEstudio.getNombrePlanEstudio());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPlanEstudio(ClsEntidadPlanEstudio PlanEstudio) {
        try {
            cst = conexion.prepareCall("{call USP_PlanEstudio_U(?,?)}");
            cst.setString("pidPlanEstudio", String.valueOf(PlanEstudio.getIdPlanEstudio()));
            cst.setString("pnombrePlanEstudio", PlanEstudio.getNombrePlanEstudio());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarPlanEstudio(String idPlanEstudio) {
        try {
            cst = conexion.prepareCall("{call USP_PlanEstudio_D(?)}");
            cst.setString("pidPlanEstudio", idPlanEstudio);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList MostrarPlanEstudios() {
        ArrayList<ClsEntidadPlanEstudio> infoPlanEstudios = new ArrayList<ClsEntidadPlanEstudio>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_PlanEstudio_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadPlanEstudio entPlanEstudio = new ClsEntidadPlanEstudio();

                entPlanEstudio.setIdPlanEstudio(Integer.parseInt(rs.getString("idPlanEstudio")));        
                entPlanEstudio.setNombrePlanEstudio(rs.getString("nombrePlanEstudio"));        
                infoPlanEstudios.add(entPlanEstudio);
            }
            
            
            return infoPlanEstudios;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ClsEntidadPlanEstudio MostrarDatosClsEntidadPlanEstudio(String idPlanEstudio) {
        ClsEntidadPlanEstudio entPlanEstudio = new ClsEntidadPlanEstudio();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_PlanEstudio_S2(?)}");
            cst.setString("pidPlanEstudio", idPlanEstudio);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                entPlanEstudio.setIdPlanEstudio(Integer.parseInt(rs.getString("idPlanEstudio")));        
                entPlanEstudio.setNombrePlanEstudio(rs.getString("pnombrePlanEstudio"));   
            }
            
            return entPlanEstudio;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
