package AbstractFactory;

public class LeftCatFactory implements CatFactory{
    @Override
    public Ear EarFactory() {
        System.out.println ("Left Ear creating...");
        return new LeftEar ();
    }

    @Override
    public Eye EyeFactory() {
        System.out.println ("Left Eye creating...");
        return new LeftEye ();
    }

    @Override
    public Paw PawFactory() {
        System.out.println ("Left Paw creating...");
        return new LeftPaw ();
    }
}
