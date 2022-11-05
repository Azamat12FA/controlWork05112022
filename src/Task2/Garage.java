package Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Garage {

    int maxCapacity;

    HashMap<Car, Integer> availabilityCars;

    Map<Car, Integer> sortedMap;


    public Garage(HashMap<Car, Integer> availabilityCars) {
        this.maxCapacity = availabilityCars.size();
        this.availabilityCars = availabilityCars;
        this.sortedMap = availabilityCars.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
    }

    public void printAvailabilityCars() {
        sortedMap.entrySet().forEach(System.out::println);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public HashMap<Car, Integer> getAvailabilityCars() {
        return availabilityCars;
    }

    public void setAvailabilityCars(HashMap<Car, Integer> availabilityCars) {
        this.availabilityCars = availabilityCars;
    }
}
