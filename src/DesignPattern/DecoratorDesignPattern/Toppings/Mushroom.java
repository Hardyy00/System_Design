package DesignPattern.DecoratorDesignPattern.Toppings;

import DesignPattern.DecoratorDesignPattern.Pizza.Pizza;

public class Mushroom extends ToppingDecorator {

    Pizza pizza;

    public Mushroom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + 10;
    }
}
