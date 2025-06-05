package DesignPattern.AdapterDesignPattern.Client;


import DesignPattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import DesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;
import DesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdpater;


public class Main {

    public static void main(String[] args) {
        WeightMachineAdpater weightMachineAdpater = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdpater.getWeightInKg());
    }
}
