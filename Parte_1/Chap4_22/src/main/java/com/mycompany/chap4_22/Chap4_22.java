/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chap4_22;

/**
 *
 * @author betid
 */

import java.util.Scanner;
public class Chap4_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double horas,precio_hora,salario;
        String nombre;
        System.out.println("Ingrese el nombre del empleado");
        nombre=scan.nextLine();
        System.out.println("Ingrese el salario basico por hora");
        precio_hora=scan.nextDouble();
        System.out.println("Numero de horas trabajadas al mes");
        horas=scan.nextDouble();
        
        salario=horas*precio_hora;
        if (salario>450000){
            System.out.println("El empleado "+nombre+" tiene un salario mensual de "+salario);
        }else{
            System.out.println("Empleado "+nombre);
        }
        
        
    }
}
