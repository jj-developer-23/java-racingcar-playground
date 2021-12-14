package racing;

import java.util.stream.Collectors;

public class Racing {
    private RandomUtils random = new RandomUtils();
    private static final int MIN_FORWARD_NUMBER = 4;

    public Cars game(int num, String carNames) {
        Cars cars = new Cars(carNames);
        for(int i = 0; i < num; i++) {
            cars.cars.stream()
                    .map(this::apply)
                    .collect(Collectors.toList());
        }

        return cars;
    }

    public boolean isForward(int randomNum) {
        return randomNum >= MIN_FORWARD_NUMBER;
    }

    private Car apply(Car car) {
        if (this.isForward(random.create())) {
            return car.forward();
        }
        return car;
    }
}
