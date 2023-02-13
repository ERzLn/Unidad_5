/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.u5hoja7ej5;

/**
 *
 * @author Eloy
 */
public class Principal {

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
    /*
      public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
     */
}
