/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
public class PoliDeportivo extends Edificio{
    
    private String nombre;
    private String tipoInstalacion;

    public PoliDeportivo() {
        
    }

    public PoliDeportivo(String nombre, String tipoInstalacion,Integer alto,Integer largo, Integer ancho) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
        this.ancho=ancho;
        this.alto=alto;
        this.largo=largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
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

    
    
    
    @Override
    public Integer calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public Integer calcularVolumen() {
        return ancho*largo*alto;
    }
    
    /////////////////
    /*
    Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    */
    
    public void tipoTechadoOAbiertos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa porfa el tipo de instalacion del polideportivo...");
        System.out.println("Debe ser: Techado o Abierto.");
        System.out.println("-->");
        tipoInstalacion=leer.nextLine();
        leer.nextLine();
        
    } 

    @Override
    public String toString() {
        return "PoliDeportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
    
    
    
}
