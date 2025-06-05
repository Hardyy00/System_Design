package DesignPattern.NullObjectDesignPattern;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");

        System.out.println(vehicle.getTankCapacity());

        Vehicle vehicle2 = VehicleFactory.getVehicleObject("Bike");

        System.out.println(vehicle2.getSeatingCapacity());

    }
}
