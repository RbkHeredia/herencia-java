/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
public class EdificioDeOficinas extends Edificio {
    
    private Integer numOficinas;
    private Integer cantidadPersonas;
    private Integer numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer alto,Integer largo
            , Integer ancho) {
        this.numOficinas = 0;
        this.cantidadPersonas = 0;
        this.numPisos = 0;
        this.ancho=ancho;
        this.alto=alto;
        this.largo=largo;
    }

    

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantidadPersonas=" + cantidadPersonas + ", numPisos=" + numPisos + '}';
    }

    ////////////// Metodos de la clase madre//////////////////
    @Override
    public Integer calcularSuperficie() {
        return ancho*largo*numPisos;
    }

    @Override
    public Integer calcularVolumen() {
        return ancho*largo*alto;
    }
    
    ////////////
    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    */
    
    public void cantPersonas(){
        Scanner leer=new Scanner(System.in);
        Integer totalPersonas=1;
        
        System.out.println("Ingresa por favor la cantidad de personas por oficina.");
        System.out.println("-->");
        cantidadPersonas=leer.nextInt();
        System.out.println("Ingresa por favor la cantidad de oficinas en total, seguido del numero de pisos.");
        System.out.println("-->");
        numPisos=leer.nextInt();
        numOficinas=numPisos;
        totalPersonas=numOficinas*cantidadPersonas;
        
        System.out.println("Cantidad personas por oficinas: "+cantidadPersonas);
        System.out.println("Cantidad personas: "+totalPersonas);
        
        
        
    }
    
}
