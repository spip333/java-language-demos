package org.nstern.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.demos.data.Car;

public class DemoStreamCollectToList {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(new Car(1, "Ferrari","GT8"), new Car(2, "Chevrolet", "Corvette"));

        List<Integer> carListAsInteger = carList.stream().mapToInt(Car::getCode).boxed().collect(Collectors.toList());

        System.out.println(carListAsInteger);


    }
}




