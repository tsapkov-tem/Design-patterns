package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Action hiss = new Hiss (Danger.minor);
        Action bite = new Bite (Danger.significant);
        Action scratch = new Scratch (Danger.serious);

        hiss.setNext(bite);
        bite.setNext (scratch);
        hiss.MakeAction (Danger.serious);
    }
}
