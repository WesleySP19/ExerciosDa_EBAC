package model;

public class SedanCar extends Car {
    public SedanCar(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("Sedan Car - Model: " + getModel() + ", Color: " + getColor() + ", Year: " + getYear());
    }
}