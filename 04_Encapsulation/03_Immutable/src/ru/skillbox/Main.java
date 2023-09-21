package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15,20,30);
        Cargo cargo = new Cargo(dimensions, 20.0, "Address1", true, "Number1", false);

        Cargo newCargo = cargo.setDeliveryAddress("Address2");

        System.out.println("Original cargo address: " + cargo.getDeliveryAddress());
        System.out.println("New cargo address: " + newCargo.getDeliveryAddress());

        Dimensions newDimensions = new Dimensions(8, 6, 4);
        Cargo newCargo2 = cargo.setDimensions(newDimensions);

        System.out.println("Original cargo dimensions: " + cargo.getDimensions().dimensionsValue());
        System.out.println("New cargo dimensions: " + newCargo2.getDimensions().dimensionsValue());

        Cargo newCargo3 = cargo.setWeights(60.0);
        System.out.println("Original cargo weight: " + cargo.getWeight());
        System.out.println("New cargo weight: " + newCargo3.getWeight());
    }
}
