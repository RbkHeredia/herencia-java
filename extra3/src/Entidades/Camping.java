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
public class Camping extends ExtraHotelero{
    protected int capacidadCarpas;
    protected int cantBanios;
    protected boolean restaurant;

    public Camping() {
    }

    public Camping(int capacidadCarpas, int cantBanios, boolean restaurant, boolean privado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }
    
    

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadCarpas=" + capacidadCarpas + ", cantBanios=" + cantBanios + ", restaurant=" + restaurant + '}';
    }
    
    
}
