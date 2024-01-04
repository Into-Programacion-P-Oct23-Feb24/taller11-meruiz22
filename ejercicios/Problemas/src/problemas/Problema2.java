/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        System.out.println("Ingrese: 1 para calcular el area de un cuadrad\n "
                + "2 para calcular el area de un triangulo\n "
                + "3 para calcularc el area de un rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else if (opcion == 2) {
            obtenerAreaTriangulo();
        } else if (opcion == 3) {
            obtenerAreaRectangulo();

            {

            }
        }

    }

    public static void obtenerAreaCuadrado() {
        double l;
        double m;
        System.out.println("Ingrese el valor de los lados del cudrado");
        l = entrada.nextDouble();

    }

    public static void obtenerAreaTriangulo() {

    }

    public static void obtenerAreaRectangulo() {

    }

}
