package baseball;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        baseball.model.BaseballGameModel model = new baseball.model.BaseballGameModel();
        baseball.view.BaseballGameView view = new baseball.view.BaseballGameView();
        baseball.controller.BaseballGameController controller = new baseball.controller.BaseballGameController(model, view);

        controller.startGame();
    }
}
