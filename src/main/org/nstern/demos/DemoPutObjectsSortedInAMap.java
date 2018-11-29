package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.nstern.demos.data.Car;

public class DemoPutObjectsSortedInAMap {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(1, "Ferrari", "GT8", 999999),
                new Car(2, "Chevrolet", "Corvette", 88888),
                new Car(3, "Ford", "GT", 111111)
        );

        p("" + carList);
        carList.sort(Comparator.comparing(Car::getPrice));
        p("" + carList);

        Map<String, Car> carMap = new LinkedHashMap<>();

        for (Car c : carList) {
            carMap.put(c.getMark(), c);
        }

        p("" + carMap);

        carMap.clear();
    }
}




