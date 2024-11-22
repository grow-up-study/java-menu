package menu.view;

import static menu.util.message.Message.INPUT_COACH_NAME;
import static menu.util.message.Message.INPUT_HATE_FOOD;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getCoachNames() {
        System.out.println(INPUT_COACH_NAME.getMessage());
        return Console.readLine();
    }

    public static String getHateFoods(String name){
        System.out.printf(INPUT_HATE_FOOD.getMessage(), name);
        System.out.println();
        return Console.readLine();
    }
}
