package Negocio;

import Entidad.ClsEntidadUsuario;
//import Interface.ClsInterfaceUsuario;
import Conexion.ClsConexion;
import Interface.ClsInterfaceUsuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 * @author Andrei
 * @author Enzo
 */
public class ClsNegocioUsuario implements ClsInterfaceUsuario {

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public ResultSet LoginUsuario(String usuario, String password) throws Exception {
        ResultSet rs = null;
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Usuario_Login(?,?)}");
            cst.setString("pcodusu", usuario);
            cst.setString("ppass_usu", password);
            
            rs = cst.executeQuery();
//            conexion.close();
            return rs;
        } catch (SQLException ex) {
            
            throw ex;
        }        
    }

    @Override
    public ResultSet obtenerDatosPruebaEntrada(String codDocente, String idCurso) throws Exception {
        ResultSet rs = null;
        try {
            CallableStatement cst = conexion.prepareCall("{call UPS_DatosPruebaEntrada(?,?)}");
            cst.setString("pcodDocente", codDocente);
            cst.setString("pidCurso", idCurso);
            
            rs = cst.executeQuery();
//            conexion.close();
            return rs;
        } catch (SQLException ex) {
            
            throw ex;
        }
    }

    @Override
    public ResultSet obtenerCursosDocente(String pcodDocente) throws Exception {
        ResultSet rs = null;
        try {
            CallableStatement cst = conexion.prepareCall("{call UPS_CursosDeDocente(?)}");
            cst.setString("pcodDocente", pcodDocente);
            
            rs = cst.executeQuery();
//            conexion.close();
            return rs;            
        } catch (SQLException ex) {
            
            throw ex;
        }
    }

    @Override
    public String ObtenerID() {
        String ultCodigo = "";
        try {
            cst = conexion.prepareCall("{call USP_Usuario_UltimoCod()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ultCodigo = String.valueOf(Integer.parseInt(rs.getString("idUsuario"))+1);
            }
            
            
            return ultCodigo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AgregarUsuario(ClsEntidadUsuario Usuario) {
        try {
            cst = conexion.prepareCall("{call USP_Usuario_I(?,?,?,?)}");
            cst.setString("pcodDocente", Usuario.getCodDocente());
            cst.setString("pconraseniaUsuario", Usuario.getContraseniaUsuario());
            cst.setString("pnivelUsuario", Usuario.getNivelUsuario());
            cst.setString("pestadoUsuario", Usuario.getEstadoUsuario());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarUsuario(ClsEntidadUsuario Usuario) {
        try {
            cst = conexion.prepareCall("{call USP_Usuario_U(?,?,?,?,?)}");
            cst.setString("pidUsuario", Usuario.getIdUsuario());
            cst.setString("pcodDocente", Usuario.getCodDocente());
            cst.setString("pconraseniaUsuario", Usuario.getContraseniaUsuario());
            cst.setString("pnivelUsuario", Usuario.getNivelUsuario());
            cst.setString("pestadoUsuario", Usuario.getEstadoUsuario());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarUsuario(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_Usuario_D(?)}");
            cst.setString("pidUsuario", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList MostrarUsuarios() {
        ArrayList<ClsEntidadUsuario> infoUsuarios = new ArrayList<ClsEntidadUsuario>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Usuario_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadUsuario entUsu = new ClsEntidadUsuario();

                entUsu.setIdUsuario(rs.getString("idUsuario"));  
                entUsu.setCodDocente(rs.getString("codDocente"));  
                entUsu.setContraseniaUsuario(rs.getString("conraseniaUsuario"));  
                entUsu.setNivelUsuario(rs.getString("nivelUsuario"));  
                entUsu.setEstadoUsuario(rs.getString("estadoUsuario"));  
                infoUsuarios.add(entUsu);
            }
            
            
            return infoUsuarios;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ClsEntidadUsuario MostrarDatosUsuario(String codigo) {
        ClsEntidadUsuario entUsu = new ClsEntidadUsuario();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Usuario_S2(?)}");
            cst.setString("pidUsuario", codigo);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                entUsu.setIdUsuario(rs.getString("idUsuario"));  
                entUsu.setCodDocente(rs.getString("codDocente"));  
                entUsu.setContraseniaUsuario(rs.getString("conraseniaUsuario"));  
                entUsu.setNivelUsuario(rs.getString("nivelUsuario"));  
                entUsu.setEstadoUsuario(rs.getString("estadoUsuario"));  
            }
            
            return entUsu;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
