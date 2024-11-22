package menu.model;

import java.util.List;
import menu.exception.DislikeMenuCountException;

public class DislikeMenu {

    private final List<String> dislikeMenus;

    public DislikeMenu(List<String> dislikeMenus) {
        validateMenus(dislikeMenus);
        this.dislikeMenus = dislikeMenus;
    }

    public List<String> getDislikeMenus() {
        return dislikeMenus;
    }

    private void validateMenus(List<String> dislikeMenus) {
        if (dislikeMenus.size() > 2) {
            throw new DislikeMenuCountException();
        }
    }
}
