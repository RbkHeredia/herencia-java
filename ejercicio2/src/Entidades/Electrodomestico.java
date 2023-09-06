/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Electrodomestico {
        protected double precio;
        protected String color;
        protected char consumoE;
        protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoE, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "Color:" + color + ", Consumo Electrico:" + consumoE + ", Peso:" + peso;
    }
        
    Scanner read = new Scanner(System.in);
    private char comprobarConsumoEnergetico(char letra){
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f'};
        char result = 'f';
        for (char let : letras) {
            if(Character.compare(let, letra) == 0){
                result = let;
            } 
        }
        return result;
    }
    
    private String comprobarColor(String color){
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        String result = "blanco";
        for (String col : colores) {
            if(col.equals(color)){
                result = color;
            } 
        }
        return result;
    }
    
    public Electrodomestico crearElectrodomestico(double peso, String color, char consumo){
         this.setPeso(peso);
         this.setColor(comprobarColor(color));
         this.setConsumoE(comprobarConsumoEnergetico(consumo));
         this.setPrecio(precioFinal(consumo, peso));
        return this;
    }
    
    protected double precioFinal(char letra, double peso){
        double finalP = 1000;
        switch(letra){
            case 'a':
                finalP+= 1000;
                break;
            case 'b':
                finalP+=800;
                break;
            case'c':
                finalP+=600;
                break;
            case 'd':
                finalP+=500;
                break;
            case 'e':
                finalP+=300;
                break;
            case 'f':
                finalP+=100;
                break;
        }
        if(peso>=1 && peso<20){
            finalP+=100;
        }
        if(peso>=20 && peso<50 ){
            finalP+=500;
        }
        if(peso>=50 && peso<80){
            finalP+=800;
        }
        if(peso>=80){
            finalP+=1000;
        }
        return finalP;
    }
}
