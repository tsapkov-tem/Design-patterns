package Observer;

public class Main {
    public static void main(String[] args) {
        CatBowl bowl = new CatBowl ();
        Cat cat1 = new Cat ("Бублика", bowl);
        Cat cat2 = new Cat ("Ириску", bowl);
        bowl.setFood ("Рыбой");
    }
}
