package menu.model.coach;

import static menu.util.message.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;

import menu.model.category.type.Category;
import menu.util.CategoryMenuMapper;
import menu.util.parser.NameParser;

public class Coaches {

    private final List<Coach> coaches = new ArrayList<>();

    public Coaches(String inputNames) {
        makeCoaches(inputNames);
        validateCount();
    }

    private void makeCoaches(String input) {
        List<String> names = NameParser.splitName(input);

        for (String name : names) {
            coaches.add(new Coach(name));
        }
    }

    private void validateCount() {
        if (coaches.size() < 2) {
            throw new IllegalArgumentException(ERROR_COACH_MIN_COUNT.getMessage());
        }
        if (coaches.size() > 5) {
            throw new IllegalArgumentException(ERROR_COACH_MAX_COUNT.getMessage());
        }
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void pickMenu(Category category) {
        for (Coach coach : coaches) {
            coach.addWeekFoods(CategoryMenuMapper.from(category).getRandomMenu());
        }
    }
}
