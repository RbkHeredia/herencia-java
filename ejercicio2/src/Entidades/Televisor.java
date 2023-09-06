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
public class Televisor extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizador;

    public Televisor(){
        
    }
    
    public Televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumoE, double peso) {
        super(precio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return super.toString() + "Resolucion:" + resolucion + ", Sintonizador:" + sintonizador + ", Precio: " + precio;
    }

    
    public Televisor crearTelevisor(double peso, String color, char consumo, int resolucion, boolean sintonizador){
        super.crearElectrodomestico(peso, color, consumo);
        this.setResolucion(resolucion);
        this.setSintonizador(sintonizador);
        this.setPrecio(precioFinal(super.getPrecio(), resolucion, sintonizador));
        return this;
    }
    
    private double precioFinal(double precio, int resolucion, boolean sintonizador){
        double finalP = precio;
        if(resolucion >40){
            finalP = precio + (precio*0.3);
        }
        if(sintonizador){
            finalP+=500;
        }
        return finalP;
    }
    
    
}
