/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.u5hoja10ej2;

import hoja10.u5hoja10.Griego;
import hoja10.u5hoja10.Guerrero;

/**
 *
 * @author Eloy
 */
public class Caballo implements PuedeMontarse{

    public final int CAPACIDAD;
    private int ocupacion;
    private Guerrero[] ocupantes;

    public Caballo(Guerrero[] guerreros) {

        boolean todosGriegos = true;
        for (int i = 0; i < guerreros.length; i++) {
            if (!(guerreros[i] instanceof Griego)) {
                todosGriegos = false;
            }
        }
        if (todosGriegos) {
            CAPACIDAD = guerreros.length;
            this.ocupantes = new Guerrero[CAPACIDAD];
            
        } else {
           CAPACIDAD = 100;
           this.ocupantes = new Guerrero[0];
           }
    }

    public Caballo(Guerrero guerr, int CAPACIDAD) {
        this.CAPACIDAD = CAPACIDAD;
        if (guerr instanceof Griego) {

        }
    }

    public void ordenar() {
        for (int i = 0; i < (ocupantes.length - 1); i++) {
            if (ocupantes[(i + 1)].getFuerza() > ocupantes[i].getFuerza()) {
                Guerrero aux = ocupantes[i];
                ocupantes[i] = ocupantes[(i + 1)];
                ocupantes[(i + 1)] = aux;
                i = -1;
            }
        }
    }

    public int buscar(String nombre) {
        this.ordenar();
        int posicion = -1;
        for (int i = 0; i < ocupantes.length; i++) {
            if (ocupantes[i].getNOMBRE().equalsIgnoreCase(nombre)) {
                posicion = (i + 1);
            }

        }
        return posicion;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    @Override
    public int montar(Guerrero g) {
         if(g instanceof Griego){
             if(this.CAPACIDAD>this.ocupacion){
                 ocupantes[ocupacion]=g;
                 ocupacion++;
                 return ocupacion;}
             else return -1;
         }else return -2;
        }

    @Override
    public void desmontar() {
    this.ocupacion=0;
    this.ocupantes=new Guerrero[0];
    }
}
