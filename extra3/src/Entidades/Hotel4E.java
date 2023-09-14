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
 * Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4E extends Hotel{

    public Hotel4E() {
    }

    public Hotel4E(int cantHabitaciones, int nroCamas, int nroPisos, double precioHabitacion, Gym gimnasio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, nroPisos, gimnasio, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
    }

    @Override
    public String toString() {
        return "Hotel4E{" + super.toString() + '}';
    }
    
    
    
    
    
}
