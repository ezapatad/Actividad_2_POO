/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chap4_23;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chap4_23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double discriminante,real,a,b,c;
        System.out.println("Toda ecuacion de segundo grado se puede escribir de la forma ax^2+bx+c");
        System.out.println("Valor de a");
        a=scan.nextDouble();
        System.out.println("Valor de b");
        b=scan.nextDouble();
        System.out.println("Valor de c");
        c=scan.nextDouble();
        
        discriminante=Math.pow(b,2)-4*a*c;
        real=-b/(2*a);
        
        if (discriminante<0){
            System.out.println("x1 = "+real+" + "+Math.sqrt(-discriminante)/(2*a)+"i");
            System.out.println("x2 = "+real+" - "+Math.sqrt(-discriminante)/(2*a)+"i");
        } else {
            System.out.println("x1 = "+(real+Math.sqrt(discriminante)/(2*a)));
            System.out.println("x1 = "+(real-Math.sqrt(discriminante)/(2*a)));
        }
        
    }
}
