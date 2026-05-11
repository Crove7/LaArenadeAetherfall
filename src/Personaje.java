package laarenadeaetherfall;

import java.util.Random;

public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected int energia;
    protected int ataque;
    protected int armadura;
    protected int critico;
    
    public Personaje(String nombre, int vida, int energia, int ataque, int armadura, int critico) {
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
        this.ataque = ataque;
        this.armadura = armadura;
        this.critico = critico;
    }
    //nombre    vida    energia     ataque      armadura      critico

    public Personaje() {
    }

    public abstract int atacar();

    public void recibirDanio(int danio) {
        int danioRecibido = 0;
        if (danio > 0) {
            System.out.println(nombre + " RECIBE DANIO.....");

            if (vida + armadura/2 > danio) {
                if (Aleatorio() > 3) {
                    danioRecibido = danio - armadura/2;
                    vida -= danioRecibido;
                } else {
                    danioRecibido = danio - armadura / 4;
                    vida -= danioRecibido;
                }
                System.out.println(nombre + " Recibe puntos de danio " + danioRecibido + " tiene " + vida + " puntos de vida");

            } else {
                System.out.println(nombre + " Se debilito...");
                vida=0;
            }
        }

    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int Aleatorio() {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;

        System.out.print("SE ARROJA UN DADO........");
        System.out.println("(" + num + ")");
        return num;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", energia=" + energia + ", ataque=" + ataque + ", armadura=" + armadura + ", critico=" + critico + '}';
    }

}
