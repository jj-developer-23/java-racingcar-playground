package racing;

import java.util.Arrays;

public class StringUtil {
    private static final String nameRegex = ",";
    private static final int nameLength = 5;


    public String[] splitName(String carNames) {
        if(!checkCarNames(carNames)) {
            throw new RuntimeException();
        }

        return Arrays.stream(carNames.split(nameRegex))
                .map(this::overLength)
                .toArray(String[]::new);
    }

    private String overLength(String carName) throws RuntimeException {
        if(carName.length() > nameLength) throw new RuntimeException();

        return carName;
    }

    private boolean checkCarNames(String carNames) {
        return !(carNames == null || carNames.equals(""));
    }
}
