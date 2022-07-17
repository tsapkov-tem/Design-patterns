package Composite;

public class Main {
    public static void main(String[] args) {
        Cat blackCat = new BlackCat();
        Cat grayCat = new GrayCat();
        Cat whiteCat = new WhiteCat();

        PackOfCats packOfCats = new PackOfCats();
        packOfCats.addCat (blackCat);
        packOfCats.addCat (grayCat);
        packOfCats.addCat (whiteCat);

        packOfCats.AllEat ();
    }
}
