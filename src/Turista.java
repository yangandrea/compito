import java.util.*;
public class Turista extends Thread{
    private String name;
    private Museo museo;

    public Turista(String name, Museo museo) {
        this.name = name;
        this.museo = museo;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(2000) + 1000);
            museo.entramuseo(name);
        } catch (InterruptedException e) {
            e.printStackTrace();

    }
}
}
