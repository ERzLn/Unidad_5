/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja9.u5hoja9ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja9Ej5 {

    public static void main(String[] args) {
        int aleatorio = (int) Math.floor(Math.random() * 500) + 1;
        System.out.println("(TRAMPA): " + aleatorio);
        int contador = 0;
        boolean valido = false;
        
        do {
            try {

                contador++;
                System.out.println("Introduce el numero que crees que es: ");
                int num = new Scanner(System.in).nextInt();
                if (aleatorio == num) {
                    System.out.println("ENHORABUENA ACERTASTE!!\n EN " + contador + " INTENTOS");
                    valido = true;
                } else {
                    System.out.println("Numero incorrecto\n Numero de intentos: " + contador);
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR. No has introducido un numero entero.");
            }

        } while (!valido);
    }
}
