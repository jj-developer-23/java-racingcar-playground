package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private RandomNumberUtil randomNumberUtil = new RandomNumberUtil();
    private static final int MAX_NUM = 3;
    public int GAME_NUM = 5;

    public boolean isForward(int num) {
        return num > MAX_NUM;
    }


    public RacingCars racing() {
        RacingCars cars = new RacingCars("pobi,crong,honux");
        for (int i = 0; i < GAME_NUM; i++) {
            cars = (RacingCars) cars.listCar
                .stream()
                .map(car -> {
                    int num = randomNumberUtil.create();
                    if(this.isForward(num)) {
                        return car.forward(car);
                    }
                    return car;
                });
        }

        return cars;
    }

    public List<String> winRacingCars(RacingCars cars) {
        List<String> wins = cars.listCar.stream()
                .filter(car -> car.position == this.GAME_NUM)
                .map(car -> {
                    return car.carName;
                })
                .collect(Collectors.toList());

        return wins;
    }
}
