package ObserverPattern;

public class TrendForecastObserver extends Observer {
    public TrendForecastObserver(StockPriceSubject subject){
        this.subject = subject;
        subject.attach(this);
    }

    String trend;
    double lastPrice;

    String getTrend(){
        return trend;
    }

    @Override
    void update() {
        if(lastPrice == 0){
            lastPrice = subject.getStockPrice();
            trend = "数据不足，不能推测股票走势";
        }else{
            if(subject.getStockPrice() < lastPrice){
                trend ="股票有下跌趋势";
            }else{
                trend ="股票有上升趋势";
            }
        }
    }
}
