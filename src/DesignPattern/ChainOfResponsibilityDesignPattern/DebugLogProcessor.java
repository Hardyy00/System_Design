package DesignPattern.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }


    @Override
    public void log(int logType, String message) throws Exception {

        if(logType==DEBUG){
            System.out.println("DEBUG : " + message);
        }else{

            super.log(logType ,message);
        }
    }
}
