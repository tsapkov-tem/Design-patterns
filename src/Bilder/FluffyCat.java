package Bilder;

public class FluffyCat extends AbstractCatBuilder{

    @Override
    void buildName() {
        cat.setName ("Пушистик");
    }

    @Override
    void buildCatHair() {
        cat.setCatHair (CatHair.FLUFFY);
    }

    @Override
    void buildWeight() {
        cat.setWeight (4);
    }
}
