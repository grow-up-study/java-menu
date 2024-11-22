package menu.model.food;

import static menu.util.message.ErrorMessage.ERROR_DUPLICATE_MENUS;

import java.util.List;

import menu.util.parser.MenuParser;

public class HateFoods {

    private List<Food> foods;

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
    }

    public List<Food> getFoods() {
        return foods;
    }
}
