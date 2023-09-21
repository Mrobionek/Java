package ru.skillbox;

public class Cargo {
    private Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean canBeTurned;
    private final String registrationNumber;
    private final boolean isDelicate;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress, boolean canBeTurned, String registrationNumber, boolean isDelicate) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeTurned = canBeTurned;
        this.registrationNumber = registrationNumber;
        this.isDelicate = isDelicate;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeTurned() {
        return canBeTurned;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isDelicate() {
        return isDelicate;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeTurned, registrationNumber, isDelicate);
    }

    public Cargo setWeights(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeTurned, registrationNumber, isDelicate);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeTurned, registrationNumber, isDelicate);
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", canBeTurned=" + canBeTurned +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", isDelicate=" + isDelicate +
                '}';
    }
}
