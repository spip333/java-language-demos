package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.nstern.demos.data.Car;

public class DemoStreamListFindAttribute {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(1, "Ferrari", "GT8"),
                new Car(2, "Chevrolet", "Corvette"),
                new Car(3, "Ford", "GT")
        );

        Set<String> resultSet = new HashSet<>();

        carList.stream().forEach(car -> resultSet.add(car.getMark()));

        p("" + resultSet);


    }
}




