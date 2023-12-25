package game;

/**
 *
 * @author sistemi
 */
public
        class Vampiro extends Functions implements Mostro,Personaggio 
{
    protected int Forza;
    
    public Vampiro(){
        Forza=15;
    }
     public void getForza(){
          System.out.println("La Forza rimanente del Vampiro è di: "+Forza);
    }
      public void azzanna(){
         System.out.println("il Vampiro azzanna l'avversario con i suoi canini aguzzi...");
          Forza=Forza-2;
    }
}