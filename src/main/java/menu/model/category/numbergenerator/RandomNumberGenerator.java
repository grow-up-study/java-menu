package menu.model.category.numbergenerator;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {

    public int generateNum() {
        return Randoms.pickNumberInRange(1, 5);
    }
}
