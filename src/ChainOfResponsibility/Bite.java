package ChainOfResponsibility;

public class Bite extends Action{
    public Bite(int danger) {
        super(danger);
    }

    @Override
    public void Make() {
        System.out.println ("BITE!!!");
    }
}
