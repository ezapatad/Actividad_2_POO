/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasfiguras;

/**
 *
 * @author betid
 */
public class Rectangulo {
    int base,altura;
    public Rectangulo(int base,int altura){
        this.altura=altura;
        this.base=base;
    }
    
    public double calcularArea(){
        return base*altura;
    }
    
    public double calcularPerimetro(){
        return 2*base+2*altura;
    }
}
