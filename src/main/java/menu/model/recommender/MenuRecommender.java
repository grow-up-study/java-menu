package menu.model.recommender;

import camp.nextstep.edu.missionutils.Randoms;
import menu.model.Coach;
import menu.model.DaysCategory;
import menu.model.MenuCategory;

public class MenuRecommender {

    public void recommendMenus(Coach coach, DaysCategory daysCategory) {
        daysCategory.getCategories().values()
                .forEach(menuCategory -> recommendMenu(coach, menuCategory));
    }

    public void recommendMenu(Coach coach, MenuCategory menuCategory) {
        String menu = pickRandomMenu(menuCategory);
        if (coach.containsDislikeMenu(menu)) {
            pickRandomMenu(menuCategory);
            return;
        }
        if (coach.containsRecommendedMenu(menu)) {
            pickRandomMenu(menuCategory);
            return;
        }
        coach.addRecommendedMenu(menu);
    }

    private String pickRandomMenu(MenuCategory menuCategory) {
        return Randoms.shuffle(menuCategory.getMenus()).get(0);
    }
}
