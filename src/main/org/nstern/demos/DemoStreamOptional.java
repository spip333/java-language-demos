package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.nstern.demos.data.Car;

public class DemoStreamOptional {

    public static void main(String[] args) {

        List<Car> carListWithOneElement = Arrays.asList(
                new Car(1, "Ferrari", "GT8")
        );

        List<Car> carListWithNoElement = Collections.emptyList();

        List<Car> carListNull = null;

        Optional<Car> carOpt1 = carListWithOneElement.stream().findAny();

        if (carOpt1.isPresent()) {
            p("found one car : " + carOpt1.get() + " in list carListWithOnelement.");
        }

        Optional<Car> carOpt2 = carListWithNoElement.stream().findAny();

        if (carOpt2.isPresent()) {
            p("found one car : " + carOpt2.get());
        } else {
            p("found no car in carListWithNoElement");
        }

        Optional<Car> carOpt3 = carListNull.stream().findAny();

        if (carOpt3.isPresent()) {
            p("found one car : " + carOpt3.get());
        } else {
            p("found no car in carListNull");
        }
    }

}
