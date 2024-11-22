package menu.model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CoachsTest {

    @Test
    void 코치는_2명_에서_5명_사이여야_한다1() {
        Assertions.assertThatThrownBy(() -> new Coachs(List.of(
                new Coach(new Name("이현수1"), new DislikeMenu(List.of()))
        ))).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 코치는_2명_에서_5명_사이여야_한다2() {
        Assertions.assertThatThrownBy(() -> new Coachs(List.of(
                new Coach(new Name("이현수1"), new DislikeMenu(List.of())),
                new Coach(new Name("이현수2"), new DislikeMenu(List.of())),
                new Coach(new Name("이현수3"), new DislikeMenu(List.of())),
                new Coach(new Name("이현수4"), new DislikeMenu(List.of())),
                new Coach(new Name("이현수5"), new DislikeMenu(List.of())),
                new Coach(new Name("이현수6"), new DislikeMenu(List.of()))
        ))).isInstanceOf(IllegalArgumentException.class);
    }
}
