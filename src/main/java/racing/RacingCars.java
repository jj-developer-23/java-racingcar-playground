package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    StringUtil util = new StringUtil();
    public int POSITION_NUM = 1;
    List<RacingCar> listCar;

    public RacingCars(String carNames) {
        listCar = racingCarSetting(carNames);
    }

    private List<RacingCar> racingCarSetting(String carNames) {
        String[] cars = util.splitName(carNames);

        return Arrays.stream(cars)
                .map(s -> {
                    return new RacingCar(s, POSITION_NUM);
                })
                .collect(Collectors.toList());
    }

}
