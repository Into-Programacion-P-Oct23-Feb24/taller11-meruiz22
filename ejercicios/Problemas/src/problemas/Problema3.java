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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String r;
        double n;
        double n1;
        double n2;
        double n3;

        System.out.println("Ingrese la primera nota");
        n = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        n3 = entrada.nextDouble();

        r = obtenerParametros(n,n1,n2,n3);
        System.out.println("El promedio de las notas: "
                + n + ", " + n1 + ", " + n2 + ", " + n3 + " es " + r);

    }
    public static String obtenerParametros(double n, double n1, double n2, double n3){
        String c;
        double promedio= (n+n1+n2+n3)/4;
         if (promedio >= 0 && promedio <= 5) {
            c="Regular";
        } else if (promedio <= 8) {
            c= "Bueno";
        } else if (promedio <= 9) {
            c="Muy Bueno";
        } else if (promedio <= 10) {
            c= "Sobresaliente";
        } else {
            c= "Promedio fuera de rango";
        }
      return c;  
    }
    

}
