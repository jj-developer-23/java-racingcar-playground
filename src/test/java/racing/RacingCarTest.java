package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    RacingCar car;

    @BeforeEach
    void setUp() {
        car = new RacingCar("pobi", 1);
    }

    @Test
    void racingResultPrint() {
        assertThat(car.racingResult()).isEqualTo("pobi : -");
    }
}
