package Proxy;

public class ProxyCat implements WakeUp{
    private Cat cat;

    @Override
    public void wokeUp() {
        if(cat == null){
            cat = new Cat ();
        }
        cat.wokeUp ();
    }
}
