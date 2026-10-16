package racingcar;

import java.util.List;

public class Output {

    public static void printResultTitle() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printRound(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + drawPosition(car.getPosition()));
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }

    private static String drawPosition(int position) {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < position; i++) {
            track.append("-");
        }
        return track.toString();
    }
}