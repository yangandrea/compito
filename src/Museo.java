import java.util.*;
public class Museo {
    public static int ingressi_turisti=5;
    public static int interno=0;

    public synchronized void entramuseo(String nometurista) throws InterruptedException{

        while(interno >= ingressi_turisti)
        {
            try{
                wait();
            }catch(InterruptedException e )
            {
                e.printStackTrace();
            }
        }
        interno++;
        System.out.println(nometurista +" è entrato nel museo per vedere la giconda ");
        int tempoGuardareGioconda = new Random().nextInt(3000) + 2000;
        Thread.sleep(tempoGuardareGioconda);
        System.out.println(nometurista + " ha vistato il museo " + (tempoGuardareGioconda/1000) + " secondi");
            interno--;
        System.out.println(nometurista + " ha lasicato il museo ");
        notifyAll();
    }
}
