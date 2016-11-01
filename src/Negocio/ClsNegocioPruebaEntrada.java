package Negocio;

import Entidad.ClsEntidadPruebaEntrada;
import Interface.ClsInterfacePruebaEntrada;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import Conexion.ClsConexion;
import Entidad.ClsEntidadPruebaCursosFaltantes;

/**
 *
 * @author enzocv
 */
public class ClsNegocioPruebaEntrada implements ClsInterfacePruebaEntrada{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
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
    public ArrayList hacerInformePruebaFaltante(String codDocente){
        ArrayList<ClsEntidadPruebaCursosFaltantes> Usuario = new ArrayList<ClsEntidadPruebaCursosFaltantes>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_FaltaInforme(?)}");
            cst.setString("pcodDocente", codDocente);
            rs = cst.executeQuery();
            
            while (rs.next()) {
                ClsEntidadPruebaCursosFaltantes pru = new ClsEntidadPruebaCursosFaltantes();
                
                pru.setIdCurso(rs.getString("idCurso"));
                pru.setNombreCurso(rs.getString("nombre"));
                pru.setHorasTeoricas(rs.getInt("horasTeoricas"));
                pru.setHoraPracticas(rs.getInt("horasPracticas"));
                pru.setAlumnosMatriculados(rs.getInt("alumnosMatriculados"));
                pru.setAlumnosRetirados(rs.getInt("alumnosRetirados"));
                pru.setAlumnosAbandono(rs.getInt("alumnosAbandono"));
                pru.setCodigoDocente(rs.getString("codDocente"));
                pru.setNombreDocente(rs.getString("nombreDocente"));
                
                Usuario.add(pru);
            }
            return Usuario;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
