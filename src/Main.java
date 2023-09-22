import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car c1=new Car(1000000,600);
        Car c2=new Car(2000000,400);
        Car c3=new Car(4000000,200);
        Car c4=new Car(5000000,1600);
        Car c5=new Car(6000000,1500);

        List<Car> carList=new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
        carList.sort(new EngineComparator());
        System.out.println(carList);

    }
}