package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadInformeFinalCurso;
import Interface.ClsInterfaceInformeFinalCurso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarInformeFinal(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaAvanzaInformeFinal(String criterio, String busqueda) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModificarEstadoInformeFinal(String codigo, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
