/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.abstracto.Fabrica;

/**
 *
 * @author Andres
 */
public class ConexionVacia implements Fabrica {

    @Override
    public void conectar() {
        System.out.println("no se  especifico un provedor");
    }

    @Override
    public void desconectar() {
        System.out.println("desconexion por no encontar un provedor");
    }
    
}
