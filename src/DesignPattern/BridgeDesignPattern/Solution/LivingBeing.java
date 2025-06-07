package DesignPattern.BridgeDesignPattern.Solution;

public abstract class LivingBeing {

    BreathingProcess breathingProcess;

    public LivingBeing(BreathingProcess breathingProcess){
        this.breathingProcess = breathingProcess;
    }

    public abstract void breathe();
}
