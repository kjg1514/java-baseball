package baseball;

public class Application {
    public static void main(String[] args) {

        Game game = new Game();
        while (game.restartOrEnd()) {
            game.playGame();
        }
    }
}
