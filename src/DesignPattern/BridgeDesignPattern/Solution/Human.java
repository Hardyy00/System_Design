package DesignPattern.BridgeDesignPattern.Solution;

public class Human extends LivingBeing {

    public Human(BreathingProcess  breathingProcess){
        super(breathingProcess);
    }
    @Override
    public void breathe(){

        this.breathingProcess.breathingProcess();
    }
}
