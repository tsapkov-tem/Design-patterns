package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    List<Cat> cats = new ArrayList<Cat> ();

    void add(Cat cat){
        cats.add (cat);
    }

    @Override
    public void SayMeowAll(Cat cat) {
        cat.setTrue ();
        for(Cat c: cats){
            if(c!=cat){
                c.setFalse ();
            }
        }
    }
}
