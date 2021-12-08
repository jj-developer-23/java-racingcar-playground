package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    RacingGame game;

    @BeforeEach
    void setUp() {
        game = new RacingGame();
    }

    @Test
    void forward() {
        assertThat(game.isForward(4)).isTrue();
        assertThat(game.isForward(3)).isFalse();
    }

    @Test
    void winCars() {
        RacingCars cars = new RacingCars("pobi,crong,honux");
        cars.listCar.get(0).position = 5;
        cars.listCar.get(1).position = 4;
        cars.listCar.get(2).position = 5;

        List<String> winCars = game.winRacingCars(cars);
        assertThat(winCars.get(0)).isEqualTo("pobi");
        assertThat(winCars.get(1)).isEqualTo("honux");


    }
}
