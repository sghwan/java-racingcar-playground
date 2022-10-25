package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {
    @Test
    @DisplayName("랜덤값이 4이상이면 앞으로 전진한다.")
    void moveForward() {
        assertThat(RacingCar.isMove(5)).isEqualTo(true);
    }

    @Test
    @DisplayName("랜덤값이 3이하이면 제자리에 있는다.")
    void stay() {
        assertThat(RacingCar.isMove(3)).isEqualTo(false);
    }

}
