/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public class padre {

    Scanner in = new Scanner(System.in);
    protected int a, b, r;

    public void pedirDatos() {
        System.out.print("Dame el primer valor: ");
        a = in.nextInt();

        System.out.print("Dame el segundo valor: ");
        b = in.nextInt();
    }

    public void mostrarResultado() {
        System.out.println(r);
    }
}
