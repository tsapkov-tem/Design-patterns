package Singleton;

public class RunThreads implements Runnable{

    @Override
    public void run() {
        Singleton.getInstance ();
    }
}
