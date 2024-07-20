package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy obj;

    // this is known as constructor injection
    public  Vehicle(DriveStrategy obj){
        this.obj = obj;
    }

    public void drive(){

        obj.drive();
    }
}
