/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        boolean bandera = true;
        int i;
        int P;
        System.out.print("Escriba el nombre del cliente:");
        nombre = entrada.nextLine();
        System.out.print("Escriba la cedula del cliente:");
        cedula = entrada.nextLine();

        while (bandera) {
            System.out.println("Digite 1 para calcular el valor de la luz o "
                    + "2 para calcular el valor del predio");
            i = entrada.nextInt();
            if (i == 1) {
                calcularValorLuz(nombre, cedula);
            } else if (i == 2) {
                obtenerPredio(nombre, cedula);
            } else {
                System.out.print("Valor no permitido");
            }
            System.out.println("Si desea salir digite 0 "
                    + "caso contrario digite otro numero");
            P = entrada.nextInt();
            if (P == 0) {
                bandera = false;

            }
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorKilowatio;
        double mesKilowatio;
        double costo;
        System.out.print("Valor kilowatio:");
        valorKilowatio = entrada.nextDouble();
        System.out.print("Numero de kilowatio del mes:");
        mesKilowatio = entrada.nextDouble();
        costo = valorKilowatio * mesKilowatio;
        System.out.printf("El cliente %s con cedula %s debe cancelar "
                + "el valor de %.2f\n",
                nombre,
                cedula,
                costo);

    }

    public static void obtenerPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double predio;
        System.out.print("Valor del inmueble:");
        valorInmueble = entrada.nextDouble();
        predio = valorInmueble * 0.02;
        System.out.printf("El cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio %.2f\n",
                nombre,
                cedula,
                valorInmueble,
                predio);

    }

}
