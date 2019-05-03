/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operaciones.hijaSuma;
import operaciones.hijaResta;

/**
 *
 * @author damian
 */
public class principal {

    public static void main(String[] args) {

        hijaResta mensajeroResta = new hijaResta();
        mensajeroResta.pedirDatos();
        mensajeroResta.resta();
        System.out.print("la resta da: ");
        mensajeroResta.mostrarResultado();

        hijaSuma mensajeroSuma = new hijaSuma();
        mensajeroSuma.pedirDatos();
        mensajeroSuma.sumar();
        System.out.print("la suma da: ");
        mensajeroSuma.mostrarResultado();

    }
}
