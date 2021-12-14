package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    List<Car> winners = new ArrayList<>();
    int max = 0;

    public void createWinners(List<Car> cars) {
        maxPosition(cars);
        addWinner(cars);
    }

    private void maxPosition(List<Car> cars) {
        for(Car car : cars) {
            if(car.position > this.max) {
                this.max = car.position;
            }
        }
    }

    private void addWinner(List<Car> cars) {
        winners = cars
                .stream()
                .filter(
                        car -> car.position == max
                ).collect(Collectors.toList());

    }
}
