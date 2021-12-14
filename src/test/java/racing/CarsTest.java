package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차_이름_입력() {
        Cars cars = new Cars("pobi,crong,honux");
        assertThat(cars.size()).isEqualTo(3);
    }
}
