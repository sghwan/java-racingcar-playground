package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("car1");
    }

    @Test
    void move() {
        assertThat(car.move(4)).isEqualTo(1);
    }

    @Test
    void stay() {
        assertThat(car.move(3)).isEqualTo(0);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }
}
