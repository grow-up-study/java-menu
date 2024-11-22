package menu.model;

import java.util.List;

public class Coach {

    private final Name name;
    private final List<String> dislikeMenu;

    public Coach(Name name, List<String> dislikeMenu) {
        this.name = name;
        this.dislikeMenu = dislikeMenu;
    }
}
