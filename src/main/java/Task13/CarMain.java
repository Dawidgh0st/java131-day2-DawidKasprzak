package Task13;

import Task12.Car;
import Task12.EngineType;
import Task12.Manufacturer;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarMain {
    public static void main(String[] args) {
        Manufacturer Manufacturer = new Manufacturer("Audi", 1444, "Germany");
        Manufacturer Manufacturer1 = new Manufacturer("Ford", 1980, "USA");
        Manufacturer Manufacturer2 = new Manufacturer("BMW", 1990, "Germany");
        List<Manufacturer> manufacturers = new ArrayList<>();
        List<Manufacturer> manufacturers1 = new ArrayList<>();

        manufacturers.add(Manufacturer);
        manufacturers1.add(Manufacturer);
        manufacturers1.add(Manufacturer1);


        CarService carService = new CarService();
        Car car1 = new Car("Audi", "A4", "30000", 2006, manufacturers, EngineType.V12);
        Car car2 = new Car("Audi", "A6", "25000", 2006, manufacturers, EngineType.V6);
        Car car3 = new Car("Audi", "A8", "35000", 2006, manufacturers1, EngineType.V6);
        Car car4 = new Car("Audi", "A8", "27000", 1980, manufacturers1, EngineType.V6);
        Car car5 = new Car("Audi", "A8", "45000", 2016, manufacturers1, EngineType.V12);
        Car car6 = new Car("Marcedes", "A8", "45000", 2016, manufacturers, EngineType.V12);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
       // System.out.println(carService.getAllV12());

      //  System.out.println(carService.getAllBefore1999());

//        carService.getAllCars().forEach(car -> System.out.println(car));
//        carService.getAllCars().add(car3);

//        carService.removeCar(car1);
//        carService.removeCar(car2);
   //     System.out.println(carService.getMultiManufacturerCar());
    //    System.out.println(carService.getSortedList(SortOrder.DESCENDING));
      //  System.out.println(carService.isOnTheList(car6));
        System.out.println(carService.getAllProducedBy(Manufacturer2));
        var carNames = carService.getAllProducedBy(Manufacturer).stream()
                .map(car -> car.getName())
                .map(carName -> "Nazwa samochodu " + carName)
                .map(carName -> carName.length())
                .collect(Collectors.toList());
        System.out.println(carNames);
    }
}

