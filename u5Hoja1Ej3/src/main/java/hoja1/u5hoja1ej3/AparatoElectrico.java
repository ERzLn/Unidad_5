/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.u5hoja1ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class AparatoElectrico {
    public static double consumoTotal;
    private double potencia;
    private boolean encendido;

    public AparatoElectrico() {
        System.out.println("Potencia (Kw):");
        Scanner entrada=new Scanner(System.in);
        potencia=entrada.nextDouble();
        encendido=false;
        System.out.println("Consumo total (Kw): "+consumoTotal);
    }
    public void encender(){
        encendido=true;
        consumoTotal+=potencia;
        System.out.println("Consumo total (Kw): "+consumoTotal);
    }
}