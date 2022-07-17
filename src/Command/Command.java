package Command;

abstract class Command{
    Cat cat;
    public Command(Cat cat) {
        this.cat = cat;
    }

    abstract  void execute();
}
