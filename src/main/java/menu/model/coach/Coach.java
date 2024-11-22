package menu.model.coach;

import static menu.util.message.ErrorMessage.ERROR_DUPLICATE_MENUS;
import static menu.util.message.ErrorMessage.ERROR_HATE_FOOD;

import java.util.ArrayList;
import java.util.List;

import menu.model.food.Food;
import menu.model.food.HateFoods;

public class Coach {

    private final Name name;

    private HateFoods hateFoods;

    private List<Food> weekFoods = new ArrayList<>();

    public Coach(String name) {
        this.name = new Name(name);
    }

    public void addWeekFoods(String foodName) {
        validateHateFood(foodName);
        validateDuplicateFood(foodName);
        weekFoods.add(new Food(foodName));
    }

    private void validateDuplicateFood(String foodName) {
        if (weekFoods.contains(new Food(foodName))) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_MENUS.getMessage());
        }
    }

    private void validateHateFood(String foodName) {
        if (hateFoods.getFoods().contains(new Food(foodName))) {
            throw new IllegalArgumentException(ERROR_HATE_FOOD.getMessage());
        }
    }

    public void setHateFoods(String inputHateFoods) {
        hateFoods = new HateFoods(inputHateFoods);
    }

    public String getName() {
        return name.getName();
    }

    public List<Food> getWeekFoods() {
        return weekFoods;
    }
}
