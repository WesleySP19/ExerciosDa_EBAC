package model;

public class SUVCar extends Car {
    public SUVCar(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("SUV Car - Model: " + getModel() + ", Color: " + getColor() + ", Year: " + getYear());
    }
}