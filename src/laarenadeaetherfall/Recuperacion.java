/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

/**
 *
 * @author gian-
 */
public interface Recuperacion {
    public static void curarse(Personaje personaje){
        if (personaje.estaVivo()) {
           personaje.vida=+(personaje.vida*9+Utilidades.aleatorio())/100;
           personaje.energia+=(personaje.energia*9+Utilidades.aleatorio())/100;
        }
    }
        
    
}
