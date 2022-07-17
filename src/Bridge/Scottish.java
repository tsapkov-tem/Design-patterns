package Bridge;

public class Scottish extends Cat {
    public Scottish(Color c) {
        super (c);
    }
    @Override
    void showBreed() {
        System.out.println ("Scottish");
    }
}
