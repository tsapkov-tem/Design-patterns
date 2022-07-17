package Observer;

import Adapter.FeedCat;

import java.util.ArrayList;
import java.util.List;

public class CatBowl implements Bowl {
    private List<Observer> cats;
    private String food;

    public CatBowl() {
        cats = new ArrayList<> ();
    }

    public void setFood(String food) {
        this.food = food;
        FeedCats();
    }

    @Override
    public void CallCat(Observer observer) {
        cats.add (observer);
    }

    @Override
    public void BanishCat(Observer observer) {
        cats.remove (observer);
    }


    @Override
    public void FeedCats() {
        for(Observer observer : cats ){
            observer.feed (food);
        }
    }
}
