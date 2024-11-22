package menu.view;

import static menu.util.message.Message.*;

import java.util.List;
import java.util.Map;

import menu.model.ResultDTO;

public class OutputView {

    public static void printStart() {
        System.out.println("\n" + START_LUNCH_RECOMMEND.getMessage() + "\n");
    }

    public static void printResult(ResultDTO resultDTO) {
        System.out.println(RECOMMEND_RESULT.getMessage());
        System.out.println(RECOMMEND_RESULT_WEEKDAYS.getMessage());
        System.out.printf(RECOMMEND_RESULT_CATEGORIES.getMessage(),
            resultDTO.getCategories().get(0),
            resultDTO.getCategories().get(1),
            resultDTO.getCategories().get(2),
            resultDTO.getCategories().get(3),
            resultDTO.getCategories().get(4));
        System.out.println();

        for (Map.Entry<String, List<String>> entry : resultDTO.getResult().entrySet()) {
            String name = entry.getKey();
            List<String> menus = entry.getValue();
            String valueString = String.join(" | ", menus);

            System.out.printf("[ %s | %s ]\n", name, valueString);
        }

        System.out.println("\n" + RECOMMEND_END.getMessage());
    }

    public static void printException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
