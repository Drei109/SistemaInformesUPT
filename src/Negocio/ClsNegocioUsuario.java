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

    //Obtener la Conexion con la Base de Datos
    
    /**
     *  @param conexion     "obtiene la Conexion con la BD"
     */
    public Connection conexion = new ClsConexion().getConnection();
    
    @Override
    public ResultSet LoginUsuario(String usuario, String password) throws Exception {
        conexion = new ClsConexion().getConnection();
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
    
}
