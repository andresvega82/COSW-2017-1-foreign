package com.eci.edu.entities;

import java.util.ArrayList;

/**
 * Created by 2098165 on 2/16/17.
 */
public class Client {

    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private String nombreUsuario;
    private String paisNacimiento;
    private String lugarResidencia;
    private String lenguaMaterna;
    private ArrayList<String> idiomasAprender;
    private ArrayList<Tutorship> tutorias;
    private String descripcion= null;

    public Client(String nombre, String apellido, String correo, Integer telefono, String nombreUsuario, String paisNacimiento, String lugarResidencia, String lenguaMaterna){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.nombreUsuario=nombreUsuario;
        this.paisNacimiento=paisNacimiento;
        this.lugarResidencia=lugarResidencia;
        this.lenguaMaterna=lenguaMaterna;
        idiomasAprender= new ArrayList<String>();
        tutorias=new ArrayList<Tutorship>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getLenguaMaterna() {
        return lenguaMaterna;
    }

    public void setLenguaMaterna(String lenguaMaterna) {
        this.lenguaMaterna = lenguaMaterna;
    }

    public ArrayList<String> getIdiomasAprender() {
        return idiomasAprender;
    }

    public void setIdiomasAprender(ArrayList<String> idiomasAprender) {
        this.idiomasAprender = idiomasAprender;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Tutorship> getTutorias() {
        return tutorias;
    }

    public void setTutorias(ArrayList<Tutorship> tutorias) {
        this.tutorias = tutorias;
    }
}
