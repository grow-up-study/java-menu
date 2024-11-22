package menu.model.recommender;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import menu.model.Day;
import menu.model.MenuCategory;

public class DaysCategoryRecommender {

    public Map<Day, MenuCategory> recommendCategory() {
        Map<Day, MenuCategory> recommendedCategory = new HashMap<>();
        Arrays.stream(Day.values()).forEach(day -> putCategory(day, recommendedCategory));
        return recommendedCategory;
    }

    private void putCategory(Day day, Map<Day, MenuCategory> recommendedCategory) {
        MenuCategory pickedCategory = MenuCategory.getMenuCategory(Randoms.pickNumberInRange(1, 5));
        if (countCategory(recommendedCategory, pickedCategory) > 2) {
            putCategory(day, recommendedCategory);
        }
        recommendedCategory.put(day, pickedCategory);
    }

    private long countCategory(Map<Day, MenuCategory> recommendedCategory, MenuCategory menuCategory) {
        return recommendedCategory.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == menuCategory)
                .count();
    }
}
