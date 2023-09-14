/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4E;
import Entidades.Hotel5E;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList <Alojamiento> alojamientos = new ArrayList();
        // int cantHabitaciones, int nroCamas, int nroPisos, double precioHabitacion, Gym gimnasio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente
        Hotel4E h1 = new Hotel4E(2, 2, 4, 0, Hotel.Gym.A, "Restaurant1", 30, "Hotel1", "Siempre viva", "Springfield", "Gerente");
        Hotel4E h2 = new Hotel4E(3, 2, 5, 0, Hotel.Gym.B, "Restaurant2", 30, "Hotel2", "Siempre viva", "Springfield", "Gerente");
        Hotel4E h3 = new Hotel4E(4, 2, 8, 0, Hotel.Gym.A, "Restaurant3", 15, "Hotel3", "Siempre viva", "Springfield", "Gerente");
        //(int cantSalones, int cantSuites, int cantLimousinas, int cantHabitaciones, int nroCamas, int nroPisos, double precioHabitacion, Gym gimnasio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente
        Hotel5E H1 = new Hotel5E(2, 3, 8, 3, 2, 6, 0, Hotel.Gym.A, "resto1", 60, "hotel1", "LDLL", "Cba", "alguien");
        Hotel5E H2 = new Hotel5E(2, 5, 15, 3, 2, 6, 0, Hotel.Gym.B, "resto1", 100, "hotelucho", "LDLL", "Cba", "alguien");
        Hotel5E H3 = new Hotel5E(2, 3, 2, 3, 2, 6, 0, Hotel.Gym.A, "resto1", 60, "hotel1", "LDLL", "Cba", "alguien");
        Camping c1 = new Camping(10, 3, true, true, 300, "campingcito", "alta gracia", "alta gracia", "alguien");
        Camping c2 = new Camping(10, 3, false, true, 300, "campingcito", "alta gracia", "alta gracia", "alguien");
        Camping c3 = new Camping(10, 3, true, false, 300, "campingcito", "alta gracia", "alta gracia", "alguien");
        Residencia r1 = new Residencia(5, true, true, true, 200, "residencia", "la calle", "cba", "uno");
        Residencia r2 = new Residencia(5, true, false, true, 200, "residencia", "la calle", "cba", "uno");
        Residencia r3 = new Residencia(5, false, true, false, 200, "residencia", "la calle", "cba", "uno");
        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(h3);
        alojamientos.add(H1);
        alojamientos.add(H2);
        alojamientos.add(H3);
        alojamientos.add(c1);
        alojamientos.add(c2);
        alojamientos.add(c3);
        alojamientos.add(r1);
        alojamientos.add(r2);
        alojamientos.add(r3);
        
        System.out.println("1. Mostrar todos los alojamientos");
        System.out.println("2. Mostrar todos los hoteles de mas caro a mas barato");
        System.out.println("3. Mostrar todos los campings con restaurante");
        System.out.println("4. Mostrar todas las residencias que tienen descuento");
        int opcion = read.nextInt();
        switch(opcion){
            case 1:
                for (Alojamiento alojamiento : alojamientos) {
                    System.out.println(alojamiento.toString());
                }
                break;
            case 2:
                for (Alojamiento alojamiento : alojamientos) {
                    if(alojamiento instanceof Hotel){
                        System.out.println(alojamiento.toString());
                    }
                }
                break;
            case 3:
                for (Alojamiento alojamiento : alojamientos) {
                    if(alojamiento instanceof Camping ){
                        if(((Camping) alojamiento).isRestaurant()){
                            System.out.println(alojamiento.toString());
                        }
                    }
                }
                break;
            case 4:
                for (Alojamiento alojamiento : alojamientos) {
                    if(alojamiento instanceof Residencia ){
                        if(((Residencia) alojamiento).isDescuento()){
                            System.out.println(alojamiento.toString());
                        }
                    }
                }
        }





    }
    
}
