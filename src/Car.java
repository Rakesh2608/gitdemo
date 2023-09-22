public class Car {
    private int price;
    private int engine;

    public Car(int price, int engine) {
        this.price = price;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", engine=" + engine +
                '}';
    }
}
