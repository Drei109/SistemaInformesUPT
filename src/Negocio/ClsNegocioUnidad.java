package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadUnidad;
import Interface.ClsInterfaceUnidad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public class ClsNegocioUnidad implements ClsInterfaceUnidad{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public void AgregarUnidad(ClsEntidadUnidad Unidad) {
        try {
            cst = conexion.prepareCall("{call USP_Unidad_I(?,?)}");
            cst.setString("pdescripcionUnidad", Unidad.getDescripcionUnidad() );
            cst.setString("pestadoUnidad", Unidad.getEstadoUnidad());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarUnidad(String codigo, ClsEntidadUnidad Unidad) {
        try {
            cst = conexion.prepareCall("{call USP_Unidad_U(?,?,?)}");
            cst.setString("pidUnidad", codigo);
            cst.setString("pdescripcionUnidad", Unidad.getDescripcionUnidad() );
            cst.setString("pestadoUnidad", Unidad.getEstadoUnidad());
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarUnidad(String codigo) {
        try {
            cst = conexion.prepareCall("{call USP_Unidad_D(?)}");
            cst.setString("pidUnidad", codigo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList seleccionarUnidad(String codigoUnidad) {
        ArrayList<ClsEntidadUnidad> datosUnidad = new ArrayList<ClsEntidadUnidad>();
        
        try {
            cst = conexion.prepareCall("{call USP_FaltaInforme(?)}");
            cst.setString("pidUnidad", codigoUnidad);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadUnidad uni = new ClsEntidadUnidad();

                uni.setIdUnidad( Integer.parseInt(rs.getString("idCurso")) );
                uni.setDescripcionUnidad(rs.getString("descripcionUnidad"));
                uni.setEstadoUnidad(rs.getString("estadoUnidad"));
                datosUnidad.add(uni);
            }
            
            
            return datosUnidad;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList seleccionarTodasLasUnidad() {
        ArrayList<ClsEntidadUnidad> datosUnidad = new ArrayList<ClsEntidadUnidad>();
        
        try {
            cst = conexion.prepareCall("{call USP_Unidad_S()}");
            rs = cst.executeQuery();
            
            while (rs.next()) {
                ClsEntidadUnidad uni = new ClsEntidadUnidad();

                uni.setIdUnidad( Integer.parseInt(rs.getString("idUnidad")) );
                uni.setDescripcionUnidad(rs.getString("descripcionUnidad"));
                uni.setEstadoUnidad(rs.getString("estadoUnidad"));
                datosUnidad.add(uni);
            }
            
            return datosUnidad;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
