package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {
    RacingCars cars;

    @BeforeEach
    void setUp() {
        cars = new RacingCars("pobi,crong,honux");
    }

    @Test
    void racingCars() {
        assertThat(cars.listCar.get(0).carName).isEqualTo("pobi");
        assertThat(cars.listCar.get(2).carName).isEqualTo("honux");
    }
}
