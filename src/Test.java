import ObserverPattern.Shareholder;
import ObserverPattern.StockPriceSubject;
import StrategyPattern.Context;
import StrategyPattern.SoldByDeducted;
import StrategyPattern.SoldByDiscounted;
import StrategyPattern.SoldByOriginalPrice;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        Context context = new Context(new SoldByOriginalPrice());
//        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));
//
//        context = new Context(new SoldByDeducted(1));//每件按固定价格减少
//        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));
//
//        context = new Context(new SoldByDiscounted(0.05f));//每件价格减少5%
//        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));


        Random rand = new Random();
        StockPriceSubject stockPriceSubject = new StockPriceSubject();
        Shareholder shareholder = new Shareholder(stockPriceSubject);
        for(int i=0;i<10;++i){
            stockPriceSubject.setStockPrice(rand.nextDouble());
            System.out.println("shareholder get currentPrice: "+ shareholder.getCurrentPrice());
            System.out.println("shareholder get MaxPrice: "+ shareholder.getMaxStockPrice());
            System.out.println("shareholder get MinPrice: "+ shareholder.getMinStockPrice());
            System.out.println("shareholder get AvgPrice: "+ shareholder.getAvgStockPrice());
            System.out.println("shareholder get Trend:" + shareholder.getStockTrend());
        }
    }


}