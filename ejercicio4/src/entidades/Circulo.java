/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Área circulo: PI * radio ^ 2 
* Perímetro circulo: PI * diámetro.
 */
package entidades;

import interfaces.calculoForma;

/**
 *
 * @author rebek
 */
public class Circulo implements calculoForma{
    public double radio;
    public double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public Double calculoArea() {
        return PI * radio*radio;
    }

    @Override
    public Double calculoPerimetro() {
        return PI * diametro;
    }
    
}
