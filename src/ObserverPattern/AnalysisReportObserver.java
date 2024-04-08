package ObserverPattern;

public class AnalysisReportObserver extends Observer{

    public AnalysisReportObserver(StockPriceSubject subject){
        this.subject = subject;
        subject.attach(this);
    }
    double maxPrice;
    double minPrice = Double.MAX_VALUE;
    double avgPrice;
    int days = 0;
    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getAvgPrice() {
        return avgPrice;
    }
    @Override
    void update() {
        maxPrice = maxPrice > subject.getStockPrice() ? maxPrice : subject.getStockPrice();
        minPrice = minPrice < subject.getStockPrice() ? minPrice : subject.getStockPrice();
        avgPrice =((avgPrice * days)+subject.getStockPrice())/(++days);
    }
}
