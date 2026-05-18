/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laarenadeaetherfall;

/**
 *
 * @author User
 */
public class Guerrero extends Personaje implements Utilidades {

    public Guerrero(String nombre) {
        super(nombre, 170, 60, 26, 20, 30);
        //nombre    vida  energia  ataque  armadura   costeEnegia
    }

    @Override
    public int atacar() {
        int danio = 0;

        System.out.println(nombre + " VA A ATACAR.....");
        if (energia >= costeEnergia) {

            switch (Utilidades.aleatorio()) {
                case 1:
                    System.out.println("FALLA EL ATAQUE....");
                    break;
                case 2:
                    danio += ataque / 2;
                    break;
                case 3:
                    danio += ataque;
                    break;
                case 4:
                    danio += ataque + 1;
                    break;
                case 5:
                    danio += ataque + ataque / 2;
                    break;
                case 6:
                    danio += ataque * 2;
                    break;

            }
            energia -= costeEnergia;
            //System.out.println("Danio inflingido : "+ danio);
            System.out.println("Gasta " + costeEnergia + " Energia total(" + energia + ")");
        } else {
            System.out.println("Esta Cansado necesita recuperarse.....");
            energia = Utilidades.aleatorioSinTexto() * 10;
            System.out.println("RECARGO " + energia + " DE ENERGIA");

        }

        return danio;
    }

}
