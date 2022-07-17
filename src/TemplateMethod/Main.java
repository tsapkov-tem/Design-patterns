package TemplateMethod;

import Strategy.Activity;

public class Main {
    public static void main(String[] args) {
        ActivityTemplate crazyCat = new CrazyCat ();
        crazyCat.activity ();

        ActivityTemplate calmCat = new CalmCat ();
        calmCat.activity ();
    }
}
