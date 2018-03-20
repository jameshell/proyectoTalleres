/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ingenieriarequerimientos.proyectotalleres.DTO;

import java.util.Date;
import java.util.List;

/**;
 *
 * @author james
 */
public class Transaccion {
    private int idTransaccion;
    private Date fecha;
    private List<Taller> talleresCerca;

    public Transaccion(int idTransaccion, Date fecha, List<Taller> talleresCerca) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.talleresCerca = talleresCerca;
    }
    
    

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Taller> getTalleresCerca() {
        return talleresCerca;
    }

    public void setTalleresCerca(List<Taller> talleresCerca) {
        this.talleresCerca = talleresCerca;
    }
    
    
}
