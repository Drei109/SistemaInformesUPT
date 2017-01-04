package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadInformeFinalCurso;
import Interface.ClsInterfaceInformeFinalCurso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author enzocv
 */
public class ClsNegocioInformeFinalCurso implements ClsInterfaceInformeFinalCurso{

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;
    
    @Override
    public void AgregarInformeFinal(ClsEntidadInformeFinalCurso InformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_InformeFinalCurso_I(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString("pidCargaAcademica", String.valueOf(InformeFinal.getIdCargaAcademica()));
            cst.setString("pestadoInformeFinalCurso", InformeFinal.getEstadoInformeFinalCurso()); 
            cst.setString("pcumpliSilabo", String.valueOf(InformeFinal.getCumpliSilabo()));
            cst.setString("ppractiRealizadas", String.valueOf(InformeFinal.getPractiRealizadas()));
            cst.setString("plaboratoRealizadas",String.valueOf(InformeFinal.getLaboratoRealizadas())); 
            cst.setString("pproyectoRealizado", String.valueOf(InformeFinal.getProyectoRealizado()));
            cst.setString("pestudianteAsiste", String.valueOf(InformeFinal.getEstudianteAsiste()));
            cst.setString("pestudienteAproado",String.valueOf(InformeFinal.getEstudienteAproado())); 
            cst.setString("pestudianteDesaprobado",String.valueOf(InformeFinal.getEstudianteDesaprobado()));
            cst.setString("pnotaMasAlta",String.valueOf(InformeFinal.getNotaMasAlta()));
            cst.setString("pnotaPromedio",String.valueOf(InformeFinal.getNotaPromedio())); 
            cst.setString("pnotaMasBaja",String.valueOf(InformeFinal.getNotaMasBaja()));
            cst.setString("plab", InformeFinal.getLab());
            cst.setString("ptaller",InformeFinal.getTaller());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarInformeFinal(String codigo, ClsEntidadInformeFinalCurso InformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_InformeFinalCurso_U(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString("pidinformefinalcurso",codigo);
            cst.setString("pidCargaAcademica",String.valueOf(InformeFinal.getIdCargaAcademica()));
            cst.setString("pestadoInformeFinalCurso", InformeFinal.getEstadoInformeFinalCurso()); 
            cst.setString("pcumpliSilabo", String.valueOf(InformeFinal.getCumpliSilabo()));
            cst.setString("ppractiRealizadas", String.valueOf(InformeFinal.getPractiRealizadas()));
            cst.setString("plaboratoRealizadas",String.valueOf(InformeFinal.getLaboratoRealizadas())); 
            cst.setString("pproyectoRealizado", String.valueOf(InformeFinal.getProyectoRealizado()));
            cst.setString("pestudianteAsiste", String.valueOf(InformeFinal.getEstudianteAsiste()));
            cst.setString("pestudienteAproado",String.valueOf(InformeFinal.getEstudienteAproado())); 
            cst.setString("pestudianteDesaprobado",String.valueOf(InformeFinal.getEstudianteDesaprobado()));
            cst.setString("pnotaMasAlta",String.valueOf(InformeFinal.getNotaMasAlta()));
            cst.setString("pnotaPromedio",String.valueOf(InformeFinal.getNotaPromedio())); 
            cst.setString("pnotaMasBaja",String.valueOf(InformeFinal.getNotaMasBaja()));
            cst.setString("plab", InformeFinal.getLab());
            cst.setString("ptaller",InformeFinal.getTaller());
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarInformeFinal(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaAvanzaInformeFinal(String criterio, String busqueda) throws Exception {
         try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaInfoFinal(?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public void ModificarEstadoInformeFinal(String codigo, String estado, String motivo) {
        try {
            cst = conexion.prepareCall("{call USP_EstadoInfoFinalCuros_U(?,?,?)}");
            cst.setString("pidInfoFinal", codigo);
            cst.setString("pestadoInfoFinal", estado);
            cst.setString("pmotivo", motivo);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet ConsultaAvanzaInfoFinalUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaInfoFinalUsuario(?,?,?)}");
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
    public ArrayList seleccionarInforCurso(String codinfo) {
        ArrayList<String> infoCurso = new ArrayList<String>();
        try {
            cst = conexion.prepareCall("{call USP_InfoFinalPorId(?)}");
            cst.setString("pidinfo", codinfo);
            rs = cst.executeQuery();
            
            while (rs.next()) {//25
                infoCurso.add(rs.getString(1));
                infoCurso.add(rs.getString(2));
                infoCurso.add(rs.getString(3));
                infoCurso.add(rs.getString(4));
                infoCurso.add(rs.getString(5));
                infoCurso.add(rs.getString(6));
                infoCurso.add(rs.getString(7));
                infoCurso.add(rs.getString(8));
                infoCurso.add(rs.getString(9));
                infoCurso.add(rs.getString(10));
                infoCurso.add(rs.getString(11));
                infoCurso.add(rs.getString(12));
                infoCurso.add(rs.getString(13));
                infoCurso.add(rs.getString(14));
                infoCurso.add(rs.getString(15));
                infoCurso.add(rs.getString(16));
                infoCurso.add(rs.getString(17));
                infoCurso.add(rs.getString(18));
                infoCurso.add(rs.getString(19));
                infoCurso.add(rs.getString(20));
                infoCurso.add(rs.getString(21));
                infoCurso.add(rs.getString(22));
                infoCurso.add(rs.getString(23));
                infoCurso.add(rs.getString(24));
                infoCurso.add(rs.getString(25));
            }
            return infoCurso;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_FinalInformesAdmin(?,?)}");
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
            cst = conexion.prepareCall("{call USP_FinalInformesUsuario(?,?,?)}");
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
