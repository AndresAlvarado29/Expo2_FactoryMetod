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
public class ConexionMySQL implements Fabrica {
 private String host;
 private String puerto;
 private String usuario;
 private String contraseña;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
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
