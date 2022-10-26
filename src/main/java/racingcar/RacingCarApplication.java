package racingcar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCarApplication {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();
    private static final Judge judge = new Judge();

    public static void main(String[] args) throws IOException {
        List<String> winners = new ArrayList<>();
        while (winners.size() < 1) {
            String[] names = inputView.askCarNames().split(",");
            winners = handleRuntimeException(names, winners);
        }
    }

    private static List<String> handleRuntimeException(String[] names, List<String> winners) throws IOException {
        try {
            List<String> carNames = new ArrayList<>(Arrays.asList(names));
            Cars cars = new Cars(carNames);

            int racingTime = inputView.askRacingTime();
            resultView.printResult(cars, racingTime);

            winners = judge.judgeWinners(cars.getCars(), cars.getMax());
            resultView.printWinners(winners);
        } catch (IllegalArgumentException e) {
            System.out.println("자동차의 이름은 5글자 이하여야 합니다.");
            System.out.println();
        }

        return winners;
    }
}
