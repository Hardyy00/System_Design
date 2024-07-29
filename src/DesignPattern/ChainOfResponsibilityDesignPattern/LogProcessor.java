package DesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class LogProcessor {

    static int INFO = 1;
    static int ERROR = 2;
    static int DEBUG = 3;

    LogProcessor nextLogprocessor;

    public LogProcessor(LogProcessor nextLogprocessor){
        this.nextLogprocessor = nextLogprocessor;
    }

    public void log(int logType, String message) throws  Exception{

        if(nextLogprocessor != null){
            nextLogprocessor.log(logType, message);
        }else{

            throw new Exception("No Such logger exists");
        }
    }


}
