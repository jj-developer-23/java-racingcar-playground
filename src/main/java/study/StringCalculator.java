package study;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    private static String splitRegex = ",|:";

    public int calculator(String str) {
        if(!strLengthCheck(str)) {
            return 0;
        }
        str = getSplitRegex(str);
        String[] strList = str.split(splitRegex);

        return Arrays.stream(strList)
                .mapToInt(s -> wrap(() -> Integer.parseInt(s)))
                .map(this::isNegative)
                .sum();
    }

    private int isNegative(int num) throws RuntimeException {
        if(num < 0) throw new RuntimeException();

        return num;
    }

    public static <T> T wrap(ExceptionSupplier<T> z) {
        try {
            return z.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private boolean strLengthCheck(String str) {
        return !(str == null || str.equals(""));
    }

    private String getSplitRegex(String str) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(str);
        if(matcher.find()) {
            splitRegex += "|" + matcher.group(1);
            str = matcher.group(2);
        }

        return str;
    }
}
