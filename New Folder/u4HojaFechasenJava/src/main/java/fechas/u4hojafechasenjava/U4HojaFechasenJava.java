/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fechas.u4hojafechasenjava;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U4HojaFechasenJava {

    public static void main(String[] args) {
        System.out.println("Numero de Letras: ");
        Scanner entrada=new Scanner(System.in);
        int numLetras=entrada.nextInt();
        Letra letr[]=new Letra[numLetras];
        for(int i=0;i<numLetras;i++){
            letr[i]=new Letra();
            letr[i].demora();
            if(letr[i].vencida()){
            letr[i].mostrar();
            }
            else System.out.println("La letra no ha vencido aún, quedan "+letr[i].diasFaltan()+ " dias");
        }
    }
}
