/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebajava1;

import java.util.Scanner;

/**
 *
 * @author jonathan.medesc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Dias = 0;
        double Dialunar = 1.111492;
        int Meslunar = 0;
        int AnioLunar = 0;
        double resultadoDia = 0;
        System.out.println("introduce un numero de dias terrestres");
        Dias = sc.nextInt();
        while (Dias > 1000 || Dias < 0) {

            System.out.println("error introduce un numero del 1 al 1000");
            Dias = sc.nextInt();

        }

        resultadoDia = (int) (Dias * Dialunar);

        if (Dias > 30) {
            Meslunar = 1;
            Meslunar++;

        } else if (Dias > 365) {
            AnioLunar = +1;
            AnioLunar++;

        }
        System.out.println("dia lunar: " + resultadoDia + " Mes lunar: " + Meslunar + " Año lunar: " + AnioLunar);

    }
}
