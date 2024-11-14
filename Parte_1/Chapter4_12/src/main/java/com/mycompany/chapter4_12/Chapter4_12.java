/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter4_12;

/**
 *
 * @author betid
 */
import java.util.Scanner;
public class Chapter4_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombres;
        double num_horas,valor_hora,horas_extra,paga;
        
        System.out.println("Ingrese el nombre del trabajador");
        nombres = scan.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        num_horas=scan.nextDouble();
        System.out.println("Ingrese el valor de las horas");
        valor_hora=scan.nextDouble();
        
        
        if (num_horas>40){
            horas_extra=num_horas%40;
            if (horas_extra>8){
                horas_extra-=8;
                paga=(40*valor_hora)+(16*valor_hora)+(3*horas_extra*valor_hora);
                System.out.println("El trabajador "+nombres+" Devengo: "+paga);
            }else{
            paga=(2*horas_extra*valor_hora)+40*valor_hora;
            System.out.println("El trabajador "+nombres+" Devengo: "+paga);
            }
        } else{
            paga=num_horas*valor_hora;
            System.out.println("El trabajador "+nombres+" Devengo: "+paga);
        }
    }
}
