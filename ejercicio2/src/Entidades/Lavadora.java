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
public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoE, double peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    

    @Override
    public String toString() {
        return super.toString() +"Carga:" + carga + ", Precio:" + precio;
    }
    
    public Lavadora crearLavadora(double peso, String color, char consumo, int carga){
        super.crearElectrodomestico(peso, color, consumo);
        this.setCarga(carga);
        super.setPrecio(super.getPrecio()+precioFinal(carga));
        return this;
    }
    
    
    private double precioFinal(int carga){
        double finalP = 0;
        if(carga > 30){
            finalP+= 500;
        }
        return finalP;
    }
    
}
