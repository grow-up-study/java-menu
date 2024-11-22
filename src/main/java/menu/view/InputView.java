package menu.view;

import static menu.view.InputMessage.INPUT_COACH_NAME;
import static menu.view.InputMessage.INPUT_DISLIKE_MENU;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputCoachs() {
        INPUT_COACH_NAME.print();
        return Console.readLine();
    }

    public String inputDislikeMenu(String name) {
        INPUT_DISLIKE_MENU.print(name);
        return Console.readLine();
    }
}
