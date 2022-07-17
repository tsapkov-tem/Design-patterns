package Bridge;

abstract class Cat {
    Color color;
    public Cat(Color c){
        color = c;
    }
    abstract void showBreed();
    void showDetails(){
        showBreed();
        color.setColor ();
    }
}
