/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_10;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_inscripcion,estrato;
        double pago_matricula,patrimonio,valor_base;
        String nombres;
        
        valor_base=50000;
        
        System.out.println("Ingrese el numero de inscripcion");
        numero_inscripcion=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese los nombres del estudiante");
        nombres=entrada.nextLine();
        System.out.println("Ingrese el patrimonio");
        patrimonio=entrada.nextDouble();
        System.out.println("Ingrese el estrato");
        estrato=entrada.nextInt();
        
        
        if (patrimonio>2000000 && estrato>3){
            valor_base=valor_base*(1.03);
        }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION"+numero_inscripcion);
        System.out.println("Y NOMBRE "+nombres+" DEBE PAGAR $"+valor_base);
    }
}
