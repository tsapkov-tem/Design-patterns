package Command;

public class Kitty {
    Command meow;
    Command eat;
    Command bite;

    public Kitty(Command meow, Command eat, Command bite) {
        this.meow = meow;
        this.eat = eat;
        this.bite = bite;
    }
    void MeowCat(){
        meow.execute ();
    }
    void EatCat(){
        eat.execute ();
    }
    void BiteCat(){
        bite.execute ();
    }
}
