/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_11;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_11 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a,b,c,mayor;
        System.out.println("Ingrese el valor del primer numero");
        a=enter.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        b=enter.nextInt();
        System.out.println("Ingrese el valor del tercer numero");
        c=enter.nextInt();
        
        if (a>b && a>c){
            mayor =a;
            System.out.println("El numero mayor es "+mayor);
        } else if (b>a && b>c){
            mayor = b;
            System.out.println("El numero mayor es "+mayor);
        } else if (c>a && c>b){
            mayor=c;
            System.out.println("El numero mayor es "+mayor);
        } else {
            System.out.println("Hay minimo dos numeros mayores iguales");
        }
        
    }
}
