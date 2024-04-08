package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockPriceSubject {
    private List<Observer> observers;
    private double stockPrice;

    double getStockPrice(){
        return stockPrice;
    }

    public void setStockPrice(double price){
        stockPrice = price;
        notifyAllObserver();
    }


    void attach(Observer observer){
        if(observers == null){
            observers = new ArrayList<>();
            observers.add(observer);
        }else{
            observers.add(observer);
        }
    }

    void notifyAllObserver(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
