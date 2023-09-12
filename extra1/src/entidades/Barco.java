/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author rebek
 */
public class Barco extends Alquiler {
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco(String matricula, int eslora, int anioFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, String barco) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    @Override
    public Double calcularPrecio(){
   
        return this.precio;
    }

    @Override
    public String toString() {
        return "Barco: matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion ;
    }
    
    
}
