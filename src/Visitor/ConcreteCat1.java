package Visitor;

public class ConcreteCat1 implements Cat{
    public void accept(Visitor visitor) {
        visitor.feed ((this));
    }
}
