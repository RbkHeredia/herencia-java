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
public class Yate extends Barco{
    protected int potenciaCV;
    protected int nroCamarotes;

    public Yate(int potenciaCV, int nroCamarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.nroCamarotes = nroCamarotes;
    }

    public Yate(int potenciaCV, int nroCamarotes, String matricula, int eslora, int anioFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, String barco) {
        super(matricula, eslora, anioFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.potenciaCV = potenciaCV;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    
    @Override
    public Double calcularPrecio(){
        long cantDias = DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
        double total = cantDias * this.eslora * 10;
        total +=  potenciaCV*10 + nroCamarotes *10;
        this.setPrecio(total);
        System.out.println("precio");
        return total;
    }

    @Override
    public String toString() {
        return "Yate: potenciaCV=" + potenciaCV + ", nroCamarotes=" + nroCamarotes ;
    }
    
    
    
}
