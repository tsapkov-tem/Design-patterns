package ChainOfResponsibility;

abstract class Action {
    int danger;
    Action next;

    public void setNext(Action next) {
        this.next = next;
    }

    public Action(int danger) {
        this.danger = danger;
    }

    public void MakeAction(int level) {
        if (level >= danger) {
            Make();
        }
        if (next != null) {
            next.MakeAction (level);
        }
    }
    abstract void Make();
}
