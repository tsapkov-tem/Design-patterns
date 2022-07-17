package State;

public class Sleep implements Activity{
    @Override
    public void doSomething() {
        System.out.println ("Кот спит...");
    }
}
