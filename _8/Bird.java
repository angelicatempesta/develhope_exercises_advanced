package _Inerhitance;

public class Bird extends Animal{
    double wingSpan;

    public Bird(String name,double height, double weight, double wingSpan) {
        super(name, height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return wingSpan * 4;
    }
}
