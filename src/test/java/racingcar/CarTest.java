package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {


    @Test
    void cartest4() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

@Test
void cartest3() {
    Car car = new Car("pobi");
    car.move(3);
    assertThat(car.getPosition()).isEqualTo(0);
}
    @Test
    void cartestname() {
        assertThatThrownBy(() -> new Car("aarrrr"))
                .isInstanceOf(IllegalArgumentException.class);
    }


}
