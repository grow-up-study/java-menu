package menu.model.food;

import static menu.util.message.ErrorMessage.ERROR_DUPLICATE_MENUS;
import static menu.util.message.ErrorMessage.ERROR_HATE_FOODS_COUNT;

import java.util.ArrayList;
import java.util.List;

import menu.util.parser.MenuParser;

public class HateFoods {

    private final List<Food> foods = new ArrayList<>();

    public HateFoods(String inputfoods) {
        splitFoods(inputfoods);
        validateFoodsCount();
    }

    private void splitFoods(String inputFoods) {
        List<String> foodNames = MenuParser.splitMenu(inputFoods);

        for (String foodName : foodNames) {
            foods.add(new Food(foodName));
        }
    }

    private void validateFoodsCount() {
        if (foods.size() != foods.stream().distinct().count()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_MENUS.getMessage());
        }
        if(foods.size() > 2){
            throw new IllegalArgumentException(ERROR_HATE_FOODS_COUNT.getMessage());
        }
    }

    public List<Food> getFoods() {
        return foods;
    }
}
