package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Judge {
    public List<String> judgeWinners(List<Car> cars, int goalLine) {
        return cars.stream()
                .filter(car -> car.getPosition() == goalLine)
                .map(car -> car.getDriver().getName())
                .collect(Collectors.toList());
    }
}
