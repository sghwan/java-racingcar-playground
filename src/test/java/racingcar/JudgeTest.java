package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JudgeTest {
    List<Car> cars;
    Judge judge;

    @BeforeEach
    void setUp() {
        cars = new ArrayList<>();
        judge = new Judge();
    }

    @Test
    @DisplayName("승리를 판단한다")
    void judge_victory() {
        //given
        Car car1 = new Car(new Driver("car1"), 1);
        Car car2 = new Car(new Driver("car2"), 2);
        Car car3 = new Car(new Driver("car3"), 3);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        //when

        List<String> winners = judge.judgeWinners(cars, 3);

        //then
        Assertions.assertThat(winners.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("승리자는 두명일 수 있다.")
    void judge_joint_win() {
        //given
        Car car1 = new Car(new Driver("car1"), 1);
        Car car2 = new Car(new Driver("car2"), 2);
        Car car3 = new Car(new Driver("car3"), 2);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        //when
        List<String> winners = judge.judgeWinners(cars, 2);

        //then
        Assertions.assertThat(winners.size()).isEqualTo(2);
    }

    @AfterEach
    void tearDown() {
        cars = null;
        judge = null;
    }
}
