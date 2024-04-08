package StrategyPattern;

public class SoldByDiscounted implements Sold{

    float discountRate;

    public SoldByDiscounted(){
        discountRate = 0.05f;
    }

    public SoldByDiscounted(float _discountRate){
        discountRate = _discountRate;
    }

    @Override
    public float calculateDistance(int num, float price) {
        return num * price *(1-discountRate);
    }
}
