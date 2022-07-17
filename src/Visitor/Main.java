package Visitor;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new ConcreteCat1();
        Cat cat2 = new ConcreteCat2();
        Visitor meat = new ConcreteVisitor1 ();
        Visitor fish = new ConcreteVisitor2 ();

        cat1.accept(meat);
        cat2.accept (fish);
    }
}
