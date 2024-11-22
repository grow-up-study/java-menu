package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private final Name name;
    private final List<String> dislikeMenu;
    private List<String> recommendedMenus = new ArrayList<>();

    public Coach(Name name, List<String> dislikeMenu) {
        this.name = name;
        this.dislikeMenu = dislikeMenu;
    }

    public Name getName() {
        return name;
    }

    public List<String> getRecommendedMenus() {
        return recommendedMenus;
    }

    public void setRecommendedMenu(List<String> menus) {
        recommendedMenus = menus;
    }

    public boolean containsDislikeMenu(String menu) {
        return dislikeMenu.contains(menu);
    }

    public boolean containsRecommandedMenu(String menu) {
        return recommendedMenus.contains(menu);
    }
}
