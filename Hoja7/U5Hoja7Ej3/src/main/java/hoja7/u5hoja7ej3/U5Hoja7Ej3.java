/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTeclado;
        boolean control = false;
        System.out.println("Introduce un numero:");
        do {
            try {
                numTeclado = new Scanner(System.in).nextInt();
                if (numTeclado < 0 || numTeclado > 100) {
                    throw new Exception("El numero no se encuentra en un rango entre 0 y 100");
                } else {
                    System.out.println("El numero se encuentra en el rango correcto");
                }
                control = true;

            } catch (InputMismatchException ex) {
                System.out.println("error no es un numero valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Intruduzca el numero de nuevo:");
                control = false;
            }
        } while (!control);
    }
}
