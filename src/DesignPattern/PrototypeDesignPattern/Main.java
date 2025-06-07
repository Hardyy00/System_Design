package DesignPattern.PrototypeDesignPattern;

public class Main {

    public static void main(String[] args){

        Student student1 = new Student("Hardik", 19, 22);

        Student clone = (Student) student1.clone();


    }
}
