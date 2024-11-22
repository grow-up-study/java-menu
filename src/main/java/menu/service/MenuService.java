package menu.service;

import menu.dto.MenuRecommendDTO;
import menu.model.Coachs;
import menu.model.DaysCategory;
import menu.model.MenuCategory;
import menu.model.recommender.MenuRecommender;

public class MenuService {

    private final MenuRecommender menuRecommender = new MenuRecommender();

    public MenuRecommendDTO recommendMenu(Coachs coachs) {
        DaysCategory daysCategory = new DaysCategory();
        daysCategory.getCategories().values().forEach(menuCategory -> recommendDayMenu(coachs, menuCategory));
        return new MenuRecommendDTO(daysCategory, coachs);
    }

    private void recommendDayMenu(Coachs coachs, MenuCategory menuCategory) {
        coachs.get().forEach(coach -> menuRecommender.recommendMenu(coach, menuCategory));
    }

}
