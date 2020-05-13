/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Duoc
 */
public class Socio {
    private String rut,nombre,apellidoMaterno,apellidoPaterno,direccion,ciudad;
    private char sexo,donante;

    public Socio() {
    }

    public Socio(String rut, String nombre, String apellidoMaterno, String apellidoPaterno, String direccion, String ciudad, char sexo, char donante) {
        setRut(rut);
        setNombre(nombre);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        setDireccion(direccion);
        setCiudad(ciudad);
        setSexo(sexo);
        setDonante(donante);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getDonante() {
        return donante;
    }

    public void setDonante(char donante) {
        this.donante = donante;
    }

    @Override
    public String toString() {
        return "Socio{" + "rut=" + rut + ", nombre=" + nombre + ", apellidoMaterno=" + apellidoMaterno + ", apellidoPaterno=" + apellidoPaterno + ", direccion=" + direccion + ", ciudad=" + ciudad + ", sexo=" + sexo + ", donante=" + donante + '}';
    }
}

   