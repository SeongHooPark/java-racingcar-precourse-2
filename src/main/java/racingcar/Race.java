package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    private final List<Car> cars;

    public Race(String names) {
        this.cars = new ArrayList<>();
        for (String name : names.split(",")) {
            cars.add(new Car(name));
        }
    }

    public void playRound() {
        for (Car car : cars) {
            car.move(pickRandomNumber());
        }
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    private int pickRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}