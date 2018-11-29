package org.nstern.demos;

import static org.nstern.demos.data.CarUtil.createDemoCarList;
import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

import org.nstern.demos.data.Car;

public class DemoListOfDtoContainsAMember {

    public static void main(String[] args) {

        List<Car> carList1 = createDemoCarList();
        Car myCar = new Car(3, "Ford", "GT");

        if (carList1.contains(myCar)) {
            p(myCar.toString() + " is in list. See : " + carList1);
        }

        List<Car> carList2 = Arrays.asList(
                new Car(1, "Ferrari", "GT8"));

        if (!(carList2.contains(myCar))) {
            p(myCar.toString() + " is not in list. See: " + carList2);
        }


    }
}




