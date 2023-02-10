/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.u5hoja7ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int entero = 0;
        double doubl = 0.0;
        boolean a=false;
        while (a) {
            System.out.print("Ingrese un número entero: ");
            try {
                entero = entrada.nextInt();
                a=true;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                entrada.nextLine();
            }
        }
        a=true;
        while (a) {
            System.out.print("Ingrese un número de tipo Double: ");
            try {
                doubl = entrada.nextDouble();
                a=false;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número de tipo Double válido.");
                entrada.nextLine();
            }
        }

        System.out.println("Número entero introducido: " + entero);
        System.out.println("Número de tipo Double introducido: " + doubl);
    }
}
    
