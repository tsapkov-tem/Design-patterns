package Bilder;

public class Cat {
    String name;
    CatHair catHair;
    int weight;

    public void setName(String name){
        this.name = name;
    }
    public void setCatHair(CatHair catHair){
        this.catHair = catHair;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", catHair=" + catHair +
                ", weight=" + weight +
                '}';
    }
}
