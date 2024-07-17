package SOLID.Liskov_Subsitution_Principle;


// the subclass should extend the capabilities of parent class, it must not narrow them down

public interface Bike {

    public void turnOnEngine();
    public void accelerate();

}

class MotorCycle implements Bike{

    boolean isEngine;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngine = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}

class Bicycle implements  Bike{

    // here we are not following 'L' of Solid, as we are narrowing the properties of Bike (by not having start engine)
    @Override
    public void turnOnEngine() {

        throw new AssertionError("There is no Engine");

    }

    @Override
    public void accelerate() {

    }
}
