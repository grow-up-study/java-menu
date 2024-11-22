package menu.model;

import java.util.List;
import menu.exception.CoachCountException;

public class Coachs {

    private final List<Coach> coaches;

    public Coachs(List<Coach> coaches) {
        validateCoachCount(coaches);
        this.coaches = coaches;
    }

    public List<Coach> get() {
        return coaches;
    }

    private void validateCoachCount(List<Coach> coaches) {
        if (coaches.size() < 2 || coaches.size() > 5) {
            throw new CoachCountException();
        }
    }
}
