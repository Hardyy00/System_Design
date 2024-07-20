package DesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stock = 0;

    @Override
    public void add(NotificationAlertObserver observer){

        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber(){
        for(NotificationAlertObserver observer : observers){

            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {

        if(stock == 0){
            notifySubscriber();
        }

        stock = newStock;

    }

    @Override
    public int getStockCount() {
        return stock;
    }



}
