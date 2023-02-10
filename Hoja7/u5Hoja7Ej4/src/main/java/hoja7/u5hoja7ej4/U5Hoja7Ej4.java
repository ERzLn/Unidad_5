/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.u5hoja7ej4;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTeclado;
        boolean control=false;
        int contador=0;
        System.out.println("Introduce un numero:");
        do {
                contador++;
        try {
            numTeclado = new Scanner(System.in).nextInt();
            if (numTeclado < 0 || numTeclado > 100) {
                throw new Exception("El numero no se encuentra en un rango entre 0 y 100\nNumero de intentos: "+contador);
               
            }
            else System.out.println("El numero se encuentra en el rango correcto\nNumero de intentos: "+contador);
            control=true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Intruduzca el numero de nuevo:");
            control=false;
        }
        } while (!control);
    }
}
