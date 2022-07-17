package Bilder;

public class Director {
    AbstractCatBuilder abstractCatBuilder;
    void setBuilder(AbstractCatBuilder b){
        abstractCatBuilder = b;
    }
    Cat BuildCat(){
        abstractCatBuilder.createCat ();
        abstractCatBuilder.buildName ();
        abstractCatBuilder.buildCatHair ();
        abstractCatBuilder.buildWeight ();
        Cat cat = abstractCatBuilder.getCat ();
        return cat;
    }
}
