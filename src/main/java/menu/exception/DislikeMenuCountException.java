package menu.exception;

import static menu.exception.ExceptionMessage.DISLIKE_MENU_COUNT;

public class DislikeMenuCountException extends IllegalArgumentBaseException {

    public DislikeMenuCountException() {
        super(DISLIKE_MENU_COUNT);
    }
}
