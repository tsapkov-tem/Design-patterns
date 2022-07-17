package Bilder;

public class CatBuilder {
    String n = "default";
    CatHair h = CatHair.FLUFFY;
    int w = 3;

    CatBuilder buildName(String n){
        this.n = n;
        return this;
    }
    CatBuilder buildCatHair(CatHair h){
        this.h = h;
        return this;
    }
    CatBuilder buildWeight(int w){
        this.w = w;
        return this;
    }
    Cat build(){
        Cat cat = new Cat();
        cat.setName (n);
        cat.setCatHair (h);
        cat.setWeight (w);
        return cat;
    }
}
