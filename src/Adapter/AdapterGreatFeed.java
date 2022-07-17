package Adapter;

class AdapterGreatFeed extends FeedGreatFood implements FeedCat {
    @Override
    public void FeedMeat() {
        FeedFreshMeat ();
    }

    @Override
    public void FeedFish() {
        FeedRedFish ();
    }
}
