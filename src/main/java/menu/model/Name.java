package menu.model;

import menu.exception.NameFormatException;

public final class Name {

    private final String name;

    public Name(String name) {
        validateNameFormat(name);
        this.name = name;
    }

    private void validateNameFormat(String name) {
        if (name.length() < 2 || name.length() > 4) {
            throw new NameFormatException();
        }
    }
}
