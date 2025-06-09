package DesignPattern.SingletonDesignPattern.SynchronizedMethod;

public class DBConnection {

    private static DBConnection connObject;

    private DBConnection(){
    }

    synchronized public static DBConnection getInstance(){

        if(connObject == null){
            connObject = new DBConnection();
        }

        return connObject;
    }

    /*

        The problem with this is that synchronized is very expensive as everytime a request comes it puts a lock
        so even if the object is already created the request puts a lock and other requests have to wait.
        This method works with the first request as it has to create the connObject but for upcoming requests it is very unoptimised
     */
}
