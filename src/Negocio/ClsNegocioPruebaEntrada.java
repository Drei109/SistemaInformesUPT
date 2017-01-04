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
//            cst.setString("pidPruebaEntrada", String.valueOf(PruebaEntrada.getIdPruebaEntrada())); 
            cst.setString("pidPruebaEntrada", codigo); 
            cst.setString("pidCargaAcademica",  String.valueOf(PruebaEntrada.getIdCargaAcademica()));
            cst.setString("pevaluados",  String.valueOf(PruebaEntrada.getEvaluados()));
            cst.setString("pestadoPruebaEntrada", PruebaEntrada.getEstado());
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
    public ArrayList hacerInformePruebaFaltante(String codDocente, String busqueda){
        ArrayList<ClsEntidadPruebaCursosFaltantes> Usuario = new ArrayList<ClsEntidadPruebaCursosFaltantes>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_FaltaInforme(?,?)}");
            cst.setString("pcodDocente", codDocente);
            cst.setString("pbusqueda", busqueda);
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
                pru.setEmailDocente(rs.getString("emailDocente"));
                pru.setCeluDocente(rs.getString("celularDocente"));
                pru.setSeccion(rs.getString("seccion"));
                if (busqueda.equals("Portafolio")) {
                    pru.setIdUnidad(rs.getInt("idUnidad"));
                    pru.setDescripcionUnidad(rs.getString("descripcionUnidad"));
                    pru.setCargaAcademica(rs.getString("idCargaAcademica"));
                    pru.setCuentaCarga(rs.getString("cuentaCarga"));
                }
                

                Usuario.add(pru);
            }
            
            
            return Usuario;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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

    @Override
    public ArrayList seleccionarPruebaEntrada(String codPruebaEntrada) {
        ArrayList<String> pruebaEntrada = new ArrayList<String>();
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_PruebaEntradaPorId(?)}");
            cst.setString("pidPruebaEntrada", codPruebaEntrada);
            rs = cst.executeQuery();
            
            while (rs.next()) {
                pruebaEntrada.add(rs.getString(1));
                pruebaEntrada.add(rs.getString(2));
                pruebaEntrada.add(rs.getString(3));
                pruebaEntrada.add(rs.getString(4));
                pruebaEntrada.add(rs.getString(5));
                pruebaEntrada.add(rs.getString(6));
                pruebaEntrada.add(rs.getString(7));
                pruebaEntrada.add(rs.getString(8));
                pruebaEntrada.add(rs.getString(9));
                pruebaEntrada.add(rs.getString(10));
                pruebaEntrada.add(rs.getString(11));
            }
            return pruebaEntrada;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ModificarEstadoPruebaEntrada(String codigo, String estado, String motivo) {
        try {
            cst = conexion.prepareCall("{call USP_EstadoPruebaEntrada_U(?,?,?)}");
            cst.setString("pidPruebaEntrada", codigo);
            cst.setString("pestadoPruebaEntrada", estado);
            cst.setString("pmotivo", motivo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_PruebaEntradaInformesAdmin(?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ResultSet ConsultaInformeUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_PruebaEntradaInformesUsuario(?,?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
            cst.setString("pcodDocente", codDocente);
             rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList verInformesTotales(String busqueda) {
        ArrayList<ClsEntidadPruebaCursosFaltantes> infoTotales = new ArrayList<ClsEntidadPruebaCursosFaltantes>();
        
        try {
            CallableStatement cst = conexion.prepareCall("{call USP_ListaTotalInformes(?)}");
            cst.setString("pbusqueda", busqueda);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadPruebaCursosFaltantes pru = new ClsEntidadPruebaCursosFaltantes();

                pru.setCargaAcademica(rs.getString("idCargaAcademica"));
                pru.setCodigoDocente(rs.getString("codDocente"));
                pru.setNombreDocente(rs.getString("nombreDocente"));
                pru.setIdCurso(rs.getString("idCurso"));
                pru.setNombreCurso(rs.getString("nombre"));
                pru.setFechaPrueba(rs.getString("fechainformefinalcurso"));
                pru.setEstadoPrueba(rs.getString("estadoInformeFinalCurso"));
                pru.setSeccion(rs.getString("seccion"));
                infoTotales.add(pru);
            }
            
            
            return infoTotales;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ResultSet verInformesTotalesGraficos(String busqueda) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_ListaTotalInformesGrafico(?)}");            
            cst.setString("pbusqueda", busqueda);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList verInformesTotalesDocente(String busqueda, String codDocente) {
        ArrayList<ClsEntidadPruebaCursosFaltantes> infoTotalesDoc = new ArrayList<ClsEntidadPruebaCursosFaltantes>();
        
        try {
            cst = conexion.prepareCall("{call USP_ListaTotalInformesPorDocente(?,?)}");
            cst.setString("pbusqueda", busqueda);
            cst.setString("pcodDoc", codDocente);
            rs = cst.executeQuery();
            
            
            while (rs.next()) {
                ClsEntidadPruebaCursosFaltantes pru = new ClsEntidadPruebaCursosFaltantes();

                pru.setCargaAcademica(rs.getString("idCargaAcademica"));
                pru.setCodigoDocente(rs.getString("codDocente"));
                pru.setNombreDocente(rs.getString("nombreDocente"));
                pru.setIdCurso(rs.getString("idCurso"));
                pru.setNombreCurso(rs.getString("nombre"));
                pru.setFechaPrueba(rs.getString("fechainformefinalcurso"));
                pru.setEstadoPrueba(rs.getString("estadoInformeFinalCurso"));
                pru.setSeccion(rs.getString("seccion"));
                infoTotalesDoc.add(pru);
            }
            
            
            return infoTotalesDoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ResultSet verInformesTotalesGraficosPorDocente(String busqueda, String codDocente) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_ListaTotalInformesGraficoPorDocente(?,?)}");            
            cst.setString("pbusqueda", busqueda);
            cst.setString("pcodDoc", codDocente);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
}
