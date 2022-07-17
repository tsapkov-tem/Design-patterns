package Adapter;

public class Main {
    public static void main(String[] args) {
        //через наследование
        FeedCat feedCat = new AdapterGreatFeed ();
        feedCat.FeedMeat ();
        feedCat.FeedFish ();

        FeedCat feedCat1 = new AdapterGreatFeed1 ();
        feedCat1.FeedMeat ();
        feedCat1.FeedFish ();
    }
}
