package DesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String username;
    StockObservable observable;

    public MobileAlertObserver(String username, StockObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMsgOnMobile(username, "Product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String username, String msg){
        System.out.println("Msg sent to : " + username);
    }
}
