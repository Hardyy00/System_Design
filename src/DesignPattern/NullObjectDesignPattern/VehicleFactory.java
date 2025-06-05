package DesignPattern.NullObjectDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String typeofVehicle){

        if("Car".equals(typeofVehicle)){
            return new Car();
        }

        return new NullVehicle();
    }
}
