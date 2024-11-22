package menu.controller;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import menu.model.Coach;
import menu.model.Coachs;
import menu.model.DislikeMenu;
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
        List<String> dislikeMenes = handleInput(() -> inputDislikeMenu(name));
        DislikeMenu dislikeMenu = menuService.createDislikeMenu(dislikeMenes);
        return new Coach(name, dislikeMenu);
    }

    private List<Name> inputCoachName() {
        List<String> names = Parser.parseCoachName(inputView.inputCoachs());
        return menuService.createName(names);
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
