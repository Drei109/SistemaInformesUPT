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
    
    @Override
    public void AgregarPruebaEntrada(ClsEntidadPruebaEntrada PruebaEntrada) {
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_PruebaEntrada_I(?,?,?)}");
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
            CallableStatement cst = conexion.prepareCall("{call USP_PruebaEntrada_U(?,?,?,?)}");
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
            CallableStatement cst = conexion.prepareCall("{call USP_PruebaEntrada_D(?)}");
            cst.setString("pidPruebaEntrada", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    
}
