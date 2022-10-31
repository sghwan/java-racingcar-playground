package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {
    @Test
    void mapToCar() {
        Cars cars = new Cars("abc,cde,efg");
        assertThat(cars.getNumberOfParticipants()).isEqualTo(3);
    }

    @Test
    void mapToCarNameException() {
        assertThatThrownBy(() -> new Cars("abc,cde,efghij"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 1~5자 여야 합니다.");
    }
}
