package Observer;

import java.util.Observable;

public class Cat implements Observer{
    private String name;

    public Cat(String name,  Bowl bowl) {
        this.name = name;
        bowl.CallCat (this);
    }

    @Override
    public void feed(String food) {
        System.out.println ("Кормим" + " " + name + " " + food);
    }
}
