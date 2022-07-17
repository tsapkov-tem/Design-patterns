package Prototype;

public class Cat implements Copyable{
    int age;
    String name;
    Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Cat copy = new Cat(age, name);
        return copy;
    }
}
