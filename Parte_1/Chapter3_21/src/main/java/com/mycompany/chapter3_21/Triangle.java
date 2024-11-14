/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter3_21;

/**
 *
 * @author betid
 */
public class Triangle {
    public double l1,l2,l3;
    
    public double Perimetro(){
        return (l1+l2+l3);
    }
    
    public double Semiperimetro(){
        return (l1+l2+l3)/2;
    }
    
    public double Area(){
        double a;
        a=Semiperimetro()*(Semiperimetro()-l1)*(Semiperimetro()-l2)*(Semiperimetro()-l3);
        return Math.sqrt(a);
    }
    
    public void Info(){
        System.out.println("\nPerimetro: "+Perimetro());
        System.out.println("Semiperimetro: "+Semiperimetro());
        System.out.println("Area: "+Area());
    }
}
