package org.nstern.demos.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarUtil {

    public static List<Car> createDemoCarList() {

        List<Car> list = new ArrayList<>();

        list = Arrays.asList(
                new Car(1, "Ferrari", "GT8"),
                new Car(2, "Chevrolet", "Corvette"),
                new Car(3, "Ford", "GT"),
                new Car(4, "Volkswagen", "Golf"),
                new Car(5, "Renault", "Espace"));

        return list;

    }

}
