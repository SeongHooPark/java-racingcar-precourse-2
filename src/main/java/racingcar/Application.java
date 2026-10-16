package racingcar;

public class Application {
    public static void main(String[] args) {
        Race race = createRace();
        int tryCount = askTryCount();

        Output.printResultTitle();
        for (int i = 0; i < tryCount; i++) {
            race.playRound();
            Output.printRound(race.getCars());
        }
        Output.printWinners(race.findWinners());
    }

    private static Race createRace() {
        while (true) {
            try {
                return new Race(Input.Carnames());
            } catch (IllegalArgumentException e) {
                Output.printError(e.getMessage());
            }
        }
    }

    private static int askTryCount() {
        while (true) {
            try {
                return Input.TryCount();
            } catch (IllegalArgumentException e) {
                Output.printError(e.getMessage());
            }
        }
    }
}