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
            cst = conexion.prepareCall("{call USP_Capacidad_I(?,?,?)}");
            cst.setString("pdescripcion", CapacidadInformeFinal.getDescripcion());
            cst.setString("pidnivelcapacidad", String.valueOf(CapacidadInformeFinal.getIdcapacidad()));
            cst.setString("pidinformefinalcurso", String.valueOf(CapacidadInformeFinal.getIdinformefinalcurso()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
