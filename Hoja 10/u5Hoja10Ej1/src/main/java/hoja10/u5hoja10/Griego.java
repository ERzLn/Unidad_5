/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.u5hoja10;

import hoja10.u5hoja10ej2.Teclado;

/**
 *
 * @author DAW122
 */
public class Griego extends Guerrero {

    public Griego(String NOMBRE, int edad, int fuerza) {
        super(NOMBRE, edad, fuerza);
    }
    public Griego(){
        Teclado.tecladoGuerrero();
    }

    @Override
    public boolean retirarse() {
        boolean retirarse = false;
        if (super.isHerido()) {
            retirarse = true;
        }
        return retirarse;
    }
}
