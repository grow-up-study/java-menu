package menu.exception;

import static menu.exception.ExceptionMessage.COACH_COUNT_RANGE_OUT;

public class CoachCountException extends IllegalArgumentBaseException {

    public CoachCountException() {
        super(COACH_COUNT_RANGE_OUT);
    }
}
