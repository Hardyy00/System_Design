package DesignPattern.ObserverDesignPattern;

import DesignPattern.ObserverDesignPattern.Observable.IphoneObservable;
import DesignPattern.ObserverDesignPattern.Observable.StockObservable;
import DesignPattern.ObserverDesignPattern.Observer.EmailAlertObserver;
import DesignPattern.ObserverDesignPattern.Observer.MobileAlertObserver;
import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {


        StockObservable iphoneStock = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("hardik@g.com", iphoneStock);
        NotificationAlertObserver observer2 = new EmailAlertObserver("a@g.com", iphoneStock);
        NotificationAlertObserver observer3 = new MobileAlertObserver("Hardik", iphoneStock);

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);
        iphoneStock.add(observer3);

        iphoneStock.setStockCount(10);
    }
}
