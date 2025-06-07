package DesignPattern.BridgeDesignPattern.Solution;


public class Tree extends LivingBeing {

    public Tree(BreathingProcess breathingProcess){
        super(breathingProcess);
    }

    @Override
    public void breathe(){
        breathingProcess.breathingProcess();
    }
}
