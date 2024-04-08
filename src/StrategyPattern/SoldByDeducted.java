package StrategyPattern;

public class SoldByDeducted implements Sold{

    private  float amount;

    public  SoldByDeducted(){
        amount = 0;
    }

    public SoldByDeducted(float _amount){
        amount = _amount;
    }
    @Override
    public float calculateDistance(int num, float price) {
        return num * (price - amount);
    }
}
