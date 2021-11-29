package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {
    StringCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new StringCalculator();
    }

    @Test
    public void 빈문자열_또는_null() {
        assertThat(calc.calculator("")).isEqualTo(0);
        assertThat(calc.calculator(null)).isEqualTo(0);
    }

    @Test
    public void 쉼표_문자열_자르기() {
        assertThat(calc.calculator("1,2")).isEqualTo(3);
    }

    @Test
    public void 콜론_문자열_자르기() {
        assertThat(calc.calculator("1:2")).isEqualTo(3);
    }

    @Test
    public void 커스텀_구분자_문자열_자르기() {
        assertThat(calc.calculator("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    public void 음수() {
        assertThatThrownBy(() -> calc.calculator("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    public void 숫자외_문자() {
        assertThatThrownBy(() -> calc.calculator("1,2,ㄱ"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    public void 한자리_숫자() {
        assertThat(calc.calculator("1")).isEqualTo(1);
    }
}
