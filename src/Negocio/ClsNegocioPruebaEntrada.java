package Negocio;

import Entidad.ClsEntidadPruebaEntrada;
import Interface.ClsInterfacePruebaEntrada;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import Conexion.ClsConexion;

/**
 *
 * @author enzocv
 */
public class ClsNegocioPruebaEntrada implements ClsInterfacePruebaEntrada{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    
    @Override
    public void AgregarPruebaEntrada(ClsEntidadPruebaEntrada PruebaEntrada) {
        try {
            cst = conexion.prepareCall("{call USP_PruebaEntrada_I(?,?,?)}");
            cst.setString("pidCargaAcademica", String.valueOf(PruebaEntrada.getIdCargaAcademica())); 
            cst.setString("pevaluados", String.valueOf(PruebaEntrada.getEvaluados()));
            cst.setString("pestadoPruebaEntrada", PruebaEntrada.getEstado());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPruebaEntrada(String codigo, ClsEntidadPruebaEntrada PruebaEntrada) {
        try {
            cst = conexion.prepareCall("{call USP_PruebaEntrada_U(?,?,?,?)}");
            cst.setString("pidPruebaEntrada", String.valueOf(PruebaEntrada.getIdPruebaEntrada())); 
            cst.setString("pidCargaAcademica",  String.valueOf(PruebaEntrada.getIdCargaAcademica()));
            cst.setString("pestadoPruebaEntrada", PruebaEntrada.getEstado());
            cst.setString("pevaluados",  String.valueOf(PruebaEntrada.getEvaluados()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarPruebaEntrada(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_PruebaEntrada_D(?)}");
            cst.setString("pidPruebaEntrada", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet ConsultaAvanzaPruebaEntrada(String criterio, String busqueda) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaPruebaEntrada(?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
             rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
        
    }

    @Override
    public ResultSet hacerInformePruebaFaltante(String codDocente) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_FaltaInforme(?)}");
            cst.setString("pcodDocente", codDocente);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ResultSet ConsultaAvanzaPruebaEntradaUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaPruebaEntradaUsuario(?,?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
            cst.setString("pcodDocente", codDocente);
             rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
}
