package domain;

import view.InputView;
import view.ResultView;

import java.io.IOException;
import java.util.List;

public class RacingMain {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();

    public static void main(String[] args) throws IOException {
        int max_try = 10;
        while (max_try > 0) {
            max_try = handleIllegalArgumentException(max_try);
        }
    }

    private static int handleIllegalArgumentException(int max_try) throws IOException {
        try {
            RacingGame racingGame = new RacingGame(new Cars(inputView.askParticipants()));
            int racingTime = inputView.askRacingTime();

            start(racingGame, racingTime);

            resultView.printResult(racingGame.result());
            max_try = 0;
        } catch (IllegalArgumentException e) {
            max_try--;
        }

        return max_try;
    }

    private static void start(RacingGame racingGame, int racingTime) {
        System.out.println();
        System.out.println("실행 결과");
        while (racingTime > 0) {
            List<CarDto> carDtos = racingGame.run();
            resultView.printMoment(carDtos);
            racingTime--;
        }
    }
}
