
package laarenadeaetherfall;

public class Arquero extends Personaje {
    private final int costeEnergia=10;
    public Arquero(String nombre) {
        super(nombre,   126,    70,     26,      14,        64);
        //   nombre     vida  energia   ataque  armadura  critico 
    }

    
    
    @Override
    public int atacar() {
        int danio=0;
        int dado=0;
        
        System.out.println(nombre+" VA A ATACAR.....");
        if (energia>=costeEnergia) {
            
            
            switch (Aleatorio()) {
                case 1:
                    System.out.println("FALLA EL ATAQUE....");
                    break;
                case 2:
                    danio+=ataque/2;
                    break;
                case 3:
                    danio+=ataque;
                    break;
                case 4:
                    danio+=ataque+1;
                    break;
                case 5:
                    danio+=ataque+critico/2;
                    break;
                case 6:
                    danio+=ataque+critico;
                    break;
                
            }
            energia-=costeEnergia;
            System.out.println("Danio inflingido : "+ danio);
            System.out.println("Gasta " +costeEnergia+" Energia total("+energia+")");
        }else{
            System.out.println("RECARGA ENERGIA.....");
            energia=Aleatorio()*10;
            System.out.println("RECARGO "+ energia +" DE ENERGIA");
            
        }
        
        return danio;
    }

    public int getArmadura() {
        return armadura;
    }

    @Override
    public String toString() {
        return "Arquero{" + "costeEnergia=" + costeEnergia + '}';
    }
    
}
