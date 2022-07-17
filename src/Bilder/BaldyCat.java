package Bilder;

public class BaldyCat extends AbstractCatBuilder{

    @Override
    void buildName() {
        cat.setName ("Лысик");
    }

    @Override
    void buildCatHair() {
        cat.setCatHair (CatHair.BALD);
    }

    @Override
    void buildWeight() {
        cat.setWeight (5);
    }
}
