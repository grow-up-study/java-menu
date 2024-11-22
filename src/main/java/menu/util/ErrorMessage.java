package menu.util;

public enum ErrorMessage {

    ERROR_NAME_LENGTH("[ERROR] 코치의 이름은 2글자 이상 4글자 이하여야 합니다."),
    ERROR_COACH_COUNT("[ERROR] 코치는 최소 2명 이상 입력해야 합니다."),

    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getMessage(){
        return errorMessage;
    }
}
