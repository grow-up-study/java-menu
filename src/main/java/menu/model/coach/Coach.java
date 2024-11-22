package menu.model.coach;

import menu.model.food.HateFoods;

public class Coach {

    private final Name name;

    private HateFoods hateFoods;

    public Coach(String name){
        this.name = new Name(name);
    }

    public void setHateFoods(String inputHateFoods){
        hateFoods = new HateFoods(inputHateFoods);
    }

    public String getName(){
        return name.getName();
    }
}
