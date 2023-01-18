/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.u5hoja1ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Bombilla {
    public static boolean icp;
    private boolean interruptor;

    public Bombilla() {
    }
    public boolean estadoInterruptor(){
        System.out.println("Interruptor encendido?:");
        Scanner entrada=new Scanner(System.in);
        String estado=entrada.nextLine();
        interruptor=estado.equalsIgnoreCase("SI");
        return interruptor;
    }
    public static boolean estadoIcp(){
        System.out.println("Icp encendido?:");
        Scanner entrada=new Scanner(System.in);
        String estado=entrada.nextLine();
        icp=estado.equalsIgnoreCase("SI");
        return icp;
    }
    public boolean estadoBombilla(){
        return icp&&interruptor;
    }
}
