/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplogit.u4hoja2ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Invierno {

  
    private double ar[];

    public Invierno(int n) {
        ar= new double[n];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce la " + i + "º temperatura: ");
            Scanner entrada = new Scanner(System.in);
            ar[i] = entrada.nextDouble();
        }
    }

    public double tempMedia() {

        double tempMedia = 0;
        for (int i = 0; i < ar.length; i++) {
            tempMedia += ar[i];
        }
        return tempMedia;
    }

    public void fahrenheit() {
        for (int i = 0; i < ar.length; i++) {
            double[] ar2 = new double[ar.length];
            ar2[i] = (ar[i] * 1.8 + 32);
            System.out.println("fahrenheit " + (i + 1) + "= " + ar2[i]);
        }
    }

    @Override
    public String toString() {
       return "";

       
    }

}
