package laarenadeaetherfall;

public class LaArenadeAetherfall implements Utilidades {

    public static void main(String[] args) {
        //Arquero personaje1 = new Arquero("Dibu");

        //Arquero personaje2 = new Arquero("Marchesin");
        //correcion en arqueros
        Personaje personaje1 = creacionDePersonaje();

        Personaje personaje2 = creacionDePersonaje();

        do {

            if (Utilidades.aleatorioSinTexto() > 3) {
                personaje2.recibirDanio(personaje1.atacar());
                Utilidades.detener();
                Utilidades.limpiar();

                if (personaje2.estaVivo()) {
                    personaje1.recibirDanio(personaje2.atacar());
                    Utilidades.detener();
                    Utilidades.limpiar();
                }

            } else {
                personaje1.recibirDanio(personaje2.atacar());
                Utilidades.detener();
                Utilidades.limpiar();
                if (personaje1.estaVivo()) {
                    personaje2.recibirDanio(personaje1.atacar());
                    Utilidades.detener();
                    Utilidades.limpiar();
                }

            }

        } while (personaje2.estaVivo() && personaje1.estaVivo());

    }

    public static Personaje creacionDePersonaje() {
        int num = 0;
        String nombre;
        Personaje personaje = null;

        System.out.println("Elija un personaje: ");
        System.out.println("1: Guerrero");
        System.out.println("2: Arquero");
        System.out.println("3: Mago");
        System.out.println("4: Aleatorio");
        num = Utilidades.ingresoNUM();

        System.out.println("Ingrese el nombre del personaje: ");
        nombre = Utilidades.ingresoTexto();

        if (num == 4) {
            int aleatorio = Utilidades.aleatorioSinTexto();

            num = (aleatorio % 3) + 1;
        }

        switch (num) {
            case 1:
                personaje = new Guerrero(nombre);
                break;
            case 2:
                personaje = new Arquero(nombre);
                break;
            case 3:
                personaje = new Mago(nombre);
                break;
            default:
                System.out.println("Opción inválida. Se creará un Guerrero por defecto.");
                personaje = new Guerrero(nombre);
                break;
        }
        Utilidades.limpiar();
        return personaje;
    }

}
