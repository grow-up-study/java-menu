package menu.util.parser;

import static menu.util.message.ErrorMessage.*;
import static menu.util.message.Message.PARSE_REGEX;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuParser {

    private final List<String> menus;

    public MenuParser(String input) {
        this.menus = splitMenu(input);
        validateDuplicate();
    }

    private List<String> splitMenu(String inputMenu) {
        validateEmpty(inputMenu);
        validateSeparator(inputMenu);

        return List.of(inputMenu.split(","));
    }

    private void validateSeparator(String inputName) {
        Pattern pattern = Pattern.compile(PARSE_REGEX.getMessage());
        Matcher matcher = pattern.matcher(inputName);
        if (matcher.find()) {
            throw new IllegalArgumentException(ERROR_WRONG_PARSER.getMessage());
        }
    }

    private void validateEmpty(String inputName) {
        if (inputName.isBlank()) {
            throw new IllegalArgumentException(ERROR_EMPTY.getMessage());
        }
    }

    private void validateDuplicate() {
        if (menus.size() != menus.stream().distinct().count()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_MENUS.getMessage());
        }
    }

    public List<String> getMenus() {
        return menus;
    }
}
