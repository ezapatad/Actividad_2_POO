/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter3_18;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter3_18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo_empleado;
        String nombre_empleado;
        double horas_mes,valor_hora,porcentaje;
        double salario_bruto,salario_neto;
        double retencion_fuente;
                
        System.out.println("Ingrese el codigo del empleado");
        codigo_empleado=scan.nextInt();
        System.out.println("\nIngrese el nombre del empleado");
        scan.nextLine();
        nombre_empleado=scan.nextLine();
        System.out.println("\nIngrese la cantidad de horas trabajadas al mes");
        horas_mes=scan.nextDouble();
        System.out.println("\nIngrese el valor de cada hora trabajada");
        valor_hora=scan.nextDouble();
        System.out.println("\nIngrese el valor de porcentaje de retencion (0-100)");
        retencion_fuente= scan.nextDouble();
        salario_bruto=horas_mes*valor_hora;
        porcentaje=(retencion_fuente/100)*salario_bruto;
        salario_neto=salario_bruto-porcentaje;
        
        
        System.out.println("\n\nCodigo: "+codigo_empleado);
        System.out.println("Nombre: "+nombre_empleado);
        System.out.println("Salario Bruto: "+salario_bruto);
        System.out.println("Salario Neto: "+salario_neto);
    }   
}
