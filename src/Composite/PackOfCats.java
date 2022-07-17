package Composite;

import java.util.ArrayList;
import java.util.List;

public class PackOfCats {
    List<Cat> pack = new ArrayList<Cat>();

    public  void addCat(Cat cat){
        pack.add (cat);
    }
    public void removeCat(Cat cat){
        pack.remove (cat);
    }

    public void AllEat(){
        System.out.println ("The pack of Cats eats");
        for(Cat cat : pack){
            cat.eat ();
        }
    }
}
