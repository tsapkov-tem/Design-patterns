package Command;

public class MeowCommand extends Command{

    public MeowCommand(Cat cat) {
        super (cat);
    }

    public void execute() {
        cat.meow ();
    }
}
