package menu.model;

import java.util.List;
import menu.exception.CoachCountException;

public final class Coachs {

    private final List<Coach> coaches;
    private static final int COACH_MIN_SIZE = 2;
    private static final int COACH_MAX_SIZE = 5;

    public Coachs(List<Coach> coaches) {
        validateCoachCount(coaches);
        this.coaches = coaches;
    }

    public List<Coach> get() {
        return coaches;
    }

    private void validateCoachCount(List<Coach> coaches) {
        if (coaches.size() < COACH_MIN_SIZE || coaches.size() > COACH_MAX_SIZE) {
            throw new CoachCountException();
        }
    }
}
