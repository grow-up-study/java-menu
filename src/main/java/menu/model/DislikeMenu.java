package menu.model;

import java.util.List;
import menu.exception.DislikeMenuCountException;

public class DislikeMenu {

    private final List<String> dislikeMenus;
    private static final int DISLIKE_MENU_MAXIMUM_COUNT = 2;

    public DislikeMenu(List<String> dislikeMenus) {
        validateMenus(dislikeMenus);
        this.dislikeMenus = dislikeMenus;
    }

    public List<String> getDislikeMenus() {
        return dislikeMenus;
    }

    private void validateMenus(List<String> dislikeMenus) {
        if (dislikeMenus.size() > DISLIKE_MENU_MAXIMUM_COUNT) {
            throw new DislikeMenuCountException();
        }
    }
}
