package menu.exception;

public enum ExceptionMessage {

    COACH_COUNT_RANGE_OUT("코치는 최소 2명 이상 입력해야 합니다."),
    COACH_NAME_RANGE_OUT("코치 이름은 2~4글자 입니다."),
    DISLIKE_MENU_COUNT("싫어하는 메뉴의 개수는 3개 이상 입력할 수 없습니다."),
    ;

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
