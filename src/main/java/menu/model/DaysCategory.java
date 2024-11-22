package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DaysCategory {
    private final Map<Day, MenuCategory> categories = new LinkedHashMap<>();

    public DaysCategory() {
        Arrays.stream(Day.values()).forEach(this::putDayCategory);
    }

    public Map<Day, MenuCategory> getCategories() {
        return categories;
    }

    private void putDayCategory(Day day) {
        MenuCategory pickedCategory = MenuCategory.getMenuCategory(Randoms.pickNumberInRange(1, 5));
        if (countCategory(pickedCategory) > 2) {
            putDayCategory(day);
        }
        categories.put(day, pickedCategory);
    }

    private long countCategory(MenuCategory menuCategory) {
        return categories.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == menuCategory)
                .count();
    }
}
