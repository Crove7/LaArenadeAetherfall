/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

/**
 *
 * @author User
 */
public class Guerrero  extends Personaje{

    public Guerrero(String nombre) {
        super(nombre,   170,    60,     26,     20);
            //nombre    vida  energia  ataque  armadura   
    }

    @Override
    public int atacar() {
        return 1;
    }
    
}
