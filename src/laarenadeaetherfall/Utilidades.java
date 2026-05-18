/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

import java.util.Random;
import java.util.Scanner;

public interface Utilidades {

    public static int aleatorio() {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;

        System.out.println("SE ARROJA UN DADO.......(" + num + ")");
        return num;
    }
    public static int aleatorioSinTexto() {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;

        
        return num;
    }


    public static void detener() {
        Scanner scan = new Scanner(System.in);
        System.out.println("PRESIONE ENTER...");
        scan.nextLine();
    }

    public static void limpiar() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
    public static int ingresoNUM() {
    Scanner scan = new Scanner(System.in);
    
    
    int numero = scan.nextInt(); 
    scan.nextLine();
    return numero;
    
    }
    public static String ingresoTexto() {
    Scanner scan = new Scanner(System.in);
    
    
    String texto = scan.nextLine(); // Captura la línea completa de texto
    
    return texto; // <--- Devuelve el texto hacia donde se llamó el método
}
}
