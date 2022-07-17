package Mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator ();

        concreteMediator.add (new ConcreteCat (concreteMediator));
        concreteMediator.add (new ConcreteCat (concreteMediator));
        ConcreteCat concreteCat = new ConcreteCat (concreteMediator);
        concreteMediator.add(concreteCat);
        concreteCat.changeStatus ();
    }
}
