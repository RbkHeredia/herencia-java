/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import entidades.Motor;
import entidades.Velero;
import entidades.Yate;
import java.time.LocalDate;

/**
 *
 * @author rebek
 * 
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Velero v1 = new Velero(2, "AMS452", 3, 2020, "Perla Negra", 35785143, LocalDate.of(2023,9,10) , LocalDate.of(2023,9,13), 55, "barco");
        System.out.println(v1.calcularPrecio());
        
        Motor m1 = new Motor(25, "matricula", 10, 5, "Moby Dick", 35481321, LocalDate.of(2023,9,5), LocalDate.of(2023,9,20), 10, "motor");
        System.out.println(m1.calcularPrecio());
        
        Yate y1 = new Yate(35, 40, "uno111", 10, 2021, "Titanic", 35646110, LocalDate.of(1966, 5, 12), LocalDate.of(2023,9,12), 8, "crucero");
        System.out.println(y1.calcularPrecio());
    }
    
}
