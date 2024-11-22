package menu.model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DislikeMenuTest {

    @Test
    void 싫어하는_음식은_2개_이하여야_한다() {
        Assertions.assertThatThrownBy(() -> new DislikeMenu(List.of("초밥", "떡볶이", "우동")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
