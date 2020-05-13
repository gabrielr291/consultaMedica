/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Socio;

/**
 *
 * @author Duoc
 */
public class Registro_socio {

    conexion.conexionSQL cone = new conexionSQL();
    Statement st;
    static ArrayList<Socio> socios;

    public Registro_socio() {
        socios = new ArrayList<>();
    }

    public boolean agregarSocio(Socio soc) {
        boolean dato = false;
        try {
            String consulta = "insert into persona (rut,nombre,apellido_p,apellido_m,direccion,ciudad,sexo,donante)"
                    + "values(" + soc.getRut() + ","
                    + "'" + soc.getNombre() + "',"
                    + "'" + soc.getApellidoPaterno() + "',"
                    + "'" + soc.getApellidoMaterno() + "',"
                    + "'" + soc.getDireccion() + "',"
                    + "'" + soc.getCiudad() + "',"
                    + "'" + soc.getSexo() + "',"
                    + "'" + soc.getDonante() + "')";
            st = cone.getCone().createStatement();
            st.executeUpdate(consulta);
            dato = true;
        } catch (SQLException ex) {
            System.err.println("error" + ex.getMessage());
        }
        return dato;
    }

    public boolean ModificarSocio(Socio soc) {
        boolean dato = false;
        try {
            String consulta = "update persona "
                    + "set nombre='"+soc.getNombre()+"',"
                    + "apellido_p='"+soc.getApellidoPaterno()+"',"
                    + "apellido_m='"+soc.getApellidoMaterno()+"',"
                    + "direccion='"+soc.getDireccion()+"',"
                    + "sexo='"+soc.getSexo()+"',"
                    + "ciudad='"+soc.getCiudad()+ "',"
                    + "donante='"+soc.getDonante()+ "' where rut='" + soc.getRut()+"'";
            st = cone.getCone().createStatement();
            st.executeUpdate(consulta);
            dato = true;
        } catch (SQLException ex) {
            System.err.println("error" + ex.getMessage());
        }
        return dato;
    }

    public boolean EliminarSocio(String rut) {
        boolean dato = false;
        try {
            String consulta = "delete from persona where rut=" + rut;
            st = cone.getCone().createStatement();
            st.executeUpdate(consulta);
            dato = true;
        } catch (SQLException ex) {
            System.err.println("error" + ex.getMessage());
        }
        return dato;
    }

    public ArrayList<Socio> ListarSocios() {
        try {
            st = cone.getCone().createStatement();
            String consulta = "select * from persona";
            ResultSet resultado = st.executeQuery(consulta);
            while (resultado.next()) {
                Socio soc = new Socio();
                soc.setRut(resultado.getString(1));
                soc.setNombre(resultado.getString(2));
                soc.setApellidoMaterno(resultado.getString(3));
                soc.setApellidoPaterno(resultado.getString(4));
                soc.setDireccion(resultado.getString(5));
                soc.setSexo(resultado.getString(6).charAt(0));
                soc.setCiudad(resultado.getString(7));
                soc.setDonante(resultado.getString(8).charAt(0));
                socios.add(soc);
            }
        } catch (SQLException ex) { //captura el error
            System.err.println("error :" + ex.getMessage());
        }
        return socios;
    }

    public ArrayList<Socio> buscarSocio(String rut) {
        try {
            st = cone.getCone().createStatement();
            String consulta = "select * from persona where rut=" + rut;
            ResultSet resultado = st.executeQuery(consulta);
            while (resultado.next()) {
                Socio soc = new Socio();
                soc.setRut(resultado.getString(1));
                soc.setNombre(resultado.getString(2));
                soc.setApellidoMaterno(resultado.getString(3));
                soc.setApellidoPaterno(resultado.getString(4));
                soc.setDireccion(resultado.getString(5));
                soc.setSexo(resultado.getString(6).charAt(0));
                soc.setCiudad(resultado.getString(7));
                soc.setDonante(resultado.getString(8).charAt(0));
                 socios.add(soc);
            }
        } catch (SQLException ex) { //captura el error
            System.err.println("error :" + ex.getMessage());
        }
        return socios;
    }

}
