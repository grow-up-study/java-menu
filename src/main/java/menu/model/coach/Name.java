package menu.model.coach;

import static menu.util.message.ErrorMessage.ERROR_NAME_LENGTH;

public class Name {

    private final String name;

    public Name(String name){
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name){
        if(name.length() < 2 || name.length() > 4){
            throw new IllegalArgumentException(ERROR_NAME_LENGTH.getMessage());
        }
    }

    public String getName(){
        return name;
    }
}
