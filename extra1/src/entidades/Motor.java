/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;

/**
 *
 * @author rebek
 */
public class Motor extends Barco{
    protected int potenciaCV;

    public Motor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Motor(int potenciaCV, String matricula, int eslora, int anioFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, String barco) {
        super(matricula, eslora, anioFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    @Override
    public Double calcularPrecio(){
        long cantDias = DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
        double total = cantDias * this.eslora * 10;
         total += + potenciaCV*10;
        this.setPrecio(total);
        return total;
    }

    @Override
    public String toString() {
        return "Barco a Motor: potenciaCV=" + potenciaCV;
    }
    
    
    
}
