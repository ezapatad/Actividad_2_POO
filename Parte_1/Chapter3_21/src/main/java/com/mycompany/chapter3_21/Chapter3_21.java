/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter3_21;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter3_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("Ingrese el valor del lado 1:");
        a=scan.nextDouble();
        System.out.println("Ingrese el valor del lado 2:");
        b=scan.nextDouble();
        System.out.println("Ingrese el valor del lado 3");
        c=scan.nextDouble();
        
        Triangle t1 = new Triangle();
        t1.l1=a;
        t1.l2=b;
        t1.l3=c;
        
        t1.Info();
    }
}
