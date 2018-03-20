/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import com.usa.ingenieriarequerimientos.proyectotalleres.DTO.Taller;
import java.util.List;

/**
 *
 * @author james
 */
public class adminTaller {
    private List<Taller> listaDeTalleres;

    public adminTaller(List<Taller> listaDeTalleres) {
        this.listaDeTalleres = listaDeTalleres;
    }
    
    public List<Taller> getListaDeTalleres() {
        return listaDeTalleres;
    }

    public void setListaDeTalleres(List<Taller> listaDeTalleres) {
        this.listaDeTalleres = listaDeTalleres;
    }

    @Override
    public String toString() {
        return "adminTaller{" + "listaDeTalleres=" + listaDeTalleres + '}';
    }
    
    
    
}
