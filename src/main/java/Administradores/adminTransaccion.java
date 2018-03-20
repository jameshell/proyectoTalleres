/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import com.usa.ingenieriarequerimientos.proyectotalleres.DTO.Transaccion;
import java.util.List;

/**
 *
 * @author james
 */
public class adminTransaccion {
    
    private List<Transaccion> listaDeTransacciones; 

    public adminTransaccion(List<Transaccion> listaDeTransacciones) {
        this.listaDeTransacciones = listaDeTransacciones;
    }

    public List<Transaccion> getListaDeTransacciones() {
        return listaDeTransacciones;
    }

    public void setListaDeTransacciones(List<Transaccion> listaDeTransacciones) {
        this.listaDeTransacciones = listaDeTransacciones;
    }

    @Override
    public String toString() {
        return "adminTransaccion{" + "listaDeTransacciones=" + listaDeTransacciones + '}';
    }
    
    
    
}
