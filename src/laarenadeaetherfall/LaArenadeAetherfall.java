package laarenadeaetherfall;


public class LaArenadeAetherfall extends Utilidades{

 
    public static void main(String[] args) {
        Arquero arquero1 = new Arquero("Dibu");
        
        Arquero arquero2 = new Arquero("Marchesin");
        //correcion en arqueros
        
        System.out.println(Utilidades.aleatorio());
        
        do {
            
            if (arquero1.aleatorio()>3) {
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
    
    
}
