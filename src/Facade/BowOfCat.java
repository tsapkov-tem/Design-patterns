package Facade;

public class BowOfCat {
    boolean fullBow = false;

    public void setBowOfCat(boolean fullBow) {
        this.fullBow = fullBow;
    }

    public void putFood(){
        if(fullBow){
            System.out.println ("There is food in the bow");
        }else{
            System.out.println ("We put food in the bow");
        }
    }
}
