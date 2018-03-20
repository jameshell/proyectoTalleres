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
public class Administrador {
    private String nombreAdmin;
    private String apellidoAdmin;
    private int idAdmin;
    private int autorizacionAdmin;
    private String correoAdmin;

    public Administrador(String nombreAdmin, String apellidoAdmin, int idAdmin, int autorizacionAdmin, String correoAdmin) {
        this.nombreAdmin = nombreAdmin;
        this.apellidoAdmin = apellidoAdmin;
        this.idAdmin = idAdmin;
        this.autorizacionAdmin = autorizacionAdmin;
        this.correoAdmin = correoAdmin;
    }

    
    
    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getApellidoAdmin() {
        return apellidoAdmin;
    }

    public void setApellidoAdmin(String apellidoAdmin) {
        this.apellidoAdmin = apellidoAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getAutorizacionAdmin() {
        return autorizacionAdmin;
    }

    public void setAutorizacionAdmin(int autorizacionAdmin) {
        this.autorizacionAdmin = autorizacionAdmin;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombreAdmin=" + nombreAdmin + ", apellidoAdmin=" + apellidoAdmin + ", idAdmin=" + idAdmin + ", autorizacionAdmin=" + autorizacionAdmin + ", correoAdmin=" + correoAdmin + '}';
    }
    
    
    
}
