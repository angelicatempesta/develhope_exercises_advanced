package _toString;

public class Person {
    String name;
    int age;
    String address;

    @Override
    public String toString() {
        return "My name is " + this.name +" , I'm " + this.age + " and I live in " + this.address;

    }

    @Override
    public int hashCode() {
        return (this.name + this.age + this.address).hashCode();


    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
