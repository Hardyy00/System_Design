package DesignPattern.SingletonDesignPattern.Lazy;

public class DBConnection {

    private static DBConnection connOjbect;

    private DBConnection(){

    }

    public static DBConnection getInstance(){

        if(connOjbect == null){
            connOjbect = new DBConnection();
        }

        return connOjbect;
    }
}
