/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.lang.Object;
import java.lang.Enum;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author rebek
 */
public class Velero extends Barco{
    protected int mastiles;

    public Velero(int mastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, int eslora, int anioFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, String barco) {
        super(matricula, eslora, anioFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public Double calcularPrecio(){
       long cantDias = DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
        double total = cantDias * this.eslora * 10;
        total += mastiles *10;
        this.setPrecio(total);
        return total;
    }

    @Override
    public String toString() {
        return "Velero:" + "mastiles=" + mastiles ;
    }
    
    
}
