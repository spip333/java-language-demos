package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.HashMap;
import java.util.Map;

import org.nstern.demos.data.Car;

public class DemoMapMerge {

    public static void main(String[] args) {
        Map<String, Car> carMap = new HashMap<>();
        carMap.put("chevrolet", new Car.Builder().withMark("Chevrolet").withModel("Camaro").withPrice(33333).build());
        carMap.put("ford", new Car.Builder().withMark("Ford").withModel("Mustang").withPrice(33444).build());

        p("" + carMap);

        carMap.merge("chevrolet", new Car.Builder().withMark("Chevrolet").withModel("Z28").withPrice(67888).build(),
                (c1, c2) -> c1.getPrice() > c2.getPrice() ? c1 : c2);
        p("" + carMap);

    }
}
