package DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Special Drive Capability");
    }
}
