package Momento;

public class Photo {
    private final String name;
    private final String catName;

    public Photo(String name, String catName) {
        this.name = name;
        this.catName = catName;
    }

    public String getName() {
        return name;
    }

    public String getCatName() {
        return catName;
    }
}
