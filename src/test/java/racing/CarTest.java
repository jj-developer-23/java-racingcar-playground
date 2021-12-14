package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 이름_길이_제한() {
        assertThatThrownBy(() -> new Car("racing", 0))
                .isInstanceOf(Exception.class);
    }
}
