package Iterator;

public class ConcreteAggregate implements Aggregate {
    String[] cats = {"Том", "Бублик", "Ириска"};

    @Override
    public Iterator getIterator() {
        return new CatsIterator();
    }

    private class CatsIterator implements Iterator{
        int index=0;
        @Override
        public boolean HasNext() {
            if(index< cats.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return cats[index++];
        }
    }
}
