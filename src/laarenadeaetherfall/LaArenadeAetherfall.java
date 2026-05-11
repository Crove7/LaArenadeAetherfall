package laarenadeaetherfall;

import java.util.Scanner;


public class LaArenadeAetherfall {

 
    public static void main(String[] args) {
        Arquero arquero1 = new Arquero("Dibu");
        
        Arquero arquero2 = new Arquero("Marchesin");
        do {
            
            if (arquero1.Aleatorio()>3) {
                arquero2.recibirDanio(arquero1.atacar());
                saltoDeLinea();limpiar();
                
                if (arquero2.estaVivo()) {
                    arquero1.recibirDanio(arquero2.atacar());
                saltoDeLinea();limpiar();
                }
                
            }else{
                arquero1.recibirDanio(arquero2.atacar());
                saltoDeLinea();limpiar();
                if (arquero1.estaVivo()) {
                    arquero2.recibirDanio(arquero1.atacar());
                saltoDeLinea();limpiar();
                }
                
            }
            
            
        } while (arquero2.estaVivo()&&arquero1.estaVivo());
        
    }
    
    public static void saltoDeLinea(){
        Scanner scan = new Scanner(System.in);
        System.out.println("PRESIONE ENTER....");
        String c = scan.nextLine();
        System.out.println(c);
    }
    public static void limpiar(){
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
}
