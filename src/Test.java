import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new SoldByOriginalPrice());
        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));

        context = new Context(new SoldByDeducted(1));//每件按固定价格减少
        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));

        context = new Context(new SoldByDiscounted(0.05f));//每件价格减少5%
        System.out.println("num =10 price = 5  total =" + context.executeStrategy(10, 5));
    }


}