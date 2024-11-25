package menu.util.parser;

import static menu.util.message.ErrorMessage.*;
import static menu.util.message.Message.PARSE_REGEX;

import java.awt.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuParser {

    private MenuParser() {
    }

    public static List<String> splitMenu(String inputMenu) {
        validateEmpty(inputMenu);
        validateSeparator(inputMenu);

        return List.of(inputMenu.split(","));
    }

    private static void validateSeparator(String inputName) {
        Pattern pattern = Pattern.compile(PARSE_REGEX.getMessage());
        Matcher matcher = pattern.matcher(inputName);
        if (matcher.find()) {
            throw new IllegalArgumentException(ERROR_WRONG_PARSER.getMessage());
        }
    }

    private static void validateEmpty(String inputName) {
        if (inputName.isBlank()) {
            throw new IllegalArgumentException(ERROR_EMPTY.getMessage());
        }
    }
}
