package racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(String names) {
        this.cars = createCars(names);
    }

    private List<Car> createCars(String names) {
        List<Car> listCar = new ArrayList<>();
        String[] carNames = splitNames(names);

        int index = 0;
        for(String name : carNames) {
           listCar.add(index, new Car(name, 0));
        }

        return listCar;
    }

    private String[] splitNames(String names) {
        return names.split(",");
    }

    public int size() {
        return this.cars.size();
    }
}
