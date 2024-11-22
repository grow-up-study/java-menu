package menu.model.recommender;

import camp.nextstep.edu.missionutils.Randoms;
import menu.model.Coach;
import menu.model.MenuCategory;

public class MenuRecommender {

    public String recommendMenu(Coach coach, MenuCategory menuCategory) {
        String menu = pickRandomMenu(menuCategory);
        if (coach.containsDislikeMenu(menu)) {
            return pickRandomMenu(menuCategory);
        }
        if (coach.containsRecommandedMenu(menu)) {
            return pickRandomMenu(menuCategory);
        }
        return menu;
    }

    private String pickRandomMenu(MenuCategory menuCategory) {
        return Randoms.shuffle(menuCategory.getMenus()).get(0);
    }
}
