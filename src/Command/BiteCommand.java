package Command;

public class BiteCommand extends Command{

    public BiteCommand(Cat cat) {
        super (cat);
    }

    public void execute() {
        cat.bite ();
    }
}
