package ChainOfResponsibility;

public class Hiss extends Action{
    public Hiss(int danger) {
        super(danger);
    }

    @Override
    public void Make() {
        System.out.println ("Shshshshshsh!");
    }
}
