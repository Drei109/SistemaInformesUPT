package Negocio;

import Entidad.ClsEntidadDetallePruebaEntrada;
import Interface.ClsInterfaceDetallePruebaEntrada;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import Conexion.ClsConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author enzocv
 */
public class ClsNegocioDetallePruebaEntrada implements ClsInterfaceDetallePruebaEntrada {

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement  cst = null;
    
    @Override
    public void AgregarDetallePruebaEntrada(ClsEntidadDetallePruebaEntrada DetallePruebaEntrada) {
        try {
            cst = conexion.prepareCall("{call USP_DetallePruebaEntrada_I(?,?,?,?,?,?)}");
            cst.setString("pidPruebaEntrada", String.valueOf(DetallePruebaEntrada.getIdPruebaEntrada()));
            cst.setString("phabilidad", DetallePruebaEntrada.getHabilidad());
            cst.setString("pcantNoAceptalbe", String.valueOf(DetallePruebaEntrada.getCantNoAceptalbe()));
            cst.setString("pcantSuficiente", String.valueOf(DetallePruebaEntrada.getCantSuficiente()));
            cst.setString("pcantBueno", String.valueOf(DetallePruebaEntrada.getCantBueno()));
            cst.setString("pmedidasCorrectivas", DetallePruebaEntrada.getMedidasCorrectivas());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarDetallePruebaEntrada(String codigoDetalle, String codigoPrueba, ClsEntidadDetallePruebaEntrada DetallePruebaEntrada) {
        try {
            cst = conexion.prepareCall("{call USP_DetallePruebaEntrada_U(?,?,?,?,?,?,?)}");
            cst.setString("pidDetallePruebaEntrada",codigoDetalle); 
            cst.setString("pidPruebaEntrada", codigoPrueba);
            cst.setString("phabilidad", DetallePruebaEntrada.getHabilidad());
            cst.setString("pcantNoAceptalbe", String.valueOf(DetallePruebaEntrada.getCantNoAceptalbe()));
            cst.setString("pcantSuficiente", String.valueOf(DetallePruebaEntrada.getCantSuficiente()));
            cst.setString("pcantBueno", String.valueOf(DetallePruebaEntrada.getCantBueno()));
            cst.setString("pmedidasCorrectivas", DetallePruebaEntrada.getMedidasCorrectivas());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarDetallePruebaEntrada(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_DetallaPruebaEntrada_D(?)}");
            cst.setString("pidDetallePruebaEntrada",codigo);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet ObtenerIdPruebaEntrada(String idCargaAcademica) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_IdPruebaEntrada(?)}");
            cst.setString("pidCargaAcademica", idCargaAcademica);
            
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList seleccionarDetallePruebaEntrada(String codPruebaEntrada) {
        ArrayList<ClsEntidadDetallePruebaEntrada> detallePruebaEntrada = new ArrayList<ClsEntidadDetallePruebaEntrada>();
        try{
            CallableStatement cst = conexion.prepareCall("{call USP_DetallePruebaEntradaPorId(?)}");
            cst.setString("pidPruebaEntrada", codPruebaEntrada);
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {                
                ClsEntidadDetallePruebaEntrada detalle =  new ClsEntidadDetallePruebaEntrada();
                detalle.setIdDetallePruebaEntrada(Integer.parseInt(rs.getString(1)));
                detalle.setIdPruebaEntrada(Integer.parseInt(rs.getString(2)));
                detalle.setHabilidad(rs.getString(3));
                detalle.setCantNoAceptalbe(Integer.parseInt(rs.getString(4)));
                detalle.setCantSuficiente(Integer.parseInt(rs.getString(5)));
                detalle.setCantBueno(Integer.parseInt(rs.getString(6)));
                detalle.setMedidasCorrectivas(rs.getString(7));
                
                detallePruebaEntrada.add(detalle);
            }
            return detallePruebaEntrada;
        }
        catch(Exception ex){
            return null;
        }
    }

    @Override
    public void EliminarDetallPruebaEntradaTodo(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_DetallePruebaEntrada_D_Todos(?)}");
            cst.setString("pidPruebaEntrada",codigo);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
