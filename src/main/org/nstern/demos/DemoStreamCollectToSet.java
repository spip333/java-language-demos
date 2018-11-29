package org.nstern.demos;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.nstern.demos.data.Car;

public class DemoStreamCollectToSet {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(new Car(1, "Ferrari","GT8"), new Car(2, "Chevrolet", "Corvette"));

        Set<String> carSetOfMark = carList.stream().map(Car::getMark).collect(toSet());

        System.out.println(carSetOfMark);


    }
}




