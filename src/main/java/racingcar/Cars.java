package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private int max = Integer.MIN_VALUE;

    public Cars(List<String> carNames) {
        cars = mapToRacingCar(carNames);
    }

    private List<Car> mapToRacingCar(List<String> carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(new Driver(carName)));
        }

        return cars;
    }

    public void race(int repetition) {
        for (int i = 0; i < repetition; i++) {
            calculateDistance();
            updateGoalLine();
        }

        Judge judge = new Judge();
        judge.judgeWinners(cars, max);
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
