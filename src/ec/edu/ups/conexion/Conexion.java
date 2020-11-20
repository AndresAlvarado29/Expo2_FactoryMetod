/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.conexion;

import ec.edu.ups.abstracto.Fabrica;
import ec.edu.ups.modelo.ConexionMySQL;
import ec.edu.ups.modelo.ConexionOracle;
import ec.edu.ups.modelo.ConexionVacia;

/**
 *
 * @author Andres
 */
public class Conexion {
    public Fabrica getConexion(String motor){
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
            
        }else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        return new ConexionVacia();
    }
}
