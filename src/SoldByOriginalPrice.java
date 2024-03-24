public class SoldByOriginalPrice implements Sold{

    @Override
    public float calculateDistance(int num, float price) {
        return num * price;
    }
}
