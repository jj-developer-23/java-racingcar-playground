package racing;

public class Car {
    private static final int CAR_NAME_MAX_LENGTH = 5;
    String name;
    int position;

    public Car(String name, int position) {
        this.name = checkName(name);
        this.position = position;
    }

    private String checkName(String name) {
        if(name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
        return name;
    }

    public Car forward() {
        this.position++;

        return this;
    }
}
