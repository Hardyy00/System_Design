package DesignPattern.NullObjectDesignPattern;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity(){
        return 1;
    }

    @Override
    public int getSeatingCapacity(){
        return 1;
    }
}
