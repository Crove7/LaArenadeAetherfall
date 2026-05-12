/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    public static int aleatorio() {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;

        System.out.println("SE ARROJA UN DADO.......(" + num + ")");
        return num;
    }

    public static void saltoDeLinea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("PRESIONE ENTER...");
        scan.nextLine();
    }

    public static void limpiar() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
}
