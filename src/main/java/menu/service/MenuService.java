package menu.service;

import java.util.List;
import java.util.stream.Collectors;
import menu.dto.MenuRecommendDTO;
import menu.model.Coachs;
import menu.model.DaysCategory;
import menu.model.DislikeMenu;
import menu.model.MenuCategory;
import menu.model.MenuRecommender;
import menu.model.Name;

public class MenuService {

    private final MenuRecommender menuRecommender = new MenuRecommender();

    public MenuRecommendDTO recommendMenu(Coachs coachs) {
        DaysCategory daysCategory = new DaysCategory();
        daysCategory.getCategories().values().forEach(menuCategory -> recommendDayMenu(coachs, menuCategory));
        return new MenuRecommendDTO(daysCategory, coachs);
    }

    public List<Name> createName(List<String> names) {
        return names.stream()
                .map(Name::new)
                .collect(Collectors.toList());
    }

    private void recommendDayMenu(Coachs coachs, MenuCategory menuCategory) {
        coachs.get().forEach(coach -> menuRecommender.recommendMenu(coach, menuCategory));
    }

    public DislikeMenu createDislikeMenu(List<String> dislikeMenes) {
        return new DislikeMenu(dislikeMenes);
    }
}
