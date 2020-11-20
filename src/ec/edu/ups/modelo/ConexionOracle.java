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
public class ConexionOracle implements Fabrica {
 private String host;
 private String puerto;
 private String usuario;
 private String contraseña;

    public ConexionOracle() {
        this.host = "localHost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contraseña = "123";
    }

    @Override
    public void conectar() {
        System.out.println("Se conecto");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto");
    }
    

 
   
 
 
}
