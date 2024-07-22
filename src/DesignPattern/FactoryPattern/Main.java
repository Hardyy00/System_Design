package DesignPattern.FactoryPattern;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        Shape rectangle = factory.getShape("RECTANGLE");

        circle.draw();
        rectangle.draw();

    }
}
