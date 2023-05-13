package _BigInt;

public record Person(String name, int age, String address) {

    @Override
    public String toString() {
        return "My name is " + name + ", I'm " + age + " and I live in " + address;
    }
}
