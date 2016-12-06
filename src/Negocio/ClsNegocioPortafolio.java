/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadPortafolio;
import Interface.ClsInterfacePortafolio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Drei
 */
public class ClsNegocioPortafolio implements ClsInterfacePortafolio {

    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;

    @Override
    public void AgregarPortafolio(ClsEntidadPortafolio InformeFinal) {
        try {
            cst = conexion.prepareCall("{call USP_Portafolio_I(?,?,?,?,?,?)}");
            cst.setString("pidCargaAcademica", String.valueOf(InformeFinal.getIdCargaAcademica()));
            cst.setString("pestadoPortafolio", String.valueOf(InformeFinal.getEstadoPortafolio()));            
            cst.setString("pestudianteAsiste", String.valueOf(InformeFinal.getEstudianteAsisten()));            
            cst.setString("pestudienteAproado", String.valueOf(InformeFinal.getEstudianteAprobado()));            
            cst.setString("pestudianteDesaprobado", String.valueOf(InformeFinal.getEstudianteDesaprobado()));            
            cst.setString("precepcioadoPor", String.valueOf(InformeFinal.getRecepcioadoPor()));            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarPortafolio(String codigo, ClsEntidadPortafolio portafolio) {
        try {
            cst = conexion.prepareCall("{call USP_Portafolio_U(?,?,?,?,?)}");
            cst.setString("pidPortafolio",codigo);
            cst.setString("pestudianteAsisten",String.valueOf(portafolio.getEstudianteAsisten()));
            cst.setString("pestudianteAprobado",String.valueOf(portafolio.getEstudianteAprobado()));
            cst.setString("pestudianteDesaprobado",String.valueOf(portafolio.getEstudianteDesaprobado()));
            cst.setString("pestadoPortafolio",String.valueOf(portafolio.getEstadoPortafolio()));
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarPortafolio(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultaAvanzaPortafolioAdministrador(String criterio, String busqueda) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaPortafolio(?,?)}");
            cst.setString("pcriterio", criterio);
            cst.setString("pbusqueda", busqueda);
            rs = cst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public void ModificarEstadoPortafolio(String codigo, String estado) {
        try {
            cst = conexion.prepareCall("{call USP_Portafolio_U_Estado(?,?)}");
            cst.setString("pidPortafolio",codigo);
            cst.setString("pestadoPortafolio",estado);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet ConsultaAvanzaPortafolioUsuario(String criterio, String busqueda, String codDocente) throws Exception {
        ResultSet rs = null;
        try {
            cst = conexion.prepareCall("{call USP_BusquedaAvanzadaPortafolioUsuario(?,?,?)}");
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
    public ResultSet ConsultaInformeAdministrador(String criterio, String busqueda) throws Exception {
        try {
            cst = conexion.prepareCall("{call USP_ReportePortafolioAdmin(?,?)}");
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
            cst = conexion.prepareCall("{call USP_ReportePortafolioUsuario(?,?,?)}");
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
    public ArrayList seleccionarInfoPortafolio(String codPortafolio) {
        ArrayList<String> infoCurso = new ArrayList<String>();
        try {
            cst = conexion.prepareCall("{call USP_PortafolioPorId(?)}");
            cst.setString("pidinfo", codPortafolio);
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
            }
            return infoCurso;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ModificarRececpcionadoPorPortafolio(String codigo, String recepcionado) {
        try {
            cst = conexion.prepareCall("{call USP_Portafolio_U_RecepcionadoPor(?,?)}");
            cst.setString("pidPortafolio",codigo);
            cst.setString("precepcioadoPor",recepcionado);
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
