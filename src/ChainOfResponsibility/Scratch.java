package ChainOfResponsibility;

public class Scratch extends Action {
    public Scratch(int danger) {
        super(danger);
    }

    @Override
    public void Make() {
        System.out.println ("ScratchScratchScratch!!!");
    }
}