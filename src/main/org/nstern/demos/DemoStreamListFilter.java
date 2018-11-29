package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.nstern.demos.data.Car;

public class DemoStreamListFilter {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(1, "Ferrari", "GT8"),
                new Car(2, "Chevrolet", "Corvette"),
                new Car(3, "Ford", "GT"),
                new Car(4, "Ford", "Cmax")
        );

        Car myCar = new Car(3, "Ford", "GT");

        Optional<Car> result = carList.stream().filter(car -> car.getCode().equals(myCar.getCode())).findFirst();

        if (result.isPresent()) {
            p("" + result.get());
        }


    }
}




