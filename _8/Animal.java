package _Inerhitance;

 class Animal {
     double height, weight;
     String name;

    public Animal(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
