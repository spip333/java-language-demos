package org.nstern.demos;

import static java.util.stream.Collectors.toList;
import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.demos.data.Car;

public class DemoStreamPeek {

    public static void main(String[] args) {

        List<Car> carList =
                Arrays.asList(new Car(1, "Ferrari", "GT8"), new Car(2, "Chevrolet", "Corvette"), new Car(3, "Ford", "GT"),
                        new Car(4, "Ford", "Cmax"));

        Car myCar = new Car();
        myCar.setCode(3);

        List<Car> result =
                carList.stream()
                        .peek(x -> p(":"+x.getCode()))
                        .filter(car -> car.getCode().equals(myCar.getCode())).peek(x -> p("->"+x.getCode())).collect(toList());

        p("" + result);


    }
}




