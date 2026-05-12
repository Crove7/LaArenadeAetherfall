/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

/**
 *
 * @author User
 */
public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre, 80,   150,   50,     0);
         //nombre    vida  energia ataque armadura  
        
    }

    public Mago() {
    }
    
    @Override
    public int atacar() {
        return 1;
    }
    
}
