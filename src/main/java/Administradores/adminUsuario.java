/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import com.usa.ingenieriarequerimientos.proyectotalleres.DTO.Usuario;
import java.util.List;

/**
 *
 * @author james
 */
public class adminUsuario {
    private List<Usuario> listaUsuarios;

    public adminUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "adminUsuario{" + "listaUsuarios=" + listaUsuarios + '}';
    }
}
