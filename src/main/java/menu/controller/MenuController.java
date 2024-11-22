package menu.controller;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import menu.model.Coach;
import menu.model.Coachs;
import menu.model.Name;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final MenuService menuService = new MenuService();

    public void run() {
        outputView.printWelcome();
        List<Name> coachNames = handleInput(this::inputCoachName);
        Coachs coachs = convertCoaches(coachNames);
        outputView.printRecommend(menuService.recommendMenu(coachs));
    }

    private Coachs convertCoaches(List<Name> names) {
        return new Coachs(names.stream().map(this::convertCoach).collect(Collectors.toList()));
    }

    private Coach convertCoach(Name name) {
        return new Coach(name, handleInput(() -> inputDislikeMenu(name)));
    }

    private List<Name> inputCoachName() {
        return Parser.parseCoachName(inputView.inputCoachs())
                .stream()
                .map(Name::new)
                .collect(Collectors.toList());
    }

    private List<String> inputDislikeMenu(Name name) {
        return Parser.parseMenuName(inputView.inputDislikeMenu(name.value()));
    }

    private <T> T handleInput(Supplier<T> inputSupplier) {
        while (true) {
            try {
                return inputSupplier.get();
            } catch (IllegalArgumentException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
