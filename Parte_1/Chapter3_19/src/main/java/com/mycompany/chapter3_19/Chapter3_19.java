/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter3_19;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter3_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side;
        System.out.println("Ingrese el valor del lado del triangulo equilatero:");
        side = scan.nextDouble();
        Triangulo t1 = new Triangulo(side);
        t1.Info();
    }
}
