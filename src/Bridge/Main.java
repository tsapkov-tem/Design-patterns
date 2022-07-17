package Bridge;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Siberian (new Red ());
        cat.showDetails ();
    }
}
