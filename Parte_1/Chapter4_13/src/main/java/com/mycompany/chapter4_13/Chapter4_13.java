/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_13;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio_compra,paga,descuento;
        String col;
        
        System.out.println("Ingrese el precio de la compra");
        precio_compra=scan.nextDouble();
        scan.nextLine();
        System.out.println("Ingrese el color");
        col=scan.nextLine();
        
        if (col.toLowerCase().equals("blanca")){
            descuento=0;
        } else if (col.toLowerCase().equals("verde")){
            descuento=0.1;
        } else if (col.toLowerCase().equals("amarilla")){
            descuento=0.25;
        } else if (col.toLowerCase().equals("azul")){
            descuento=0.5;
        } else {
            descuento=1;
        }
        paga=precio_compra-precio_compra*descuento;
        System.out.println("El cliente debe pagar "+paga);
    }
}
