package DesignPattern.StrategyDesignPattern.WithStrategyPattern;


import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends  Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }

}
