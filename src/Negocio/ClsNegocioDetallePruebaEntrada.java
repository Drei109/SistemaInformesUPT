package Negocio;

import Entidad.ClsEntidadDetallePruebaEntrada;
import Interface.ClsInterfaceDetallePruebaEntrada;
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
public class ClsNegocioDetallePruebaEntrada implements ClsInterfaceDetallePruebaEntrada {

    private Connection conexion = new ClsConexion().getConnection();
    
    @Override
    public void AgregarDetallePruebaEntrada(ClsEntidadDetallePruebaEntrada DetallePruebaEntrada) {
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_DetallePruebaEntrada_I(?,?,?,?,?,?)}");
            cst.setString("pidDetallePruebaEntrada", String.valueOf(DetallePruebaEntrada.getIdDetallePruebaEntrada())); 
            cst.setString("pidPruebaEntrada", String.valueOf(DetallePruebaEntrada.getIdPruebaEntrada()));
            cst.setString("phabilidad", DetallePruebaEntrada.getHabilidad());
            cst.setString("pcantNoAceptalbe", String.valueOf(DetallePruebaEntrada.getCantNoAceptalbe()));
            cst.setString("pcantSuficiente", String.valueOf(DetallePruebaEntrada.getCantSuficiente()));
            cst.setString("pcantBueno", String.valueOf(DetallePruebaEntrada.getCantBueno()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarDetallePruebaEntrada(String codigoDetalle, String codigoPrueba, ClsEntidadDetallePruebaEntrada DetallePruebaEntrada) {
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_DetallePruebaEntrada_U(?,?,?,?,?,?)}");
            cst.setString("pidDetallePruebaEntrada",codigoDetalle); 
            cst.setString("pidPruebaEntrada", codigoPrueba);
            cst.setString("phabilidad", DetallePruebaEntrada.getHabilidad());
            cst.setString("pcantNoAceptalbe", String.valueOf(DetallePruebaEntrada.getCantNoAceptalbe()));
            cst.setString("pcantSuficiente", String.valueOf(DetallePruebaEntrada.getCantSuficiente()));
            cst.setString("pcantBueno", String.valueOf(DetallePruebaEntrada.getCantBueno()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarDetallePruebaEntrada(String codigo) {
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_DetallaPruebaEntrada_D(?)}");
            cst.setString("pidDetallePruebaEntrada",codigo);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}