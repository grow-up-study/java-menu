package menu.model.coach;

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
            throw new IllegalArgumentException("중복되는 메뉴입니다.");
        }
    }

    private void validateHateFood(String foodName) {
        if (hateFoods.getFoods().contains(new Food(foodName))) {
            throw new IllegalArgumentException("못먹는 음식입니다.");
        }
    }

    public void setHateFoods(String inputHateFoods) {
        hateFoods = new HateFoods(inputHateFoods);
    }

    public String getName() {
        return name.getName();
    }

    public List<Food> getWeekFoods(){
        return weekFoods;
    }
}
