public class Context {

        private Sold sold;

        public Context(Sold sold){
            this.sold = sold;
        }

        public float executeStrategy(int num,float price){
            return sold.calculateDistance(num,price);
        }

}
