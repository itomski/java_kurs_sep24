package de.lubowiecki.basics.factory;

public class Factory {

    private String brand;
    private String model;

    public Factory(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle createRedVehicle() {
        return new Vehicle(brand, model, Color.RED);
    }

    public Vehicle createVehicle(Color color) {
        return new Vehicle(brand, model, color);
    }
}
