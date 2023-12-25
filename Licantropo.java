package game;

/**
 *
 * @author sistemi
 */
public
        class Licantropo extends Functions implements Umano,Personaggio,Mostro
{
    protected int ForzaUmano, ForzaMostro;
    public boolean LunaPiena;
    
    public Licantropo(boolean change){
        LunaPiena=change;
        if(LunaPiena==true){
             ForzaUmano=0;
        ForzaMostro=15;
        }
        else{
        ForzaUmano=10;
        ForzaMostro=0;
        }
    }
    public void getForza(){
        if(LunaPiena==true){
            System.out.println("La Forza rimanente del Licantropo mostro è di: "+ForzaMostro);
        }
        else{
        System.out.println("La Forza rimanente del Licantropo umano è di: "+ForzaUmano);}
        
    }
    public void combatti(){
          System.out.println("il Licantropo in forma umana parte all'attaccco..");
          ForzaUmano=ForzaUmano-3;
    }
    public void azzanna(){
         System.out.println("il Licantropo in forma di lupo azzanna l'avversario...");
          ForzaMostro=ForzaMostro-2;
    }

}