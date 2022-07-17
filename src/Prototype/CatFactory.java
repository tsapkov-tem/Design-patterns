package Prototype;

public class CatFactory {
    Cat cat;

    CatFactory(Cat cat){
        setCat (cat);
    }
    public void setCat(Cat cat){
        this.cat = cat;
    }
    Cat makeCopy(){
        return (Cat)cat.copy ();
    }
}
