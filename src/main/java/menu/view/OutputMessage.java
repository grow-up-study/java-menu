package menu.view;

import java.util.List;

public enum OutputMessage {

    OUTPUT_WELCOME("점심 메뉴 추천을 시작합니다."),
    OUTPUT_RECOMMEND_TITLE("메뉴 추천 결과입니다."),
    OUTPUT_RECOMMEND_HEADER("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    OUTPUT_RECOMMEND_CATEGORIES("[ 카테고리 | %s | %s | %s | %s | %s ]"),
    OUTPUT_RECOMMEND("[ %s | %s | %s | %s | %s | %s ]"),
    OUTPUT_RECOMMEND_COMPLETE("추천을 완료했습니다."),
    ;

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void print(Object... values) {
        System.out.println(format(values));
    }

    public String format(Object... values) {
        return String.format(message, values);
    }

    public String format(List<String> values) {
        return String.format(message, values.toArray());
    }
}
