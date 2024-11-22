package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private final Name name;
    private final DislikeMenu dislikeMenu;
    private final List<String> recommendedMenus = new ArrayList<>();

    public Coach(Name name, DislikeMenu dislikeMenu) {
        this.name = name;
        this.dislikeMenu = dislikeMenu;
    }

    public Name getName() {
        return name;
    }

    public List<String> getRecommendedMenus() {
        return new ArrayList<>(recommendedMenus);
    }

    public void addRecommendedMenu(String menu) {
        recommendedMenus.add(menu);
    }

    public boolean containsDislikeMenu(String menu) {
        return dislikeMenu.getDislikeMenus().contains(menu);
    }

    public boolean containsRecommendedMenu(String menu) {
        return recommendedMenus.contains(menu);
    }
}
