package menu.controller;

import menu.model.ResultDTO;
import menu.model.week.WeeklyCategory;
import menu.model.week.WeeklyMenu;
import menu.model.category.numbergenerator.RandomNumberGenerator;
import menu.model.coach.Coach;
import menu.model.coach.Coaches;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    private Coaches coaches;

    public void run() {
        OutputView.printStart();

        process(this::makeCoaches);
        process(this::inputHateFoods);
        process(this::recommend);
    }

    private void makeCoaches() {
        coaches = new Coaches(InputView.getCoachNames());
    }

    private void inputHateFoods() {
        for (Coach coach : coaches.getCoaches()) {
            coach.setHateFoods(InputView.getHateFoods(coach.getName()));
        }
    }

    private void recommend() {
        WeeklyCategory weeklyCategory = new WeeklyCategory(new RandomNumberGenerator());
        WeeklyMenu weeklyMenu = new WeeklyMenu(weeklyCategory, coaches);
        weeklyMenu.pickWeeklyMenu();
        ResultDTO resultDTO = new ResultDTO(weeklyCategory, coaches);
        OutputView.printResult(resultDTO);
    }

    private void process(Runnable action) {
        try {
            action.run();
        } catch (IllegalArgumentException e) {
            OutputView.printException(e.getMessage());
            process(action);
        }
    }
}
