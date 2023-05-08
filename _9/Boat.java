package _AbstractClasses;

public class Boat implements Movable {
    @Override
    public void moveForward() {
        System.out.println("I'm moving forward!");
    }

    @Override
    public void moveBackward() {
        System.out.println("I'm moving backward!");

    }
}
