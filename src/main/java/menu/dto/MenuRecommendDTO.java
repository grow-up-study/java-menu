package menu.dto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import menu.model.Coachs;
import menu.model.DaysCategory;

public class MenuRecommendDTO {
    private final List<String> categories = new ArrayList<>();
    private final Map<String, List<String>> recommendedCoachMenu = new LinkedHashMap<>();

    public MenuRecommendDTO(DaysCategory daysCategory, Coachs coachs) {
        daysCategory.getCategories()
                .forEach((key, value) -> this.categories.add(value.getName()));
        coachs.get().forEach(coach -> recommendedCoachMenu.put(coach.getName().value(), coach.getRecommendedMenus()));
    }

    public List<String> getCategories() {
        return categories;
    }

    public Map<String, List<String>> getRecommendedCoachMenu() {
        return recommendedCoachMenu;
    }
}
