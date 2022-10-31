package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void move() {
        Car car = new Car("car1");
        Assertions.assertThat(car.move(4)).isEqualTo(1);
    }

    @Test
    void stay() {
        Car car = new Car("car1");
        Assertions.assertThat(car.move(3)).isEqualTo(0);
    }
}
