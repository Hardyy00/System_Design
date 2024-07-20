package DesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String email;
    StockObservable observable;

    public EmailAlertObserver(String email, StockObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update(){

        sendEmail(email, "Product is in stock hurry Up!!");
    }

    private void sendEmail(String emailId, String msg){

        System.out.println("Mail sent to : " + emailId);
    }
}
