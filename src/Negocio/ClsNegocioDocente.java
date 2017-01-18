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
    public void ModificarDocente(String codigo, ClsEntidadDocente Docente) {
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
    
    
    
}
