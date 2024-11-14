/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_24;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_24 {

    public static void main(String[] args) {
        double pesoA,pesoB,pesoC;
        Scanner scan = new Scanner(System.in);
        System.out.println("Peso de la esfera A");
        pesoA = scan.nextDouble();
        System.out.println("Peso de la esfera B");
        pesoB= scan.nextDouble();
        System.out.println("Peso de la esfera C");
        pesoC = scan.nextDouble();
        
        if (pesoA>pesoB && pesoA>pesoC){
            System.out.println("La esfera de mayor peso es la A");
        } else if (pesoB>pesoA && pesoB>pesoC) {
            System.out.println("la esfera de mayor peso es la B");
        } else {
            System.out.println("La esfera de mayor peso es la C");
        }
        
    }
}
