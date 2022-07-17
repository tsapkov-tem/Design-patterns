package Adapter;

public class AdapterGreatFeed1 implements FeedCat{
    FeedGreatFood feedGreatFood = new FeedGreatFood ();
    @Override
    public void FeedMeat() {
        feedGreatFood.FeedFreshMeat ();
    }

    @Override
    public void FeedFish() {
        feedGreatFood.FeedRedFish ();
    }
}
