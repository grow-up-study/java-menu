package menu.exception;

import static menu.exception.ExceptionMessage.COACH_NAME_RANGE_OUT;

public class NameFormatException extends IllegalArgumentBaseException {

    public NameFormatException() {
        super(COACH_NAME_RANGE_OUT);
    }
}
