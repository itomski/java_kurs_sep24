package de.lubowiecki.basics.factory;

public class Vehicle {

    private final String brand;
    private final String model;
    private final Color color;

    public Vehicle(String brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
