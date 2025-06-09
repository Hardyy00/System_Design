package DesignPattern.SingletonDesignPattern.Lazy;

public class Main {

    public static void main(String[] args) {

        DBConnection conn = DBConnection.getInstance();
    }
}
