/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.u4hoja6ej2;

/**
 *
 * @author DAW122
 */
public class U4Hoja6ej2 {

    public static void main(String[] args) {
        Banco banco=new Banco(1000);
        banco.ingresar(3);
        
        banco.buscar();
        System.out.println("Se elimina");
        banco.eliminar(2);
        System.out.println("Se muestra");
        banco.mostrar(2);
        
        
    }
}
