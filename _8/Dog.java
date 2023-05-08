package _Inerhitance;

public class Dog extends Animal{
     String breed;

    public Dog(String name, double height, double weight, String breed) {
        super(name, height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond(){
        return super.getHeight() * 2;
    }
}
