package _AbstractClasses;

public class Circle extends Shape{
    public double calculateArea(){
        double raggio = width / 2;
        double pi = 3.15;
        return (raggio * raggio) * pi;

    }

    public Circle(double x) {
        this.width = x;
    }
}
