/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojamain.u4hoja8ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Array {

    private int[] vector;

    public Array() {
        this.vector = new int[10];

    }

    public void mostrar() {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector " + i + " = " + vector[i]);
        }
    }

    public void introducir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los 10 valores (enteros):");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }
    }

    public int media() {
        int i = 0;
        int suma = 0;
        for (i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma / (i + 1);
    }

    public void modificar(int num, int pos) {
        vector[(pos - 1)] = num;
    }

    public void rotarIzquierda() {
        int primero = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                vector[i] = vector[(i + 1)];
            } else {
                vector[i] = primero;
            }
        }
    }

    public void rotarDerecha() {
        int ultimo = vector[(vector.length - 1)];
        for (int i = (vector.length - 1); i >= 0; i--) {
            if (i > 0) {
                vector[i] = vector[(i - 1)];
            } else {
                vector[i] = ultimo;
            }
        }
    }

    public void comparar(Array a) {

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < a.vector.length; j++) {
                if (vector[i] == a.vector[j]) {
                    System.out.println("Coincide: " + vector[i]);
                }
            }
        }
    }

    public void sumaPares() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                suma += vector[i];
            }
        }
        System.out.println("La suma de los numeros pares es: " + suma);
    }

    public void multiplos(int num) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (i + 1) * num;
        }
    }

}
