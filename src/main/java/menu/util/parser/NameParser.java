package menu.util.parser;

import static menu.util.message.ErrorMessage.*;
import static menu.util.message.Message.PARSE_REGEX;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameParser {

    private NameParser() {
    }

    public static List<String> splitName(String inputName) {
        validateEmpty(inputName);
        validateSeparator(inputName);
        return List.of(inputName.split(","));
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

    // TODO: 이름 중복 검사 필요
    /*private void validateDuplicate() {
        if (names.size() != names.stream().distinct().count()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_NAMES.getMessage());
        }
    }*/
}
