/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasfiguras;

/**
 *
 * @author betid
 */
public class Cuadrado {
    int lado;
    
    public Cuadrado(int lado){
        this.lado=lado;
    }
    
    public double calcularArea(){
        return Math.pow(lado,2);
    }
    
    public double calcularPerimetro(){
        return 4*lado;
    }
}
