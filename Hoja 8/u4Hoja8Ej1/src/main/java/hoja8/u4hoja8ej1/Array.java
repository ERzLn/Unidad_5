/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.u4hoja8ej1;

/**
 *
 * @author DAW122
 */
public class Array {
    private int[]vector;

    public Array() {
        vector=new int [10];
    }
    public void mostrar(){
        System.out.println("Los valores del vector son: ");
        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    
}
