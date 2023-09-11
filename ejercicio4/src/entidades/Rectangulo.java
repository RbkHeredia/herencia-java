/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.calculoForma;

/**
 *
 * @author rebek
 * 
 * Área rectángulo: base * altura 
* Perímetro rectángulo: (base + altura) * 2.
 */
public class Rectangulo implements calculoForma{
    public double base;
    public double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public Double calculoArea() {
        return base*altura;
    }

    @Override
    public Double calculoPerimetro() {
        return (base+altura)*2;
    }
}
