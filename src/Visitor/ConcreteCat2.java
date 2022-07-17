package Visitor;

public class ConcreteCat2 implements Cat{
    @Override
    public void accept(Visitor visitor) {
        visitor.feed ((this));
    }
}
