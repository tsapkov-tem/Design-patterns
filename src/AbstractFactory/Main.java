package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CatFactory rightCatFactory = new RightCatFactory ();
        CatFactory leftCatFactory = new LeftCatFactory ();

        Ear ear = leftCatFactory.EarFactory ();
        Eye eye = rightCatFactory.EyeFactory ();
        Paw paw = leftCatFactory.PawFactory ();
    }
}
