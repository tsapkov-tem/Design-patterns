package State;

public class Cat {
    private Activity state;
    private boolean AllHumanSleep;

    public void setState(Activity state) {
        this.state = state;
    }

    public void setAllHumanSleep(boolean allHumanSleep) {
        AllHumanSleep = allHumanSleep;
    }

    void nextStation(){
        if(AllHumanSleep){
            setState (new Run ());
        }else {
            setState (new Sleep ());
        }
    }
    void doSomething(){
        state.doSomething ();
    }
}
