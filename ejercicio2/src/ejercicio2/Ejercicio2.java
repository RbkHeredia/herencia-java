/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author rebek
 * 
 * el ejercicio se encuentra en ejercicio.txt
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico();
        //e1.crearElectrodomestico();
        //System.out.println(e1.toString());
        Lavadora l1 = new Lavadora();
        l1.crearLavadora(10, "rojo", 'c', 35);
        
        Lavadora l2 = new Lavadora();
        l2.crearLavadora(15, "blanco", 'h', 15);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        
        Televisor t1 = new Televisor();
        t1.crearTelevisor(15, "negro", 'b', 35, true);
        System.out.println(t1.toString());
    }
    
}
