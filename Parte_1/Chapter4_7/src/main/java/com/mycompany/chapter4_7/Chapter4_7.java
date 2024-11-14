/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_7;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b;
        System.out.println("Ingrese el valor de a");
        a=entrada.nextDouble();
        System.out.println("Ingrese el valor de b");
        b=entrada.nextDouble();
        
        if (a>b){
            System.out.println(a+" es mayor que "+b);
        } else if (a==b){
            System.out.println(a+" es igual a "+b);
        } else {
            System.out.println(a+" es menor que "+b);
        }
    }
}
