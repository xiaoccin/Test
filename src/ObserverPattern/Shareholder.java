package ObserverPattern;

public class Shareholder {
    private AnalysisReportObserver analysisReportObserver;
    private CurrentPriceObserver currentPriceObserver;
    private TrendForecastObserver trendForecastObserver;

    public Shareholder(StockPriceSubject subject){
        analysisReportObserver = new AnalysisReportObserver(subject);
        currentPriceObserver = new CurrentPriceObserver(subject);
        trendForecastObserver = new TrendForecastObserver(subject);
    }

    public double getMaxStockPrice(){
        return analysisReportObserver.getMaxPrice();
    }

    public double getMinStockPrice(){
        return analysisReportObserver.getMinPrice();
    }

    public double getAvgStockPrice(){
        return analysisReportObserver.getAvgPrice();
    }

    public String getStockTrend(){
        return trendForecastObserver.getTrend();
    }

    public double getCurrentPrice(){
        return currentPriceObserver.getCurrentPrice();
    }
}
