package ObserverPattern;

public class CurrentPriceObserver extends Observer{


    public CurrentPriceObserver(StockPriceSubject subject){
        this.subject = subject;
        subject.attach(this);
    }

    double currentPrice;

    public double getCurrentPrice() {
        return currentPrice;
    }

    @Override
    void update() {
        currentPrice = subject.getStockPrice();
    }
}
