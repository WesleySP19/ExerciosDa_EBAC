import enums.CarType;
import factory.CarFactory;
import model.Car;

public class Main {
    public static void main(String[] args) {
        // Creating cars using the factory
        Car sedan = CarFactory.createCar(CarType.SEDAN, "Model S", "Black", 2023);
        Car suv = CarFactory.createCar(CarType.SUV, "Model X", "White", 2022);
        Car hatchback = CarFactory.createCar(CarType.HATCHBACK, "Model H", "Red", 2021);

        // Displaying car details
        ((Car) sedan).displayDetails();
        ((Car) suv).displayDetails();
        ((Car) hatchback).displayDetails();
    }
}