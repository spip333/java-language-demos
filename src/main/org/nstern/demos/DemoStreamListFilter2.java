package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import org.nstern.demos.data.Car;

public class DemoStreamListFilter2 {

    public static void main(String[] args) {

        List<Car> carList =
                Arrays.asList(new Car(1, "Ferrari", "GT8"), new Car(2, "Chevrolet", "Corvette"), new Car(3, "Ford", "GT"),
                        new Car(4, "Ford", "Cmax"));

        Car myCar = new Car();
        myCar.setCode(3);

        List<Car> result = carList.stream().filter(car -> car.getCode().equals(myCar.getCode())).collect(toList());
        p("" + result);

        myCar.setCode(2);
        List<Car> result2 = carList.stream().filter(car -> car.getCode().equals(myCar.getCode())).collect(Collectors.toList());

        p("" + result2);


    }
}




