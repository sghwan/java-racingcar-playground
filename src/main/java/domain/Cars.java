package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;
    private static int MAX_POSITION = Integer.MIN_VALUE;

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

    public List<Car> race() {
        return cars.stream()
                .peek(car -> MAX_POSITION = Math.max(MAX_POSITION, car.move((int) (Math.random() * 10))))
                .collect(Collectors.toList());

    }

    public List<String> getWinners() {
        return cars.stream()
                .filter(car -> car.getPosition().getPosition() == MAX_POSITION)
                .map(car -> car.getName().getName())
                .collect(Collectors.toList());
    }
}
