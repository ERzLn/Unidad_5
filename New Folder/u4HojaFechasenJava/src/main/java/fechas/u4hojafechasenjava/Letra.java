/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.u4hojafechasenjava;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Letra {

    private int numLetra;
    private double importe;
    private LocalDate fechaVencimiento;
    private String titular;

    public Letra() {
        System.out.println("Introduce el numero de letra: ");
        Scanner entrada = new Scanner(System.in);
        numLetra = entrada.nextInt();
        System.out.println("Introduce el titular: ");
        titular = new Scanner(System.in).nextLine();
        System.out.println("Introduce el importe: ");
        importe = new Scanner(System.in).nextDouble();
        System.out.println("Introduce el año de vencimiento: ");
        int anio = new Scanner(System.in).nextInt();
        System.out.println("Introduce el mes de vencimiento: ");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Introduce el dia de vencimiento: ");
        int dia = new Scanner(System.in).nextInt();
        fechaVencimiento = LocalDate.of(anio, mes, dia);
    }

    public boolean vencida() {
        boolean vencida = fechaVencimiento.isBefore(LocalDate.now());
        return vencida;
    }

    public void demora() {
        System.out.println("Introduce los dias de demora: ");
        Scanner entrada = new Scanner(System.in);
        int demora = entrada.nextInt();
        fechaVencimiento = fechaVencimiento.plus(Period.ofDays(demora));
    }

    public int diasFaltan() {
        int diasFaltan = 0;
        if (!this.vencida()) {
            diasFaltan = (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
            return diasFaltan;
        }
        return diasFaltan;
    }

    public void mostrar() {
        System.out.println("Numero de letra: " + numLetra + "\n Titular: " + titular + "\n Importe: " + importe + "\n Fecha de Vencimiento: " + fechaVencimiento + "\n Vencida: " + this.vencida() + "\n Dias que faltan: " + this.diasFaltan());
    }

    public String getTitular() {
        return titular;
    }
    
}
