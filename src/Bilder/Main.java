package Bilder;

public class Main {
    public static void main(String[] args) { //простой способ билдера
         Cat cat = new CatBuilder ()
                 .buildName ("Бублик")
                 .buildCatHair (CatHair.FLUFFY)
                 .buildWeight (4)
                 .build ();
        System.out.println (cat);

        Director director = new Director (); //сложный способ билдера с абстракцией
        director.setBuilder (new BaldyCat ());
        Cat baldycat = director.BuildCat ();
        System.out.println (baldycat);
    }
}
