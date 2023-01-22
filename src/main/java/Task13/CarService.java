package Task13;

import Task12.Car;
import Task12.EngineType;
import Task12.Manufacturer;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        //  System.out.println(cars);
    }

    public void removeCar(Car car) {
        cars.remove(car);
        System.out.println(cars);
    }

    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        result.addAll(cars);
        return result;

    }

    public List<Car> getAllV12() {
        List<Car> result = cars.stream()
                .filter(car -> EngineType.V12 == car.getEngineType())
                .collect(Collectors.toList());

        return result;
    }

    public List<Car> getAllBefore1999() {

        return cars.stream()
                .filter(car -> Year.of(1999).isAfter(car.getYearProduction()))
                .collect(Collectors.toList());
    }

    public Car getMostExpensive() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null) {
                mostExpensiveCar = car;
            }
            if (mostExpensiveCar.getPrice().compareTo(car.getPrice()) < 0) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getMostExpensive2() {
        // posortowanie po cenie malejąco
        final var sortedCars = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());

        // pobranie iteratora (skoczka) dla posortowanej listy
        final var carsIterator = sortedCars.iterator();

        // jeśli iterator widzi pierwszy element to go zwraca, jeśli nie to null
        if (carsIterator.hasNext()) {
            return carsIterator.next();
        } else {
            return null;
        }
    }

    public Optional<Car> getMostExpensive3() {
        return cars.stream()
                .reduce((car, car2) -> car.getPrice().compareTo(car2.getPrice()) >= 0 ? car : car2);
    }

    public Optional<Car> getCheapest() {
        return cars.stream()
                .reduce((car, car2) -> car.getPrice().compareTo(car2.getPrice()) >= 0 ? car : car2);

    }

    public Car getCheapest1(){
        Car CheapestCar = null;
        for (Car car : cars) {
            if (CheapestCar == null){
                CheapestCar = car;
            }
            if (CheapestCar.getPrice().compareTo(car.getPrice()) > 0){
                CheapestCar = car;
            }
        }
        return CheapestCar;
    }

    public List<Car> getMultiManufacturerCar(){
        List<Car> result = cars.stream()
                .filter(car -> car.getManufacturers().size()>=3)
                .collect(Collectors.toList());
        return result;
    }

    public List<Car> getSortedList(SortOrder sortOrder){
        List<Car> result = cars.stream()
                .sorted(Comparator.comparing(car -> car.getYearProduction()))
                .collect(Collectors.toList());
        if (SortOrder.DESCENDING == sortOrder){
            return cars.stream()
                    .sorted(Comparator.comparing((Car car) -> car.getYearProduction()).reversed())
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted(Comparator.comparing(car -> car.getYearProduction()))
                    .collect(Collectors.toList());
        }
    }
    public boolean isOnTheList(Car car){
        return cars.contains(car);
        }

        public List<Car> getAllProducedBy(Manufacturer manufacturer){
        List<Car> result = cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
        return result;
        }


    }


