/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_10;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double pesoA,pesoB,pesoC,pesoD;
        System.out.println("Por favor ingrese el peso de la pelota A:");
        pesoA = lector.nextDouble();
        System.out.println("Por favor ingrese el peso de la pelota B:");
        pesoB = lector.nextDouble();
        System.out.println("Por favor ingrese el peso de la pelota C:");
        pesoC = lector.nextDouble();
        System.out.println("Por favor ingrese el peso de la pelota D:");
        pesoD = lector.nextDouble();
        
        if (pesoA==pesoB&&pesoA==pesoC) {
            if (pesoA>pesoD) {
                System.out.println("La esfera D es la diferente y es de menor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }
        } else {
            if (pesoA==pesoB&&pesoA==pesoD) {
            if (pesoA>pesoC) {
                System.out.println("La esfera C es la diferente y es de menor peso");
            } else {
                System.out.println("La esfera C es la diferente y es de mayor peso");
            }
        } else {
                if (pesoA==pesoC&&pesoA==pesoD) {
            if (pesoA>pesoB) {
                System.out.println("La esfera B es la diferente y es de menor peso");
            } else {
                System.out.println("La esfera B es la diferente y es de mayor peso");
            }
        } else {
                    if (pesoA>pesoB) {
                System.out.println("La esfera A es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
                }
            }
        }
    }
}
