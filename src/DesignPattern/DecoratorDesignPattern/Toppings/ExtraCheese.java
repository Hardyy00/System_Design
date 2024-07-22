package DesignPattern.DecoratorDesignPattern.Toppings;

import DesignPattern.DecoratorDesignPattern.Pizza.Pizza;

public class ExtraCheese extends ToppingDecorator {

    Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + 5;
    }
}
