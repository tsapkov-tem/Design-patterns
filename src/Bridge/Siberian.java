package Bridge;

public class Siberian extends Cat {

    public Siberian(Color c) {
        super (c);
    }

    @Override
    void showBreed() {
        System.out.println ("Siberian");
    }
}
