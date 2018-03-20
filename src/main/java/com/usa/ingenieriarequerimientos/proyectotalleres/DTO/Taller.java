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
public class Taller {
    private String nombreTaller;
    private float ratingTaller;
    private float horarioTaller;

    public Taller(String nombreTaller, float ratingTaller,float horarioTaller) {
        this.nombreTaller = nombreTaller;
        this.ratingTaller = ratingTaller;
        this.horarioTaller = horarioTaller;
    }
    
    

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    public float getRatingTaller() {
        return ratingTaller;
    }

    public void setRatingTaller(float ratingTaller) {
        this.ratingTaller = ratingTaller;
    }

    public float getHorarioTaller() {
        return horarioTaller;
    }

    public void setHorarioTaller(float horarioTaller) {
        this.horarioTaller = horarioTaller;
    }

    @Override
    public String toString() {
        return "Taller{" + "nombreTaller=" + nombreTaller + ", ratingTaller=" + ratingTaller + ", horarioTaller=" + horarioTaller + '}';
    }
}
