package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private int max = Integer.MIN_VALUE;

    public Cars(List<String> carNames) {
        cars = mapToRacingCar(carNames);
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getMax() {
        return max;
    }

    private List<Car> mapToRacingCar(List<String> carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(new Driver(carName)));
        }

        return cars;
    }

    public List<Car> race() {
        calculateDistance();
        updateGoalLine();

        return cars;
    }

    private void calculateDistance() {
        cars.forEach(car -> car.move((int) (Math.random() * 10)));
    }

    private void updateGoalLine() {
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }
    }
}
