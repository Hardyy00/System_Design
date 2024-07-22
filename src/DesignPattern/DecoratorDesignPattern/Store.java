package DesignPattern.DecoratorDesignPattern;

import DesignPattern.DecoratorDesignPattern.Pizza.Margherita;
import DesignPattern.DecoratorDesignPattern.Pizza.Pizza;
import DesignPattern.DecoratorDesignPattern.Toppings.ExtraCheese;
import DesignPattern.DecoratorDesignPattern.Toppings.Mushroom;

public class Store {

    public static void main(String[] args) {

//        Pizza margretta = new Margherita();
//        Pizza margrettaPlusExtraCheese = new ExtraCheese(new Margherita());  // margretta + extracheese
//        Pizza plusMushroom = new Mushroom(margrettaPlusExtraCheese);
//
//        System.out.println(margrettaPlusExtraCheese.cost());
//        System.out.println(plusMushroom.cost());


        // wrapping the main class around decorators
        Pizza pizza = new Mushroom(new ExtraCheese(new Margherita()));



    }
}
