package AbstractFactory;

public class RightCatFactory implements CatFactory{
    @Override
    public Ear EarFactory() {
        System.out.println ("Right Ear creating...");
        return new RightEar ();
    }

    @Override
    public Eye EyeFactory() {
        System.out.println ("Right Eye creating...");
        return new RightEye ();
    }

    @Override
    public Paw PawFactory() {
        System.out.println ("Right Paw creating...");
        return new RightPaw ();
    }
}
