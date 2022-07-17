package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCat implements Cat{
    boolean hearMeow;
    Mediator mediator;

    public ConcreteCat(Mediator  mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setTrue() {
        hearMeow = true;
        System.out.println ("I hear meow!");
    }

    @Override
    public void setFalse() {
        System.out.println ("Didnt hear");
        hearMeow = false;
    }

    @Override
    public void changeStatus() {
        mediator.SayMeowAll (this);
    }
}
