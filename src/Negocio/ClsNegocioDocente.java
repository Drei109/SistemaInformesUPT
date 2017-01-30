/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadDocente;
import Interface.ClsInterfaceDocente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public class ClsNegocioDocente implements ClsInterfaceDocente{
    
    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public String ObtenerCodigo() {
        String ultCodigo = "";
        try {
            cst = conexion.prepareCall("{call USP_Docente_UltimoCod()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ultCodigo = String.valueOf(Integer.parseInt(rs.getString("codDocente"))+1);
            }
            
            
            return ultCodigo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AgregarDocente(ClsEntidadDocente Docente) {
        try {
            cst = conexion.prepareCall("{call USP_Docente_I(?,?,?,?,?)}");
            cst.setString("pcodDocente", Docente.getCodDocente());
            cst.setString("pnombreDocente", Docente.getNombreDocente());
            cst.setString("pemailDocente", Docente.getEmailDocente());
            cst.setString("pcelularDocente", Docente.getCelularDocente());
            cst.setString("pgradoDocente", Docente.getGradoDocente());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarDocente(ClsEntidadDocente Docente) {
        try {
            cst = conexion.prepareCall("{call USP_Docente_U(?,?,?,?,?)}");
            cst.setString("pcodDocente", Docente.getCodDocente());
            cst.setString("pnombreDocente", Docente.getNombreDocente());
            cst.setString("pemailDocente", Docente.getEmailDocente());
            cst.setString("pcelularDocente", Docente.getCelularDocente());
            cst.setString("pgradoDocente", Docente.getGradoDocente());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarDocente(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_Docente_D(?)}");
            cst.setString("pcodDocente", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList MostrarDocentes() {
        ArrayList<ClsEntidadDocente> infoDocente = new ArrayList<ClsEntidadDocente>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Docente_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadDocente entDoc = new ClsEntidadDocente();

                entDoc.setCodDocente(rs.getString("codDocente"));       
                entDoc.setNombreDocente(rs.getString("nombreDocente"));       
                entDoc.setEmailDocente(rs.getString("emailDocente"));       
                entDoc.setCelularDocente(rs.getString("celularDocente"));       
                entDoc.setGradoDocente(rs.getString("gradoDocente"));       
                infoDocente.add(entDoc);
            }
            
            
            return infoDocente;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ClsEntidadDocente MostrarDatosDocente(String codigo) {
        ClsEntidadDocente entDoc = new ClsEntidadDocente();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Docente_S2(?)}");
            cst.setString("pcodDocente", codigo);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                entDoc.setCodDocente(rs.getString("codDocente"));       
                entDoc.setNombreDocente(rs.getString("nombreDocente"));       
                entDoc.setEmailDocente(rs.getString("emailDocente"));       
                entDoc.setCelularDocente(rs.getString("celularDocente"));       
                entDoc.setGradoDocente(rs.getString("gradoDocente"));  
            }
            
            return entDoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    
    
}
