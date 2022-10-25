package racingcar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCarApplication {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Judge judge = new Judge();
        String[] names = inputView.askCarNames().split(",");
        try {
            List<String> carNames = new ArrayList<>(Arrays.asList(names));
            Cars cars = new Cars(carNames);
            int racingTime = inputView.askRacingTime();
            System.out.println("실행결과");
            while (racingTime > 0) {
                resultView.printResult(cars.race());
                racingTime--;
            }
            List<String> winners = judge.judgeWinners(cars.getCars(), cars.getMax());
            for (String winner : winners) {
                System.out.print(winner + ", ");
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("예외 발생");
        }
    }
}
