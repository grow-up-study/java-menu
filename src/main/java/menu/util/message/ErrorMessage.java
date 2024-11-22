package menu.util.message;

public enum ErrorMessage {

    ERROR_NAME_LENGTH("[ERROR] 코치의 이름은 2글자 이상 4글자 이하여야 합니다."),
    ERROR_COACH_COUNT("[ERROR] 코치는 최소 2명 이상 입력해야 합니다."),
    ERROR_WRONG_PARSER("[ERROR] 한글과 알파벳구분자 , 를 제외한 문자가 들어가있습니다."),
    ERROR_EMPTY("[ERROR] 공백이 들어갈 수 없습니다."),
    ERROR_DUPLICATE_NAMES("[ERROR] 중복되는 이름이 있습니다."),
    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getMessage(){
        return errorMessage;
    }
}
