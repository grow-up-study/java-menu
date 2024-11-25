package menu.model.food.menu;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Menus {

    protected List<String> menus;

    public String getRandomMenu() {

        return Randoms.shuffle(menus).get(0);
    }
}
