package Facade;


public class Facade {
    Human human = new Human ();
    Cat cat = new Cat ();
    BowOfCat bowOfCat = new BowOfCat ();

    public void feedCat(){
        human.callCat ();
        bowOfCat.setBowOfCat (false);
        bowOfCat.putFood ();
        cat.eat ();
    }
}
