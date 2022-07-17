package Strategy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ();
        Activity run = new Run ();
        cat.setActivity (run);
        cat.doSomething ();
    }
}
