package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1234,5321);
        CarInfo carInfo = new CarInfo(1998,"Car1",9000,"Black");

        HashMap<Car,CarInfo> hashMap = new HashMap<>();
        hashMap.put(car,carInfo);
        hashMap.put(new Car(321, 6421), new CarInfo(2000, "Car2", 8000, "Pink"));
        hashMap.put(new Car(621, 8689), new CarInfo(2016, "Car3", 6000, "Red"));
        hashMap.put(new Car(843, 5542), new CarInfo(2001, "Car4", 4500, "White"));
        hashMap.put(new Car(962, 8431), new CarInfo(2014, "Car5", 10000, "Brown"));
        hashMap.put(new Car(111, 6865), new CarInfo(2008, "Car6", 8600, "Yellow"));
        for (Map.Entry<Car, CarInfo>
                a : hashMap.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
        }
}
