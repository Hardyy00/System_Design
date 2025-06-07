package DesignPattern.BridgeDesignPattern.Solution;

public class Client {

    public static void main(String[] args){

        LivingBeing human = new Human(new HumanBreathe());
        LivingBeing tree = new Tree(new TreeBreathe());

        human.breathe();
        tree.breathe();
    }
}
