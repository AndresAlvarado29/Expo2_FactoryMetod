/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.abstracto.Fabrica;
import ec.edu.ups.conexion.Conexion;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Principal {
     public static void main(String[] args){
     String p1;
     Conexion co = new Conexion();
     Scanner escribir = new Scanner(System.in);
         System.out.println("Ingrese el nombre de un provedor");
     p1=escribir.next();
     Fabrica co1 = co.getConexion(p1);
     co1.conectar();
     co1.desconectar();
     p1=escribir.next();
     Fabrica co2 = co.getConexion(p1);
     co2.conectar();
     co2.desconectar();
     p1=escribir.next();
     Fabrica co3 = co.getConexion(p1);
     co3.conectar();
     co3.desconectar();
     }
}
