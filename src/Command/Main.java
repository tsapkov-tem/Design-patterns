package Command;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ();
        Kitty kitty = new Kitty (new MeowCommand(cat),new EatCommand(cat),new BiteCommand(cat));

        kitty.MeowCat ();
        kitty.EatCat ();
        kitty.BiteCat ();
    }
}
