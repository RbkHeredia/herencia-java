/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rebek
 */
public class Residencia extends ExtraHotelero {
    protected int cantHabitaciones;
    protected boolean descuento;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }
    
    

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
}
