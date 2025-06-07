package DesignPattern.BridgeDesignPattern.Problem;

public abstract class LivingBeing {

    public abstract void breatheProcess();

    /*
        To implement a new breathing process
        we need to  extend the above class
        so there is a dependency of the class on a breathing process
     */

}

class Human extends LivingBeing {

    @Override
    public void breatheProcess(){

    }

}

class Fish extends LivingBeing{

    @Override
    public void breatheProcess(){

    }
}

class Tree extends LivingBeing{

    @Override
    public void breatheProcess(){

    }
}
