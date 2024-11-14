/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_14;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ventas1,ventas2,ventas3,ventastotal,salar,proporcion,salar1,salar2,salar3;
        
        
        System.out.println("Ingrese las ventas del departamento 1");
        ventas1=scan.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2");
        ventas2 = scan.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3");
        ventas3=scan.nextDouble();
        System.out.println("Ingrese el salario de los vendedores del departamento");
        salar=scan.nextDouble();
        
        ventastotal=ventas1+ventas2+ventas3;
        if ((ventas1/ventastotal)>0.3){
            salar1=salar+salar*0.2;
        } else{
            salar1=salar;
        }
        if ((ventas2/ventastotal)>0.3){
            salar2=salar+salar*0.2;
        }else{
            salar2=salar;
        }
        if ((ventas3/ventastotal)>0.3){
            salar3=salar+salar*0.2;
        } else {
            salar3=salar;
        }
        
        System.out.println("Salario Vendededores Departamento 1: "+salar1);
        System.out.println("Salario Vendededores Departamento 2: "+salar2);
        System.out.println("Salario Vendededores Departamento 3: "+salar3);

    scan.close();    
    }
    }
