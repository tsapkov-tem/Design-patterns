package Decorator;

public class Panther implements Cat{
    private String name = "panther";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String run() {
        return getName () + "is running";
    }
}
