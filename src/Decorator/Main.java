package Decorator;

public class Main {
    public static void main(String[] args) {
        Panther panther = new Panther ();
        Decorator PinkPanther = new Decorator ("pink",panther);
        System.out.println (PinkPanther.run ());
    }
}
