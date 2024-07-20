package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

public class Main {

    public static void main(String[] args) {

        Vehicle sports = new SportsVehicle();
        sports.drive();

        Vehicle offroad = new OffRoadVehicle();
        offroad.drive();

        Vehicle passenger = new PassengerVehicle();

        passenger.drive();
    }
}
