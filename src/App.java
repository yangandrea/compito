import java.util.*;
public class App {
    public static void main(String[] args){
        Museo museo = new Museo();
        List<Thread> turisti = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            turisti.add(new Thread(new Turista("Pippo", museo)));
            turisti.add(new Thread(new Turista("Valerio", museo)));
            turisti.add(new Thread(new Turista("Cane", museo)));
        }
        for (Thread turista : turisti) {
            turista.start();
        }
        try {
            for (Thread turista : turisti) {
                turista.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}