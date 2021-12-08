package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringUtilTest {
    StringUtil utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtil();
    }

    @Test
    void carNameSplit() {
        String carNames = "pobi,crong,honux";
        String[] cars = {"pobi", "crong", "honux"};
        assertThat(utils.splitName(carNames)).isEqualTo(cars);
    }

    @Test
    void carNameNullOrEmpty() {
        assertThatThrownBy(() -> utils.splitName(null))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void carNameOverLength() {
        assertThatThrownBy(() -> utils.splitName("crong222,pobi,honux"))
                .isInstanceOf(RuntimeException.class);
    }
}
