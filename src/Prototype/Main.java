package Prototype;

public class Main {
    public static void main(String[] args) {
        Cat original = new Cat (2, "Бублик");
        System.out.println (original);

        Cat copy = (Cat) original.copy ();
        System.out.println (copy);

        CatFactory catFactory = new CatFactory (copy);
        Cat cat1 = catFactory.makeCopy ();
        System.out.println (cat1);
    }
}
