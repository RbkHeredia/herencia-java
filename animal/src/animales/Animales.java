/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rebek
 * 
 * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
* 
* Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
* Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
perro1.Alimentarse();
Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "chihuahua");
perro2.Alimentarse();
Animal gato1 = new Gato("pelusa", "galletas", 15, "siames");
gato1.Alimentarse();
Animal caballo1 = new Caballo("Spark", "pasto", 25, "fino");
caballo1.Alimentarse();
* 
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
//        Animal a = new Animal();
//        Animal b = new Perro();
//        Animal c = new Gato();
//        
//        animales.add(a);
//        animales.add(b);
//        animales.add(c);
//        
//        
//        for (Animal animal : animales) {
//            System.out.println(animal.hacerRuido());
//        }
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");

            perro1.alimentarse();
            Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "chihuahua");
            perro2.alimentarse();
            Animal gato1 = new Gato("pelusa", "galletas", 15, "siames");
            gato1.alimentarse();
            Animal caballo1 = new Caballo("Spark", "pasto", 25, "fino");
            caballo1.alimentarse();
    }
    
    
    
}
