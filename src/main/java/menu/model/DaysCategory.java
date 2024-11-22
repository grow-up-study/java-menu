package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DaysCategory {
    private final Map<Day, MenuCategory> categories = new LinkedHashMap<>();
    private static final int CATEGORY_START = 1;
    private static final int CATEGORY_END = 5;
    private static final int DUPLICATE_MAXIMUM_COUNT = 2;

    public DaysCategory() {
        Arrays.stream(Day.values()).forEach(this::putDayCategory);
    }

    public Map<Day, MenuCategory> getCategories() {
        return categories;
    }

    private void putDayCategory(Day day) {
        MenuCategory pickedCategory = MenuCategory.getMenuCategory(Randoms.pickNumberInRange(
                CATEGORY_START,
                CATEGORY_END
        ));
        if (countCategory(pickedCategory) > DUPLICATE_MAXIMUM_COUNT) {
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
