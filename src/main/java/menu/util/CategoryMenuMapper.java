package menu.util;


import menu.model.category.type.Category;
import menu.model.food.menu.Asian;
import menu.model.food.menu.Chiness;
import menu.model.food.menu.Japaness;
import menu.model.food.menu.Korean;
import menu.model.food.menu.Menus;
import menu.model.food.menu.Western;

public class CategoryMenuMapper {

    public static Menus from(Category category){
        if(category == Category.JAPANESS){
            return new Japaness();
        }
        if(category == Category.KOREAN){
            return new Korean();
        }
        if(category == Category.CHINESS){
            return new Chiness();
        }
        if(category == Category.ASIAN){
            return new Asian();
        }
        if(category == Category.WESTERN){
            return new Western();
        }

        // TODO: 에러 처리 필요
        throw new IllegalArgumentException("존재하지 않는 카테고리");
    }
}
