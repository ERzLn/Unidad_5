/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.u5hoja1ej2;

/**
 *
 * @author DAW122
 */
public class U5Hoja1Ej2 {

    public static void main(String[] args) {
        Bombilla.estadoIcp();
        Bombilla bombilla1=new Bombilla();
        bombilla1.estadoInterruptor();
        if(bombilla1.estadoBombilla()) System.out.println("La bombilla está encendida.");
        else System.out.println("La bombilla está apagada");
    }
}
