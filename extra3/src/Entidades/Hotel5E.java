/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rebek
 * 
 * Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 
 Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 
 */
public class Hotel5E extends Hotel{
    protected int cantSalones;
    protected int cantSuites;
    protected int cantLimousinas;

    public Hotel5E() {
    }

    public Hotel5E(int cantSalones, int cantSuites, int cantLimousinas, int cantHabitaciones, int nroCamas, int nroPisos, double precioHabitacion, Gym gimnasio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, nroPisos, gimnasio, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimousinas = cantLimousinas;
    }

    

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimousinas() {
        return cantLimousinas;
    }

    public void setCantLimousinas(int cantLimousinas) {
        this.cantLimousinas = cantLimousinas;
    }
    
    @Override
    protected double calcularPrecio(){
        double precioF = this.precioHabitacion + (this.cantLimousinas *15);
        this.setPrecioHabitacion(precioF);
        return precioF;
    }

    @Override
    public String toString() {
        return "Hotel5E{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimousinas=" + cantLimousinas + '}';
    }

    
}
