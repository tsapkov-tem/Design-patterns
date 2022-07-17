package Iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate ();
        Iterator iterator = concreteAggregate.getIterator ();
        while (iterator.HasNext ()){
            System.out.println ((String)iterator.next ());
        }
    }
}
