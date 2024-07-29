package DesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logType, String message) throws Exception{

        if(logType==ERROR){
            System.out.println("ERROR : " + message);
        }else{
            super.log(logType, message);
        }
    }
}
