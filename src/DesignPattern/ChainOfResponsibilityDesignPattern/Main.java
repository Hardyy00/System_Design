package DesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) throws Exception {

        LogProcessor obj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        obj.log(LogProcessor.ERROR, "Some error occurred");
        obj.log(LogProcessor.INFO, "My name is hardik");
        obj.log(LogProcessor.DEBUG,"DEBUG it");

    }
}
