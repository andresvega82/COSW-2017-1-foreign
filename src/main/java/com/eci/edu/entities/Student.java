package com.eci.edu.entities;

import java.util.ArrayList;

/**
 * Created by 2098165 on 2/16/17.
 */
public class Client {
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private String nombreUsuario;
    private String paisNacimiento;
    private String lugarResidencia;
    private String lenguaMaterna;
    private ArrayList<String> idiomasAprender;
    private ArrayList<Tutor> tutorias;
    private String descripcion= null;

    public Client(Integer id, String nombre, String apellido, String correo, Integer telefono, String nombreUsuario, String paisNacimiento, String lugarResidencia, String lenguaMaterna){
        this.id = id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.nombreUsuario=nombreUsuario;
        this.paisNacimiento=paisNacimiento;
        this.lugarResidencia=lugarResidencia;
        this.lenguaMaterna=lenguaMaterna;
        idiomasAprender= new ArrayList<String>();
        tutorias=new ArrayList<Tutor>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id= id;
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

    public ArrayList<Tutor> getTutorias() {
        return tutorias;
    }

    public void setTutorias(ArrayList<Tutor> tutorias) {
        this.tutorias = tutorias;
    }
}
