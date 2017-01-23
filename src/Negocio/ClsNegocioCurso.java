/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.ClsConexion;
import Entidad.ClsEntidadCurso;
import Interface.ClsInterfaceCurso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ClsNegocioCurso implements ClsInterfaceCurso{
    public Connection conexion = new ClsConexion().getConnection();
    public CallableStatement cst = null;
    public ResultSet rs = null;

    @Override
    public void AgregarCurso(ClsEntidadCurso curso) {
        try {
            cst = conexion.prepareCall("{call USP_Curso_I(?,?,?,?,?,?,?,?)}");
            cst.setString("pidCurso", curso.getIdCurso() );
            cst.setString("pnombre", curso.getNombre() );
            cst.setString("phorasTeoricas", String.valueOf(curso.getHorasTeoricas()) );
            cst.setString("phorasPracticas", String.valueOf(curso.getHorasPracticas()) );
            cst.setString("pcreditos", String.valueOf(curso.getCreditos()) );
            cst.setString("pciclo", curso.getCiclo());
            cst.setString("ptipoCurso", curso.getTipoCurso() );
            cst.setString("ppreRequisito", curso.getPreRequisito() );
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModificarCurso(String idCurso, ClsEntidadCurso curso) {
        try {
            cst = conexion.prepareCall("{call USP_Curso_U(?,?,?,?,?,?,?,?)}");
            cst.setString("pidCurso", idCurso );
            cst.setString("pnombre", curso.getNombre() );
            cst.setString("phorasTeoricas", String.valueOf(curso.getHorasTeoricas()) );
            cst.setString("phorasPracticas", String.valueOf(curso.getHorasPracticas()) );
            cst.setString("pcreditos", String.valueOf(curso.getCreditos()) );
            cst.setString("pciclo", curso.getCiclo());
            cst.setString("ptipoCurso", curso.getTipoCurso() );
            cst.setString("ppreRequisito", curso.getPreRequisito() );
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void EliminarCurso(String idCurso) {
        try {
            cst = conexion.prepareCall("{call USP_Curso_D(?)}");
            cst.setString("pidCurso", idCurso );
            
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList seleccionarCurso(String idCurso) {
        ArrayList<ClsEntidadCurso> datosCurso = new ArrayList<ClsEntidadCurso>();
        
        try {
            cst = conexion.prepareCall("{call USP_Curso_S_Avanzado(?)}");
            cst.setString("pidCurso", idCurso );
            rs = cst.executeQuery();
            
            while (rs.next()) {
                ClsEntidadCurso cur = new ClsEntidadCurso();

                cur.setIdCurso(rs.getString("idCurso") );
                cur.setNombre( rs.getString("nombre") );
                cur.setHorasTeoricas( Integer.parseInt( rs.getString("horasTeoricas") ) );
                cur.setHorasPracticas( Integer.parseInt( rs.getString("horasPracticas") ) );
                cur.setCreditos( Integer.parseInt( rs.getString("creditos") ) );
                cur.setCiclo( rs.getString("ciclo") );
                cur.setTipoCurso(rs.getString("tipoCurso") );
                cur.setPreRequisito(rs.getString("preRequisito") );
                
                datosCurso.add(cur);
            }
            
            return datosCurso;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList seleccionarTodasLosCursos() {
        ArrayList<ClsEntidadCurso> datosCurso = new ArrayList<ClsEntidadCurso>();
        
        try {
            cst = conexion.prepareCall("{call USP_Curso_S()}");
            rs = cst.executeQuery();
            
            while (rs.next()) {
                ClsEntidadCurso cur = new ClsEntidadCurso();

                cur.setIdCurso(rs.getString("idCurso") );
                cur.setNombre( rs.getString("nombre") );
                cur.setHorasTeoricas( Integer.parseInt( rs.getString("horasTeoricas") ) );
                cur.setHorasPracticas( Integer.parseInt( rs.getString("horasPracticas") ) );
                cur.setTotalHoras( Integer.parseInt( rs.getString("totalHoras") ) );
                cur.setCreditos( Integer.parseInt( rs.getString("creditos") ) );
                cur.setCiclo( rs.getString("ciclo") );
                cur.setTipoCurso(rs.getString("tipoCurso") );
                cur.setPreRequisito(rs.getString("preRequisito") );
                
                datosCurso.add(cur);
            }
            
            return datosCurso;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
