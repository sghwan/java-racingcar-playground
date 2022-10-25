package racingcar;

import java.util.List;

public class ResultView {
    public void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getDriver().getName() + " : " + drawDistance(car.getPosition()));
        }

        System.out.println();
    }

    private String drawDistance(int distance) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < distance; i++) {
            sb.append("-");
        }

        return sb.toString();
    }
}
