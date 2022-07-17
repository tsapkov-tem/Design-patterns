package Singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread[] = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            thread[i] = new Thread (new RunThreads ());
            thread[i].start ();
        }
        for (int i = 0; i < 1000; i++) {
            thread[i].join ();
        }
        System.out.println (Singleton.counter
        );
    }
}
