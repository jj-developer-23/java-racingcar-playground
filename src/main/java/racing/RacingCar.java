package racing;

public class RacingCar {
    String carName;
    int position;

    public RacingCar(String name, int position) {
        this.carName = name;
        this.position = position;
    }

    public RacingCar forward(RacingCar car) {
        car.position++;
        return car;
    }

    public String racingResult() {
        return carName + " : " +positionPrint();
    }

    private String positionPrint() {
        String result = "-";
        for(int i = 1; i < position; i++) {
            result += "-";
        }

        return result;
    }

}
