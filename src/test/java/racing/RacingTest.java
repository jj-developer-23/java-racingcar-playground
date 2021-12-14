package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    Racing racing;

    @BeforeEach
    void setup() {
        racing = new Racing();
    }

    @Test
    void 자동차_전진() {
        assertThat(racing.isForward(4)).isTrue();
    }

    @Test
    void 자동차_멈춤() {
        assertThat(racing.isForward(3)).isFalse();
    }


}
