package DesignPattern.SingletonDesignPattern.DoubleLocking;

public class DBConnection {

    private static DBConnection connObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){

        // this resolves the earlier problem with synchronized method
        // as once the object is created there is no need for synchronized
        // multiple threads and execute this function simultaneously and
        // get the object

        if(connObject == null){

            synchronized (DBConnection.class){

                if(connObject == null){
                    connObject = new DBConnection();
                }

            }
        }

        return connObject;
    }
}
