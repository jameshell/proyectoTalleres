/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ingenieriarequerimientos.proyectotalleres.DTO;

/**
 *
 * @author james
 */
public class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String idUsuario;
    private String correoUsuario;
    private String contraseñaUsuario;
    private String latitud;
    private String longitud;
    private float creditosUsuario;
    private String loginStatus;

    public Usuario(String nombreUsuario, String apellidoUsuario,String latitud, String longitud, String idUsuario, String correoUsuario, String contraseñaUsuario, float creditosUsuario, String loginStatus) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.idUsuario = idUsuario;
        this.latitud = latitud;
        this.longitud = longitud;
        this.correoUsuario = correoUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.creditosUsuario = creditosUsuario;
        this.loginStatus = loginStatus;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public float getCreditosUsuario() {
        return creditosUsuario;
    }

    public void setCreditosUsuario(float creditosUsuario) {
        this.creditosUsuario = creditosUsuario;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
    
    
    
}
