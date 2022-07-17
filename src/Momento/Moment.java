package Momento;

public class Moment {
    private String name;
    private String catName;
    public void set(String name, String catName){
        this.name = name;
        this.catName = catName;
    }
    public void showPhoto(Photo photo){
        name = photo.getName ();
        catName = photo.getCatName ();
    }
    public Photo TakePicture(){
        return new Photo (name, catName);
    }

    @Override
    public String toString() {
        return "Moment{" +
                "name='" + name + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
}
