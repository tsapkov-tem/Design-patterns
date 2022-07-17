package Flyweight;

import java.util.HashMap;

public class CatFactory {
    private static final HashMap<String, Cat> cats = new HashMap<> ();

    public Cat callCatt(String color){
        Cat cat = cats.get (color);
        if(cat == null){
            switch (color){
                case "White":{
                    System.out.println ("Call the white cat...");
                    cat = new WhiteCat ();
                    break;
                }
                case "Black":{
                    System.out.println ("Call the black cat...");
                    cat = new BlackCat ();
                    break;
                }
            }
            cats.put (color, cat);
        }
        return cat;
    }
}
