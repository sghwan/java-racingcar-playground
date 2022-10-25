package racingcar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(new Driver("seoul"));
    }

    @Test
    @DisplayName("랜덤값이 4이상이면 앞으로 전진할 수 있는 상태이다")
    void moveForward() {
        car.move(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤값이 3이하이면 전진하지 못한다.")
    void stay() {
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }
}
