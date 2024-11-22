package menu.util.message;

public enum Message {

    START_LUNCH_RECOMMEND("점심 메뉴 추천을 시작합니다."),
    INPUT_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_HATE_FOOD("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    RECOMMEND_RESULT("메뉴 추천 결과입니다."),
    RECOMMEND_RESULT_WEEKDAYS("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    RECOMMEND_RESULT_CATEGORIES("[ 카테고리 | %s | %s | %s | %s | %s ]"),
    RECOMMEND_COACH_MENU("[ %s | %s | %s | %s | %s ]"),
    RECOMMEND_END("추천을 완료했습니다."),
    PARSE_REGEX ("[^가-힣a-zA-Z,]"),
    ;


    private final String message;

    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
