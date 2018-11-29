package org.nstern.demos;

import org.nstern.demos.data.Car;

import java.util.Arrays;
import java.util.List;

public class DemoStreamListContains {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(1, "Ferrari", "GT8"),
                new Car(2, "Chevrolet", "Corvette"),
                new Car(3, "Ford", "GT")
        );

        Car myCar = new Car(3, "Ford", "GT");

        boolean isInList1 = carList.stream().anyMatch(car -> car.getCode().equals(myCar.getCode()));

        Car otherCar = new Car(4, "Ford", "cmax");

        boolean isInList2 = carList.stream().anyMatch(car -> car.getCode().equals(otherCar.getCode()));

    }
}




