package Proxy;

public class Cat implements WakeUp{
    Cat(){
        openEyes ();
    }
    public void openEyes(){
        System.out.println ("The cat opened it's eyes");
    }
    @Override
    public void wokeUp() {
        System.out.println ("The cat woke up");
    }
}
