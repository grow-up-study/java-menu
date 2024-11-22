package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private final Name name;
    private final List<String> dislikeMenu;
    private List<String> recommendedMenu = new ArrayList<>();

    public Coach(Name name, List<String> dislikeMenu) {
        this.name = name;
        this.dislikeMenu = dislikeMenu;
    }

    public boolean containsDislikeMenu(String menu) {
        return dislikeMenu.contains(menu);
    }

    public boolean containsRecommandedMenu(String menu) {
        return recommendedMenu.contains(menu);
    }
}
