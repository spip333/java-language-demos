package org.nstern.demos;

import static org.nstern.demos.data.CarUtil.createDemoCarList;
import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.demos.data.Car;

public class DemoExtractDtoMemberFromList {

    public static void main(String[] args) {

        List<Car> carList = createDemoCarList();

        List<String> markList = carList.stream().map(car -> car.getMark()).collect(Collectors.toList());

        p(""+ markList);
    }
}




