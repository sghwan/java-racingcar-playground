package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String askCarNames() throws IOException {
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분). ");
        return br.readLine();
    }

    public int askRacingTime() throws IOException {
        System.out.print("시도할 회수는 몇회인가요? ");
        return Integer.parseInt(br.readLine());
    }
}
