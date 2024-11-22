package menu.service;

import java.util.List;
import menu.dto.MenuRecommendDTO;
import menu.model.Coachs;
import menu.model.DaysCategory;
import menu.model.recommender.MenuRecommender;

public class MenuService {

    private final MenuRecommender menuRecommender = new MenuRecommender();

    public MenuRecommendDTO recommendMenu(Coachs coachs) {
        DaysCategory daysCategory = new DaysCategory();
        coachs.get().forEach(coach -> {
            List<String> recommendedMenus = menuRecommender.recommendMenus(coach, daysCategory);
            coach.setRecommendedMenu(recommendedMenus);
        });
        return new MenuRecommendDTO(daysCategory, coachs);
    }

}
