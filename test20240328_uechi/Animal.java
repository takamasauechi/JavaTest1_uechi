package test20240328_uechi;
public class Animal {
    String name;
    double height; // 単位: cm
    double weight; // 単位: kg

    public Animal(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getterメソッド
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}