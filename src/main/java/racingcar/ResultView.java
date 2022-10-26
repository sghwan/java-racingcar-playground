package racingcar;

import java.util.List;

public class ResultView {
    public void printResult(Cars cars, int racingTime) {
        System.out.println("실행결과");
        while (racingTime > 0) {
            printMomentResult(cars.race());
            racingTime--;
        }
    }

    public void printMomentResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.printf("%5s : %s\n", car.getDriver().getName(), drawDistance(car.getPosition()));
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

    public void printWinners(List<String> winners) {
        System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
        System.out.println();
    }
}
