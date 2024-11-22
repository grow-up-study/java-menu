package menu.util;

public enum Message {

    START_LUNCH_RECOMMEND("점심 메뉴 추천을 시작합니다."),
    INPUT_COACH_NAME("코치의 이름을 입력해주세요. (, 로 구분)"),
    INPUT_HATE_FOOD("%s(이)가 못 먹는 메뉴를 입력해주세요"),
    RECOMMEND_RESULT("메뉴 추천 결과입니다."),
    RECOMMEND_END("추천을 완료했습니다.")
    ;


    private final String message;

    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
