package ObserverPattern;

public abstract class Observer {
    StockPriceSubject subject;

    abstract void update();
}
