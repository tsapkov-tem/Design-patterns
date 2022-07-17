package TemplateMethod;

public abstract class ActivityTemplate {
    abstract void doSomething();
    public void activity(){
        System.out.println ("Гладим кота");
        doSomething ();
        System.out.println ("Кормим кота");
    }
}
