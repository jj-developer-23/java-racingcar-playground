package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberUtilTest {
    RandomNumberUtil util;

    @BeforeEach
    void setUp() {
        util = new RandomNumberUtil();
    }

    @Test
    void randomNumberRange() {
        assertThat(util.create()).isGreaterThan(-1);
        assertThat(util.create()).isLessThan(10);
    }
}
