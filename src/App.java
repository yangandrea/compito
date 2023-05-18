import java.util.*;
public class App {
    public static void main(String[] args){
        Museo museo = new Museo();
        List<Thread> turisti = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            turisti.add(new Thread(new Turista("turista "+ (i), museo)));
        }
        for(int i=0;i<turisti.size();i+=5)
        {
            List<Thread> gruppoturisti = turisti.subList(i, Math.min(i + 5, turisti.size()));
        
        for (Thread turista : gruppoturisti) {
            turista.start();
        }
        try {
            for (Thread turista : gruppoturisti) {
                turista.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}