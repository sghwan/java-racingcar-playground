package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String participants) {
        cars = mapToCar(participants);
    }

    private List<Car> mapToCar(String participants) {
        List<Car> cars = new ArrayList<>();
        String[] names = participants.split(",");

        for (String name : names) {
            cars.add(new Car(name));
        }

        return cars;
    }

    public int getNumberOfParticipants() {
        return cars.size();
    }
}
