package menu.model;

import menu.exception.NameFormatException;

public final class Name {

    private final String name;
    private static final int MIN_NAME_SIZE = 2;
    private static final int MAX_NAME_SIZE = 4;

    public Name(String name) {
        validateNameFormat(name);
        this.name = name;
    }

    public String value() {
        return name;
    }

    private void validateNameFormat(String name) {
        if (name.length() < MIN_NAME_SIZE || name.length() > MAX_NAME_SIZE) {
            throw new NameFormatException();
        }
    }
}
