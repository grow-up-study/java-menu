package menu.model.week;

import menu.model.category.type.Category;
import menu.model.coach.Coaches;

public class WeeklyMenu {

    private final WeeklyCategory weeklyCategory;

    private final Coaches coaches;

    public WeeklyMenu(WeeklyCategory weeklyCategory, Coaches coaches){
        this.weeklyCategory = weeklyCategory;
        this.coaches = coaches;
    }

    public void pickWeeklyMenu(){
        for(Category category : weeklyCategory.getWeekCategory()){
            coaches.pickMenu(category);
        }
    }
}
