package menu.util.parser;

import static menu.util.message.ErrorMessage.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameParser {

    private final List<String> names;
    private static final String nameParseRegex = "[^가-힣a-zA-Z,]";

    public NameParser(String input) {
        this.names = splitName(input);
    }

    private List<String> splitName(String inputName) {
        validateEmpty(inputName);
        validateSeparator(inputName);
        validateDuplicate();
        return List.of(inputName.split(","));
    }

    private void validateSeparator(String inputName) {
        Pattern pattern = Pattern.compile(nameParseRegex);
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
        if (names.size() != names.stream().distinct().count()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_NAMES.getMessage());
        }
    }

    public List<String> getNames() {
        return names;
    }
}
