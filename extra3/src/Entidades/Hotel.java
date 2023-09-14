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
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
* 
* El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
 */
public class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int nroCamas;
    protected int nroPisos;
    protected double precioHabitacion = calcularPrecio();
    public enum Gym {
        A, B
    }
    protected Gym gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel() {
    }


    public Hotel(int cantHabitaciones, int nroCamas, int nroPisos, Gym gimnasio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.nroPisos = nroPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    
    
    

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    
    public Gym getGimnasion() {
        return gimnasio;
    }

    public void setGimnasion(Gym gimnasion) {
        this.gimnasio = gimnasion;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", nroPisos=" + nroPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
    protected double calcularPrecio(){
        double finalP = 50;
        int capacidad = this.nroPisos * this.cantHabitaciones * this.nroCamas;
        int valorR;
        if(this.capacidadRestaurante<30){
            valorR = 10;
        } else if(this.capacidadRestaurante <50){
            valorR = 30;
        } else {
            valorR = 50;
        }
        int valorGym;
        if(this.gimnasio == Gym.A){
            valorGym = 50;
        } else valorGym = 30;
        finalP = finalP + capacidad + valorR + valorGym;
        return finalP;
    }
    
}
