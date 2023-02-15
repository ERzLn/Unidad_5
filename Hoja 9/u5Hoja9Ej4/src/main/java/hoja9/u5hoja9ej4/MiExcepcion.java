/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.u5hoja9ej4;

/**
 *
 * @author DAW122
 */
public class MiExcepcion extends Exception{
       String mensaje;
       public MiExcepcion(String mensaje) {
            this.mensaje = mensaje;
        }
        public String getMensaje() {
            return mensaje;
        }
    }