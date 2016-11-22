package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadObservaFinalCurso;
import Interface.ClsInterfaceObservacionesInformeFinal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public class ClsNegocioObservacionesInformeFinalCurso implements ClsInterfaceObservacionesInformeFinal{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public ArrayList ListarObservaciones() {
        
        ArrayList<ClsEntidadObservaFinalCurso> observa = new ArrayList<ClsEntidadObservaFinalCurso>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_Observaciones_S()}");
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadObservaFinalCurso pru = new ClsEntidadObservaFinalCurso();

                pru.setIdObservaciones(Integer.parseInt(rs.getString("idObservaciones")));
                pru.setTitulo(rs.getString("titulo"));
                pru.setSubtitulo(rs.getString("subtitulo"));

                observa.add(pru);
            }
            
            
            return observa;
        } catch (NumberFormatException | SQLException e) {
            return null;
        }
    }


    @Override
    public void AgregarPruebaEntrada(ClsEntidadObservaFinalCurso Observaciones) {
        try {
            cst = conexion.prepareCall("{call USP_DetalleObservaciones_I(?,?,?)}");
            cst.setString("pidObservaciones", String.valueOf(Observaciones.getIdObservaciones())); 
            cst.setString("pidInformeFinalCurso", String.valueOf(Observaciones.getIdinformefinalcurso()));
            cst.setString("pdescripcion", Observaciones.getDescripcion());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
