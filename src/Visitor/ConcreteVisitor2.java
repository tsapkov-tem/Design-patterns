package Visitor;

public class ConcreteVisitor2 implements Visitor{
    @Override
    public void feed(ConcreteCat1 cat1) {
        System.out.println ("Кормим рыбой первого кота");
    }

    @Override
    public void feed(ConcreteCat2 cat2) {
        System.out.println ("Кормим рыбой второго кота");
    }
}
