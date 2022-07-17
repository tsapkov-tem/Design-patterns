package Bilder;

public abstract class AbstractCatBuilder {
    Cat cat;
    void createCat(){
        cat  = new Cat();
    }

    abstract void buildName();
    abstract void buildCatHair();
    abstract void buildWeight();

    Cat getCat(){
        return cat;
    }
}
