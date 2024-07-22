package DesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {


     void add(NotificationAlertObserver observer);

     void remove(NotificationAlertObserver observer);

     void notifySubscriber();

     void setStockCount(int newStockAdded);

     int getStockCount();
}
