/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_15;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pesoA,pesoB,pesoC,pesoD;
        System.out.println("Ingrese el peso de la esfera A");
        pesoA=scan.nextDouble();
        System.out.println("Ingrese el peso de la esfera B");
        pesoB=scan.nextDouble();
        System.out.println("Ingrese el peso de la esfera C");
        pesoC=scan.nextDouble();
        System.out.println("Ingrese el peso de la esfera D");
        pesoD=scan.nextDouble();
        
        
        if (pesoA==pesoB && pesoA==pesoC){
            if (pesoA<pesoD){
                System.out.println("La esfera D es la de mayor peso");
            }else{
                System.out.println("la esfera D es la de menor peso");
            }
        } else if (pesoA==pesoB && pesoA==pesoD){
            if (pesoA<pesoC){
                System.out.println("La esfera C es la de mayor peso");
            }else{
                System.out.println("la esfera C es la de menor peso");
            }
        } else if (pesoA==pesoC && pesoA==pesoD){
            if (pesoA<pesoB){
                System.out.println("La esfera B es la de mayor peso");
            }else{
                System.out.println("la esfera B es la de menor peso");
            }
        }else{
            if (pesoA>pesoB){
                System.out.println("La esfera A es la mayor peso");
            }else{
                System.out.println("La esfera A es la de menor peso");
            }
            
        }
    }
}
