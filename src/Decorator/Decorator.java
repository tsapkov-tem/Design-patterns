package Decorator;

public class Decorator implements Cat{
    private String name;
    Cat cat;

    public Decorator(String name, Cat cat) {
        this.name = name;
        this.cat = cat;
    }


    @Override
    public String getName() {
        return this.name + " " + cat.getName ();
    }

    @Override
    public String run() {
        return getName () + " is running";
    }
}
