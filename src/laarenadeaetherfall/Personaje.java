package laarenadeaetherfall;

public abstract class Personaje implements Utilidades, Atacante, Recuperacion {

    protected String nombre;
    protected int vida;
    protected int energia;
    protected int ataque;
    protected int armadura;
    protected int costeEnergia;

    public Personaje() {
    }

    public Personaje(String nombre, int vida, int energia, int ataque, int armadura, int costeEnergia) {
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
        this.ataque = ataque;
        this.armadura = armadura;
        this.costeEnergia = costeEnergia;

    }
    //nombre    vida    energia     ataque      armadura      

    public void recibirDanio(int danio) {
        int danioRecibido = 0;
        if (danio > 0) {
            System.out.println(nombre + " SE DEFIENDE.......");

            if (vida + armadura / 2 > danio) {
                if (Utilidades.aleatorio() > 3) {
                    danioRecibido = danio - armadura / 2;
                    vida -= danioRecibido;
                } else {
                    danioRecibido = danio - armadura / 4;
                    vida -= danioRecibido;
                }
                System.out.println(nombre + " Recibe puntos de danio " + danioRecibido + " tiene " + vida + " puntos de vida");

            } else {
                System.out.println(nombre + " SE DEBILITO.....");
                vida = 0;
            }
        }

    }

    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", energia=" + energia + ", ataque=" + ataque + ", armadura=" + armadura + "  '}'";
    }

}
