package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory ();
        List<Cat> cats = new ArrayList<> ();
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("Black"));
        cats.add (catFactory.callCatt ("White"));
        cats.add (catFactory.callCatt ("White"));
        cats.add (catFactory.callCatt ("White"));
        cats.add (catFactory.callCatt ("White"));
        cats.add (catFactory.callCatt ("White"));

        for (Cat cat :cats){
            cat.eat ();
        }
    }
}
