package State;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Sleep ();
        Cat cat = new Cat ();
        cat.setState (activity);
        cat.doSomething ();
        cat.setAllHumanSleep (true);
        cat.nextStation ();
        cat.doSomething ();
    }
}
