package menu.model.week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import menu.model.category.numbergenerator.NumberGenerator;
import menu.model.category.type.Category;

public class WeeklyCategory {

    private final List<Category> weekCategory = new ArrayList<>();
    private NumberGenerator numberGenerator;

    public WeeklyCategory(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        pickCategory();
    }

    private void pickCategory() {
        while (weekCategory.size() < 5) {
            Category category = Category.getCategory(numberGenerator.generateNum());
            if (Collections.frequency(weekCategory, category) < 2) {
                weekCategory.add(category);
            }
        }
    }

    public List<Category> getWeekCategory() {
        return weekCategory;
    }
}
