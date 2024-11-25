package menu.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import menu.model.category.type.Category;
import menu.model.coach.Coach;
import menu.model.coach.Coaches;
import menu.model.food.Food;
import menu.model.week.WeeklyCategory;

public class ResultDTO {

    private final Coaches coaches;
    private final Map<String, List<String>> result = new LinkedHashMap<>();
    private final List<Category> categories;

    public ResultDTO(WeeklyCategory weeklyCategory, Coaches coaches) {
        this.categories = weeklyCategory.getWeekCategory();
        this.coaches = coaches;
        makeResult();
    }

    private void makeResult() {
        for (Coach coach : coaches.getCoaches()) {
            result.put(coach.getName(), coach.getWeekFoods().stream().map(Food::getName).collect(Collectors.toList()));

        }
    }

    public Map<String, List<String>> getResult() {
        return result;
    }

    public List<String> getCategories() {
        return categories.stream().map(Category::getName).collect(Collectors.toList());
    }
}
