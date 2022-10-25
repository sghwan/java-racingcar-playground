package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class DriverTest {

    @ParameterizedTest
    @CsvSource(value = {"aaa,true", "aa,true", "abcde,true"})
    @DisplayName("자동차의 이름은 5자를 넘을 수 없다.")
    void validateCarName(String name, boolean expected) {
        Driver Driver = new Driver(name);
        assertThat(Driver.getName().length() <= 5).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"666666", "7777777"})
    @DisplayName("자동차의 이름은 5자를 넘으면 예외를 던진다.")
    void handleException(String name) {
        assertThatThrownBy(() -> new Driver(name)).isInstanceOf(IllegalArgumentException.class);
    }
}
