package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadCacidadInformeFinalCurso;
import Entidad.ClsEntidadInformeFinalCurso;
import Interface.ClsInterfaceCapacidadInformeFinalCurso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public class ClsNegocioCapadidadInformeFinalCurso implements ClsInterfaceCapacidadInformeFinalCurso{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;

    @Override
    public ResultSet obtenerIdInfoFinalCuro() throws Exception {
        ResultSet rs = null;
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_IDInformeFinalCurso()}");
            rs = cst.executeQuery();
//            conexion.close();
            return rs;
        } catch (SQLException ex) {
            
            throw ex;
        }
    }

    @Override
    public void AgregarDetallePruebaEntrada(ClsEntidadCacidadInformeFinalCurso CapacidadInformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_Capacidad_I(?,?,?,?)}");
            cst.setString("pdescripcion", CapacidadInformeFinal.getDescripcion());
            cst.setString("pidnivelcapacidad", String.valueOf(CapacidadInformeFinal.getIdnivelcapacidad()));
            cst.setString("pidinformefinalcurso", String.valueOf(CapacidadInformeFinal.getIdinformefinalcurso()));
            cst.setString("pmedidaCorrectiva", CapacidadInformeFinal.getMedidaCorectiva());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList obtenerInfoFinalDocente(String codDoc, String idCurso) {
        ArrayList<String> idInfo = new ArrayList<String>();
        
        try {
            cst = conexion.prepareCall("{call USP_ObtenerIdInfoFinalPorDocente(?,?)}");
            cst.setString("pcoddoc", codDoc);
            cst.setString("pidCurso", idCurso);
            rs = cst.executeQuery();
            
            while (rs.next()) {//
                idInfo.add(rs.getString(1));
            }
            return idInfo;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ModificarInfoFinal(String codigo, ClsEntidadCacidadInformeFinalCurso CapacidadInformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_Capacidad_I(?,?,?,?)}");
//            cst.setString("pdescripcion", CapacidadInformeFinal.getDescripcion());
            cst.setString("pdescripcion", CapacidadInformeFinal.getDescripcion());
            cst.setString("pidnivelcapacidad", String.valueOf(CapacidadInformeFinal.getIdnivelcapacidad()));
            cst.setString("pidinformefinalcurso", String.valueOf(CapacidadInformeFinal.getIdinformefinalcurso()));
            cst.setString("pmedidaCorrectiva", CapacidadInformeFinal.getMedidaCorectiva());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarEstadoInfoFinal(String codigo, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarDetallInfoFinalTodo(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_CapacidadInfoFinal_D_Todos(?)}");
            cst.setString("pidInfoFinal",codigo);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList seleccionarDetalleInfoFinal(String codInfoFinal) {
        ArrayList<ClsEntidadCacidadInformeFinalCurso> detalleInfoFinal = new ArrayList<ClsEntidadCacidadInformeFinalCurso>();
        try{
            cst = conexion.prepareCall("{call USP_CapacidadInfoFinal_PorId(?)}");
            cst.setString("pidInfoFinal", codInfoFinal);
            rs = cst.executeQuery();
            while (rs.next()) {                
                ClsEntidadCacidadInformeFinalCurso detalle =  new ClsEntidadCacidadInformeFinalCurso();
                detalle.setIdcapacidad(Integer.parseInt(rs.getString(1)));
                detalle.setDescripcion(rs.getString(2));
                detalle.setIdnivelcapacidad(Integer.parseInt(rs.getString(3)));
                detalle.setIdinformefinalcurso(Integer.parseInt(rs.getString(4)));
                detalle.setMedidaCorectiva(rs.getString(5));
                
                detalleInfoFinal.add(detalle);
            }
            return detalleInfoFinal;
        }
        catch(Exception ex){
            return null;
        }
    }
    
    
}
