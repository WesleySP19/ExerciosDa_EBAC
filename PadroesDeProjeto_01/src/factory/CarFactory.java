package factory;

import model.*;
import enums.CarType;

public class CarFactory {
    public static Car createCar(CarType type, String model, String color, int year) {
        return switch (type) {
            case SEDAN -> new SedanCar(model, color, year);
            case SUV -> new SUVCar(model, color, year);
            case HATCHBACK -> new HatchbackCar(model, color, year);
            default -> throw new IllegalArgumentException("Unsupported car type: " + type);
        };
    }
}