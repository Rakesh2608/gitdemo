public class Car {
    private int price;
    private int engine;
    private int maxSpeed;

    public Car(int price, int engine, int maxSpeed) {
        this.price = price;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
