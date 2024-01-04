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
        System.out.println("Ingrese:\n 1 para calcular el area de un cuadrad\n "
                + "2 para calcular el area de un triangulo\n "
                + "3 para calcularc el area de un rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1){
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
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double l;
        double m;
        System.out.println("Ingrese el valor de los lados del cudrado");
        l = entrada.nextDouble();
        m=l*l*l*l;
        System.out.println(m);
        

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double b;
        double a;
        double m;
        System.out.println("Ingrese la altura del alturadel triangulo");
        a = entrada.nextDouble();
        System.out.println("Ingrese la base del alturadel triangulo");
        b = entrada.nextDouble();
        m =(b*a)/2;
        System.out.println(m);
        

    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double b;
        double a;
        double m;
        System.out.println("Ingrese la altura del alturadel triangulo");
        a = entrada.nextDouble();
        System.out.println("Ingrese la base del alturadel triangulo");
        b = entrada.nextDouble();
        m =(b*a);
        System.out.println(m);

    }

}
