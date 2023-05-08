package _AbstractClasses;

public class Rectangle extends Shape {
    public double calculateArea(){
        return this.height * this.width;

    }

    public Rectangle(double x, double y) {
        this.width = x;
        this.height = y;
    }
}
