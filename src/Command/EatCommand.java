package Command;

public class EatCommand extends Command{

    public EatCommand(Cat cat) {
        super (cat);
    }

    public void execute() {
        cat.eat ();
    }
}
