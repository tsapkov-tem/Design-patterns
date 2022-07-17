package Visitor;

public interface Visitor {
    void feed(ConcreteCat1 cat1);
    void feed(ConcreteCat2 cat2);
}
