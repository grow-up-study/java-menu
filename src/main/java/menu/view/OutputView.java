package menu.view;

import static menu.view.OutputMessage.OUTPUT_RECOMMEND;
import static menu.view.OutputMessage.OUTPUT_RECOMMEND_CATEGORIES;
import static menu.view.OutputMessage.OUTPUT_RECOMMEND_COMPLETE;
import static menu.view.OutputMessage.OUTPUT_RECOMMEND_HEADER;
import static menu.view.OutputMessage.OUTPUT_RECOMMEND_TITLE;
import static menu.view.OutputMessage.OUTPUT_WELCOME;

import java.util.ArrayList;
import java.util.List;
import menu.dto.MenuRecommendDTO;

public class OutputView {

    public void printWelcome() {
        OUTPUT_WELCOME.print();
    }

    public void printRecommend(MenuRecommendDTO menuRecommendDTO) {
        PrintStringBuilder stringBuilder = new PrintStringBuilder();
        stringBuilder.appendLine(OUTPUT_RECOMMEND_TITLE.getMessage());
        stringBuilder.appendLine(OUTPUT_RECOMMEND_HEADER.getMessage());
        stringBuilder.appendLine(OUTPUT_RECOMMEND_CATEGORIES.format(menuRecommendDTO.getCategories().toArray()));
        menuRecommendDTO.getRecommendedMenu()
                .forEach((key, value) -> {
                    List<String> recommend = new ArrayList<>(value);
                    recommend.add(0, key);
                    stringBuilder.appendLine(OUTPUT_RECOMMEND.format(recommend));
                });
        stringBuilder.appendLine("");
        stringBuilder.appendLine(OUTPUT_RECOMMEND_COMPLETE.getMessage());
        stringBuilder.print();
    }

    public void printErrorMessage(String message) {
        System.out.println(message);
    }
}
