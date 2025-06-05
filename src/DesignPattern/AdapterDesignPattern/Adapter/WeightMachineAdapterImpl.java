package DesignPattern.AdapterDesignPattern.Adapter;

import DesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdpater{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg(){

        double weightInPound = weightMachine.getWeightInPound();
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
