package game;
import java.util.*;

public class Game
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        boolean change=false;
        int i=0;
        do{
        System.out.println("Sei in un cimitero, alzi gli occhi al cielo... Com'è la Luna \n [1]-Piena \n [2]-non piena");
        int waa=k.nextInt();
        switch(waa){
            case 1:
                 System.out.println("La Luna piena è alta nel cielo, ci saranno dei Licantropi?");
                 change=true;
                 i++;
                break;
                
            case 2:
                System.out.println("La Luna non è piena, la notte è scura, ma almeno non ci saranno dei lLicantropi");
                 i++;
                break;
            default:
                 System.out.println("Non ho capito... La luna è piena oppure no?");
                break;
        }
        }
        while(i==0);
        
        Vampiro Vamp=new Vampiro();
        Eroe eroe=new Eroe();
        Licantropo Manny=new Licantropo(change);
        
        
        for(i=0;i<3;i++){
            eroe.combatti();
            System.out.println("");
        }
        Vamp.azzanna();
         System.out.println("");
        for(i=0;i<2;i++){
            if(Manny.ForzaMostro==0){
                Manny.combatti();
            }
            else{
                Manny.azzanna();
            }
             System.out.println("");
        }
        eroe.getForza();
         System.out.println("");
        Vamp.getForza();
         System.out.println("");
        Manny.getForza();
        
        
        
    }
    
}