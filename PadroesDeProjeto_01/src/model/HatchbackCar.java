package model;

public class HatchbackCar extends Car {
    public HatchbackCar(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("Hatchback Car - Model: " + getModel() + ", Color: " + getColor() + ", Year: " + getYear());
    }
}