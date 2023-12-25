package game;

/**
 *
 * @author sistemi
 */
public class Eroe extends Functions implements Umano,Personaggio 
{
    protected int Forza;
    
    public Eroe(){
    
     Forza=10;
}
    public void combatti(){
        System.out.println("L'Eroe si lancia all'attacco...");
        Forza=Forza-3;
    }
    public void getForza(){
          System.out.println("La Forza rimanente dell'eroe è di: "+Forza);
    }
    
}