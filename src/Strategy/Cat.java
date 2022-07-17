package Strategy;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doSomething(){
        activity.doSomething ();
    }
}
