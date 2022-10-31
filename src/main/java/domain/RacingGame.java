package domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private final Cars cars;

    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public List<CarDto> run() {
        return this.cars.race()
                .stream()
                .map(car -> new CarDto(car.getName().getName(), car.getPosition().getPosition()))
                .collect(Collectors.toList());
    }

    public List<String> result() {
        return this.cars.getWinners();
    }
}
