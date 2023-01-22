package Task12;

import java.time.Year;
import java.util.List;

public class Task12Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Toyota", 2020,"Japan");
        Manufacturer manufacturer2 = new Manufacturer("Toyota", 2020,"Japan");
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

     //   manufacturer2.setName("Mercedes");
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);


        Car car1 = new Car("Ferrari", "Punto rose", "300000", 1990,
                List.of(manufacturer1, manufacturer2), EngineType.V8);
        Car car2 = new Car("Ferrari", "Punto rose", "300000", 1990,
                List.of(manufacturer1, manufacturer2), EngineType.V8);
        System.out.println(car1.equals(car2));
    }
}
