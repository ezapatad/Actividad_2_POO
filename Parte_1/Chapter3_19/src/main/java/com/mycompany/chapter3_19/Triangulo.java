/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter3_19;

/**
 *
 * @author betid
 */
public class Triangulo {
    private double lado;
    public Triangulo(double l){
    this.lado=l;
    }
    
    public double height(){
        double height;
        height=Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2));
        return height;
    }
    
    public double Area(){
        return (lado*height())/2;
    }
    
    public double Perimeter(){
        return 3*lado;
    }
    
    public void Info(){
        System.out.println("Altura: "+height());
        System.out.println("Perimetro: "+Perimeter());
        System.out.println("Area: "+Area());
    }
}
