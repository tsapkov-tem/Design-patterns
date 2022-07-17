package Visitor;

public class ConcreteVisitor1 implements Visitor{
    @Override
    public void feed(ConcreteCat1 cat1) {
        System.out.println ("Кормим Мясом первого кота");
    }

    @Override
    public void feed(ConcreteCat2 cat2) {
        System.out.println ("Кормим Мясом второго кота");
    }
}
