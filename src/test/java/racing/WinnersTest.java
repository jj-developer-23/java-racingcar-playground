package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    void 우승자() {
        Winners winners = new Winners();
        Cars cars = new Cars("pobi,crong,honux");
        cars.cars.get(0).position = 4;
        cars.cars.get(1).position = 3;
        cars.cars.get(2).position = 4;
        winners.createWinners(cars.cars);
        assertThat(winners.winners.get(0).name).isEqualTo("honux");
        assertThat(winners.winners.get(1).name).isEqualTo("pobi");
        assertThat(winners.winners.size()).isEqualTo(2);
    }
}
