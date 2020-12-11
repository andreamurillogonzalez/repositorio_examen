/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_examen;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Proyecto_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
      System.out.println("Opción 1 = horas a segundos");
        System.out.println("Opción 2 = kilometros a metros");
        System.out.println("Opción 3 = salir");
        System.out.println("Elige una de las opciones (1, 2 o 3): ");
        int caso = teclado.nextInt();
        System.out.println("Introduce un número: ");
        int número= teclado.nextInt();
        for (int i = 0; i < 3; i++) {
            
        switch (caso){
            case 1:
                System.out.println("Introduce un las horas: ");
                int horas = teclado.nextInt();
                double segundos = horas*3600;
                System.out.println("Segundos: "+segundos);
                break;
            case 2:
                System.out.println("Introduce un los km: ");
                int km = teclado.nextInt();
                double m = km * 1000;
                System.out.println("Metros: "+m);
                break;
	}

    }
     }
}
